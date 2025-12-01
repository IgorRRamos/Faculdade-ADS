show databases;
create database aula;
use aula;
create table cidade(
	id int primary key auto_increment,
    nome varchar(120) not null,
    cepGeral int unsigned zerofill);
    
alter table cidade
add dddd char(05);
describe cidade;

alter table cidade 
change dddd ddd char(05);

alter table cidade
modify ddd char(03);

insert into cidade (nome, cepGeral, ddd)
values ('Salvador', 765567, 045);
select * from cidade;

insert into cidade(nome, cepGeral, ddd)
values ('Minas Gerais', 38600000, 555);
select * from cidade;

alter table cidade
drop cepGeral;