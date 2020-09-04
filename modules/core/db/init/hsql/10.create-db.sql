-- begin CUBASTUDIOTELEGRAMBOT_LOGIN
create table CUBASTUDIOTELEGRAMBOT_LOGIN (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LOGIN_NAME varchar(255) not null,
    PASSWORD varchar(255),
    --
    primary key (ID)
)^
-- end CUBASTUDIOTELEGRAMBOT_LOGIN
-- begin CUBASTUDIOTELEGRAMBOT_PASSWORD
create table CUBASTUDIOTELEGRAMBOT_PASSWORD (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSWORD varchar(255),
    --
    primary key (ID)
)^
-- end CUBASTUDIOTELEGRAMBOT_PASSWORD
