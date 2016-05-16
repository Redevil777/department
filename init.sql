CREATE TABLE department (
    id INT AUTO_INCREMENT PRIMARY KEY ,
    dep_name VARCHAR(100) NOT NULL
);

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fname VARCHAR(50) NOT NULL,
    lname VARCHAR(50) NOT NULL,
    mname VARCHAR(50) NOT NULL,
    birthday VARCHAR(15) NOT NULL,
    salary INT NOT NULL,
    dep_id INT NOT NULL
);

INSERT INTO department VALUES
    (NULL, 'java developer'),
    (NULL, 'c++ developer'),
    (NULL, 'python developer'),
    (NULL, 'objective-c developer');

INSERT INTO employee VALUES
    (NULL, 'Cristiano', 'Ronaldo', 'Aviero', '1985-02-05', 322, 1),
    (NULL,'Wayne', 'Rooney', 'Mark', '1985-10-24', 300, 1),
    (NULL, 'Carlos', 'Tevez', 'Alberto', '1984-02-05', 250, 1),
    (NULL, 'Anthony', 'Martial', 'Joran', '1995-12-05', 100, 2),
    (NULL, 'David', 'de Gea', 'Quintana', '1990-11-07', 200, 2),
    (NULL, 'Lionel', 'Messi', 'Andres', '1987-06-24', 300, 2),
    (NULL, 'Lius', 'Suarez', 'Alberto', '1987-01-24', 250, 3),
    (NULL, 'Gareth', 'Bale', 'Frank', '1989-07-16', 250, 3),
    (NULL, 'Karim', 'Benzema', 'Mostafa', '1987-12-19', 200, 4),
    (NULL, 'Poul', 'Scholes', 'Aron', '1974-11-16', 180, 4);