CREATE TABLE IF NOT EXISTS leisure_sub_type
(
    id serial primary key not null unique,
    sub_type_name character(50) NOT NULL UNIQUE DEFAULT 'No name',
    description character(300) NOT NULL UNIQUE DEFAULT 'No description'
)