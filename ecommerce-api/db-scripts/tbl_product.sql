CREATE TABLE tbl_product (
    product_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250),
    category VARCHAR(100),
    price DECIMAL(10, 2) NOT NULL,
    image_url VARCHAR(250)
);

insert into tbl_product (name, description, category, price, image_url) 
values
('Laptop', 'Mobile laptop gamer', 'notebook', 200.99, 'https://www.svgrepo.com/show/420907/computer-display-hardware.svg'),
('CD', 'Compact Disc', 'music', 29.99, 'https://www.svgrepo.com/show/420904/cd-compact-computer.svg'),
('USB Cable', 'USB A Cable 1.5mts', 'cable', 10.99, 'https://www.svgrepo.com/show/420894/cable-computer-connector.svg');

insert into tbl_product (name, description, category, price, image_url) 
values
('Product restored', 'description', 'cable', 10.99, 'https://www.svgrepo.com/show/420894/cable-computer-connector.svg');
