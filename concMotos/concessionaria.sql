create database concessionaria;
use concessionaria;

create table descricao(
id_descricao int not null auto_increment,
nome varchar(30),
preco float not null,
ano int not null,
primary key(id_descricao)
);

create table funcionario(
id_funcionario int not null auto_increment,
nome varchar(30),
expediente varchar(10),
salario float,
primary key(id_funcionario)
);

create table cliente(
id_cliente int not null auto_increment,
nome varchar(30),
RG varchar(30),
CNH int not null,
primary key(id_cliente)
);

insert into descricao(id_descricao,nome,preco,ano)
value(1,"XJ6",28.200,2017);
insert into descricao(nome,preco,ano)
value("Hornet",35.140,2018),
("Z1000",55.990,2019),
("Z800",37.990,2017);

insert into funcionario(id_funcionario,nome,expediente,salario) value
(1,"Marcus","manhã",3.500);
insert into funcionario(nome,expediente,salario) value
("Matuê","manhã",3.500),
("Wosvald","tarde",1.900),
("Fabinho","tarde",2.201);

insert into cliente(id_cliente,nome,RG,CNH) value
(1,"Marcus","15.644.046-5",43595200943);
insert into cliente(nome,RG,CNH) value
("Augusto","44.421.879-8",31905001815),
("Claudiney","37.981.661-1",77090006202),
("Matheus","38.411.414-3",52749148806);
