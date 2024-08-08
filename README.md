# Bank-Managment-System
# Bank Management System with ATM Simulation

## Description

This project is a comprehensive Bank Management System featuring an ATM simulation for secure transactions and efficient financial operations. Developed using Java, AWT, Swing, JDBC API, and MySQL, it includes various functionalities like mini statements, balance inquiries, fund transfers, ATM PIN generation, and ATM card number generation.

## Features

- **ATM Simulation**: Simulate ATM transactions including withdrawals, deposits, and balance inquiries.
- **Mini Statements**: View recent transactions for an account.
- **Balance Inquiries**: Check the current balance of an account.
- **Fund Transfers**: Transfer funds between accounts.
- **ATM PIN Generation**: Generate and manage ATM PINs.
- **ATM Card Number Generation**: Generate and manage ATM card numbers.

## Technologies Used

- **Java**: Core programming language for the application.
- **AWT & Swing**: For building the graphical user interface (GUI).
- **JDBC API**: For database connectivity and operations.
- **MySQL**: For managing the database and storing financial data.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/bank-management-system.git
 
 Navigate to the project directory:
 cd bank-management-system


Set up the MySQL database:
Create a new database and import the SQL schema from db_schema.sql.
Update the database configuration in the DatabaseConfig.java file with your MySQL credentials.

Compile and run the application:
javac *.java
java MainClass

Usage
Run the application: Start the application and use the ATM simulation to interact with the system.
ATM Transactions: Perform transactions such as withdrawals and deposits.
View Mini Statements: Access recent transactions and account information.
Transfer Funds: Use the fund transfer feature to move money between accounts.
Manage PINs and Cards: Generate and manage ATM PINs and card numbers.

Configuration
Database Configuration: Ensure that your MySQL server is running and the database schema is properly set up. Update DatabaseConfig.java with your database URL, username, and password.

Contributing
Fork the repository.

Create a new branch:
git checkout -b feature-branch

Commit your changes:
git commit -am 'Add new feature'

Push to the branch:
git push origin feature-branch
Create a new Pull Request on GitHub.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgments
Java Development Kit: For providing the tools and libraries necessary for development.
MySQL Team: For the robust and reliable database management system.
AWT & Swing: For graphical user interface development.
