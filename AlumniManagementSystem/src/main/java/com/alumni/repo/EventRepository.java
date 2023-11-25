package com.alumni.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumni.entity.Registration;
import com.alumni.entity.event;

public interface EventRepository extends JpaRepository<event, Long> {


}
