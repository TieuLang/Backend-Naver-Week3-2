# Backend-Naver-Week3-2
## 1. Project Configuration
[Application.properties](https://github.com/TieuLang/Backend-Naver-Week3-2/blob/master/src/main/resources/application.properties)
## 2. Validation
### Test Employee with invalid value
- Request: http://localhost:9081/likelion/TestEmployee
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



