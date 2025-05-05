# Design Patterns

Design patterns are typical solutions to common problems in software design. They are categorized into three main types:

## 🧱 Types of Design Patterns

- **Creational Patterns** – Deal with object creation mechanisms.
- **Structural Patterns** – Deal with object composition and relationships.
- **Behavioral Patterns** – Deal with object communication and responsibility delegation.

---

## 🔨 Creational Patterns

Creational patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

### 🧬 Prototype Pattern

The **Prototype Pattern** is used when creating a new object is costly or complex. 
Instead of creating new instances from scratch, it allows you to **clone** existing ones.

#### ✅ When to Use

- Creating an object is **expensive or time-consuming**.
- You want to **avoid subclassing**.
- You need **many similar objects** with slight variations.

#### 💡 Benefits

- Speeds up object creation.
- Reduces code duplication.
- Simplifies the process of creating complex objects.

---