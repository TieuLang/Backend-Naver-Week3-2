# Backend-Naver-Week3-2
## 1. Project Configuration
[Application.properties](https://github.com/TieuLang/Backend-Naver-Week3-2/blob/master/src/main/resources/application.properties)
## 2. Validation
### Test Employee with invalid value
- Request: POST http://localhost:9081/likelion/TestEmployee
```
{
    "employeeId": 1,
    "name": "",
    "birthDate": "2000-01-01",
    "gender": "male",
    "email": "abc"
}
```
- Response:
```
{
    "status": "error",
    "employeeDto": null,
    "error": [
        "Email is not valid",
        "Ten khong duoc de trong"
    ]
}
```
### Test Employee with valid value
- Request: POST http://localhost:9081/likelion/TestEmployee
```
{
    "employeeId": 1,
    "name": "abc",
    "birthDate": "2000-01-01",
    "gender": "male",
    "email": "abc@xyz.vn"
}
```
- Response:
```
{
    "status": "success",
    "employeeDto": {
        "employeeId": 1,
        "name": "abc",
        "birthDate": "2000-01-01T00:00:00.000+00:00",
        "gender": "male",
        "email": "abc@xyz.vn"
    },
    "error": null
}
```
### Test Department with invalid value
- Request: POST http://localhost:9081/likelion/TestDepartment 
```
{
    "departmentId": 1,
    "deptName": "a",
    "description": "",
    "employeeDtoList": [
        {
            "employeeId": 1,
            "name": "",
            "birthDate": "2000-01-01",
            "gender": "male",
            "email": "fdcom"
        }
    ]
}
```
### Test Department with valid value
- Request: POST http://localhost:9081/likelion/TestDepartment 
```
{
    "departmentId": 1,
    "deptName": "asdasasdasd",
    "description": "abc",
    "employeeDtoList": [
        {
            "employeeId": 1,
            "name": "abc",
            "birthDate": "2000-01-01",
            "gender": "male",
            "email": "a@gmail.com"
        }
    ]
}
```
- Response:
```
{
    "status": "success",
    "departmentDto": {
        "departmentId": 1,
        "deptName": "asdasasdasd",
        "description": "abc",
        "employeeDtoList": [
            {
                "employeeId": 1,
                "name": "abc",
                "birthDate": "2000-01-01T00:00:00.000+00:00",
                "gender": "male",
                "email": "a@gmail.com"
            }
        ]
    },
    "error": null
}
```
## 3. Logging
- Logging Employee:
```
-2022-09-08 09:29:52.061  INFO 5684 --- [nio-9081-exec-9] c.e.demo.aop.EmployeeServiceAspect       : Before called execution(EmployeeDto com.example.demo.service.impl.EmployeeServiceImpl.getEmployeeDto(EmployeeDto))
-2022-09-08 09:29:52.066  INFO 5684 --- [nio-9081-exec-9] c.e.demo.aop.EmployeeServiceAspect       : After called execution(EmployeeDto com.example.demo.service.impl.EmployeeServiceImpl.getEmployeeDto(EmployeeDto))
```
- Logging Department:
```
-2022-09-08 09:28:55.925  INFO 5684 --- [nio-9081-exec-8] c.e.demo.aop.DepartmentServiceAspect     : Before called execution(DepartmentDto com.example.demo.service.impl.DepartmentServiceImpl.getDepartmentDto(DepartmentDto))
-2022-09-08 09:28:55.941  INFO 5684 --- [nio-9081-exec-8] c.e.demo.aop.DepartmentServiceAspect     : After called execution(DepartmentDto com.example.demo.service.impl.DepartmentServiceImpl.getDepartmentDto(DepartmentDto))
```


