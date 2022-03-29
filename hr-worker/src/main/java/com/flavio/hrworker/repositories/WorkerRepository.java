package com.flavio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
