# Write your MySQL query statement below
SELECT customer_id , count(*) as count_no_trans 
from Visits as v
 LEFT JOIN 
 Transactions as t 
on
 v.visit_id = t.visit_id WHERE
t.transaction_id IS NULL
GROUP BY customer_id