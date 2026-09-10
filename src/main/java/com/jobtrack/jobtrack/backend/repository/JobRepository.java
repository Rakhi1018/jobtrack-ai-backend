package com.jobtrack.jobtrack.backend.repository;

import com.jobtrack.jobtrack.backend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}