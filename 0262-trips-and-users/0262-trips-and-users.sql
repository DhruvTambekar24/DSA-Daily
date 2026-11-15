# Write your MySQL query statement below
WITH user_trips AS(
    SELECT t.* FROM Trips t JOIN Users u ON t.client_id=u.users_id 
    JOIN Users d ON t.driver_id = d.users_id 
    WHERE u.banned='NO' AND d.banned = 'No'
    AND t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
)
SELECT request_at AS Day,
    ROUND(SUM(CASE WHEN status IN ('cancelled_by_client','cancelled_by_driver')
        THEN 1
        ELSE 0 END)*1.0/COUNT(*),2
    ) AS `Cancellation Rate`
FROM user_trips GROUP BY request_at;