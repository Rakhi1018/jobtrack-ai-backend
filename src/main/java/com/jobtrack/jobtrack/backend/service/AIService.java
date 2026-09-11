package com.jobtrack.jobtrack.backend.service;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final OpenAIClient client;

    public AIService() {
        this.client = OpenAIOkHttpClient.fromEnv();
    }

    public String analyzeResume(String resume, String jobDescription) {

        String prompt = """
                You are an expert technical recruiter and resume analyst.

                Analyze the following resume against the job description.

                RESUME:
                %s

                JOB DESCRIPTION:
                %s

                Provide a clear analysis containing:

                1. ATS Match Score out of 100
                2. Strongly Matched Skills
                3. Missing Skills
                4. Relevant Experience
                5. Resume Strengths
                6. Resume Weaknesses
                7. Specific Suggestions to improve the resume
                8. Important keywords the candidate should consider adding

                Be realistic and base your analysis only on the information provided.
                Do not invent experience, skills, education, or projects.
                Keep the response concise and useful for a job seeker.
                """.formatted(resume, jobDescription);

        ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
                .model(ChatModel.GPT_5_2)
                .addUserMessage(prompt)
                .build();

        ChatCompletion response = client.chat()
                .completions()
                .create(params);

        return response.choices()
                .stream()
                .flatMap(choice -> choice.message().content().stream())
                .findFirst()
                .orElse("AI could not generate an analysis.");
    }
}