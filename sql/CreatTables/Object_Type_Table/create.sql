CREATE TABLE IF NOT EXISTS object_type
(
    id serial primary key not null unique,
    object_name character(50) not null unique default 'No name',
    object_description character(500) not null unique default 'No description'
);