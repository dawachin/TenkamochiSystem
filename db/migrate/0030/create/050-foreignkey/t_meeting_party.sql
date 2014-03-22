alter table T_MEETING_PARTY add constraint T_MEETING_PARTY_FK1 foreign key (ID) references T_PARTY (MEETING_ID);
