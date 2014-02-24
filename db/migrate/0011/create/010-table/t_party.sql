create table T_PARTY (
    ID int not null auto_increment,
    PARTY_ID int not null,
    DRUNK_PARTY_TIME timestamp not null,
    DRUNK_PARTY_ROOM varchar(255) not null,
    DRUNK_PARTY_MEMO varchar(255) not null,
    DRUNK_PARTY_DEADLINE timestamp not null,
    constraint T_PARTY_PK primary key(ID)
);
