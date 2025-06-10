CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    hire_date DATE,
    experience_years INT,
    salary DECIMAL(10, 2)
);

CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    last_login DATE,
    status VARCHAR(20)
);
INSERT INTO employees (employee_id, name, position, hire_date, experience_years, salary)
VALUES 
  (101, 'Employee 1', 'Software Engineer', '2018-03-15', 6, 85000),
  (102, 'Employee 2', 'Data Analyst', '2020-07-01', 4, 60000),
  (103, 'Sambhav', 'CEO', '2015-01-10', 9, 100000);


UPDATE employees
SET salary = salary * 1.10
WHERE experience_years > 5;

DELETE FROM customers
WHERE last_login < DATE_SUB(CURRENT_DATE, INTERVAL 1 YEAR);

