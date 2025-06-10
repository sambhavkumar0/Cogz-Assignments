CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100)
);

CREATE TABLE managers (
    manager_id INT PRIMARY KEY,
    manager_name VARCHAR(100)
);

CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    name VARCHAR(100),
    department_id INT,
    manager_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id),
    FOREIGN KEY (manager_id) REFERENCES managers(manager_id)
);


/* The tables are split into three parts: departments, managers, and employees. 
This is normalization in sql to reduce data redundancy and ensure integrity of data in the database . */