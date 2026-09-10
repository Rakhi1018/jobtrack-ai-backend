package com.jobtrack.jobtrack.backend.controller;

import com.jobtrack.jobtrack.backend.model.Job;
import com.jobtrack.jobtrack.backend.repository.JobRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
@RestController
@CrossOrigin(origins = {
        "http://localhost:5173",
        "http://localhost:5174",
        "http://localhost:5175",
        "http://localhost:5176",
        "http://localhost:5177",
        "https://jobtrack-ai-frontend.vercel.app"
})
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {

        Job existingJob = jobRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found"));

        existingJob.setCompany(job.getCompany());
        existingJob.setRole(job.getRole());
        existingJob.setLocation(job.getLocation());
        existingJob.setStatus(job.getStatus());
        existingJob.setJobUrl(job.getJobUrl());

        return jobRepository.save(existingJob);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable Long id) {

        if (!jobRepository.existsById(id)) {
            throw new RuntimeException("Job not found");
        }

        jobRepository.deleteById(id);
    }
}