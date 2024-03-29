create database truy_van_du_lieu_csdl_qlsv;
use truy_van_du_lieu_csdl_qlsv;

create table `class`(
	class_id int primary key auto_increment,
    class_name varchar(60) not null,
    start_date datetime not null,
    `status` bit
);

create table student(
	student_id int auto_increment primary key,
	student_name varchar(30) not null,
    address varchar(60),
    phone varchar(20),
    `status` bit,
    class_id int not null,
    foreign key(class_id) references class(class_id)
);

create table `subject`(
	sub_id int auto_increment primary key,
    sub_name varchar(50) not null,
    credit tinyint not null default 1 check (credit >= 1),
    `status` bit default 1
);
create table mark(
	mark_id int auto_increment primary key,
    sub_id int not null,
    student_id int not null,
    mark float default 0 check (mark between 0 and 100),
    exam_times tinyint default 1,
	unique (sub_id, student_id),
    foreign key(sub_id) references `subject`(sub_id),
    foreign key(student_id) references student(student_id)
);

insert into `class` values(1,'a1','2008-11-1',1);
insert into `class` values(2,'a2','2008-12-1',1);
insert into `class` values(3,'a3',current_date(),0);

insert into student (student_name, address, Phone, `Status`, class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_name, address, Phone, `Status`, class_id)
values ('Hoa', 'Hai phong','0912113113', 1, 1);
insert into student (student_name, address, Phone, `Status`, class_id)
values ('Manh', 'HCM', '0123123123', 0, 2);

insert into subject
values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
insert into mark (sub_id, student_id, mark, exam_times)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
select *from student;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’ 
select * from student where student_name like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from `class` where month(start_date) = 12;

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5. 
select * from `subject` having credit >= 3 and 5 >= credit;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2. 
set SQl_SAFE_UPDATES = 0;
update student 
set class_id = 2 
where student_name = 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student_name, sub_name, mark from mark
inner join student on mark.student_id = student.student_id
join `subject` on mark.sub_id = `subject`.sub_id
order by mark.mark desc, student.student_name asc;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from `subject`
where credit = (select max(credit) from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select `subject`.*,mark.mark from `subject` inner join 
mark on subject.sub_id = mark.sub_id
where mark.mark = (select max(mark) from mark);
 
 -- 3. Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần. 
 select student.*, avg(mark.mark) from student inner join
 mark on student.student_id = mark.student_id
 group by student.student_id
 order by avg(mark.mark) desc;