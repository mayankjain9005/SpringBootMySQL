CREATE TABLE User (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  points INT,
  PRIMARY KEY (id));
  
  
INSERT INTO User(name,points)VALUES('user1 ',100);
INSERT INTO User(name,points)VALUES('user2',200);
INSERT INTO User(name,points)VALUES('user3',300);
  

CREATE TABLE Room (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  charge  int,
  status VARCHAR(50) ,
  MAPPED_USER_ID INT,
  PRIMARY KEY (id));
  
  
INSERT INTO Room(name,charge,status,MAPPED_USER_ID)VALUES('room1',100,null,null);
INSERT INTO Room(name,charge,status,MAPPED_USER_ID)VALUES('room2',100,null,null);
INSERT INTO Room(name,charge,status,MAPPED_USER_ID)VALUES('room3',100,null,null);
