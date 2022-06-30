--liquibase formatted sql

-- changeset aLodochnikov:1
CREATE TABLE notification_task
(
    id           BIGSERIAL PRIMARY KEY,
    id_Chat       bigint,
    text         text,
    date_time timestamp

    );


