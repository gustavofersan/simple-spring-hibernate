CREATE TABLE CONTACTO (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(30),
apellido VARCHAR(30),
telefono VARCHAR(15),
email VARCHAR(30),
creacion TIMESTAMP DEFAULT NOW()
);