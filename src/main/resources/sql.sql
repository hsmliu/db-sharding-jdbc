SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Create DataBases
-- ----------------------------
create databases db_shardingjdbc_0;
create databases db_shardingjdbc_1;
create databases db_shardingjdbc_2;
create databases db_shardingjdbc_3;

-- >>>>>>>>>>创建用户表<<<<<<<<<<<
drop table if exists `user_info`;
create table `user_info`  (
                              `user_id` bigint not null comment '用戶id',
                              `user_name` varchar(255) comment '用戶姓名',
                              `user_sex` varchar(255) comment '用戶性別',
                              `user_age` int(8) not null comment '用戶年齡',
                              primary key (`user_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建商品表0<<<<<<<<<<<
drop table if exists shopping_00;
create table `shopping_00`  (
                                `shopping_id` bigint not null comment '商品id',
                                `shopping_name` varchar(255) comment '商品名称',
                                `shopping_price` int(8) not null comment '商品价格',
                                primary key (`shopping_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建商品表1<<<<<<<<<<<
drop table if exists shopping_01;
create table `shopping_01`  (
                                `shopping_id` bigint not null comment '商品id',
                                `shopping_name` varchar(255) comment '商品名称',
                                `shopping_price` int(8) not null comment '商品价格',
                                primary key (`shopping_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建商品表2<<<<<<<<<<<
drop table if exists shopping_02;
create table `shopping_02`  (
                                `shopping_id` bigint not null comment '商品id',
                                `shopping_name` varchar(255) comment '商品名称',
                                `shopping_price` int(8) not null comment '商品价格',
                                primary key (`shopping_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建商品表3<<<<<<<<<<<
drop table if exists shopping_03;
create table `shopping_03`  (
                                `shopping_id` bigint not null comment '商品id',
                                `shopping_name` varchar(255) comment '商品名称',
                                `shopping_price` int(8) not null comment '商品价格',
                                primary key (`shopping_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建订单表<<<<<<<<<<<
drop table if exists `order`;
create table `order`  (
                          `order_id` bigint not null comment  '订单号',
                          `order_price` int(8) not null comment '订单总金额',
                          `user_id` bigint not null comment '用戶id',
                          primary key (`order_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;

-- >>>>>>>>>>创建订单详情表<<<<<<<<<<<
drop table if exists `order_info`;
create table `order_info`  (
                               `order_info_id` bigint not null comment  '订单详情号',
                               `order_id`  bigint not null comment '订单号',
                               `shopping_name` varchar(255)  comment '商品名称',
                               `shopping_price` int(8) not null comment '商品价格',
                               primary key (`order_info_id`) using btree,
                               index `key_order_id`(`order_id`) using btree
)
    engine = InnoDB
character set = utf8
collate = utf8_general_ci
row_format = compact;


-- >>>>>>>>>>创建地区表<<<<<<<<<<<
-- drop table if exists `address`;
-- create table `address`  (
--   `address_id` bigint not null comment  '地址ID',
--   `province`  bigint not null comment '省',
--   `city` varchar(255)  comment '市',
--   `county_or_district` int(8) not null comment '县或区',
--   primary key (`address_id`) using btree
-- )
-- engine = InnoDB
-- character set = utf8
-- collate = utf8_general_ci
-- row_format = compact;