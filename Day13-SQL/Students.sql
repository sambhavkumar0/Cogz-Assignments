CREATE TABLE STUDENTS (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    marks FLOAT
);

INSERT INTO STUDENTS VALUES (1, 'Alice', 20, 88.5);
INSERT INTO STUDENTS VALUES (2, 'Bob', 22, 67.0);
INSERT INTO STUDENTS VALUES (3, 'Charlie', 19, 91.0);
INSERT INTO STUDENTS VALUES (4, 'David', 21, 74.5);
INSERT INTO STUDENTS VALUES (5, 'Eva', 23, 80.0);


SELECT * FROM STUDENTS ORDER BY age;

SELECT * FROM STUDENTS WHERE marks > 75;

SELECT * FROM STUDENTS;
