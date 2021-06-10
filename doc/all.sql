drop table if exists `test`;
create table `test`(
`id` bigint not null comment 'id',
`name` varchar(50) comment '名称',
`password` varchar(50) comment '密码',
primary key (id)
) engine=innodb default charset=utf8mb4 comment='测试'
# insert
insert into `test` (id, name, password) VALUES (002,'jackson','12345678')



drop table if exists `demo`;
create table `demo`(
`id` bigint not null comment 'id',
`name` varchar(50) comment '名称',
primary key (id)
) engine=innodb default charset=utf8mb4 comment='测试2'

insert into `demo` (id, name) VALUES (1,'mike')