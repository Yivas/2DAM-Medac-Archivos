-- Creamos la tabla DATOS_PERSONALES
DROP TABLE IF EXISTS DATOS_PERSONALES;
CREATE TABLE DATOS_PERSONALES(ID INT PRIMARY KEY,NOMBRE VARCHAR(50),APELLIDOS VARCHAR(50),DIRECCION VARCHAR(50),LOCALIDAD VARCHAR(50),CP INT,TELEFONO INT,MAIL VARCHAR(50),FECHA_NACIMIENTO DATE);

-- Insertamos 10 personas en la tabla DATOS_PERSONALES
INSERT INTO DATOS_PERSONALES VALUES(1,'Juan','Garcia Lopez','Calle 2','Madrid',28100,123456789,'correo@gmail.com','1990-01-01');
INSERT INTO DATOS_PERSONALES VALUES(2,'Pedro','Lopez Lopez','Avenida 1','Sevilla',28045,823256789,'pd@hotmail.com','1995-03-02');
INSERT INTO DATOS_PERSONALES VALUES(3,'Marcos','Martinez Echevarria','Calle 3','Madrid',28070,163453182,'marcos@gmail.com','1992-05-03');
INSERT INTO DATOS_PERSONALES VALUES(4,'Maria','Martinez Perez','Calle 4','Barcelona',29002,123456789,'barce@hotmail.com','2003-12-21');
INSERT INTO DATOS_PERSONALES VALUES(5,'Ana','Perez Perez','Calle 5','Zaragoza',34002,118276789,'anaperez@gmail.com','1998-06-12');
INSERT INTO DATOS_PERSONALES VALUES(6,'Luis','Garcia Lopez','Avenida 6','Valencia',50902,728451289,'galoluis@gmail.com','1997-07-11');
INSERT INTO DATOS_PERSONALES VALUES(7,'Antonio','Rivas Lopez','Calle 6','Madrid',28002,115556789,'anrivaslo@hotmail.com','1981-08-10');
INSERT INTO DATOS_PERSONALES VALUES(8,'Jose','Garcia Lopez','Calle 1','Badalona',98101,153651729,'bad98@outlook.com','1999-09-09');
INSERT INTO DATOS_PERSONALES VALUES(9,'Luis','Martinez Gonzalez','Avenida 9','Madrid',28022,915356789,'mangon@gmail.com','1996-10-08');
INSERT INTO DATOS_PERSONALES VALUES(10,'Maria','Garcia Lopez','Calle 10','Madrid',28002,123456789,'mariagarcia@gmail.com','1990-11-07');

-- Creamos la tabla ALUMNOS a partir de DATOS_PERSONALES
DROP TABLE IF EXISTS ALUMNOS;
CREATE TABLE ALUMNOS AS SELECT * FROM DATOS_PERSONALES;

-- Borramos la tabla DATOS_PERSONALES
DROP TABLE IF EXISTS DATOS_PERSONALES;

-- Insertamos 10 alumnos en la tabla ALUMNOS
INSERT INTO ALUMNOS VALUES(11,'Juan','Garcia Lopez','Calle 2','Madrid',28100,123456789,'garcialopez@gmail.com','1999-11-01');
INSERT INTO ALUMNOS VALUES(12,'Pedro','Lopez Lopez','Avenida 1','Sevilla',28045,823256789,'pedro@hotmail.com','1995-03-02');
INSERT INTO ALUMNOS VALUES(13,'Marcos','Martinez Echevarria','Calle 3','Madrid',28070,163453182,'martinmarcos@yahoo.es','1982-05-03');
INSERT INTO ALUMNOS VALUES(14,'Maria','Gonzalez Perez','Calle 4','Barcelona',29002,123456789,'mariagonzales@yahoo.es','2003-12-21');
INSERT INTO ALUMNOS VALUES(15,'Ana','Perez Perez','Calle 5','Zaragoza',34002,118276789,'anaperez2@gmail.com','1998-06-12');
INSERT INTO ALUMNOS VALUES(16,'Luis','Garcia Lopez','Avenida 6','Valencia',50902,728451289,'luisvalenuwu@outlook.com','1987-07-11');
INSERT INTO ALUMNOS VALUES(17,'Antonio','Rivas Lopez','Calle 6','Madrid',28002,115556789,'antowonio@outlook.com','1981-08-10');
INSERT INTO ALUMNOS VALUES(18,'Jose','Martinez Lopez','Calle 1','Badalona',98101,153651729,'joserciabad@gmail.com','1979-09-09');
INSERT INTO ALUMNOS VALUES(19,'Alejandra','Martinez Gonzalez','Avenida 9','Madrid',28022,915356789,'alyxvance@gmail.com','1996-10-08');
INSERT INTO ALUMNOS VALUES(20,'Maria','Soler Martinez','Calle 10','Sevilla',28002,123456789,'vivamisevillita@gmail.com','2004-11-07');

-- Borrar las filas de alumnos menores de 23 años
DELETE FROM ALUMNOS WHERE YEAR(FECHA_NACIMIENTO) < 1997;

-- Actualizar el campo mail de los alumnos no residentes en Sevilla por el mail foraneos.add@medac.es
UPDATE ALUMNOS SET MAIL = 'foraneos.add@medac.es' WHERE LOCALIDAD != 'Sevilla';

-- Hacer una selección de los alumnos entre 24 y 28 años ordenado dicha selección por edad
SELECT * FROM ALUMNOS WHERE YEAR(FECHA_NACIMIENTO) BETWEEN 1993 AND 1997 ORDER BY FECHA_NACIMIENTO;

-- Buscar los alumnos cuyo apellido empiece por M y S
SELECT * FROM ALUMNOS WHERE APELLIDOS LIKE 'M%' OR APELLIDOS LIKE 'S%';





