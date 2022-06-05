CREATE TABLE IF NOT EXISTS userinfo (
    id   LONG      NOT NULL PRIMARY KEY AUTO_INCREMENT,
    email varchar(128) NOT NULL,
    phone varchar(15) NOT NULL
);


-- For H2 sequence is not available for each tables, so we need to use a common sequence like below and share for all tables
-- CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;
-- or create seperate sequence for each table like below
-- CREATE SEQUENCE cart_seq START WITH 1;
-- @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_seq")
-- @SequenceGenerator(name = "cart_seq", sequenceName = "cart_seq", allocationSize = 1)
