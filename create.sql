CREATE DATABASE lend;
     \c lend
    CREATE TABLE IF NOT EXISTS lend (
    id SERIAL PRIMARY KEY,
    name VARCHAR,
    age int,
    occupation VARCHAR,
    totalincome int,
    loanamount int,
    loanpurpose VARCHAR);