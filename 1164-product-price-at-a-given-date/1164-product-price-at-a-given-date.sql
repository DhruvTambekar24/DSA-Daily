# Write your MySQL query statement below
SELECT  p.product_id,COALESCE(p1.new_price, 10) AS price FROM 
(SELECT DISTINCT product_id FROM Products) p LEFT JOIN products p1 
ON p.product_id=p1.product_id AND p1.change_date=(SELECT MAX(change_date) FROM Products 
WHERE product_id=p.product_id AND change_date<='2019-08-16');