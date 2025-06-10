
/* salary above average salary*/

SELECT name, salary
FROM employees_bbsr
WHERE salary > (
    SELECT AVG(salary) FROM employees_bbsr
);



/* Top 3 highest-paid employees */

SELECT name, salary
FROM employees_bbsr
ORDER BY salary DESC
LIMIT 3;





/* Employees in Sales department with salary above 50,000 */

SELECT name, department_id AS department, salary
FROM employees_bbsr
WHERE salary > 50000 AND department_id = 2  -- Sales department
ORDER BY salary DESC;