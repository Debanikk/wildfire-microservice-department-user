package com.wildfiredk.department.controller;

import com.wildfiredk.department.entity.Department;
import com.wildfiredk.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getDepartment/{Id}")
    public Department findDepartmentById(@PathVariable("Id") Long  departmentId){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
