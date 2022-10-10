package com.wildfiredk.department.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {

    @Id
    @SequenceGenerator(
            name = "department_id_sequence",
            sequenceName = "department_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_id_sequence"
    )
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
