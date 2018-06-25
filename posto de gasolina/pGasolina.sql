create database pGasolina;
use pGasolina;

create table combustivel(
codcomb int not null,
nome varchar(30),
preco double,
primary key(codcomb));

create table fornecedor(
codf int not null,
nome varchar(20),
diaentre date,
primary key(codf));

create table vendedor(
codv int not null,
nome varchar(20),
expediente date,
primary key(codv));

create table cliente(
codcli int not null,
nome varchar(20),
pagamento double,
tipoPagamento varchar(20),
primary key(codcli));

insert into combustivel value
(1,"diesel",4.00),
(2,"etanol",4.00),
(3,"gasolina",4.00);

