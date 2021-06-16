INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'poedel', 10, 15, 25);
INSERT INTO BREED (ID, BREED_NAME, SMALL_SIZE_PRICE, MEDIUM_SIZE_PRICE, BIG_SIZE_PRICE)
VALUES(nextval('Breed_seq'), 'jack russel', 25, 45, 65);

INSERT INTO FUR (ID, FUR_TYPE)
VALUES (nextval('Fur_seq'), 'vacht 1');
INSERT INTO FUR (ID, FUR_TYPE)
VALUES (nextval('Fur_seq'), 'vacht 2');

INSERT INTO DOG (ID, NAME, GENDER, EXTRA_INFO, BREED_ID, FUR_ID)
VALUES (nextval('Dog_seq'), 'name', 'gender', 'info', 1, 1);
INSERT INTO DOG (ID, NAME, GENDER, EXTRA_INFO, BREED_ID, FUR_ID)
VALUES (nextval('Dog_seq'), 'me', 'nah not a gender', 'extra info', 2, 1);
INSERT INTO DOG (ID, NAME, GENDER, EXTRA_INFO, BREED_ID, FUR_ID)
VALUES (nextval('Dog_seq'), 'me2', 'nah not a gender', 'extra info', 1, 2);
INSERT INTO DOG (ID, NAME, GENDER, EXTRA_INFO, BREED_ID, FUR_ID)
VALUES (nextval('Dog_seq'), 'me3', 'nah not a gender', 'extra info', 2, 2);

INSERT INTO CUSTOMER (ID, NAME, PHONE_NUMBER)
VALUES (nextval('Customer_seq'), 'name1', 'kqsldmfjqksd');
INSERT INTO CUSTOMER (ID, NAME, PHONE_NUMBER)
VALUES (nextval('Customer_seq'), 'name2', 'kqsldmfjqksd');


INSERT INTO EMPLOYEE (ID, NAME, PHOTO, INFO)
VALUES (1, 'jeffrey', 'photo', 'info');
INSERT INTO EMPLOYEE (ID, NAME, PHOTO, INFO)
VALUES (2, 'anton', 'photo', 'info');

INSERT INTO PRODUCT (ID, PRODUCT_NAME, PRICE)
VALUES (nextval('Product_seq'), 'name', 23.00);



INSERT INTO CUSTOMER_DOGS (CUSTOMER_ID, DOGS_ID)
VALUES (1, 1);
INSERT INTO CUSTOMER_DOGS (CUSTOMER_ID, DOGS_ID)
VALUES (1, 2);
INSERT INTO CUSTOMER_DOGS (CUSTOMER_ID, DOGS_ID)
VALUES (2, 3);
INSERT INTO CUSTOMER_DOGS (CUSTOMER_ID, DOGS_ID)
VALUES (2, 4);