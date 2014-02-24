create table T_PARTY (
    ID int not null auto_increment,
    DRINKPARTY_ID int not null,
    PARTY_NAME varchar(255) not null,
    PARTY_NECESSARY_FLAG boolean not null,
    PARTY_TIME timestamp not null,
    PARTY_ROOM varchar(255) not null,
    PARTY_MEMO varchar(255) not null,
    PARTY_DEADLINE timestamp not null,
    constraint T_PARTY_PK primary key(ID)
);
