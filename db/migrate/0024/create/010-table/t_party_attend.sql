create table T_PARTY_ATTEND (
    ID int not null auto_increment,
    MEMBER_NUM varchar(255) not null,
    PARTY_NUM varchar(255) not null,
    PARTY_ATTEND_FLRAG varchar(255) not null,
    constraint T_PARTY_ATTEND_PK primary key(ID)
);
