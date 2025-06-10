-- Authors Table
CREATE TABLE authors (
    author_id INT PRIMARY KEY,
    name VARCHAR(100),
    country VARCHAR(50)
);

-- Publishers Table
CREATE TABLE publishers (
    publisher_id INT PRIMARY KEY,
    name VARCHAR(100),
    city VARCHAR(100)
);

-- Books Table
CREATE TABLE books (
    book_id INT PRIMARY KEY,
    title VARCHAR(150),
    genre VARCHAR(50),
    publication_year INT,
    author_id INT,
    publisher_id INT,
    FOREIGN KEY (author_id) REFERENCES authors(author_id),
    FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)
);


-- Authors
INSERT INTO authors (author_id, name, country) VALUES
(1, 'George Orwell', 'UK'),
(2, 'Haruki Murakami', 'Japan'),
(3, 'J.K. Rowling', 'UK');

-- Publishers
INSERT INTO publishers (publisher_id, name, city) VALUES
(1, 'Penguin Random House', 'New York'),
(2, 'Bloomsbury', 'London'),
(3, 'Kodansha', 'Tokyo');

-- Books
INSERT INTO books (book_id, title, genre, publication_year, author_id, publisher_id) VALUES
(101, '1984', 'Dystopian', 1949, 1, 1),
(102, 'Kafka on the Shore', 'Fiction', 2002, 2, 3),
(103, 'Harry Potter and the Philosopher\'s Stone', 'Fantasy', 1997, 3, 2),
(104, 'Norwegian Wood', 'Romance', 1987, 2, 3),
(105, 'Animal Farm', 'Political Satire', 1945, 1, 1);




-- Query to retrieve the title, genre, publication year, author name, and author's country for all books
-- ordered by the publication year in descending order
SELECT 
    b.title,
    b.genre,
    b.publication_year,
    a.name AS author_name,
    a.country
FROM books b
JOIN authors a ON b.author_id = a.author_id;



SELECT 
    a.name AS author_name,
    COUNT(b.book_id) AS book_count
FROM authors a
JOIN books b ON a.author_id = b.author_id
GROUP BY a.name
ORDER BY book_count DESC;


SELECT title, genre, publication_year
FROM books
WHERE publication_year > 2000;

SELECT title, genre, publication_year
FROM books
WHERE genre = 'Fantasy';
