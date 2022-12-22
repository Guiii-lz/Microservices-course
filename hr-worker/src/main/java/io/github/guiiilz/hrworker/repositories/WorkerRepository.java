package io.github.guiiilz.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.guiiilz.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
