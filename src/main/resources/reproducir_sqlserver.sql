CREATE DATABASE JSP_db ON (NAME=JSP_db, FILENAME='D:\databases_sqlserver\JSP_db.mdf')
    LOG ON (NAME=JSP_db_Logcat, FILENAME='D:\databases_sqlserver\JSP_db.ldf');

USE JSP_db

DROP TABLE IF EXISTS users;

CREATE TABLE users (
    name varchar(100) PRIMARY KEY,
    phone varchar(100) NOT NULL,
    friends varchar(100) NOT NULL,
);

INSERT INTO users VALUES ('mike','9890','yotam,tedy');
INSERT INTO users VALUES ('nanduri','8888','tedy,ofek');
INSERT INTO users VALUES ('ofek','2323','tedy,rotem,yotam');
INSERT INTO users VALUES ('rotem','2221','tedy,ofek,yotam');
INSERT INTO users VALUES ('tedy','6666','yotam,ofek,rotem,nanduri');
INSERT INTO users VALUES ('Tom','7654','mike,yotam,tedy');
INSERT INTO users VALUES ('yotam','1234','tedy,ofek,rotem');

GRANT ALL ON users TO JavaExp

/* SELECT * FROM users */