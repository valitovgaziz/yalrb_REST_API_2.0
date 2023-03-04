CREATE TABLE IF NOT EXISTS risk_factor
(
    id serial primary key not null unique,
    risk_name character(70) not null default 'No risk',
    risk_description character(500) not null default 'No description'
)