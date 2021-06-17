create table tbl_top_menu(
    menu_no number(11) primary key,
    menu_name varchar2(255),
    menu_order number(11)
);
    comment on table tbl_top_menu is '대메뉴 테이블';
    comment on column tbl_top_menu.menu_no is 'pk';
    
create table tbl_middle_menu(
    menu_no number(11) primary key,
    menu_name varchar2(255),
    menu_order number(11),
    tbl_top_menu_menu_no number(11) not null,
    constraint tbl_top_menu_menu_no foreign key(tbl_top_menu_menu_no) references tbl_top_menu(menu_no) ON DELETE CASCADE
);
comment on table tbl_middle_menu is '중메뉴 테이블';
create table tbl_bottom_menu(
    menu_no number(11) primary key,
    menu_name varchar2(255),
    menu_order number(11),
    tbl_middle_menu_menu_no number(11) not null,
    constraint tbl_middle_menu_menu_no foreign key(tbl_middle_menu_menu_no) references tbl_middle_menu(menu_no) ON DELETE CASCADE
);
comment on table tbl_bottom_menu is '소메뉴 테이블';

drop table tbl_top_menu;
drop table tbl_middle_menu;
drop table tbl_bottom_menu;