SELECT 
    p.firstName, p.lastName, a.city, a.state
FROM
    Address AS a
        RIGHT JOIN
    Person AS p ON a.personId = p.personId;
