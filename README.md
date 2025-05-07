## Builder Pattern

The **Builder Pattern** is a creational design pattern used to construct complex objects step-by-step. It helps separate the construction logic from the actual object, allowing the same construction process to create different representations.

---
### When to Use
- When an object has **many optional parameters**.
- To avoid **telescoping constructors** (constructors with many parameters).
- When you want to **build objects step-by-step** in a readable and maintainable way.
---

### Real-World Scenario: E-Commerce Product Listing
In an e-commerce system, a seller might create a product listing that includes:
- Name and price (required)
- Description, discount, and image (optional)