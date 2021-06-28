# Write your MySQL query statement below
Select MAX(Salary) as SecondHighestSalary from Employee Where salary < (Select MAX(Salary) from employee);