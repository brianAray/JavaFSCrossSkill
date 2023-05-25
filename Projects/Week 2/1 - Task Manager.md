# Task Manager

## Description

The Task Manager project aims to develop a web application backend API that allows users to create, update, and manage tasks. Users will be able to create tasks, assign them to specific users, track the status of tasks, and authenticate themselves using user credentials. This project focuses on creating the initial setup for the project and implementing the core features of a backend API.

## Features

1. Task Creation
    - As a user, I can create a new task by providing:
        - title
        - description
        - due date
    - Tasks should be stored in a database
2. Task Assignment
    - As a user, I can assign tasks to other users
    - Each task can be assigned to a single user
    - Multiple tasks can be assigned to the same user
    - Implement the necessary database relationship and entity relationship
3. Task Status Tracking
    - As a user, I can update the status of a task to:
        - "in progress"
        - "completed"
    - Implement the ability to track and update the status of tasks in the database
4. User Authentication
    - As a user, I can access my information by providing credentials such as a username and password
    - Users should be able to register an account
    - Users should be able to login with their credentials
    - Users can only access their own tasks

## Example Endpoints

These are just example endpoints to show how it could be structured. If you wish to change them or structure them in a fashion that makes sense to you, please do.

1. Create a Task:
   - Request:
     ```json
     POST /tasks
     Content-Type: application/json

     {
       "title": "Implement user authentication",
       "description": "Add user registration, login, and authentication functionality",
       "dueDate": "2023-06-30"
     }
     ```
   - Response:
     ```json
     status: 201 Created
     Content-Type: application/json

     {
       "id": 1,
       "title": "Implement user authentication",
       "description": "Add user registration, login, and authentication functionality",
       "dueDate": "2023-06-30",
       "status": "IN_PROGRESS"
     }
     ```

2. Assign a Task to a User:
   - Request:
     ```json
     POST /tasks/1/assign
     Content-Type: application/json

     {
       "userId": 2
     }
     ```
   - Response:
     ```json
     status: 200 OK
     ```

3. Update the Status of a Task:
   - Request:
     ```json
     PATCH /tasks/1/status
     Content-Type: application/json

     {
       "status": "COMPLETED"
     }
     ```
   - Response:
     ```json
     status: 200 OK
     ```

4. Get a List of Tasks:
   - Request:
     ```json
     GET /tasks
     ```
   - Response:
     ```json
     status: 200 OK
     Content-Type: application/json

     [
       {
         "id": 1,
         "title": "Implement user authentication",
         "description": "Add user registration, login, and authentication functionality",
         "dueDate": "2023-06-30",
         "status": "COMPLETED"
       },
       {
         "id": 2,
         "title": "Create task assignment feature",
         "description": "Implement the ability to assign tasks to specific users",
         "dueDate": "2023-07-15",
         "status": "IN_PROGRESS"
       }
     ]
     ```
