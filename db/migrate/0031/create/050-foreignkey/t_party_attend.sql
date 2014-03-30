alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_FK1 foreign key (MEMBER_ID) references T_MEMBER (ID);
alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_FK2 foreign key (PARTY_ID) references T_PARTY (ID);
