show databases;
select mysql;
CREATE TABLE patients(
	first_name varchar(100),
    last_name varchar(100),
    gender char(1),
    allergies varchar(100) NULL,
    weight int,
    province_id char(02)
);

CREATE TABLE provinces(
	provinces_id char(02),
    provinces_name varchar(100)
);

INSERT INTO provinces(provinces_id, provinces_name) values ('ON', 'Ontario');

SELECT p.first_name, p.last_name, pr.provinces_name AS provinces_full FROM patients p 
JOIN provinces pr ON p.province_id = pr.province_id;



