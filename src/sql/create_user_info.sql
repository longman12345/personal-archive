create table if not exists user_info (
  id bigint(10) not null auto_increment,
  name varchar(20) not null,
  password varchar(20) not null,
  email varchar(32),
  qq varchar(32),
  wechat varchar(32),
  created_date datetime,
  updated_date datetime,
  primary key(id),
  unique key name_password(name,password)
)row_format=dynamic engine=innodb default charset=utf8;