create table T_PARTY_DRINK_ATTEND (
    ID int not null auto_increment,
    MEMBER_NUM int not null,
    PARTY_NUM int not null,
    PARTY_ATTEND_FLRAG int not null,
    constraint T_PARTY_DRINK_ATTEND_PK primary key(ID)
);
