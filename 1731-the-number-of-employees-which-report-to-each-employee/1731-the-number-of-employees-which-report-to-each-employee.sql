# Write your MySQL query statement below
SELECT e1.employee_id,e1.name,COUNT(e.employee_id) AS reports_count,ROUND(AVG(e.age)) AS average_age
FROM Employees e1
JOIN Employees e ON e1.employee_id=e.reports_to
GROUP BY e1.employee_id,e1.name
ORDER BY e1.employee_id;