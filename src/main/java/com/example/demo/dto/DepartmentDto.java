package com.example.demo.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long departmentId;

    @NotEmpty
    @Size(min=10,max=50,message="Ten Department phai tu 10 den 50 ki tu")
    private String deptName;

    @NotEmpty(message = "Description khong duoc de trong")
    private String description;

    @Valid
    private List<EmployeeDto> employeeDtoList;
}
