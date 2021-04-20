DROP TABLE IF EXISTS moneys.USERS;

CREATE TABLE moneys.USERS (ID INT NOT NULL auto_increment,
fName varchar(255) not null,
lname varchar(255) not null,
username varchar(20) not null,
pass varchar(25) not null,
createdDate timestamp null default null,
lastAccessed timestamp null default null,
primary key (id)
);