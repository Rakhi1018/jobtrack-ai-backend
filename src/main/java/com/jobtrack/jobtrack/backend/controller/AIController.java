package com.jobtrack.jobtrack.backend.controller;

import com.jobtrack.jobtrack.backend.service.AIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "http://localhost:5176",
        "http://localhost:5177",
        "https://jobtrack-ai-frontend.vercel.app"
})
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/analyze")
    public ResponseEntity<?> analyzeResume(
            @RequestBody Map<String, String> request) {

        String resume = request.get("resume");
        String jobDescription = request.get("jobDescription");

        if (resume == null || resume.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Resume is required"));
        }

        if (jobDescription == null || jobDescription.isBlank()) {
            return ResponseEntity.badRequest()
                    .body(Map.of("error", "Job description is required"));
        }

        String analysis = aiService.analyzeResume(resume, jobDescription);

        return ResponseEntity.ok(
                Map.of("analysis", analysis)
        );
    }
}