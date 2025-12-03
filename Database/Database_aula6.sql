use aula;
select database();

create table cidade1(id int, nome varchar(100) not null, UF char(02));

insert into cidade1(id, nome, UF) values (1, 'Paracatu', 'MG');
insert into cidade1(id, nome, UF) values (2, 'Bage', 'RS');
insert into cidade1(id, nome, UF) values (3, 'Parnaiba', 'PI');
insert into cidade1(id, nome, UF) values (4, 'Videira', 'SC');
insert into cidade1(id, nome, UF) values (5, 'Imperatriz', 'MA');
insert into cidade1(id, nome, UF) values (6, 'Belo Horizonte', 'MG');
insert into cidade1(id, nome, UF) values (7, 'São paulo', 'SP');

set SQL_SAFE_UPDATES = 0; 

update cidade1
set nome = 'Salvador'
where id = 4;

update cidade1
set nome = 'Camaçari',
UF = 'BA'
where id = 3;

delete from cidade where id = 3;

select * from cidade1;

update cidade1
set nome = 'teste'; 