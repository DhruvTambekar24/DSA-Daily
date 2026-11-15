CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      SELECT salary FROM (
         SELECT salary, DENSE_RANK() OVER (ORDER BY SALARY DESC) AS r FROM Employee
      )db
    WHERE r=N
    LIMIT 1
  );
END