set names utf8;
set foreign_key_checks= 1;
drop database if exists wagashi;

create database if not exists wagashi;
use wagashi;


create table if not exists user_info(
id int not null primary key auto_increment,
user_id varchar(16) not null unique,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0,
email varchar(32) not null,
status tinyint default 0 not null,
logined tinyint default 0 not null,
regist_date datetime not null,
update_date datetime
);


create table if not exists destination_info(
id int not null primary key auto_increment,
user_id varchar (16),
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32) not null,
tel_number varchar(13) not null,
user_address varchar(50) not null,
regist_date datetime not null,
update_date datetime
);


create table if not exists m_category(
id int not null primary key auto_increment,
category_id int not null unique,
category_name varchar(20) not null unique,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);


create table if not exists product_info(
id int not null primary key auto_increment,
product_id int not null unique,
product_name varchar(100) not null unique,
product_name_kana varchar(100) not null unique,
product_description varchar(255) not null,
category_id int not null,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
regist_date datetime not null,
update_date datetime
);


create table if not exists cart_info(
id int not null primary key auto_increment,
user_id varchar(16),
temp_user_id varchar(128),
product_id int not null,
product_name varchar(255),
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime
);


create table if not exists purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime
);


insert into user_info values (1, "taro", "123", "山田", "太郎", "やまだ", "たろう", 0, "taro@yahoo.com", 1, 1, "2018/03/01", "2018/03/05");

insert into m_category(id,category_id,category_name,category_description,insert_date)
 values (1,1,"団子","団子のカテゴリーです。","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (1,1,"団子","だんご","三色団子です。",1,100,"./img/dango.png","dango.jpg","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (2,2,"みたらし団子","みたらしだんご","みたらし団子です。",1,100,"./img/dango2.png","dango2.jpg","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (3,3,"あんこ団子","あんこだんご","あんこの団子です。",1,100,"./img/dango3.png","dango3.jpg","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (4,4,"焼き団子","やきだんご","焼き団子です。",1,100,"./img/dango4.png","dango4.jpg","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (5,5,"きなこ団子","きなこだんご","きなこ団子です。",1,150,"./img/dango5.png","dango5.jpg","2018-03-07 11:10:10");
insert into product_info(id,product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,regist_date)
values (6,6,"ごま団子","ごまだんご","ごま団子です。",1,200,"./img/dango6.png","dango6.jpg","2018-03-07 11:10:10");

insert into cart_info(user_id,product_id,product_name,product_count,price,regist_date)
values ("taro",1,"団子",1,100,"2018-03-07 11:10:10");