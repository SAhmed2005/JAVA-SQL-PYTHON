-- OPTIONS (SKIP=3,ERRORS=999999,SILENT=FEEDBACK)
LOAD DATA
INFILE 		'D:\Sami_Oracle\sql_loader\dataFile3.txt' -- changed to incoming
BADFILE		'D:\Sami_Oracle\sql_loader\practice1.bad' -- changed to incoming


APPEND
INTO TABLE SYS.CAR
FIELDS TERMINATED BY ","
TRAILING NULLCOLS
(
CARNAME 	 POSITION(1:8) CHAR
		 NULLIF(CARNAME		= BLANKS),			
CARNO		 POSITION(11:12) INTEGER EXTERNAL
		 NULLIF(CARNO		= BLANKS),
CDATE 		 "TO_DATE('05/04/72','MM/DD/YY')"
)

