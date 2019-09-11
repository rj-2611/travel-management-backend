DROP TABLE IF EXISTS trip_info;
 
create table trip_info(
   trip_id INT NOT NULL AUTO_INCREMENT,
   emp_name VARCHAR(100),
   emp_mobile BIGINT,
   cust_name VARCHAR(100),
   cust_mobile BIGINT,
   source VARCHAR(100),
   destination VARCHAR(100),
   pickup_time DATETIME,
   drop_time DATETIME,
   PRIMARY KEY ( trip_id )
);

insert into trip_info values (1,'Joey',8080808080,'Chandler',9090909090,'Megapolis','Shivaji Chowk','2019-09-10 06:20:00','2019-09-10 07:05:00'),
(2,'Ross',7070707070,'Rachel',6060606060,'Pune','Mumbai','2019-09-05 03:37:00','2019-09-05 07:05:00'),
(3,'Monica',5050505050,'Phoebee',4040404040,'Marunji','Magarpatta','2019-09-07 01:45:00','2019-09-07 02:30:00')