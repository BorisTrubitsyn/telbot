alter table CUBASTUDIOTELEGRAMBOT_LOGIN alter column LOGIN_NAME rename to LOGIN_NAME__U16465 ^
alter table CUBASTUDIOTELEGRAMBOT_LOGIN alter column LOGIN_NAME__U16465 set null ;
alter table CUBASTUDIOTELEGRAMBOT_LOGIN add column LOGIN varchar(255) ^
update CUBASTUDIOTELEGRAMBOT_LOGIN set LOGIN = '' where LOGIN is null ;
alter table CUBASTUDIOTELEGRAMBOT_LOGIN alter column LOGIN set not null ;
