CREATE DATABASE crud;
use crud;
select database();

show databases;

create table cidade(
	id int,
    nome varchar(100) not null,
    UF char(02)
);

insert into cidade(id, nome, UF) values (1, 'Paracatu', 'MG');
insert into cidade(id, nome, UF) values (2, 'Salvador', 'BA');
insert into cidade(id, nome, UF) values (3, 'Belo Horizonte', 'MG');

update cidade
set nome = 'Camaçari'
where id = 3;

select * from cidade;

delete from cidade where id = 3;