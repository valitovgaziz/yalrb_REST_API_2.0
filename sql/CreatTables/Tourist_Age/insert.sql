INSERT INTO age_range (id, range, range_name)
VALUES (0, int4range(0, 0), 'No range');

INSERT INTO age_range (range, range_name)
VALUES (int4range(0, 2), 'инфант');

INSERT INTO age_range (range, range_name)
VALUES (int4range(2, 12), 'ребенок');
INSERT INTO age_range (range, range_name)
VALUES (int4range(12, 18), 'школьник');
INSERT INTO age_range (range, range_name)
VALUES (int4range(18, 25), 'молодежь');
INSERT INTO age_range (range, range_name)
VALUES (int4range(25, 45), 'взрослые');
INSERT INTO age_range (range, range_name)
VALUES (int4range(46, 65), 'старшие');
INSERT INTO age_range (range, range_name)
VALUES (int4range(65, null), 'пенсионер');
