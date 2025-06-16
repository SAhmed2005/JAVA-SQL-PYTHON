-- OPTIONS (SKIP=3,ERRORS=999999,SILENT=FEEDBACK)
LOAD DATA
INFILE 		'D:\Sami_Oracle\sql_loader\dataFile2.csv' -- changed to incoming
BADFILE		'D:\Sami_Oracle\sql_loader\comment_trunacate_date_format.bad' -- changed to incoming


APPEND
INTO TABLE SYS.CAR
FIELDS TERMINATED BY ","
TRAILING NULLCOLS
(
CARNAME		POSITION(1)			"TRIM(SUBSTR(:CARNAME,1,5))",
CARNO,
CDATE "TO_DATE('05/04/72','MM/DD/YY')"
)

