CREATE TABLE employees_bbsr (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    position VARCHAR(50),
    hire_date DATE,
    experience_years INT,
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100)
);

INSERT INTO departments (department_id, department_name)
VALUES 
    (1, 'Engineering'),
    (2, 'Sales'),
    (3, 'HR');

INSERT INTO employees_bbsr (employee_id, name, position, hire_date, experience_years, salary, department_id)
VALUES
    (101, 'Alice Johnson', 'Software Engineer', '2018-03-15', 6, 85000, 1),
    (102, 'Bob Smith', 'Data Analyst', '2020-07-01', 4, 60000, 1),
    (103, 'Carol Lee', 'Project Manager', '2015-01-10', 9, 95000, 2),
    (104, 'David Kim', 'HR Manager', '2019-02-12', 5, 55000, 3),
    (105, 'Eva Green', 'Sales Executive', '2021-11-05', 2, 45000, 2);



SELECT name, department_id, salary
FROM employees_bbsr e
WHERE salary > (
    SELECT AVG(salary)
    FROM employees_bssr
    WHERE department_id = e.department_id
);

SELECT 
    SUM(salary) AS total_payroll,
    AVG(salary) AS average_salary
FROM employees;

SELECT 
    name,
    salary,
    CASE 
        WHEN salary < 50000 THEN 'Low'
        WHEN salary BETWEEN 50000 AND 80000 THEN 'Medium'
        ELSE 'High'
    END AS salary_category
FROM employees_bssr;

