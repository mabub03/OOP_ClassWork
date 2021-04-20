CREATE TABLE moneys.Deposits (ID INT NOT NULL auto_increment,
name varchar(255) not null,
AmountIn decimal not null,
recurring varchar(1)  not null,
howOften varchar(50),
createdDate timestamp null default null,
userId	int not null,
FOREIGN KEY (USERID) REFERENCES moneys.users(Id),
PRIMARY KEY (id)
);