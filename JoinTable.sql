
SELECT e.first_name, d.name AS department_name
FROM employees e
JOIN departments d ON e.department_id = d.id;
