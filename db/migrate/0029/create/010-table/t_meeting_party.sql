create table T_MEETING_PARTY (
    ID int not null auto_increment,
    MEETING_NAME varchar(255) not null,
    MEETING_NECESSARY_FLAG boolean not null,
    MEETING_TIME timestamp not null,
    MEETING_ROOM varchar(255) not null,
    MEETING_MEMO varchar(255) not null,
    MEETING_DEADLINE timestamp not null,
    constraint T_MEETING_PARTY_PK primary key(ID)
);
