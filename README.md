# Java Car Agency Management System

## Overview
This project focuses on developing a car agency management system using Java. It includes various classes to handle different types of vehicles and their details, demonstrating object-oriented programming (OOP) principles and design patterns in Java.

## Features
- Manage different types of vehicles (cars, jeeps, trucks, and heavy trucks).
- Implement functionalities for vehicle management within a car agency.
- Use of polymorphism, inheritance, and encapsulation to create a flexible and scalable system.

## Technologies and Tools Used
- **Java:** The primary programming language used for the car agency management system.

## Getting Started
1. Clone the repository.
   ```sh
   git clone https://github.com/DanielB66/Java-Car-Agency-Management-System
   ```
2. Compile the Java files.
   ```sh
   javac *.java
   ```
3. Run the `CarAgency.java` script to see the application in action.
   ```sh
   java CarAgency
   ```

## Classes
- **Car.java:** Represents a generic car.
- **CarAgency.java:** Manages the car agency and contains methods to add and manage vehicles.
- **HeavyTruck.java:** Extends Truck to add features specific to heavy trucks.
- **Jeep.java:** Extends Car to add features specific to jeeps.
- **Truck.java:** Represents a generic truck, base class for different types of trucks.

## Object-Oriented Principles Demonstrated
- **Encapsulation:** Encapsulating data within classes and providing public methods to interact with that data.
- **Inheritance:** Creating a hierarchy of classes that inherit properties and methods from base classes.
- **Polymorphism:** Using method overriding and interfaces to allow objects to be treated as instances of their parent class or interface.
- **Abstraction:** Defining abstract classes and methods to provide a template for derived classes.

## Contributing
Feel free to fork this repository and contribute by submitting a pull request.

## License
This project is licensed under the MIT License.
