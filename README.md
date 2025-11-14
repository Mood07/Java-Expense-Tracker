# 💸 Expense Tracker App (Java OOP Project)

A console-based **Java Expense Tracker** application developed using
solid **Object-Oriented Programming (OOP)** principles.\
This project allows users to track daily expenses, categorize them,
calculate totals, and display a history of all entries.

Perfect for showcasing **Java fundamentals**, clean architecture, and
real-world console application skills on GitHub & your CV.

---

## 📦 Features

Feature Description

---

➕ Add Expense Add expense with title, amount, and category
📋 List All Expenses See complete history of all expenses
🔎 Filter by Category View expenses under a selected category
💰 Total Expense Automatically calculates sum of all expenses
🛡 Input Validation Prevents invalid inputs and crashes
🧱 OOP Structure Uses class separation, enums, encapsulation

---

## 🧱 Project Structure

    Expense-Tracker/
    │
    ├── src/
    │   ├── Main.java               # User interface & menu
    │   ├── Expense.java            # Expense data model
    │   ├── Category.java           # Enum for categories
    │   └── ExpenseManager.java     # Core logic & calculations
    │
    ├── out/                        # Compiled .class files
    │── .gitignore
    └── README.md

---

## 🧩 OOP Concepts Used

Concept Description

---

**Encapsulation** Private fields with getters
**Composition** Manager class handles Expense objects
**Enum Usage** Category system built with enums
**Polymorphism** toString() override for formatted output
**Dynamic Collections** Uses ArrayList for storing expenses

---

## ▶ How to Run the Project

### 1️⃣ Compile:

```bash
javac -d out src\*.java
```

### 2️⃣ Run:

```bash
java -cp out Main
```

---

## 🖥 Demo Output

    ===================================
          💸 Expense Tracker App
    ===================================

    --------- MENU ---------
    1 - Add Expense
    2 - List All Expenses
    3 - List by Category
    4 - Show Total Expense
    0 - Exit
    ------------------------
    Choose an option: 1
    Expense title: Lunch
    Amount: $12.5
    Select category:
    - FOOD
    - TRANSPORT
    - ENTERTAINMENT
    - SHOPPING
    - BILLS
    - OTHER
    Category: FOOD
    ✓ Expense added successfully.

    --------- MENU ---------
    1 - Add Expense
    2 - List All Expenses
    3 - List by Category
    4 - Show Total Expense
    0 - Exit
    ------------------------
    Choose an option: 2

    📋 Expense History:
    [2025-11-14] Lunch | Category: FOOD | Amount: $12.5

    --------- MENU ---------
    1 - Add Expense
    2 - List All Expenses
    3 - List by Category
    4 - Show Total Expense
    0 - Exit
    ------------------------
    Choose an option: 3
    Enter category: FOOD

    🔎 Category: FOOD
    [2025-11-14] Lunch | Category: FOOD | Amount: $12.5

    --------- MENU ---------
    1 - Add Expense
    2 - List All Expenses
    3 - List by Category
    4 - Show Total Expense
    0 - Exit
    ------------------------
    Choose an option: 0
    ✓ Exiting...

---

## 🧰 Tools & Technologies

Category Tools

---

**Language** Java 23
**Paradigm** Object-Oriented Programming
**Collections** ArrayList
**Environment** VS Code / IntelliJ / Terminal
**Version Control** Git & GitHub

---

## 🧨 Future Enhancements

- Save expenses to a `.txt` or `.json` file\
- Monthly / yearly reports\
- Graphical interface (JavaFX)\
- Export to CSV\
- Category statistics

---

## 👨‍💻 Author

**Berke Arda Türk**  
Data Science & AI Enthusiast | Computer Science (B.ASc)  
[🌐 Portfolio Website](https://berke-turk.web.app/) • [💼 LinkedIn](https://www.linkedin.com/in/berke-arda-turk/) • [🐙 GitHub](https://github.com/Mood07)

---
