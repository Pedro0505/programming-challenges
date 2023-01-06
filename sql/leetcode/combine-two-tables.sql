-- https://leetcode.com/problems/combine-two-tables/submissions/872126205/

SELECT 
    p.firstName, p.lastName, a.city, a.state
FROM
    Address AS a
        RIGHT JOIN
    Person AS p ON a.personId = p.personId;
