CREATE TABLE HERKUNFTSLAND_ENTRY (id int AUTO_INCREMENT PRIMARY KEY , name VARCHAR (255), einwohnerzahl int, gruendungsjahr int);

CREATE TABLE MOBIL_TEL_HERSTELLER_ENTRY (id int AUTO_INCREMENT PRIMARY KEY ,HERKUNFTSLAND_ID int, name VARCHAR (255), gruendungsjahr int, mitarbeiteranzahl int, umsatz int);

CREATE TABLE MODELL_ENTRY (id int AUTO_INCREMENT PRIMARY KEY , MOBIL_TEL_HERSTELLER_ID int, modell_name VARCHAR (255), display_groeﬂe int, prozessor_name VARCHAR (255), preis decimal(10));