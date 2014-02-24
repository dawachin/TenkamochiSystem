create table T_PARTY (
    ID int not null auto_increment,
    PARTY_NAME varchar(255) not null,
    PARTY_NECESSARY_FLAG boolean not null,
    PARTY_TIME timestamp not null,
    PARTY_ROOM varchar(255) not null,
    PARTY_MEMO varchar(255) not null,
    PARTY_DEADLINE timestamp not null,
    DRUNK_PARTY_FLAG boolean not null,
    DRUNK_PARTY_TIME timestamp not null,
    DRUNK_PARTY_ROOM varchar(255) not null,
    DRUNK_PARTY_DEADLINE timestamp not null,
    constraint T_PARTY_PK primary key(ID)
);
