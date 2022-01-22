INSERT INTO USER VALUES
('admin', 'admin', 'ADMIN'),
('user123', 'user123', 'DISTRIBUTOR'),
('userabc', 'userabc', 'DISTRIBUTOR'),
('Jan', 'Jan', 'DISTRIBUTOR'),
('Yasmine', 'Yasmine', 'DISTRIBUTOR');

INSERT INTO User_Detail VALUES
(101,'admin', 'admin','admin', null,null,null,null,null,null,'admin@test.com'),
(102,'user123', 'user123','user123', null,null,null,null,null,null,'user123@test.com'),
(103,'userabc', 'userabc','userabc', null,null,null,null,null,null,'userabc@test.com'),
(104,'Jan', 'Jan','Alami', null,null,null,null,null,null,'JanA@test.com'),
(105,'Yasmine', 'Yasmine','Harrabi', null,null,null,null,null,null,'YasmineH@test.com');

INSERT INTO PRODUCT VALUES
(1, 'Adenocor®', 'Adenosine Injection I.P.',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 200.20,null,null, 500),
(2, 'Aldurazyme®', 'Laronidase solution for injection',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 202,null,null, 700),
(3, 'AllStar®', 'Metformin Hydrochloride Sustained',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 450),
(4, 'Amaryl® MP', 'Release,Glimepiride and Pioglitazone Hydrochloride Tablets',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 186.5,null,null, 400),
(5, 'Amaryl® M', 'Metformin Hydrochloride Sustained Release and Glimepiride Tablets',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 46.41,null,null, 700),
(6, 'AllStar®', 'Metformin Hydrochloride Sustained',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 500),
(7, 'Brodactam', 'Piperacillin(4g) and Tazobactam (0.5g) For Injection USP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP,'Sanofi', 256.25,null,null, 750),
(8, 'Cardace', 'Ramipril Tablets IP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 140,null,null, 850),
(9, 'Cardace® Protect', 'Ramipril & Atorvastatin Tablets',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 252.50,null,null, 500),
(10, 'Cardace® AM', 'Ramipril and Amlodipine Tablets',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 170.10,null,null, 600),
(11, 'Frisium®', 'Clobazam tablets IP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 156.25,null,null, 500),
(12, 'Fasturtec®', 'Rasburicase',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 550),
(13, 'Insuman® Rapid', 'Human Insulin Injection IP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 350.36,null,null, 555),
(14, 'Insuman® Comb 50', 'Human Insulin Injection',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 500),
(15, 'Jevtana™', 'Cabazitaxel Injection for Intravenous Infusion',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 350,null,null, 500),
(16, 'Lantus®', 'Insulin Glargine Injection IP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 330,null,null, 450),
(17, 'Lasilactone® 50', 'Frusemide and Spironolactone Tablets',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 560),
(18, 'Myoril®', 'Thiocolchicoside Capsules IP',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 265,null,null, 450),
(19, 'Plavix®', 'Clopidogrel Tablets I.P.',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 450,null,null, 550),
(20, 'Primacor® Injection', 'Milrinone Lactate',null,null,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP, 'Sanofi', 366.60,null,null, 500);


INSERT INTO ORDERS VALUES
(1000, 'Yasmine', CURRENT_DATE, 'Ordered', 2546.0, 5.0),
(1001, 'Jan', CURRENT_DATE, 'Ordered', 2023.5, 5.0),
(1002, 'user123', CURRENT_DATE, 'Ordered', 1550.0, 5.0),
(1004, 'userabc', CURRENT_DATE, 'Ordered', 4596.0, 5.0),
(1005, 'userabc', CURRENT_DATE, 'Ordered', 2500.0, 5.0),
(1006, 'user123', CURRENT_DATE, 'Ordered', 3490.60, 5.0),
(1007, 'Yasmine', CURRENT_DATE, 'Ordered', 2546.0, 5.0),
(1008, 'Jan', CURRENT_DATE, 'Ordered', 2387.40, 5.0),
(1009, 'Jan', CURRENT_DATE, 'Ordered', 3341.30, 5.0),
(1010, 'Yasmine', CURRENT_DATE, 'Ordered', 2506.40, 5.0);

INSERT INTO ORDER_DETAIL VALUES
(201, 1000, 3, 70 ,1046),
(202, 1002, 15, 35 ,2023.5),
(203, 1001, 7, 40 ,1500.0),
(204, 1004, 15, 30 ,1000),
(205, 1004, 12, 45 ,1500.0),
(206, 1006, 10, 37 ,2490.60),
(207, 1007, 19, 42 ,220.0),
(208, 1006, 4, 32 ,1200.0),
(209, 1009, 13, 95 ,3341.30),
(210, 1010, 15, 60 ,2506.40);