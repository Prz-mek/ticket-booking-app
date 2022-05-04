INSERT INTO room (id) VALUES (1)
INSERT INTO room (id) VALUES (2)
INSERT INTO room (id) VALUES (3)

INSERT INTO movie (id, title) VALUES (1, 'The Imitation Game');
INSERT INTO movie (id, title) VALUES (2, 'Beautiful mind');
INSERT INTO movie (id, title) VALUES (3, 'The Godfather');

INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (1, 1, 1, '2022-04-29 12:00:00');
INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (2, 1, 2, '2022-04-29 15:00:00');
INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (3, 2, 2, '2022-04-29 14:30:00');
INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (4, 3, 2, '2022-04-29 19:00:00');
INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (5, 1, 3, '2022-04-29 11:00:00');
INSERT INTO screening (id, room_id, movie_id, start_time) VALUES (6, 3, 3, '2022-04-29 16:30:00');