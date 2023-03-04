create table if not exists object
(
    id                    uuid            not null unique primary key       default gen_random_uuid(),
    rest_type_id          smallint        not null references leisure_type     default 0,
    object_name           varchar(20)     not null unique                   default 'None',
    short_description     character(500)  not null                          default 'None',
    full_description      character(1500) not null                          default 'None',
    owner_id              integer         not null references account       default 1,
    rate_id               smallint        not null references rate          default 0,
    state_id              smallint        not null references state         default 0,
    start_time            timestamptz     null                              default null,
    end_time              timestamptz     null                              default null,
    created_time          timestamptz     not null                          default now(),
    level_id              smallint        not null references account_level default 0,
    id_availability_score smallint        not null                          default 0,
    id_workload_state     smallint        not null                          default 0,
    site_link             character(300)  not null                          default 'No site'
);

create table if not exists object_contact
(
    id           serial primary key unique not null,
    object_id    uuid                      not null references object,
    name_contact character(20)             not null                  default 'No name',
    phone        character(20)             not null                  default 'No phone',
    address      character(300)            not null                  default 'No address',
    email        character(50)             not null                  default 'No email',
    state_id     smallint                  not null references state default 0
);

create table if not exists rate
(
    id                      serial primary key not null unique,
    rate_from_site          smallint           not null default 0,
    rate_from_object        smallint           not null default 0,
    rate_from_socialNetwork smallint           not null default 0
);

create table if not exists point
(
    id        integer primary key unique not null,
    object_id uuid                       not null,
    longitude real                       not null default 0,
    latitude  real                       not null default 0
);

create table if not exists state
(
    id                serial primary key not null unique,
    state_name        character(30)      not null,
    state_description character(300)     not null
);

create table if not exists availability_score
(
    id         serial primary key not null unique,
    avail_name character(500)     not null,
    score      smallint           not null default 0
);

create table if not exists workload_state
(
    id                serial primary key not null unique,
    state_name        character(20)      not null,
    state_description character(500)     not null,
    score             smallint           not null default 0
);

create table if not exists account
(
    id                serial primary key not null unique,
    account_login     character(20)      not null default 'No login',
    state_id          smallint           not null default 0 references state,
    created_date_time timestamptz        not null,
    role_id           smallint           not null default 0 references role,
    level_id          smallint           not null default 0 references account_level
);

create table if not exists account_level
(
    id       serial primary key not null unique,
    level_id integer            not null references level_description,
    score    smallint           not null default 0
);

create table if not exists level_description
(
    id                serial primary key unique not null,
    name_level        character(20)             not null,
    description_level character(1000)           not null
);

create table if not exists role
(
    id               serial primary key not null unique,
    role_name        character(20)      not null,
    role_description character(500)     not null
);

create table if not exists appeal_state
(
    id                serial primary key not null unique,
    appeal_state_name character(30)      not null default 'None',
    appeal_state_mame character(500)     not null default 'None'
);

create table if not exists appeal
(
    id                   serial primary key unique not null,
    account_id           integer                   not null references account,
    phone_number         character(30)             not null default 'None',
    theme                character(20)             not null default 'None',
    appeal_text          character(2000)           not null default 'None',
    appeal_state_id      integer                   not null references appeal_state,
    response_text        character(2000)           not null default 'None',
    response_date_time   timestamptz               not null default 'Now',
    moderator_account_id integer                   not null references account
);

create table if not exists feedback
(
    id                serial primary key not null unique,
    id_account        integer            not null references account,
    description       character(500)     not null default 'None',
    score             smallint           not null default 0,
    object_id         uuid               not null references object,
    created_date_time timestamptz        not null default now()
);

create table if not exists meta_data_photo
(
    id                uuid primary key,
    object_id         uuid           not null references object,
    name_photo        character(30)  not null default id,
    description_photo character(300) not null default 'None',
    created_date_time timestamp      null,
    loaded_date_time  timestamptz    not null default now(),
    path_file_name    character(100) not null
);

create table if not exists availability_for
(
    id             serial primary key not null unique ,
    av_name        character(30)      not null        default 'Non',
    av_description character(200)     not null unique default 'Non'
);

create table if not exists object_availability
(
    id              uuid    not null unique default gen_random_uuid(),
    availability_id integer not null references availability_for,
    object_id       uuid    not null references object
)
