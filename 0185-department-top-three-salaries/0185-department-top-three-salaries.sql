# Write your MySQL query statement below
SELECT department_name AS Department ,name AS Employee,salary AS Salary FROM (
    SELECT e.name,e.id AS employee_id,d.name AS department_name,e.salary, DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC ) AS rk FROM Employee e JOIN Department d ON e.departmentId=d.id)dq
WHERE rk<= 3;
