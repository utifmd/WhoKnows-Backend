# WhoKnows Backend API Specification

## User
### CREATE User
Request:
- Method: POST
- Endpoint: `/api/user`
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body:
```json
{
  "userId": "String, Unique",
  "fullName": "String",
  "email": "String",
  "phone": "Number",
  "username": "String",
  "password": "String"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "userId": "String, Unique",
    "fullName": "String",
    "email": "String",
    "phone": "Number",
    "username": "String",
    "createdAt": "Date",
    "updatedAt":"Date"
  }
}
```
### READ User
Request:
- Method: GET
- Endpoint: `/api/user/{userId}`
- Header:
    - Accept: application/json
  
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "userId": "String, Unique",
    "fullName": "String",
    "email": "String",
    "phone": "Number",
    "username": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Update User
Request:
- Method: PUT
- Endpoint: `/api/user/{userId}`
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body:
```json
{
  "fullName": "String",
  "email": "String",
  "phone": "Number",
  "username": "String",
  "password": "String"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "userId": "String, Unique",
    "fullName": "String",
    "email": "String",
    "phone": "Number",
    "username": "String",
    "password": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Delete User
Request:
- Method: DELETE
- Endpoint: `/api/user/{userId}`
- Header:
    - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String"
}
```
### List Users
Request:
- Method: GET
- Endpoint: `/api/users`
- Header:
  - Accept: application/json
- Query Param:
  - size: Number,
  - page: Number

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": [
    {
      "userId": "String, Unique",
      "fullName": "String",
      "email": "String",
      "phone": "Number",
      "username": "String",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
  ]
}
```

## Auth
### Sign In User
Request:
- Method: POST
- Endpoint: `/api/auth/signin`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
    "email": "String",
    "password": "String"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "userId": "String, Unique",
    "fullName": "String",
    "email": "String",
    "phone": "Number",
    "username": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```

## Room
### CREATE Room
Request:
- Method: POST
- Endpoint: `/api/room`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "roomId": "String, Unique",
  "userId": "String, Unique",
  "minute": "Number",
  "title": "String",
  "desc": "String",
  "expired": "Boolean",
  "createdAt": "Date",
  "updatedAt": "Date"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "roomId": "String, Unique",
    "userId": "String, Unique",
    "minute": "Number",
    "title": "String",
    "desc": "String",
    "expired": "Boolean",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### READ Room
Request:
- Method: GET
- Endpoint: `/api/user/{roomId}`
- Header:
  - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "roomId": "String, Unique",
    "userId": "String, Unique",
    "minute": "Number",
    "title": "String",
    "desc": "String",
    "expired": "Boolean",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Update Room
Request:
- Method: PUT
- Endpoint: `/api/room/{roomId}`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "minute": "Number",
  "title": "String",
  "desc": "String",
  "expired": "Boolean"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "roomId": "String, Unique",
    "userId": "String, Unique",
    "minute": "Number",
    "title": "String",
    "desc": "String",
    "expired": "Boolean",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Delete Room
Request:
- Method: DELETE
- Endpoint: `/api/room/{roomId}`
- Header:
  - Accept: application/json
Response:
```json
{
  "code": "Number",
  "status": "String"
}
```
### List Rooms
Request:
- Method: GET
- Endpoint: `/api/rooms`
- Header:
  - Accept: application/json
- Query Param:
  - size: Number,
  - page: Number

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": [
    {
      "roomId": "String, Unique",
      "userId": "String, Unique",
      "minute": "Number",
      "title": "String",
      "desc": "String",
      "expired": "Boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
  ]
}
```

## Quiz
### CREATE Quiz
Request:
- Method: POST
- Endpoint: `/api/quiz`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "quizId": "String, Unique",
  "roomId": "String, Unique",
  "images": ["String"],
  "question": "String",
  "options": ["String"],
  "answer": "String",
  "createdBy": "String",
  "createdAt": "Date",
  "updatedAt": "Date"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "quizId": "String, Unique",
    "roomId": "String, Unique",
    "images": ["String"],
    "question": "String",
    "options": ["String"],
    "answer": "String",
    "createdBy": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### READ Quiz
Request:
- Method: GET
- Endpoint: `/api/quiz/{quizId}`
- Header:
  - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "quizId": "String, Unique",
    "roomId": "String, Unique",
    "images": ["String"],
    "question": "String",
    "options": ["String"],
    "answer": "String",
    "createdBy": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Update Quiz
Request:
- Method: PUT
- Endpoint: `/api/quiz/{quizId}`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "images": ["String"],
  "question": "String",
  "options": ["String"],
  "answer": "String"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "quizId": "String, Unique",
    "roomId": "String, Unique",
    "images": ["String"],
    "question": "String",
    "options": ["String"],
    "answer": "String",
    "createdBy": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Delete Quiz
Request:
- Method: DELETE
- Endpoint: `/api/quiz/{quizId}`
- Header:
  - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String"
}
```
### List Questions
Request:
- Method: GET
- Endpoint: `/api/questions`
- Header:
  - Accept: application/json
