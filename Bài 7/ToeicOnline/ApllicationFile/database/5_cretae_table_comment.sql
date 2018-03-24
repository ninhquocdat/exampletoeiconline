create table comment(
  commentid bigint not null primary key auto_increment,
  content text null,
  userid bigint null,
  listenguidlineid bigint null,
  createddate timestamp null
);