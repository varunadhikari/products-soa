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
(1, 'Adenocor®', 'Adenosine Injection I.P.', 'Sanofi', 200.20, 500),
(2, 'Aldurazyme®', 'Laronidase solution for injection', 'Sanofi', 202, 700),
(3, 'AllStar®', 'Metformin Hydrochloride Sustained', 'Sanofi', 450, 450),
(4, 'Amaryl® MP', 'Release,Glimepiride and Pioglitazone Hydrochloride Tablets', 'Sanofi', 186.5, 400),
(5, 'Amaryl® M', 'Metformin Hydrochloride Sustained Release and Glimepiride Tablets', 'Sanofi', 46.41, 700),
(6, 'AllStar®', 'Metformin Hydrochloride Sustained', 'Sanofi', 450, 500),
(7, 'Brodactam', 'Piperacillin(4g) and Tazobactam (0.5g) For Injection USP', 'Sanofi', 256.25, 750),
(8, 'Cardace', 'Ramipril Tablets IP', 'Sanofi', 140, 850),
(9, 'Cardace® Protect', 'Ramipril & Atorvastatin Tablets', 'Sanofi', 252.50, 500),
(10, 'Cardace® AM', 'Ramipril and Amlodipine Tablets', 'Sanofi', 170.10, 600),
(11, 'Frisium®', 'Clobazam tablets IP', 'Sanofi', 156.25, 500),
(12, 'Fasturtec®', 'Rasburicase', 'Sanofi', 450, 550),
(13, 'Insuman® Rapid', 'Human Insulin Injection IP', 'Sanofi', 350.36, 555),
(14, 'Insuman® Comb 50', 'Human Insulin Injection', 'Sanofi', 450, 500),
(15, 'Jevtana™', 'Cabazitaxel Injection for Intravenous Infusion', 'Sanofi', 350, 500),
(16, 'Lantus®', 'Insulin Glargine Injection IP', 'Sanofi', 330, 450),
(17, 'Lasilactone® 50', 'Frusemide and Spironolactone Tablets', 'Sanofi', 450, 560),
(18, 'Myoril®', 'Thiocolchicoside Capsules IP', 'Sanofi', 265, 450),
(19, 'Plavix®', 'Clopidogrel Tablets I.P.', 'Sanofi', 450, 550),
(20, 'Primacor® Injection', 'Milrinone Lactate', 'Sanofi', 366.60, 500);


INSERT INTO ORDERS VALUES
(111, 'Yasmine', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 2546.0, 5.0),
(112, 'Jan', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 2023.5, 5.0),
(113, 'user123', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 1550.0, 5.0),
(114, 'userabc', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 4596.0, 5.0),
(115, 'userabc', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 2500.0, 5.0),
(116, 'user123', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 3490.60, 5.0),
(117, 'Yasmine', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 2546.0, 5.0),
(118, 'Jan', TIMESTAMP '2021-08-29 18:26:23.518', 'ORDERED', 2387.40, 5.0),
(119, 'Jan', TIMESTAMP '2021-08-29 18:26:23.518', 'ORDERED', 3341.30, 5.0),
(120, 'Yasmine', TIMESTAMP '2021-08-29 18:26:23', 'ORDERED', 2506.40, 5.0);

INSERT INTO ORDER_DETAIL VALUES
(201, 111, 3, 70 ,1046),
(202, 112, 15, 35 ,2023.5),
(203, 111, 7, 40 ,1500.0),
(204, 114, 15, 30 ,1000),
(205, 114, 12, 45 ,1500.0),
(206, 116, 10, 37 ,2490.60),
(207, 117, 19, 42 ,220.0),
(208, 116, 4, 32 ,1200.0),
(209, 119, 13, 95 ,3341.30),
(210, 120, 15, 60 ,2506.40);