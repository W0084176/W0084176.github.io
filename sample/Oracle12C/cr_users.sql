--Created By: Daniel Piche
--Date: November 28th, 2018
--Oracle 12C SQL Scripts
--Create Users

spool cr_users.lst
SET ECHO ON

CONN / AS SYSDBA
--Drop users
DROP USER c##DataPRD CASCADE;

--Create the common user using the default container setting
CREATE USER c##DataPRD IDENTIFIED BY password;
GRANT CREATE SESSION TO c##DataPRD;
ALTER USER c##DataPRD PASSWORD EXPIRE; 

--Connect to database
ALTER PLUGGABLE DATABASE PDB3 OPEN;
ALTER SESSION SET CONTAINER = PDB3;

--Drop Users
DROP USER DataDEV CASCADE;
DROP USER DataQA CASCADE;
DROP ROLE dev_role;

--Create user 1
CREATE USER DataDEV IDENTIFIED BY password;
GRANT CREATE SESSION TO DataDEV;
ALTER USER DataDEV PASSWORD EXPIRE;

--Create user 2
CREATE USER DataQA IDENTIFIED BY password;
GRANT CREATE SESSION TO DataQA;
ALTER USER DataQA PASSWORD EXPIRE;

--Grant permissions
CREATE ROLE dev_role;
GRANT CONNECT, RESOURCE TO dev_role;
GRANT dev_role TO DataDEV;
GRANT dev_role TO DataQA;

--End session
ALTER PLUGGABLE DATABASE PDB3 CLOSE;

spool off
