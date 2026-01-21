
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL
);

SELECT first_name FROM patients WHERE first_name LIKE 'C%';


