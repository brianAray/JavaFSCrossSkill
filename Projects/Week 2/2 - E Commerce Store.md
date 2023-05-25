# E-commerce Store

## Description

The E-commerce Store project aims to develop a web application backend API for an online store. Users will be able to browse products, add items to a shopping cart, and place orders. This project focuses on creating the initial setup for the project and implementing core features of an e-commerce backend.

## Features

1. Product Listing
   - As a user, I can view a list of products available in the store
   - Products should include information such as title, description, price, and availability
   - Implement the necessary database and API endpoints to retrieve and display product information

2. Search and Filtering
   - As a user, I can search for products based on keywords or specific criteria
   - Implement a search functionality that allows users to find products by title, description, or category
   - Provide filtering options such as sorting by price, popularity, or category

3. Shopping Cart Management
   - As a user, I can add products to my shopping cart
   - Implement endpoints to manage the shopping cart, including adding items, updating quantities, and removing items
   - Store the shopping cart information for each user in the database

4. Order Processing
   - As a user, I can place an order for the items in my shopping cart
   - Implement the necessary API endpoints to create an order, including capturing user information, selected products, and payment details
   - Handle order processing logic, such as updating product quantities and generating order confirmation

## Example Endpoints

These are just example endpoints to show how it could be structured. If you wish to change them or structure them in a fashion that makes sense to you, please do.

1. Get a List of Products:
   - Request:
     ```json
     GET /products
     ```
   - Response:
     ```json
     status: 200 OK
     Content-Type: application/json

     [
       {
         "id": 1,
         "title": "Battery",
         "description": "This is a battery for use with electronics",
         "price": 19.99,
         "availability": true
       },
       {
         "id": 2,
         "title": "Hammer",
         "description": "This is a hammer",
         "price": 24.99,
         "availability": false
       }
     ]
     ```

2. Search and Filter Products:
   - Request:
     ```json
     GET /products?search=keyword&category=electronics
     ```
   - Response:
     ```json
     status: 200 OK
     Content-Type: application/json

     [
       {
         "id": 1,
         "title": "Battery",
         "description": "This is a battery for use with electronics",
         "price": 19.99,
         "availability": true
       }
     ]
     ```

3. Add Item to Shopping Cart:
   - Request:
     ```json
     POST /cart/items
     Content-Type: application/json

     {
       "productId": 1,
       "quantity": 2
     }
     ```
   - Response:
     ```json
     status: 201 Created
     Content-Type: application/json

     {
       "id": 1,
       "productId": 1,
       "quantity": 2
     }
     ```

4. Place an Order:
   - Request:
     ```json
     POST /orders
     Content-Type:

     application/json 
     {
        "userId": 1,
        "items": 
         [
            {
                "productId": 1,
                "quantity": 2
            },
            {
                "productId": 3,
                "quantity": 1
            }
         ],
         "payment": {
             "cardNumber": "1234567890123456",
             "expiryDate": "12/25",
             "cvv": "123"
         }
     }

   - Response:
        ```json
        status: 201 Created
        Content-Type: application/json

        {
            "id": 1,
            "userId": 1,
            "items": [
                {
                    "productId": 1,
                    "quantity": 2
                },
                {
                    "productId": 3,
                    "quantity": 1
                }
            ],
            "totalAmount": 64.97,
            "status": "PROCESSING"
        }

Remember to design and structure your API endpoints based on RESTful principles and adhere to proper HTTP methods and status codes.