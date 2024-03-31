CRUD Application with MySQL Database:
-------------------------------------

Project Overview:
-----------------
This Eclipse project named "CRUD" demonstrates basic CRUD (Create, Read, Update, Delete) operations using MySQL database. 
The project is structured with the following components:

Dependency: The project utilizes the MySQL JDBC driver by adding it as a dependency in the pom.xml file.
Package: The main functionality is encapsulated within the crudAssignment package.


Database Configuration:
-----------------------
Database URL: jdbc:mysql://localhost:3306
Username: root
Password: 122640 (Replace with your MySQL database password)


Database Operations:
--------------------

1. Creating Database and Table:
-------------------------------
Class: createDatabase
Operation: Creates a database named crud and a table named Registration with the following columns:
id INT PRIMARY KEY
name VARCHAR(255) NOT NULL
email VARCHAR(255) NOT NULL
dateofbirth DATE

2. Inserting Data:
------------------
Class: insertData
Operation: Inserts 5 rows of data with random details into the Registration table.

3. Retrieving Data:
-------------------
Class: readData
Operation: Fetches details based on the provided ID from the Registration table.

4. Updating Data:
-----------------
Class: updateData
Operation: Updates the name of a person based on the provided ID in the Registration table.

5. Deleting Data:
-----------------
Class: deleteData
Operation: Deletes a row from the Registration table based on the provided ID.

Running the Application:
------------------------
1.Ensure that MySQL server is running on your local machine.
2.Import the Eclipse project into your workspace.
3.Update the database connection details in the respective classes if necessary.
4.Run each class individually to perform the desired database operations.
