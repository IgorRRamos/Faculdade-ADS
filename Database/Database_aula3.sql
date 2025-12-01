use aula;

create table aluno(
	id int primary key,
	nome varchar(130) not null,
	genero char(01),
	estadoCivil char(01) check (estadoCivil in ('s', 'c', 'v')),
	renda decimal (10,2) default 0
);

insert into aluno (id, nome, gereno, estadoCivil, renda)
values(111, 'Igor', 'M', 'S', 17,50)