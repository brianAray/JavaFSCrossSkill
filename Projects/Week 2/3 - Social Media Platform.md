# Social Media Platform

## Description

The Social Media Platform project aims to develop a basic social media platform backend. Users will be able to create profiles, post updates, follow other users, and like or comment on posts. This project focuses on creating the initial setup for the project and implementing core features of a social media backend.

## Features

1. Create a Profile
   - As a user, I can create a profile by providing details such as name, username, email, and password.
   - Implement the necessary database and API endpoints to store and retrieve user profiles.

2. Post Updates
   - As a user, I can post updates or status messages to share with others.
   - Implement endpoints to create new posts, including the post content, timestamp, and user who posted it.

3. Follow other Users
   - As a user, I can follow other users to receive updates from them.
   - Implement endpoints to manage user relationships, including following and unfollowing other users.

4. Like or Comment on Posts
   - As a user, I can like or comment on posts made by other users.
   - Implement endpoints to handle likes and comments on posts, including adding likes, retrieving comments, and adding new comments.

## Example Endpoints

These are just example endpoints to show how it could be structured. If you wish to change them or structure them in a fashion that makes sense to you, please do.

1. Create a Profile:
   - Request:
     ```json
     POST /profiles
     Content-Type: application/json

     {
       "name": "John Doe",
       "username": "johndoe",
       "email": "johndoe@example.com",
       "password": "mypassword"
     }
     ```
   - Response:
     ```json
     status: 201 Created
     Content-Type: application/json

     {
       "id": 1,
       "name": "John Doe",
       "username": "johndoe",
       "email": "johndoe@example.com"
     }
     ```

2. Post an Update:
   - Request:
     ```json
     POST /posts
     Content-Type: application/json

     {
       "userId": 1,
       "content": "Hello, world!"
     }
     ```
   - Response:
     ```json
     status: 201 Created
     Content-Type: application/json

     {
       "id": 1,
       "userId": 1,
       "content": "Hello, world!",
       "timestamp": "2023-05-25T12:34:56Z"
     }
     ```

3. Follow a User:
   - Request:
     ```json
     POST /users/1/follow
     Content-Type: application/json

     {
       "followerId": 2
     }
     ```
   - Response:
     ```json
     status: 200 OK
     ```

4. Like a Post:
   - Request:
     ```json
     POST /posts/1/like
     Content-Type: application/json

     {
       "userId": 2
     }
     ```
   - Response:
     ```json
     status: 200 OK
     ```

5. Comment on a Post:
   - Request:
     ```json
     POST /posts/1/comments
     Content-Type: application/json

     {
       "userId": 2,
       "content": "Great post!"
     }
     ```
   - Response:
     ```json
     status: 201 Created
     Content-Type: application/json

     {
       "id": 1,
       "postId": 1,
       "userId": 2,
       "content": "Great post!",
       "timestamp": "2023-05-25T13:00:00Z"
     }
     ```

Remember to design and structure your API endpoints based on RESTful principles and adhere to proper HTTP methods and status codes.