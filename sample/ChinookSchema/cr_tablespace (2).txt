spool cr_tablespace.lst

SET ECHO ON
CONN SYS/oracle AS SYSDBA

--DROP TABLESPACE Chinook_Data01 INCLUDING CONTENTS AND DATAFILES CASCADE CONSTRAINTS;
--DROP TABLESPACE Chinook_Index01 INCLUDING CONTENTS AND DATAFILES CASCADE CONSTRAINTS;

CREATE TABLESPACE Chinook_Data01
datafile '/u02/app/oracle/oradata/orcl/Chinook_Data01.dbf' size 100M,
	 '/u02/app/oracle/oradata/orcl/Chinook_Data02.dbf' size 100M;

CREATE TABLESPACE Chinook_Index01
datafile '/u02_2/app/oracle/oradata/orcl/Chinook_Index01.dbf' size 100M;

spool off


