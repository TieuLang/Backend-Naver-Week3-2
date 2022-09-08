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


