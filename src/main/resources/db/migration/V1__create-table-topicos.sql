create table topicos(
    id bigint not null auto_increment,
    idUsuario varchar(100) not null,
    mensaje varchar(100) not null,
    nombre varchar(100) not null,
    categoria varchar(100) not null,
    titulo varchar(100) not null,

    primary key(id)


);