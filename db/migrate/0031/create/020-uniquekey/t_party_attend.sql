alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_UK1 unique (MEMBER_ID);
alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_UK2 unique (PARTY_ID);
alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_UK3 unique (DRINK_AT);
alter table T_PARTY_ATTEND add constraint T_PARTY_ATTEND_UK4 unique (MEETING_AT);
