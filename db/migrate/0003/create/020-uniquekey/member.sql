alter table MEMBER add constraint MEMBER_UK1 unique (NAME);
alter table MEMBER add constraint MEMBER_UK2 unique (HNAME);
alter table MEMBER add constraint MEMBER_UK3 unique (MAIL);
alter table MEMBER add constraint MEMBER_UK4 unique (TEL1);
alter table MEMBER add constraint MEMBER_UK5 unique (TEL2);
alter table MEMBER add constraint MEMBER_UK6 unique (TEL3);
