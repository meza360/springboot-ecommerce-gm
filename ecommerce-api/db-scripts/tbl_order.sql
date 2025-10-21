create table tbl_order(
    order_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    bill_to VARCHAR(255) NOT NULL,
    total DECIMAL(10, 2) NOT NULL
)