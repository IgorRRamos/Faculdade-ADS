
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1)
);

SELECT first_name, last_name FROM patients WHERE gender = 'M';


