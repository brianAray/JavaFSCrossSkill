# Shopping Cart using Collections

## Task

You are tasked with implementing a shopping cart application using Java collections. The shopping cart should allow users to add and remove items, calculate the total price, and display the items in the cart. Follow the steps below to complete the implementation:

## Steps to Complete

1. Create a class called `Product` to represent a product with the following properties:
    - `name` (String): The name of the product.
    - `price` (double): The price of the product.
2. Create a class called `ShoppingCart` to represent the shopping cart. It should have the following methods:
    - `addProduct(Product product)`: Adds a product to the cart.
    - `removeProduct(Product product)`: Removes a product from the cart.
    - `getTotalPrice()`: Calculates and returns the total price of all the products in the cart.
    - `displayCart()`: Displays the items in the cart.
3. In the `ShoppingCart` class, use an appropriate collection to store the products added to the cart.
4. In the `main` method of a separate class, demonstrate the functionality of the shopping cart by performing the following steps:
    - Create several `Product` objects with different names and prices.
    - Create an instance of the `ShoppingCart` class.
    - Add some products to the cart.
    - Remove a product from the cart.
    - Calculate and display the total price of the cart.
    - Display the items in the cart.

## Starter Code

```java
class Product {
    private String name;
    private double price;

    // Constructor

    // Getters and setters
}

class ShoppingCart {
    // Declare a collection to store the products

    // Add product to cart method

    // Remove product from cart method

    // Calculate total price method

    // Display cart method
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        // Create Product objects

        // Create an instance of ShoppingCart

        // Add products to the cart

        // Remove a product from the cart

        // Calculate and display the total price of the cart

        // Display the items in the cart
    }
}
```

Implement the missing parts in the Product and ShoppingCart classes according to the given requirements. Test the functionality of the shopping cart by adding, removing, calculating the total price, and displaying the items in the cart.