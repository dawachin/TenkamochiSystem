alter table T_PARTY add constraint T_PARTY_FK1 foreign key (DRINK_ID) references T_DRINK_PARTY (ID);
alter table T_PARTY add constraint T_PARTY_FK2 foreign key (MEETING_ID) references T_MEETING_PARTY (ID);
