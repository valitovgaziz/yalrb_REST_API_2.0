CREATE TABLE IF NOT EXISTS transport_type
(
    id             serial         not null unique primary key,
    transport_name character(30)  not null unique default 'None',
    description    character(500) not null        default 'None'
)