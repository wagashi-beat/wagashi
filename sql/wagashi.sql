set names utf8;
set foreign_key_checks = 0;
drop database if exists wagashi;

create database if not exists wagashi;
use wagashi;


-- -----------↓会員情報テーブル↓----------------------------
drop table if exists user_info;
create table user_info(
id int not null primary key auto_increment,
user_id varchar(16) unique,
password varchar(16),
family_name varchar(32),
first_name varchar(32),
family_name_kana varchar(32),
first_name_kana varchar(32),
sex tinyint,
email varchar(32),
address varchar(32),
tel_number varchar(16),
status tinyint,
logined tinyint,
regist_date datetime,
update_date datetime
);




-- -----------↓商品情報テーブル↓----------------------------
drop table if exists product_info;
create table product_info(
id int not null primary key auto_increment,
product_id int unique,
product_name varchar(100),
product_name_kana varchar(100),
product_description varchar(255),
category_id int,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date varchar(16),
release_company varchar(50),
status tinyint DEFAULT 0,
regist_date datetime,
update_date datetime,
item_stock int DEFAULT 0,
current_cost double -- ----------------- NEW -------------------
);


drop table if exists cart_info;

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(25),
product_id int,
product_count int,
price int,
regist_date datetime,
update_date datetime,
total_price int
);

drop table if exists favorite_info;

create table favorite_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int,
regist_date datetime,
unique(user_id,product_id)
);

drop table if exists review_info;

create table review_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int,
buy_item_date datetime,
review_id varchar(255),
evaluation_count int
);


-- -----------↓購入履歴テーブル↓----------------------------
drop table if exists purchase_history_info;
create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16), -- unique消しました
product_id int,
product_count int,
price int,
at_cost double, -- ----------------- NEW -------------------
regist_date datetime,
update_date datetime,
status int default 0,
image_file_path varchar(100),
image_file_name varchar(50)
);

drop table if exists destination_info;

