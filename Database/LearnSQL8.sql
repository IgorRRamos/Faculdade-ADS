show databases;
select mysql;
CREATE TABLE patients(
	patient_id int primary key auto_increment,
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL,
    weight int,
    province_id char(02),
    birth_date date
);

CREATE TABLE provinces(
	provinces_id char(02),
    provinces_name varchar(100)
);
INSERT INTO patients(birth_date) VALUES('28-02-2010');

SELECT COUNT(patient_id) AS TotalOfPatients FROM patients WHERE YEAR(birth_date) = 2010;




