drop table if exists productos;
create table productos(
    idProductos int primary key auto_increment not null,
    nombre      varchar(100),
    precio      int(10),
    stock       int(10) null,
    imagen      varchar(100) null
);
