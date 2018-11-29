--Author: Daniel Piche
--Date: November 29th, 2018
--Project: Library Database in Oracle 10C
--File that creates the tables


DROP TABLE loan CASCADE CONSTRAINTS;
DROP TABLE book CASCADE CONSTRAINTS;
DROP TABLE  members CASCADE CONSTRAINTS;

CREATE TABLE book (
b_id NUMBER(5), 
b_isbn VARCHAR2(15),
b_title VARCHAR2(15),
b_author VARCHAR2(15),
CONSTRAINT b_id_pk PRIMARY KEY (b_id));

CREATE TABLE members (
m_id NUMBER(5), 
m_lname VARCHAR2(10),
m_fname VARCHAR2(10),
m_phone VARCHAR2(10),
m_address VARCHAR2(20),
CONSTRAINT m_id_pk PRIMARY KEY (m_id));

CREATE TABLE loan (
l_id NUMBER(5),
l_m_id number(5),
l_b_id number(5),
l_loandate DATE,
l_duedate DATE,
l_returndate DATE,
CONSTRAINT l_id_pk PRIMARY KEY (l_id),
CONSTRAINT l_m_id_fk FOREIGN KEY (l_m_id) REFERENCES members(m_id),
CONSTRAINT l_b_id_fk FOREIGN KEY (l_b_id) REFERENCES book(b_id));
