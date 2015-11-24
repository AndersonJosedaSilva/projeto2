CREATE TABLE cadastro (
  id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  data date not null,
  cidade varchar(70) not null,
  estado varchar(70) not null,
  PRIMARY KEY (id)
)
ENGINE=InnoDB;

INSERT INTO cadastro (id, name, email,data,cidade,estado) VALUES 
    (1, 'Edy Segura', 'edysegura@gmail.com','20/05/1999','Pouso Alegre','MG'),
    (2, 'Lidy Segura', 'lidyber@gmail.com','05/04/1999','Pouso Alegre','MG');