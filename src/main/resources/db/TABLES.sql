CREATE TABLE PURCHASE_DETAIL(
	PURCHASEID VARCHAR(20),
	ITEMID VARCHAR(20),
	QUANTITY INT(5),
	COST DECIMAL(10, 2)
);

CREATE TABLE TRANSACTION(
	TRANS_ID VARCHAR(20),
	PURCHASEID VARCHAR(20),
	TRANS_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	AMOUNT DECIMAL(10, 2),
	VENDORID VARCHAR(20)
);

CREATE TABLE ITEM(
	ITEMID VARCHAR(20),
	CATEGORY VARCHAR(100),
	NAME VARCHAR(100),
	METRIC VARCHAR(10),
	LAST_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE VENDOR (
	VENDORID VARCHAR(20),
	NAME VARCHAR(100),
	LAST_MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE PURCHASE_PLAN(
	PLANID VARCHAR(20),
	ITEMID VARCHAR(20),
	QUANTITY INT(5),
	PLAN_DATE DATE DEFAULT CURRENT_DATE
);