CREATE TABLE usuarios (
    id bigint not null AUTO_INCREMENT,
    nombre varchar(100) not null,
    correo_electronico varchar (100) not null unique,
    contrasena varchar(255) not null,

    primary key(id)
);