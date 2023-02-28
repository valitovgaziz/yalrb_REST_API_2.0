create table if not exists leisure_type
(
    id          serial primary key,
    type_name   character(30),
    description character(500)
);