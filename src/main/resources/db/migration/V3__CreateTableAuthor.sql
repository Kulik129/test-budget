create table author(
    id serial primary key,
    full_name varchar(100) not null,
    date_of_created timestamp default current_timestamp
);