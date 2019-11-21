DELETE FROM cita;

INSERT INTO cita (nombre, libro, texto) VALUES ('Miyamoto Musashi', 'Book of five rings', 'You can only fight the way you practice');
INSERT INTO cita (nombre, libro, texto) VALUES ('Lao Tzu', 'Tao Te Ching', 'When I let go of what I am, I become what I might be.');
INSERT INTO cita (nombre, libro, texto) VALUES ('Richard Feynman', 'Surely youre joking Mr Feynman', 'It doesnt matter how beautiful your theory is, it doesnt matter how smart you are. If it doesnt agree with experiment, its wrong.');

DELETE FROM libro;
INSERT INTO libro (titulo, autor) VALUES ('Sapiens: A Brief History of Humandkind', 'Yuval Noah Harari');
INSERT INTO libro (titulo, autor) VALUES ('The Selfish Gene', 'Richard Dawkins');
