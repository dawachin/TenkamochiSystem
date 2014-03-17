create table T_MEMBER_CLUB (
    ID int not null auto_increment,
    MEMBER_ID varchar(255),
    CLUB_ID varchar(255),
    constraint T_MEMBER_CLUB_PK primary key(ID)
);
