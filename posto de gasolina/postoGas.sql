create database postoGas;
use postoGas;

create table combustivel(
codcomb int not null,
nome varchar(30),
fornecedor varchar(39),
preco double,
primary key(codcomb));

insert into combustivel value
(1,"diesel","ddGas",4.00),
(2,"etanol","ddGas",4.00),
(3,"gasolina","ddGas",4.00),
(4,"Ditivada","ddGas",4.00);