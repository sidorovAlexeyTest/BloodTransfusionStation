create table if not exists units(id int not null auto_increment primary key,
                                 name varchar(25) not null,
                                 description varchar(500),
                                 date varchar(12));

create table if not exists problem_and_solution(name varchar(25) NOT NULL,
                                 problem_date varchar(10) NOT NULL,
                                 problem_desc varchar(1000) NOT NULL,
                                 solution_date varchar(10) NOT NULL,
                                 solution_desc varchar(1000) NOT NULL,
                                 conclusion varchar(1000) NOT NULL);
