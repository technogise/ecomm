
CREATE TABLE dummy_entity (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name varchar(255) NOT NULL,

    PRIMARY KEY (id)
);

INSERT INTO dummy_entity (name) values ('hello-world');