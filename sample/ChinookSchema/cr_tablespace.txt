#!/bin/bash

#rm -rf /u02
#rm -rf /u02_2

mkdir -p /u02/app/oracle/oradata/orcl
mkdir -p /u02_2/app/oracle/oradata/orcl

chown -R oracle:oinstall /u02
chown -R oracle:oinstall /u02_2

chmod -R 775 /u02
chmod -R 775 /u02_2
