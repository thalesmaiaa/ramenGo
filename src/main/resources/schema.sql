CREATE TABLE IF NOT EXISTS proteins (
    id SERIAL PRIMARY KEY,
    image_inactive VARCHAR(255),
    image_active VARCHAR(255),
    name VARCHAR(255),
    description VARCHAR(255),
    price INTEGER
);

CREATE TABLE IF NOT EXISTS broths (
    id SERIAL PRIMARY KEY,
    image_inactive VARCHAR(255),
    image_active VARCHAR(255),
    name VARCHAR(255),
    description VARCHAR(255),
    price INTEGER
);