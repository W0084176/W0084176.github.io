--Author: Daniel Piche
--Date: November 29th, 2018
--Project: Library Database in Oracle 10C
--File that inserts data in the tables


INSERT INTO BOOK (B_ID, B_ISBN, B_TITLE, B_AUTHOR)
VALUES (11111, 'ABC111222', 'Sharks are Cool', 'Greg Snow');

INSERT INTO BOOK (B_ID, B_ISBN, B_TITLE, B_AUTHOR)
VALUES (11112, 'ABC111223', 'Fun is the game', 'Bill Wagner');

INSERT INTO BOOK (B_ID, B_ISBN, B_TITLE, B_AUTHOR)
VALUES (11113, 'ABC111224', 'Uncoruptable', 'John Wentworth');

INSERT INTO BOOK (B_ID, B_ISBN, B_TITLE, B_AUTHOR)
VALUES (11114, 'ABC1112225', 'Science is key', 'John Pickle');

INSERT INTO BOOK (B_ID, B_ISBN, B_TITLE, B_AUTHOR)
VALUES (11115, 'ABC111226', 'Let it snow', 'Greg Today');
-----------------------------------------------------------------------------
INSERT INTO MEMBERS (M_ID, M_LNAME, M_FNAME, M_PHONE, M_ADDRESS)
VALUES (22222, 'Reardon', 'John', '665-4291', '22 Lakeview Drive');

INSERT INTO MEMBERS (M_ID, M_LNAME, M_FNAME, M_PHONE, M_ADDRESS)
VALUES (22223, 'Tally', 'Bill', '666-4291', '22 Church Cressent');

INSERT INTO MEMBERS (M_ID, M_LNAME, M_FNAME, M_PHONE, M_ADDRESS)
VALUES (22224, 'Nickerson', 'Abbie', '666-6666', '217 Park Lane');

INSERT INTO MEMBERS (M_ID, M_LNAME, M_FNAME, M_PHONE, M_ADDRESS)
VALUES (22225, 'Allen', 'Tim', '234-1902', '100 Waterford Drive');

INSERT INTO MEMBERS (M_ID, M_LNAME, M_FNAME, M_PHONE, M_ADDRESS)
VALUES (22226, 'Whyllen', 'Steve', '123-4567', '2017 Birch Street');
--------------------------------------------------------------------------

INSERT INTO LOAN (L_ID, L_M_ID, L_B_ID, L_LOANDATE, L_DUEDATE, L_RETURNDATE)
VALUES (33333, 22222, 11115, to_date('11/01/2018', 'mm/dd/yyyy'), to_date('11/14/2018', 'mm/dd/yyyy'), to_date('11/13/2018', 'mm/dd/yyyy'));

INSERT INTO LOAN (L_ID, L_M_ID, L_B_ID, L_LOANDATE, L_DUEDATE, L_RETURNDATE)
VALUES (33334, 22226, 11111, to_date('10/01/2018', 'mm/dd/yyyy'), to_date('10/20/2018', 'mm/dd/yyyy'), to_date('10/19/2018', 'mm/dd/yyyy'));

INSERT INTO LOAN (L_ID, L_M_ID, L_B_ID, L_LOANDATE, L_DUEDATE, L_RETURNDATE)
VALUES (33335, 22224, 11113, to_date('10/15/2018', 'mm/dd/yyyy'), to_date('10/29/2018', 'mm/dd/yyyy'), to_date('10/27/2018', 'mm/dd/yyyy'));