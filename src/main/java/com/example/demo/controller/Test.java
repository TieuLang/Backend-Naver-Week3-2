package com.example.demo.controller;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.dto.DepartmentResponse;
import com.example.demo.dto.EmployeeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Test {
    private static final Logger LOGGER= LoggerFactory.getLogger(Test.class);

    @PostMapping("/TestEmployee")
    public ResponseEntity<?> getEmployee(@RequestBody @Valid EmployeeDto employeeDto
            , BindingResult bindingResult){
        if (bindingResult.hasErrors())
        {
            List<String> error=new ArrayList<>();
            for (int i=0;i<bindingResult.getErrorCount();++i)
            {
                error.add(bindingResult.getAllErrors().get(i).getDefaultMessage());
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new EmployeeResponse("error",null,error));
        };
        return ResponseEntity.status(HttpStatus.OK).body(new EmployeeResponse("success",employeeDto,null));
    }

    @PostMapping("/TestDepartment")
    public ResponseEntity<?> getDepartment(@RequestBody @Valid DepartmentDto departmentDto
            , BindingResult bindingResult){
        if (bindingResult.hasErrors())
        {
            System.out.println("LOI");
            System.out.println(bindingResult.getErrorCount());
            List<String> error=new ArrayList<>();
            for (int i=0;i<bindingResult.getErrorCount();++i)
            {
                System.out.println(bindingResult.getAllErrors().get(i).getDefaultMessage());
                error.add(bindingResult.getAllErrors().get(i).getDefaultMessage());
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new DepartmentResponse("error",null,error));
        };
        return ResponseEntity.status(HttpStatus.OK).body(new DepartmentResponse("success",departmentDto,null));
    }
}
