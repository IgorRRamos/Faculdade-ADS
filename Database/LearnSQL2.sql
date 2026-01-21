
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) null
);

SELECT first_name, last_name FROM patients WHERE allergies IS NULL;


