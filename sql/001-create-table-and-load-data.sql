DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  director VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, director) VALUES ("TopGun", "Tony Scott");
INSERT INTO movies (name, director) VALUES ("JurassicPark", "Steven Spielberg");
INSERT INTO movies (name, director) VALUES ("Spider-Man", "Samuel M. Raimi");
