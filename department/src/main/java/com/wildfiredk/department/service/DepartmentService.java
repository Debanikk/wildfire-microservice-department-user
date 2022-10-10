package com.wildfiredk.department.service;

import com.wildfiredk.department.entity.Department;
import com.wildfiredk.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment Service method of departmentService");
        return repository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside saveDepartment Service method of departmentService");
        return repository.getById(departmentId);
    }
}
