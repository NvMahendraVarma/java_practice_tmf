CREATE DATABASE userdb;
USE userdb;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
CREATE TABLE transaction_table (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    transaction_date DATE NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    customer_id INT NOT NULL,
    payment_method VARCHAR(50) NOT NULL
);
INSERT INTO transaction_table (transaction_date, amount, customer_id, payment_method) VALUES
('2023-10-01', 100.50, 1, 'Credit Card'),
('2023-10-01', 200.75, 2, 'Debit Card'),
('2023-10-02', 50.00, 3, 'Credit Card'),
('2023-10-02', 300.00, 4, 'Debit Card'),
('2023-10-03', 150.25, 5, 'Credit Card'),
('2023-10-03', 75.60, 1, 'Debit Card'),
('2023-10-04', 220.00, 2, 'Credit Card'),
('2023-10-04', 90.00, 3, 'Debit Card'),
('2023-10-05', 130.00, 4, 'Credit Card'),
('2023-10-05', 45.75, 5, 'Debit Card'),
('2023-10-06', 500.00, 1, 'Credit Card'),
('2023-10-06', 60.00, 2, 'Debit Card'),
('2023-10-07', 80.00, 3, 'Credit Card'),
('2023-10-07', 250.00, 4, 'Debit Card'),
('2023-10-08', 95.00, 5, 'Credit Card'),
('2023-10-08', 120.00, 1, 'Debit Card'),
('2023-10-09', 300.00, 2, 'Credit Card'),
('2023-10-09', 70.00, 3, 'Debit Card'),
('2023-10-10', 180.00, 4, 'Credit Card'),
('2023-10-10', 40.00, 5, 'Debit Card'),
('2023-10-11', 210.00, 1, 'Credit Card'),
('2023-10-11', 55.00, 2, 'Debit Card'),
('2023-10-12', 90.00, 3, 'Credit Card'),
('2023-10-12', 150.00, 4, 'Debit Card'),
('2023-10-13', 400.00, 5, 'Credit Card'),
('2023-10-13', 65.00, 1, 'Debit Card'),
('2023-10-14', 85.00, 2, 'Credit Card'),
('2023-10-14', 130.00, 3, 'Debit Card'),
('2023-10-15', 75.00, 4, 'Credit Card'),
('2023-10-15', 200.00, 5, 'Debit Card');
SELECT *FROM transaction_table;
DESCRIBE transaction_table;