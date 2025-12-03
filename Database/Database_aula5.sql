use aula;
select database ();
create table cidade(
	id int,
    nome varchar(100) not null,
    UF char(02),
    constraint pkCidade primary key (id));
    
create table cliente(
	id int auto_increment,
    nome varchar(100),
    cidadeId int not null,
    constraint pkCliente primary key (id),
    constraint fkClienteCidade foreign key (cidadeId) references cidade(id));
    
    insert into cidade(id, nome, UF) values (1, 'Bage', 'RS');
    
    insert into cidade values(2,'Paracatu', 'MG');
    
    insert into cidade(id, nome) values (3, 'Paraiba');
    
    select * from cidade;
    
    insert into cliente(nome, cidadeid) values ('Igor', 2);
    
    insert into cliente(nome, cidadeid) values ('Rafaela', 1);
    
    insert into cliente(nome, cidadeid) values ('David', 3), ('Maria Eduarda', 2), ('Vinicius', 1);
    
    select * from cliente;
    
    create table funcionario(
		id int,
        nome varchar(100),
        cidadeId int not null,
        constraint fkFuncCidade foreign key (cidadeId) references cidade(id));
	
    insert into funcionario(id, nome, cidadeid)
    select id, nome, cidadeid from cliente;
    
	select * from funcionario;


