create database bd_biblioteca;

use bd_biblioteca;

create table autores(
Pk_IdAutor int,
NomeAutor varchar(50),
PaisOrigem varchar(50),
DataNasci date,
EnderecoAutor varchar(50)
);




insert into autores values(
 1,
'Gillian Flynn',
'Estados Unidos',
'2000-07-17',
'2103  Randall Drive'
);

select *from autores;


create table livros(
Pk_IdLIvros int,
NomeLivro varchar(60),
Fk_IdAutor int,
Genero varchar(50),
DataPublicacao date,
TipoCapa varchar(20),
Rating varchar(12),
Fk_IdEditora int,
JaComprei enum('Sim', 'Não'),
DataCompra date,
Valor float
);

insert into livros values(
3,
'O ALquimista',
2,
'Romance, ',
'1988-00-00',
'Capa Dura',
'Não tem',
2,
'Não',
'0000-00-00',
64.90
);

select *from livros;

create table editora(
Pk_IdEditora int,
NomeEditora varchar(50),
NumeroEditora numeric(12)
);

insert into editora values(
3,
'Rocco',
'2025550171'
);