create table destination_info(
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

drop table if exists m_category;

create table m_category(
id int not null primary key auto_increment,
category_id int unique,
category_name varchar(20) unique,
category_description varchar(100),
insert_date datetime,
update_date datetime
);

-- ---------------↓INSERT文↓--------------------------------------

INSERT INTO product_info(-- ------商品情報テーブルへ--------------
			product_id, -- 商品ID
			product_name,-- 商品名
			product_name_kana, -- 商品名かな
			product_description, -- 商品詳細
			category_id, -- カテゴリID
			price, -- 販売価格
			image_file_path, -- 画像ファイルパス
			image_file_name, -- 画像ファイル名
			release_date, -- 発売日
			release_company, -- 発売会社
			regist_date, -- 登録日
			item_stock, -- 在庫
			current_cost -- 現在の平均原価
) VALUES(
			10000001, -- 商品ID
			"三色団子", -- 商品名
			"さんしょくだんご", -- 商品名かな
			"三色の団子です。", -- 商品詳細
			1, -- カテゴリID
			1000, -- 販売価格
			"./img/dango.png", -- 画像ファイルパス
			"dango.png", -- 画像ファイル名
			"2010/02", -- 発売日
			"団子屋", -- 発売会社
			now(), -- 登録日
			10, -- 在庫
			700 -- 現在の平均原価
		),

		(
			10000002, -- 商品ID
			"御手洗団子", -- 商品名
			"みたらしだんご", -- 商品名かな
			"みたらし団子です。", -- 商品詳細
			1, -- カテゴリID
			1500, -- 販売価格
			"./img/dango2.png", -- 画像ファイルパス
			"dango2.png", -- 画像ファイル名
			"2018/01", -- 発売日
			"団子屋", -- 発売会社
			now(), -- 登録日
			100, -- 在庫
			650 -- 現在の平均原価
		),

		(
			10000003, -- 商品ID
			"こしあん団子", -- 商品名
			"こしあん団子", -- 商品名かな
			"こしあんの団子です。", -- 商品詳細
			2, -- カテゴリID
			2000, -- 販売価格
			"./img/dango3.png", -- 画像ファイルパス
			"dango3.png", -- 画像ファイル名
			"2000/02", -- 発売日
			"団子屋", -- 発売会社
			now(), -- 登録日
			100, -- 在庫
			1500 -- 現在の平均原価
		),

		(
			10000004, -- 商品ID
			"焼き団子", -- 商品名
			"やきだんご", -- 商品名かな
			"焼き団子です。", -- 商品詳細
			2, -- カテゴリID
			3000, -- 販売価格
			"./img/dango4.png", -- 画像ファイルパス
			"dango4.png", -- 画像ファイル名
			"2017/08", -- 発売日
			"団子堂", -- 発売会社
			now(), -- 登録日
			100, -- 在庫
			400 -- 現在の平均原価
		),

		(
			10000005, -- 商品ID
			"きなこ団子", -- 商品名
			"きなこだんご", -- 商品名かな
			"きなこ団子です。", -- 商品詳細
			3, -- カテゴリID
			8000, -- 販売価格
			"./img/dango5.png", -- 画像ファイルパス
			"dango5.png", -- 画像ファイル名
			"2018/02", -- 発売日
			"団子堂", -- 発売会社
			now(), -- 登録日
			100, -- 在庫
			1000 -- 現在の平均原価
		),

		(
			10000020, -- 商品ID
			"ごま団子", -- 商品名
			"ごまだんご", -- 商品名かな
			"ごま団子です。", -- 商品詳細
			3, -- カテゴリID
			5000, -- 販売価格
			"./img/dango6.png", -- 画像ファイルパス
			"dango6.png", -- 画像ファイル名
			"2015/12", -- 発売日
			"団子堂", -- 発売会社
			now(), -- 登録日
			100, -- 在庫
			600 -- 現在の平均原価
		);




insert into user_info values
(1,
"taro",
"123",
"山田",
"太郎",
"やまだ",
"たろう",
0,
"taro@yahoo.com",
"太郎県太郎市太郎町一太郎",
"09000000000",
1,
1,
"2018/03/01",
"2018/03/05"
);







INSERT INTO purchase_history_info(-- ------購入履歴テーブルへ--------------
			user_id,  -- ユーザーID
			product_id,-- 商品ID
			product_count, -- 購入数
			price, -- 購入時販売価格
			at_cost, -- 購入時原価
			regist_date -- 購入日時
)VALUES(
			"test",  -- ユーザーID
			10000005,-- 商品ID
			1, -- 購入数
			1728, -- 購入時販売価格
			1000, -- 購入時原価
			"2016/01/01" -- 購入日時
		),

		(
			"test1",  -- ユーザーID
			10000003,-- 商品ID
			2, -- 購入数
			6000, -- 購入時販売価格
			1500, -- 購入時原価
			now() -- 購入日時
		),

		(
			"test",  -- ユーザーID
			10000005,-- 商品ID
			10, -- 購入数
			1728, -- 購入時販売価格
			1000, -- 購入時原価
			now() -- 購入日時
		),

		(
			"test1",  -- ユーザーID
			10000020,-- 商品ID
			2, -- 購入数
			40000, -- 購入時販売価格
			20000, -- 購入時原価
			"2017/02/01" -- 購入日時
		),

		(
			"test1",  -- ユーザーID
			10000050,-- 商品ID
			30, -- 購入数
			4000, -- 購入時販売価格
			100, -- 購入時原価
			"2017/01/01" -- 購入日時
		),

		(
			"test",  -- ユーザーID
			10000004,-- 商品ID
			1, -- 購入数
			60000, -- 購入時販売価格
			40000, -- 購入時原価
			"2017/01/01" -- 購入日時
		);

INSERT INTO m_category VALUES(1,1,"団子","団子です","2016/01/01","2016/01/01");
INSERT INTO m_category VALUES(2,2,"だんご","だんごです","2016/01/01","2016/01/01");
INSERT INTO m_category VALUES(3,3,"dango","dangoです","2016/01/01","2016/01/01");




INSERT INTO favorite_info VALUES(1,"test",1,"2016/01/01");
INSERT INTO favorite_info VALUES(2,"test1",2,"2016/01/01");


INSERT INTO review_info VALUES(1,"test",10000004,"2016/01/01","いいキーボードです",3);
INSERT INTO review_info VALUES(2,"test",10000004,"2016/01/01","いい本です",1);
INSERT INTO review_info VALUES(3,"test1",10000004,"2016/01/01","いいキーボードだった",5);



INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("domon",10000002,"2018/01/03","モンハン",5);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("d",10000002,"2018/01/02","さいこう",5);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("n",10000002,"2018/01/01","かよ！！！",5);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("do",10000001,"2018/01/03","くそ",1);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("d",10000003,"2018/01/02","ふつう",3);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("n",10000004,"2018/01/01","いい！！！",5);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("do",10000004,"2018/01/03","まあまあ",3);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("d",10000001,"2018/01/02","さいこう",5);
INSERT INTO review_info(user_id,product_id,buy_item_date,review_id,evaluation_count) VALUES("n",10000001,"2018/01/01","ｆｋんがｄふいがいうｓｐｈｖｆんｖ",2);

