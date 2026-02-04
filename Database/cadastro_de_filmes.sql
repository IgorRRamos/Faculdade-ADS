create table filmes (
	id int auto_increment primary key,
    titulo varchar(100) not null,
    diretor varchar(100) not null,
    ano_lancamento int,
    nota double(10, 2) check (nota >= 0 and nota <= 10)
);


insert into filmes(titulo, diretor, ano_lancamento, nota) values("Avatar", "Piong-lee", 2009, 8.5);
insert into filmes(titulo, diretor, ano_lancamento, nota) values("Avengers: Endgame", "Stan Lee", 2019, 8.7);
insert into filmes(titulo, diretor, ano_lancamento, nota) values("Titanic", "Bolsonaro", 1997, 3.8);
insert into filmes(titulo, diretor, ano_lancamento, nota) values("Spider-Man", "Lula", 2021, 4.1);
insert into filmes(titulo, diretor, ano_lancamento, nota) values("Jurassic World", "Mãe", 2015, 9.1);


select * from filmes;
select * from filmes where ano_lancamento <= 2000;
select titulo, diretor from filmes;
select * from filmes order by nota desc;
update filmes set nota = 4.1 where id = 3;
delete from filmes where id = 4;
