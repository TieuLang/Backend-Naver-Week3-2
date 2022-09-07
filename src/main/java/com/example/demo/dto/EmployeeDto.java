package com.example.demo.dto;

import lombok.*;

import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long employeeId;

    @NotEmpty(message = "Ten khong duoc de trong")
    private String name;

    private Date birthDate;
    private String gender;

    @NotEmpty(message = "Email khong duoc de trong")
    @Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Email is not valid")
    private String email;
}
