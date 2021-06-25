# Write your MySQL query statement below
select Name as "Customers"
from customers 
left join orders
on customers.Id = orders.CustomerId 
where CustomerId is Null 