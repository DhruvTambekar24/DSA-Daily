# Write your MySQL query statement below
WITH stadium AS (
    SELECT id,visit_date,people,
        id-ROW_NUMBER() OVER (ORDER BY id) AS grp
    FROM Stadium WHERE people >= 100
),
grps AS (
    SELECT id,visit_date,people,
        COUNT(*) OVER (PARTITION BY grp) AS len
    FROM stadium
)
SELECT id,visit_date,people FROM grps
WHERE len>=3
ORDER BY visit_date ASC;
