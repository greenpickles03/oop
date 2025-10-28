# 🧠 Java OOP Concepts Practice

This project demonstrates the core concepts of **Object-Oriented Programming (OOP)** in Java — including **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction** — using simple, clear examples.

---

## 📁 Project Structure

OOP/
│
├── src/
│ ├── main/
│ │ └── java/
│ │ └── org/oop/
│ │ ├── encapsulation/
│ │ │ └── Employee.java
│ │ │
│ │ ├── inheritance/
│ │ │ ├── Animal.java
│ │ │ └── Dog.java
│ │ │
│ │ ├── polymorphism/
│ │ │ ├── Parent.java
│ │ │ ├── Child.java
│ │ │ ├── Vehicle.java
│ │ │ ├── Car.java
│ │ │ └── Main.java
│ │ │
│ │ └── (resources, test)
│ │
│ └── test/
│
├── pom.xml
├── .gitignore
└── note/
---

## 💡 Concepts Covered

### 🧩 **Encapsulation**
- File: `Employee.java`  
- Demonstrates how to protect class data using **private fields**, **getters**, and **setters**.

### 🧬 **Inheritance**
- Files: `Animal.java`, `Dog.java`  
- Shows how a subclass (`Dog`) inherits behavior and properties from a superclass (`Animal`).

### 🔁 **Polymorphism**
- Files: `Parent.java`, `Child.java`, `Vehicle.java`, `Car.java`, `Main.java`  
- Demonstrates **method overriding** and **runtime polymorphism**, where a parent reference calls a child’s overridden method.

---

## ⚙️ How to Run
1. Open the project in **IntelliJ IDEA** or any Java IDE.
2. Ensure you have **Java 8 or higher** installed.
3. Navigate to `org.oop.polymorphism.Main.java`.
4. Run the program to see the examples in action.

---

## 🧠 Summary of OOP Concepts

| Concept | Description | Example |
|----------|--------------|----------|
| **Encapsulation** | Hiding data using private fields and providing controlled access. | `Employee` |
| **Inheritance** | Reusing and extending behavior from a parent class. | `Dog extends Animal` |
| **Polymorphism** | One interface, many forms — child methods override parent methods. | `Car extends Vehicle` |
| **Abstraction** | (Optional to add) Hiding complex logic and exposing simple methods. | Could be added later |

---

## 🛠️ Tools & Technologies
- **Java 17 (or Java 8+)**
- **Maven** for project management
- **IntelliJ IDEA** (recommended IDE)

---

## 📚 Next Steps
- Add examples for **Abstraction** using `abstract` classes or interfaces.
- Create unit tests in the `/test` directory.
- Expand the project into a small real-world simulation (e.g., Employee Management System).

---

👨‍💻 *Created by Andrew Neil Royo — for Java OOP Interview and Spring Boot Preparation.*
