## Design Patterns:
    Design Patterns are the well proved solutions for commonly occuring problems in Software Design.

---

## ✅ STEP 4: Add Short Explanation (Highly Recommended)

<pre>
java-design-pattern-lab
│
├── README.md
├── pom.xml
│
└── src
└── main
├── java
│   └── com
│       └── example
│           └── javadp
│               │
│               ├── JavaDesignPatternLabApplication.java
│               │
│               ├── common
│               │   ├── config
│               │   ├── exception
│               │   └── util
│               │
│               ├── creational
│               │   ├── singleton
│               │   ├── factory
│               │   ├── abstractfactory
│               │   ├── builder
│               │   └── prototype
│               │
│               ├── structural
│               │   ├── adapter
│               │   ├── bridge
│               │   ├── composite
│               │   ├── decorator
│               │   ├── facade
│               │   ├── flyweight
│               │   └── proxy
│               │
│               ├── behavioral
│               │   ├── chainofresponsibility
│               │   ├── command
│               │   ├── interpreter
│               │   ├── iterator
│               │   ├── mediator
│               │   ├── memento
│               │   ├── observer
│               │   ├── state
│               │   ├── strategy
│               │   ├── templatemethod
│               │   └── visitor
│               │
│               └── architecture
│                   ├── layered
│                   ├── hexagonal
│                   ├── modulith
│                   ├── microservices
│                   └── eventdriven
│
└── resources
└── application.properties

</pre>

```md
### 📌 Structure Explanation

- **api**  
  Contains REST controllers. Controllers expose use-cases and never depend
  directly on design pattern implementations.

- **creational / structural / behavioral**  
  Contains pure Java implementations of GoF design patterns.

- **architecture**  
  Demonstrates higher-level architectural patterns such as Modulith,
  Microservices, Hexagonal Architecture, etc.

- **common**  
  Shared utilities, configuration, and exception handling.

This separation ensures that **design patterns remain implementation details**
and **APIs remain clean and realistic**.
