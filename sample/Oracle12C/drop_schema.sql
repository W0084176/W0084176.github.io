--Created By: Daniel Piche
--Date: November 28th, 2018
--Oracle 12C SQL Scripts
--DROP TABLES

spool drop_schema.lst

ECHO ON

--Connect to sys user and connect to database
CONN / AS SYSDBA
ALTER PLUGGABLE DATABASE PDB3 OPEN;
ALTER SESSION SET CONTAINER = PDB3;

--Connect to database owner
conn DataDEV@PDB3

--Drop all tables if they exist
DROP TABLE f_shift_assignments;
DROP TABLE f_shifts;
DROP TABLE f_order_lines;
DROP TABLE f_orders;
DROP TABLE f_staffs;
DROP TABLE f_food_items;
DROP TABLE f_regular_menus;
DROP TABLE f_promotional_menus;
DROP TABLE f_customers;
DROP TABLE d_track_listings;
DROP TABLE d_play_list_items;
DROP TABLE d_songs;
DROP TABLE d_types;
DROP TABLE d_job_assignments;
DROP TABLE d_partners;
DROP TABLE d_events;
DROP TABLE d_venues;
DROP TABLE d_themes;
DROP TABLE d_packages;
DROP TABLE d_clients;
DROP TABLE d_cds;
ALTER TABLE DEPARTMENTS DROP CONSTRAINT "DEPT_MGR_FK";
DROP TABLE job_grades;
DROP TABLE job_history;
DROP TABLE employees;
DROP TABLE jobs;
DROP TABLE departments;
DROP TABLE locations;
DROP TABLE countries;
DROP TABLE regions;
DROP TABLE wf_spoken_languages;
DROP TABLE wf_languages;
DROP TABLE wf_countries;
DROP TABLE wf_world_regions;
DROP TABLE wf_currencies;

spool off
