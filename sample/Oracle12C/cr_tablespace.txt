--Created By: Daniel Piche
--Date: November 28th, 2018
--Oracle 12C SQL Scripts
--Create Tablespace

spool cr_tablespace.lst

SET ECHO ON

--Connect as sys
CONN / AS SYSDBA

--Connect to database
ALTER PLUGGABLE DATABASE PDB3 OPEN;
ALTER SESSION SET CONTAINER = PDB3;

--Drop tablespaces

--DROP TABLESPACE DEV_data INCLUDING CONTENTS AND DATAFILES CASCADE CONSTRAINTS;
--DROP TABLESPACE DEV_idx INCLUDING CONTENTS AND DATAFILES CASCADE CONSTRAINTS;

--CREATE TABLESPACE DEV_idx
--datafile '/u04/app/oracle/oradata/OSYS3017/DEV_idx.dbf'
--SIZE 50M
--BLOCKSIZE 32K
--MAXSIZE 100M
--autoextend on;

--Create first tablespace
CREATE TABLESPACE DEV_data
datafile '/u03/app/oracle/oradata/OSYS3017/DEV_data.dbf'
SIZE 50M;

--Create second tablespace
CREATE TABLESPACE DEV_idx
datafile '/u04/app/oracle/oradata/OSYS3017/DEV_idx.dbf'
SIZE 50M;

--Alter quota to allow insert into tables
ALTER USER DataDEV quota 100M on DEV_DATA;
ALTER USER DataDEV quota 100M on DEV_IDX;

--End session
ALTER PLUGGABLE DATABASE PDB3 CLOSE;

spool off
