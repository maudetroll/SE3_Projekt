
INSERT INTO HERKUNFTSLAND_ENTRY (name,einwohnerzahl,gruendungsjahr) VALUES ('Volksrepublik China',1300000000, 1949);
INSERT INTO HERKUNFTSLAND_ENTRY (name,einwohnerzahl,gruendungsjahr) VALUES ('Sued-Korea',51470000,1945);
INSERT INTO HERKUNFTSLAND_ENTRY (name,einwohnerzahl,gruendungsjahr) VALUES ('USA',327200000,1776);



INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (2,'Samsung',1938,309630,21120000);
INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (1,'Huawei',1987,194000,122000000);
INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (3,'Apple',1976,132000,260200000);
INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (1,'Xiaomi',2010,23500,26400000);
INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (1,'OPPO',2004,20000,19700000);
INSERT INTO MOBIL_TEL_HERSTELLER_ENTRY   (HERKUNFTSLAND_ID,name,gruendungsjahr,mitarbeiteranzahl,umsatz) VALUES (1,'OnePlus',2013,800,1500000000);



INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (1,'S10',6.1,'Exynos 9820',899);
INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (1,'S20',6.2,'Exynos 990',899);


INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (2,'P40 Pro',6.58,'Kirin 990',970);
INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (2,'P30 Pro',6.0,'HiSilicon Kirin 980',506);

INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (3,'11',6.1,'Apple A13 Bionic',799);
INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (3,'10',5.8,'Apple A11',620);

INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (4,'MI Note 10 Pro',6.47,'Snapdragon 855',500);
INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (4,'MI Note 9 Pro',6.4,'Snapdragon 855',375);

INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (5,'Find X2 Pro',6.78,'Snapdragon 865',1200);
INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (5,'F11 Pro',6.53,'MediaTek Helio P70',250);

INSERT INTO MODELL_ENTRY (MOBIL_TEL_HERSTELLER_ID,modell_name,display_groeﬂe,prozessor_name,preis) VALUES (6,'8 T',6.55,'Snapdragon 865',470);
