create database relojoaria;
use relojoaria;

create table produtos(
codpro int not null,
nomep varchar(15),
preco double,
datap date,
fornecedor varchar(15),
primary key(codpro));

insert into produtos value
(4,"relogio de parede","50.00","2018-05-14","Jacob"),
(5,"relogio de pulso","123.00","2018-05-14","Jacob"),
(6,"relojio de plastico","23.00","2018-05-14","Jacob");