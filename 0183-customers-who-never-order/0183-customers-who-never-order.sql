# Write your MySQL query statement below
SELECT c.Name as Customers
FROM Customers c
WHERE c.id not in (
SELECT o.CustomerId FROM Orders o
);