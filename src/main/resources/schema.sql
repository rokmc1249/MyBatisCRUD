CREATE TABLE tbl_board(
    boardId Long auto_increment,
    title varchar(30) not null,
    content varchar(30) not null,
    name varchar(30) not null,
    read integer default 0,
    primary key(boardId)
    );

insert into tbl_board(title,content,name) values('타이틀1','컨텐트1','네임1');
insert into tbl_board(title,content,name) values('타이틀2','컨텐트2','네임2');
insert into tbl_board(title,content,name) values('타이틀3','컨텐트3','네임3');
insert into tbl_board(title,content,name) values('타이틀4','컨텐트4','네임4');
insert into tbl_board(title,content,name) values('타이틀5','컨텐트5','네임5');
insert into tbl_board(title,content,name) values('타이틀6','컨텐트6','네임6');
insert into tbl_board(title,content,name) values('타이틀7','컨텐트7','네임7');
insert into tbl_board(title,content,name) values('타이틀8','컨텐트8','네임8');
insert into tbl_board(title,content,name) values('타이틀9','컨텐트9','네임9');
insert into tbl_board(title,content,name) values('타이틀10','컨텐트10','네임10');