# Write your MySQL query statement below
SELECT email AS Email FROM Person
GROUP BY EMAIL
HAVING COUNT(email)>1;