package com.example.demo.controller;

import com.example.demo.dto.DepartmentDto;
import com.example.demo.dto.DepartmentResponse;
import com.example.demo.dto.EmployeeResponse;
import com.example.demo.service.impl.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/getDepartment")
    public ResponseEntity<?> getDepartment(@RequestBody @Valid DepartmentDto departmentDto,
                                           BindingResult bindingResult){
        if (bindingResult.hasErrors())
        {
            List<String> error=new ArrayList<>();
            for (int i=0;i<bindingResult.getErrorCount();++i)
            {
                error.add(bindingResult.getAllErrors().get(i).getDefaultMessage());
            }
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new DepartmentResponse("error",null,error));
        };
        return ResponseEntity.status(HttpStatus.OK).body(new DepartmentResponse("success",departmentService.getDepartmentDto(departmentDto),null));
    }

}
