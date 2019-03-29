
spool cr_local_user.lst

SET ECHO ON

CONN SYS/oracle AS SYSDBA

--DROP USER Chinook_01 CASCADE;

CREATE USER Chinook_01 IDENTIFIED BY password;
GRANT CREATE SESSION TO Chinook_01;
GRANT CONNECT, RESOURCE TO Chinook_01; 

ALTER USER Chinook_01 quota UNLIMITED on Chinook_Data01;
ALTER USER Chinook_01 quota UNLIMITED on Chinook_Index01;

spool off
