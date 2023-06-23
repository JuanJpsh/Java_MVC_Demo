INSERT INTO Usuario(id, usuario, clave) values(1,'juan solarte','jpsh');
INSERT INTO Usuario(id, usuario, clave) values(2,'maria h','1234');
INSERT INTO Usuario(id, usuario, clave) values(3,'Tom kld','3131');
INSERT INTO Usuario(id, usuario, clave) values(4,'find','rh');

INSERT INTO Producto(id, nombre, precio, fk_usuario) values(1,'papa',10000, 1);
INSERT INTO Producto(id, nombre, precio, fk_usuario) values(2,'cafe',2000, 1);

INSERT INTO Producto(id, nombre, precio, fk_usuario) values(3,'yuca',3000, 2);
INSERT INTO Producto(id, nombre, precio, fk_usuario) values(4,'papa',10000, 3);

INSERT INTO Producto(id, nombre, precio, fk_usuario) values(5,'arroz',4000, 3);
INSERT INTO Producto(id, nombre, precio, fk_usuario) values(6,'platano',1000, 3);