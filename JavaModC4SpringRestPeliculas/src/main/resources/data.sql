DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS salas;

CREATE TABLE IF NOT EXISTS peliculas (
						codigo INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
                        calificacion_edad INT DEFAULT NULL,
						PRIMARY KEY(codigo)
						);
                        
CREATE TABLE IF NOT EXISTS salas (
                        codigo INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
						pelicula INT DEFAULT NULL,
						PRIMARY KEY(codigo),
						CONSTRAINT peliculas_fk FOREIGN KEY (pelicula) REFERENCES peliculas (codigo)
                        ON DELETE CASCADE ON UPDATE CASCADE
						);
                        

INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Lo que el viento se llevo', 13);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Juegos del hambre', 21);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Doraemon', 7);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Los Simpsons', 10);
INSERT INTO peliculas (nombre, calificacion_edad) VALUES ('Scream 3', 18);




INSERT INTO salas (nombre, pelicula) VALUES ('Sala1', 1);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala2', 2);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala3', 3);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala4', 4);
INSERT INTO salas (nombre, pelicula) VALUES ('Sala5', 5);

