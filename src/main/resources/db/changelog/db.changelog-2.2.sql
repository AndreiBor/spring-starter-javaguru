--liquibase formatted sql

--changeset aborisov:1
ALTER TABLE users
    DROP COLUMN info;