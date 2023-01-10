create database student_management;
use student_management;

create table class (
	`id` int,
    `name` varchar(50)
);

insert into class(id, name) values ( 1, "nam");
insert into class(id, name) values ( 2, "sơn");
insert into class(id, name) values ( 3, "hải");
select * from class;

insert into class(id, name) values(4, "song");
create table student(
	`id` int,
	`name` varchar(50),
    `age` int,
    `country` varchar(50)
);
insert into student (id, name, age, country) values (1, "hải", 23, "vietnam");
insert into student (id, name, age, country) values (2, "tú", 24, "vietnam");
insert into student (id, name, age, country) values (3, "khải", 25, "vietnam");

select * from student;