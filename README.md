# Spring Dependency Injection Using ClassPath XML ApplicationContext

A simple Spring Framework project that demonstrates **Dependency Injection (DI)** using the **ClassPathXmlApplicationContext** and XML-based configuration. This project is intended for beginners who want to understand the fundamentals of the Spring IoC (Inversion of Control) container and how dependencies are managed using XML configuration.

## 📌 Features

* Demonstrates Dependency Injection using XML configuration.
* Uses `ClassPathXmlApplicationContext` to load Spring beans.
* Shows loose coupling through interfaces.
* Easy-to-understand project structure for beginners.
* Maven-based project.

## 🛠️ Technologies Used

* Java
* Spring Framework (Core)
* Maven
* Eclipse IDE

## 📂 Project Structure

```text
DependancyInjection/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/sk/
│   │   │   │   ├── App.java
│   │   │   │   ├── IPayment.java
│   │   │   │   ├── PaymentService.java
│   │   │   │   ├── Debit.java
│   │   │   │   └── Upi.java
│   │   │   └── Sample.xml
│   └── test/
├── pom.xml
└── README.md
```

## 🚀 How It Works

1. The Spring container loads the `Sample.xml` configuration file.
2. Beans are created and managed by the Spring IoC container.
3. `PaymentService` receives its dependency through Dependency Injection.
4. Different payment implementations such as `Debit` and `Upi` can be injected without modifying the service class.

## ▶️ How to Run

### Clone the repository

```bash
git clone https://github.com/Sanket2428/Spring-Dependency-Injection-Using-ClassPath-XML-Application-context.git
```

### Navigate to the project

```bash
cd Spring-Dependency-Injection-Using-ClassPath-XML-Application-context
```

### Build the project

```bash
mvn clean install
```

### Run the application

Run the `App.java` file from your IDE, or execute the generated JAR after building the project.

## 📖 Key Concepts Covered

* Spring IoC Container
* Dependency Injection (DI)
* XML Bean Configuration
* ClassPathXmlApplicationContext
* Loose Coupling
* Interface-based Programming

## 📚 Learning Objectives

This project helps you understand:

* What Dependency Injection is.
* Why Spring IoC is important.
* How Spring manages object creation.
* How XML configuration works in the Spring Framework.
* How to write loosely coupled applications.

## 🤝 Contributing

Contributions, suggestions, and improvements are welcome. Feel free to fork the repository, create a new branch, and submit a pull request.

## 📄 License

This project is intended for educational and learning purposes.

## 👨‍💻 Author

**Sanket Khavale**

GitHub: https://github.com/Sanket2428