- Query Param:
  - size: Number,
  - page: Number

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": [
    {
      "quizId": "String, Unique",
      "roomId": "String, Unique",
      "images": ["String"],
      "question": "String",
      "options": ["String"],
      "answer": "String",
      "createdBy": "String",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
  ]
}
```

## Result
### CREATE Result
Request:
- Method: POST
- Endpoint: `/api/result`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "resultId": "String, Unique",
  "roomId": "String",
  "userId": "String",
  "correctQuiz": ["String"],
  "wrongQuiz": ["String"],
  "score": "Number"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "resultId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "correctQuiz": ["String"],
    "wrongQuiz": ["String"],
    "score": "Number",
    "createdAt": "Date",
    "updatedAt":"Date"
  }
}
```
### READ Result
Request:
- Method: GET
- Endpoint: `/api/result/{resultId}`
- Header:
  - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "resultId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "correctQuiz": ["String"],
    "wrongQuiz": ["String"],
    "score": "Number",
    "createdAt": "Date",
    "updatedAt":"Date"
  }
}
```
### Update Result
Request:
- Method: PUT
- Endpoint: `/api/user/{userId}`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "roomId": "String",
  "userId": "String",
  "correctQuiz": ["String"],
  "wrongQuiz": ["String"],
  "score": "Number"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "resultId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "correctQuiz": ["String"],
    "wrongQuiz": ["String"],
    "score": "Number",
    "createdAt": "Date",
    "updatedAt":"Date"
  }
}
```
### Delete Result
Request:
- Method: DELETE
- Endpoint: `/api/result/{resultId}`
- Header:
  - Accept: application/json
  
Response:
```json
{
  "code": "Number",
  "status": "String"
}
```
### List Result
Request:
- Method: GET
- Endpoint: `/api/results`
- Header:
  - Accept: application/json
- Query Param:
  - size: Number,
  - page: Number

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": [
    {
      "resultId": "String, Unique",
      "roomId": "String",
      "userId": "String",
      "correctQuiz": ["String"],
      "wrongQuiz": ["String"],
      "score": "Number",
      "createdAt": "Date",
      "updatedAt":"Date"
    }
  ]
}
```

## participant
### CREATE participant
Request:
- Method: POST
- Endpoint: `/api/participant`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "participantId": "String, Unique",
  "roomId": "String",
  "userId": "String",
  "currentPage": "String",
  "timeLeft": "Number",
  "expired": "Boolean"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "participantId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "currentPage": "String",
    "timeLeft": "Number",
    "expired": "Boolean",
    "createdAt": "Date",
    "updatedAt":"Date"
  }
}
```
### READ participant
Request:
- Method: GET
- Endpoint: `/api/participant/{participantId}`
- Header:
  - Accept: application/json

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "participantId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "currentPage": "String",
    "timeLeft": "Number",
    "expired": "Boolean",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```
### Update participant
Request:
- Method: PUT
- Endpoint: `/api/participant/{participantId}`
- Header:
  - Content-Type: application/json
  - Accept: application/json
- Body:
```json
{
  "participantId": "String, Unique",
  "roomId": "String",
  "userId": "String",
  "currentPage": "String",
  "timeLeft": "Number",
  "expired": "Boolean"
}
```
Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": {
    "participantId": "String, Unique",
    "roomId": "String",
    "userId": "String",
    "currentPage": "String",
    "timeLeft": "Number",
    "expired": "Boolean"
  }
}
```
### Delete participant
Request:
- Method: DELETE
- Endpoint: `/api/participant/{participantId}`
- Header:
  - Accept: application/json 

Response:
```json
{
  "code": "Number",
  "status": "String"
}
```
### List participant
Request:
- Method: GET
- Endpoint: `/api/participants`
- Header:
  - Accept: application/json
- Query Param:
  - size: Number,
  - page: Number

Response:
```json
{
  "code": "Number",
  "status": "String",
  "data": [
    {
      "participantId": "String, Unique",
      "roomId": "String",
      "userId": "String",
      "currentPage": "String",
      "timeLeft": "Number",
      "expired": "Boolean",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
  ]
}
```# WhoKnows-Backend
