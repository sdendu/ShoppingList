DROP TABLE IF EXISTS items;

CREATE TABLE items (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  category VARCHAR(250) DEFAULT NULL
);

INSERT INTO items (name, description, category) VALUES
  ('Milk', 'MMMMM Milk is good!!', 'KITCHEN'),
  ('Shoes', 'Fancy new shoes', 'CLOTHING'),
  ('Red Stapler', 'Have you seen it?', 'OFFICE');
