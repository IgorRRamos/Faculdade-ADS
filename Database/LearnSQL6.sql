show databases;
select mysql;
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL,
    weight int
);

SELECT CONCAT(first_name, " ", last_name) FROM patients;


