insert into user values (90001, sysdate(), 'User1', 'test1111', '701010-1111111');
insert into user values (90002, sysdate(), 'User1', 'test2222', '801010-2111111');
insert into user values (90003, sysdate(), 'User1', 'test3333', '901010-3111111');

insert into post values(10001, 'My first post', 90001);
insert into post values(10002, 'My second post', 90001);