use database toeiconline;
alter table user add column roleid bigint;
alter table user add constraint fk_user_role foreign key(roleid) references role(roleid);
alter table comment add constraint fk_user_comment foreign key(userid) references user(userid);
alter table comment add constraint fk_listentguiline_comment foreign key(listenguidlineid) references listenguidline(listenguidlineid);