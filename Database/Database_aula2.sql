select aula;

create table cidade(
	id int primary key,
    nome varchar(100),
    sigla char(3) unique);

insert into cidade(id, nome, sigla)
values (1, 'Paracatu', 'PTU');

select * from cidade;

insert into cidade(id, nome, sigla)
values (2, 'Belo Horizonte', 'BHM');

select * from cidade;

insert into cidade(id, nome, sigla)
values (3, 'Salvador', 'SLD');

select * from cidade;

create table cliente(
id int primary key,
nome varchar(100),
idcidade int,
constraint fkclienteCidade foreign key (idcidade)
references cidade(id));

insert into cliente values(1, 'Igor', 1);
insert into cliente values(2, 'Rafaela', 6)
