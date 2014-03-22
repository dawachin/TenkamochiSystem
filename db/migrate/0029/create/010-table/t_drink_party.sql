create table T_DRINK_PARTY (
    ID int not null auto_increment,
    DRUNK_TIME timestamp not null,
    DRUNK_ROOM varchar(255) not null,
    DRUNK_MEMO varchar(255) not null,
    DRUNK_DEADLINE timestamp not null,
    constraint T_DRINK_PARTY_PK primary key(ID)
);
