show databases;
select mysql;
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL,
    weight int
);

INSERT INTO patients(first_name, last_name, gender, weight) VALUES('Igor', 'Ramos', 'M', 110);

SELECT first_name, last_name FROM patients WHERE weight between 100 and 120;


