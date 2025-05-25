# 💸 Personal Finance Tracker

A Java-based command-line application that helps users take control of their finances through simple budgeting, goal tracking, and financial awareness. Built using Object-Oriented Programming principles and the MVC architectural pattern, this app emphasizes clean code, modular design, and testability.

---

## 🚀 Features

### 📥 Add Transactions
- Record **Income** and **Expenses** with:
  - Amount
  - Category (e.g., "Food", "Transportation")
  - Description
  - Date
- Categorize transactions for better tracking

### 📂 Budget Categories
- Create custom budget categories
- Assign **monthly spending limits** to each category
- Track how much you've spent vs. budgeted
- Optional: Alert if a category goes over budget

### 📊 Monthly Summary Reports
- View reports that include:
  - Total income
  - Total expenses
  - Net savings (balance)
  - Category-wise breakdown
- Compare across different months

### 💡 Current Balance Overview
- See a real-time snapshot of your finances:
  - Total earned
  - Total spent
  - Remaining balance
  - Per-category breakdown

### 🎯 Financial Goals (New!)
- Set custom savings goals (e.g., “Buy a Laptop - $1200”)
- Automatically allocate income towards goals
- Track progress with a live percentage/progress bar
- Support multiple goals with target dates

### 🔁 Recurring Transactions (Optional)
- Mark income or expenses as recurring (e.g., rent, subscriptions)
- Automatically added each month

### 🧪 Unit Testing
- Robust **JUnit 5** test coverage for core modules:
  - Transaction logic
  - Budget tracking
  - Summary report generation
  - Goal progress logic

---

## 🧱 Architecture & Design Patterns

### ✅ Model-View-Controller (MVC)
- **Model**: Contains business logic (`Transaction`, `BudgetCategory`, `Goal`, `FinanceManager`)
- **View**: Console interface (`ConsoleView`) for input/output
- **Controller**: Manages application logic (`FinanceController`)

### ✅ Object-Oriented Design
- Encapsulation, Inheritance, Abstraction, Polymorphism

### ✅ Design Patterns
- **Singleton**: `FinanceManager` — ensures a single source of truth
- **Factory**: `TransactionFactory` — creates `Income` or `Expense` objects
- **(Optional)** **Observer**: Alert system when budget limit is exceeded

---

## 🔧 Tech Stack

| Component              | Technology       |
|------------------------|------------------|
| Language               | Java 17+         |
| Testing Framework      | JUnit 5          |
| Build Tool (optional)  | Gradle or Maven  |
| IDE                    | IntelliJ IDEA / Eclipse |
| Version Control        | Git / GitHub     |
| CLI Interface          | Standard Java I/O|

---

## 🗂️ Folder Structure

