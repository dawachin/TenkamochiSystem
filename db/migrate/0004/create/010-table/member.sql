create table MEMBER (
    ID integer generated by default as identity,
    NAME varchar(255),
    HNAME varchar(255),
    SEX varchar(255) not null,
    MAIL varchar(255),
    DEPARTMENT varchar(255),
    CURRICULUM varchar(255) not null,
    ENTRANCE integer not null,
    GRADE integer not null,
    TEL1 integer not null,
    TEL2 integer not null,
    TEL3 integer not null,
    OFFICER varchar(255) not null,
    USER_NAME varchar(255),
    PASSWORD varchar(255),
    constraint MEMBER_PK primary key(ID)
);
