package com.h2database.h2database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

// Interface extending CrudRepository
public interface DepartmentRepository
        extends CrudRepository<Department, Long> {
}
