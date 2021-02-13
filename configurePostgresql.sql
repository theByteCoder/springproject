CREATE TABLE student (
	id serial NOT NULL,
	name VARCHAR(100) NOT NULL ,
	email VARCHAR(100) DEFAULT NULL,
	dob DATE DEFAULT NULL,
	age NUMERIC DEFAULT NULL,
	PRIMARY KEY (id)
);

insert into student(id, name, email, dob, age)
values(1,'Subhasish Ghosh','subhasish064@gmail.com', TO_DATE('23/02/1991', 'DD/MM/YYYY'),29)

select * from student;
DELETE from student where id = 1;

GRANT All PRIVILEGES ON DATABASE "student" TO postgres;