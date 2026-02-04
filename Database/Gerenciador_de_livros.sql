create table livros(
	id int auto_increment primary key,
    titulo varchar(100) not null,
    autor varchar(100) not null,
    ano_publicacao int,
    preco double(10,2)
);
insert into livros(titulo, autor, ano_publicacao, preco) values("A Bíblia", "Espirito Santo", 1922, 10.00);
insert into livros(titulo, autor, ano_publicacao, preco) values("O Alcorão", "Igreja catolica", 1951, 8.00);
insert into livros(titulo, autor, ano_publicacao, preco) values("O pequeno livro vermelho", "Mao-tung", 1988, 5.00);
insert into livros(titulo, autor, ano_publicacao, preco) values("Dom quixote", "Miguel de Cervantes", 1946, 7.00);

select * from livros;

select * from livros where ano_publicacao <= 1950;

select titulo, autor from livros;

select * from livros order by preco asc;

update livros set preco = 15.50 where id = 1;

delete from livros where id = 4;
delete from livros where id = 5;

select * from livros;
