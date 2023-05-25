# Chat Application

## Description

The Chat Application project aims to develop a real-time chat application backend using Spring Boot and WebSocket. Users will be able to send and receive messages, create chat rooms, join existing rooms, view message history, receive typing indicators, and track online presence. This project focuses on creating the initial setup for the project and implementing core features of a chat application backend.

## Features

1. Send and Receive Messages
   - As a user, I can send messages to other users in real-time.
   - Implement WebSocket endpoints to handle message sending and receiving.

2. Create Chat Rooms
   - As a user, I can create new chat rooms to engage in group conversations.
   - Implement endpoints to create chat rooms and associate users with specific rooms.

3. Join Existing Rooms
   - As a user, I can join existing chat rooms to participate in ongoing conversations.
   - Implement endpoints to allow users to join and leave chat rooms.

4. Message History
   - As a user, I can view the message history of a chat room.
   - Implement endpoints to retrieve past messages for a particular chat room.

5. Typing Indicator
   - As a user, I can see when other users are typing in a chat room.
   - Implement WebSocket functionality to broadcast typing indicators to room participants.

6. Online Presence Tracking
   - As a user, I can track the online presence of other users.
   - Implement functionality to update and track user online status using WebSocket.

Remember to design and structure your API endpoints based on RESTful principles and adhere to proper HTTP methods and status codes. Additionally, use WebSocket functionality to enable real-time communication and update of chat-related events.