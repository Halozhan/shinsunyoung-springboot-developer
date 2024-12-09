create database blog;
use blog;
create table article (
    id BIGINT not null auto_increment primary key,
    author varchar(255) not null,
    content varchar(255) not null,
    created_at timestamp,
    title varchar(255) not null,
    updated_at timestamp,
);
create table refresh_token (
    id BIGINT not null auto_increment primary key,
    refresh_token varchar(255) not null,
    user_id BIGINT not null,
);
create table users (
    id BIGINT not null auto_increment primary key,
    created_at timestamp,
    email varchar(255) not null,
    nickname varchar(255),
    password varchar(255),
    updated_at timestamp,
)