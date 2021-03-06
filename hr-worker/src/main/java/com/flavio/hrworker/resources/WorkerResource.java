package com.flavio.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flavio.hrworker.entities.Worker;
import com.flavio.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping("/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list =  workerRepository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")	
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		Optional<Worker> worker =  workerRepository.findById(id);
		if (worker.isPresent()) {
			return ResponseEntity.ok(worker.get());
		}
		return ResponseEntity.notFound().build();
		
	}
		
}
