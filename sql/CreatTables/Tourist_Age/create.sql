CREATE TABLE IF NOT EXISTS age_range
(
    id         serial        not null unique primary key,
    range      int4range     not null unique default int4range(0, 0),
    range_name character(30) not null unique default 'None'
)