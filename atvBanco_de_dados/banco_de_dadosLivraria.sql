create database bd_biblioteca;

use bd_biblioteca;

create table autor(
Pk_IdAutor int,
NomeAutor varchar(50),
PaisOrigem varchar(50),
DataNasci date
);




insert into autor values(
 1,
'julius silva',
'Estados Unidos',
'2000-07-17'
);

select *from autor;


create table livro(
pk_IdLivro int,
nomeLivro varchar(60),
fk_IdAutor int,
genero varchar(50),
dataPublicacao date,
tipoCapa varchar(20),
rating varchar(12),
fk_IdEditora int

);

insert into livro values(
3,
'game of thrones',
2,
'ficcao, ',
'2000-01-10',
'Capa Dura',
'Não tem',
2
);
 
select *from livros;

create table editora(
Pk_IdEditora int,
telefone int,
idLivro int
);

insert into editora values(
3,
451681416,
5
);

create table compra (
idCompra int,
idLivro int,
idAutor int,
JaComprei enum('Sim', 'Não'),
dataCompra date,
valor float
);


insert into compra values(
2,
3,
5,
'Sim',
'2000-10-07',
150.90
);

