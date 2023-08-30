# Write your MySQL query statement below
SELECT tb1.Name as Employee
FROM Employee as tb1
LEFT JOIN Employee as tb2
ON tb1.ManagerId = tb2.Id
WHERE tb1.Salary > tb2.Salary ;