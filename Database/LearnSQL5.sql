show databases;
select mysql;
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL,
    weight int
);

UPDATE patients SET allergies = 'NKA' WHERE allergies IS NULL;


