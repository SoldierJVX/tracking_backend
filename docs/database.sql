create database tracking;

CREATE TABLE message_tracking(
    id bigint UNSIGNED PRIMARY KEY,
    message varchar(150)
)

CREATE TABLE tracking(
    id bigint UNSIGNED PRIMARY KEY,
    tracking_id varchar(20),
    date TIMESTAMP,
    localization varchar(100),
    id_message bigint UNSIGNED,
    FOREIGN KEY(id_message) references message_tracking(id)
);

INSERT INTO message_tracking VALUES (1, 'Objeto Postado'),
                                    (2, 'Objeto em trânsito - por favor aguarde'),
                                    (3, 'Objeto saiu para entrega ao destinatário'),
                                    (4, 'Objeto entregue ao destinatário');

INSERT INTO tracking (id, tracking_id, date, localization, id_message) VALUES
                                                                              (1, '84502135', '2021-07-12 12:00', 'SAO PAULO/SP', 1),
                                                                              (2, '84502135', '2021-07-12 14:00', 'SAO PAULO/SP', 2),
                                                                              (3, '84502135', '2021-07-12 15:00', 'SAO PAULO/SP', 3),
                                                                              (4, '84502135', '2021-07-12 16:00', 'SAO PAULO/SP', 4),
                                                                              (5, '95836245', '2021-07-12 13:00', 'CURITIBA/PR', 1),
                                                                              (6, '95836245', '2021-07-12 15:00', 'CURITIBA/PR', 2),
                                                                              (7, '95863214', '2021-07-12 08:00', 'CURITIBA/PR', 1),
                                                                              (8, '95863214', '2021-07-12 10:00', 'CURITIBA/PR', 2),
                                                                              (9, '95863214', '2021-07-12 17:00', 'SAO PAULO/SP', 2),
                                                                              (10, '95863214', '2021-07-12 18:00', 'SAO PAULO/SP', 3),
                                                                              (11, '63214596', '2021-07-12 15:00', 'SAO PAULO/SP', 1);