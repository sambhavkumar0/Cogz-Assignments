INSERT INTO employees (employee_id, name, position, hire_date, experience_years, salary)
VALUES 
  (101, 'Alice Johnson', 'Software Engineer', '2018-03-15', 6, 85000),
  (102, 'Bob Smith', 'Data Analyst', '2020-07-01', 4, 60000),
  (103, 'Carol Lee', 'Project Manager', '2015-01-10', 9, 95000);


UPDATE employees
SET salary = salary * 1.10
WHERE experience_years > 5;

DELETE FROM customers
WHERE last_login < DATE_SUB(CURRENT_DATE, INTERVAL 2 YEAR);