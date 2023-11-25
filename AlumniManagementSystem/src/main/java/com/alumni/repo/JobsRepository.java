package com.alumni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumni.entity.jobs;

public interface JobsRepository extends JpaRepository<jobs, Long> {

}
