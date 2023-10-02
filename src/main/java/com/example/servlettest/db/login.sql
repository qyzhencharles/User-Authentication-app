-- Create the login_system database if it doesn't exist
CREATE DATABASE IF NOT EXISTS login_system;

-- Use the login_system database
USE login_system;

-- Create the users table to store user information
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Insert sample user data (optional)
INSERT INTO users (username, password) VALUES
    ('user1', 'hashed_password_1'),
    ('user2', 'hashed_password_2'),
    ('user3', 'hashed_password_3');
