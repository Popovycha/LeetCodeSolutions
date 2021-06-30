# Write your MySQL query statement below
with temp as (
select id, recordDate, lag(recordDate, 1) over (order by recordDate) as previous_date,
    Temperature, lag(Temperature, 1) over (order by recordDate) as previous_temperature
from Weather
)
select id from temp where Temperature > previous_temperature and datediff(recordDate, previous_date) = 1