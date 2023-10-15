DROP TABLE IF EXIST users;
CREATE TABLE user(
    id int not null primary key,
    name varchar(255) not null,
    age int,
    email varchar(255),
    authorities varchar(255),
    password varchar(255)
)

