-- Insert data into 'broths' table
INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/salt/inactive.svg',
       'https://tech.redventures.com.br/icons/salt/active.svg',
       'Salt',
       'Simple like the seawater, nothing more',
       10 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Salt'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/spicy/inactive.svg',
       'https://tech.redventures.com.br/icons/spicy/active.svg',
       'Spicy',
       'A kick of heat to warm you up',
       12 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Spicy'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/umami/inactive.svg',
       'https://tech.redventures.com.br/icons/umami/active.svg',
       'Umami',
       'Rich and savory flavors for the palate',
       14 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Umami'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/miso/inactive.svg',
       'https://tech.redventures.com.br/icons/miso/active.svg',
       'Miso',
       'A traditional taste of Japan',
       11 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Miso'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/vegetable/inactive.svg',
       'https://tech.redventures.com.br/icons/vegetable/active.svg',
       'Vegetable',
       'Fresh and light with garden veggies',
       13 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Vegetable'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/chicken/inactive.svg',
       'https://tech.redventures.com.br/icons/chicken/active.svg',
       'Chicken',
       'Comforting and familiar, perfect for any soup',
       15 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Chicken'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/beef/inactive.svg',
       'https://tech.redventures.com.br/icons/beef/active.svg',
       'Beef',
       'Hearty and robust, full of flavor',
       16 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Beef'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/seafood/inactive.svg',
       'https://tech.redventures.com.br/icons/seafood/active.svg',
       'Seafood',
       'A taste of the ocean with every sip',
       18 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Seafood'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/mushroom/inactive.svg',
       'https://tech.redventures.com.br/icons/mushroom/active.svg',
       'Mushroom',
       'Earthy and rich, perfect for vegetarians',
       17 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Mushroom'
);

INSERT INTO broths (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/tomato/inactive.svg',
       'https://tech.redventures.com.br/icons/tomato/active.svg',
       'Tomato',
       'Bright and tangy, a versatile base',
       12 WHERE NOT EXISTS (
    SELECT * FROM broths WHERE name = 'Tomato'
);


-- Insert data into 'proteins' table
INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/salt/inactive.svg',
       'https://tech.redventures.com.br/icons/salt/active.svg',
       'Tofu',
       'A versatile plant-based protein',
       10 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Tofu');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/spicy/inactive.svg',
       'https://tech.redventures.com.br/icons/spicy/active.svg',
       'Tempeh',
       'A nutty flavor packed with protein',
       12 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Tempeh');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/umami/inactive.svg',
       'https://tech.redventures.com.br/icons/umami/active.svg',
       'Chicken',
       'Lean and full of protein',
       14 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Chicken');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/miso/inactive.svg',
       'https://tech.redventures.com.br/icons/miso/active.svg',
       'Beef',
       'Rich in iron and flavor',
       11 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Beef');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/vegetable/inactive.svg',
       'https://tech.redventures.com.br/icons/vegetable/active.svg',
       'Pork',
       'Juicy and tender, a crowd favorite',
       13 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Pork');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/chicken/inactive.svg',
       'https://tech.redventures.com.br/icons/chicken/active.svg',
       'Fish',
       'Light and flaky, perfect for a balanced diet',
       15 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Fish');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/beef/inactive.svg',
       'https://tech.redventures.com.br/icons/beef/active.svg',
       'Lamb',
       'Flavorful and tender, a special treat',
       16 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Lamb');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/seafood/inactive.svg',
       'https://tech.redventures.com.br/icons/seafood/active.svg',
       'Shrimp',
       'Delicate and sweet, a seafood delight',
       18 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Shrimp');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/mushroom/inactive.svg',
       'https://tech.redventures.com.br/icons/mushroom/active.svg',
       'Mushroom',
       'Earthy and rich, perfect for vegetarians',
       17 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Mushroom');

INSERT INTO proteins (image_inactive, image_active, name, description, price)
SELECT 'https://tech.redventures.com.br/icons/tomato/inactive.svg',
       'https://tech.redventures.com.br/icons/tomato/active.svg',
       'Egg',
       'Packed with protein and versatile',
       12 WHERE NOT EXISTS (SELECT * FROM proteins WHERE name = 'Egg');