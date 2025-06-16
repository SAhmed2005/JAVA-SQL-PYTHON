SELECT AVG(salary) AS avg_salary FROM employees;

SELECT hire_date, COUNT(*) AS total_hired
FROM employees
GROUP BY hire_date;
