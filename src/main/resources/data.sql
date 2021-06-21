INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Poedel', 60, 65, 80);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Jack Russel', 25, 45, 65);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Labrador', 30, 45, 50);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'German Sheppard', 20, 35, 50);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Berner Senner', 25, 40, 60);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Golden Retriever', 45, 60, 75);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'Labradoedel', 45, 50, 55);

INSERT INTO FUR (ID, FUR_TYPE)
VALUES (nextval('Fur_seq'), 'short hair');
INSERT INTO FUR (ID, FUR_TYPE)
VALUES (nextval('Fur_seq'), 'medium long hair');
INSERT INTO FUR (ID, FUR_TYPE)
VALUES (nextval('Fur_seq'), 'long hair');

INSERT INTO CUSTOMER (ID, NAME, PHONE_NUMBER, EMAIL, REGIO)
VALUES (nextval('Customer_seq'), 'Kimberlee', '04877564846', 'kimberlee@fictief.be', 'antwerpen');

INSERT INTO EMPLOYEE (ID, NAME, PHOTO, INFO)
VALUES (1, 'jeffrey', 'photo', 'info');
INSERT INTO EMPLOYEE (ID, NAME, PHOTO, INFO)
VALUES (2, 'anton', 'photo', 'info');

INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'shampoo', 'photo', 23.00);
INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'shampoo', 'photo', 34.00);
INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'conditioner', 'photo', 30.00);
INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'kam', 'photo', 24.00);
INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'droger', 'photo', 60.00);
INSERT INTO PRODUCT (ID, PRODUCT_NAME, PHOTO, PRICE)
VALUES (nextval('Product_seq'), 'feun', 'photo', 75.00);