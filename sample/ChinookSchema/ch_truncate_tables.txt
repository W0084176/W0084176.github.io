spool ch_truncate_tables.lst
SET ECHO ON
--WHENEVER SQLERROR EXIT SQL.SQLCODE
conn Chinook_01/password

TRUNCATE TABLE f_shift_assignments;
TRUNCATE TABLE f_shifts;
TRUNCATE TABLE f_order_lines;
TRUNCATE TABLE f_orders;
TRUNCATE TABLE f_staffs;
TRUNCATE TABLE f_food_items;
TRUNCATE TABLE f_regular_menus;
TRUNCATE TABLE f_promotional_menus;
TRUNCATE TABLE f_customers;
TRUNCATE TABLE d_track_listings;
TRUNCATE TABLE d_play_list_items;
TRUNCATE TABLE d_songs;
TRUNCATE TABLE d_types;
TRUNCATE TABLE d_job_assignments;
TRUNCATE TABLE d_partners;
TRUNCATE TABLE d_events;
TRUNCATE TABLE d_venues;
TRUNCATE TABLE d_themes;
TRUNCATE TABLE d_packages;
TRUNCATE TABLE d_clients;
TRUNCATE TABLE d_cds;
ALTER TABLE DEPARTMENTS DROP CONSTRAINT "DEPT_MGR_FK";
TRUNCATE TABLE job_grades;
TRUNCATE TABLE job_history;
TRUNCATE TABLE employees;
TRUNCATE TABLE jobs;
TRUNCATE TABLE departments;
TRUNCATE TABLE locations;
TRUNCATE TABLE countries;
TRUNCATE TABLE regions;
TRUNCATE TABLE wf_spoken_languages;
TRUNCATE TABLE wf_languages;
TRUNCATE TABLE wf_countries;
TRUNCATE TABLE wf_world_regions;
TRUNCATE TABLE wf_currencies;

spool off