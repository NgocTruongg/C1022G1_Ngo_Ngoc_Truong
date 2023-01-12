create database csdl_quan_ly_ban_hang;
use csdl_quan_ly_ban_hang;

create table customer(
	c_id int primary key,
    c_name varchar(50),
    c_age int
);
create table product(
	p_id int primary key,
    p_name varchar(50),
    p_price int
);
create table `order`(
	o_id int primary key,
    c_id int,
    o_date datetime,
    o_tatal_price double,
    foreign key (c_id) references customer(c_id)
);

create table order_detail(
	o_id int,
    p_id int,
    od_qty int,
    primary key(o_id, p_id),
    foreign key(o_id) references `order`(o_id),
    foreign key(p_id) references product(p_id)
);

insert into customer values (1, 'minh quan', 10);
insert into customer values (2, 'ngoc oanh', 20);
insert into customer values (3, 'hong ha', 50);

insert into `order` values (1, 1, '2006-3-21', null);
insert into `order` values (2, 2, '2006-3-23', null);
insert into `order` values (3, 1, '2006-3-16', null);

insert into product values (1, 'may giat', 3);
insert into product values (2, 'tu lanh', 3);
insert into product values (3, 'dieu hoa', 3);
insert into product values (4, 'quat', 3);
insert into product values (5, 'bep dien', 3);

insert into order_detail (o_id, p_id, od_qty) values (1, 1, 3);
insert into order_detail (o_id, p_id, od_qty) values (1, 3, 7);
insert into order_detail (o_id, p_id, od_qty) values (1, 4, 2);
insert into order_detail (o_id, p_id, od_qty) values (2, 1, 1);
insert into order_detail (o_id, p_id, od_qty) values (3, 1, 8);
insert into order_detail (o_id, p_id, od_qty) values (2, 5, 4);
insert into order_detail (o_id, p_id, od_qty) values (2, 3, 3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
-- select * from `order`;
select o_id, o_date, o_tatal_price from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select c_name 'Danh sách khách mua hàng', o_date 'Thời gian' from `order`
inner join customer on `order`.c_id = customer.c_id;
select c_name, p_name, o_date from order_detail o
inner join product on o.p_id = product.p_id
inner join `order` on o.o_id = `order`.o_id
inner join customer on `order`.c_id = customer.c_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select * from customer
where customer.c_name not in( 
select c_name from `order`
join customer on `order`.c_id = customer.c_id);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất
--  hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)
select `order`.o_id,
       `order`.o_date,
       order_detail.od_qty * product.p_price AS 'order_total_price'
from `order`
join order_detail on `order`.o_id = order_detail.o_id
join product on order_detail.p_id = product.p_id;
