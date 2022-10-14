CREATE TABLE users
(
      name VARCHAR NOT NULL UNIQUE,
      password VARCHAR NOT NULL

);

INSERT INTO users (name, password)
VALUES ('user1', '123489');



