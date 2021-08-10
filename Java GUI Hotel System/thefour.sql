create database TheFour;
use TheFour;

create table guest(
guest_ID int auto_increment,
guest_name varchar(100),
guest_phoneNb long,
guest_age int,
guest_email varchar(100),
guest_country varchar(50),
reward_points int,
PRIMARY KEY (guest_ID)
);
insert into guest(guest_name, guest_phoneNb, guest_age, guest_email, guest_country, reward_points) values 
('Lara Idriss','01589746','25','lara.idriss@gmail.com','Lebanon','0'),
('Yasmine Samadi','01987456','21','yasmine.samadi@gmail.com','Russia','0'),
('Hala Mikkawi','01232324','28','hala.mikkawi@gmail.com','Lebanon','1500'),
('Karim Zeidan','01454545','30','karim.zeidan@gmail.com','UAE','300'),
('Mohamad Saamdi','0145658','22','mohamad.samadi@gmail.com','UAE','2000'),
('Rawad Zaatari','01363698','27','rawad.zaatari@gmail.com','Lebanon','360'),
('Faysal Sabaayoun','01544758','35','faysal.sabaayoun@gmail.com','Italy','0'),
('Riham Isamil','01369658','55','riham.isamil@gmail.com','Spain','980'),
('Solar Yaman','01234552','36','solar.yaman@gmail.com','Lebanon','320'),
('Jawad Barakat','01478963','40','jawad.barakat@gmail.com','Lebanon','0'),
('Liam Chamli', '76722322', '24', 'liam.chamli@outlook.com', 'Italy','0'), 
('Olivia Johnson', '70550550', '29', 'olivia.johnson@outlook.com', 'America','500'),
('Lara Kanso', '03454777', '18', 'lara.kanso@outlook.com', 'Lebanon','0'),
('Isabel Brown', '76001101', '32', 'isabel.brown@outlook.com', 'Africa','1200'),
('Jad Ismail', '76231114', '25', 'jad.ismail@outlook.com', 'Lebanon','0'),
('Mia Dbouk', '03669978', '46', 'mia.dbouk@outlook.com', 'Paris','0'),
('Lucas Williams', '70814283', '21', 'lucas.williams@outlook.com', 'Brazil','0'),
('Celine Kobeissy', '76111200', '40', 'celine.kobeissy@outlook.com', 'China','600'),
('Bella Koleilat', '76098625', '24', 'bella.koleilat@outlook.com', 'Italy','900'),
('James Davis', '71872243', '36', 'james.davis@outlook.com', 'Greece','0'),
('Alaa Kiran', '89326489', '30', 'alaa.kiran@gmail.com', 'India','1000'), 
('Tamara Morgan', '23975214', '40', 'tamara.morgan@hotmail.com', 'USA','520'),
('Laura Bryan', '96529245', '60', 'laura.bryan@outlook.com', 'Canada','960'),
('Iman Youssef', '23863253', '20', 'iman.youssef@gmail.com', 'Africa','780'),
('Issa Ismail', '76231114', '22', 'issa.ismail@hotmail.com', 'Algeria','0'),
('Omar Yousef', '32653544', '36', 'omar.youssef@outlook.com', 'Tunisia','0'),
('Lamia Jawad', '70814283', '45', 'lamia.jawad@hotmail.com', 'Brazil','0'),
('Wael Jarrah', '23576754', '32', 'wael.jarrah@gmail.com', 'Lebya','0'),
('Maria Tamer', '1246733', '22', 'MariaT@gmail.com', 'Lebanon','0'),
('Karim Dia', '39276214', '21', 'KarimD@outlook.com', 'Egypt','0'),
('Lina Jaber', '76712093', '34', 'lina.jaber@outlook.com', 'Lebanon','560'), 
('Melissa Maatouk', '70520150', '29', 'melissa.maatouk@outlook.com', 'America','0'),
('Jana Kanso', '03453291', '40', 'jana.kanso@outlook.com', 'Lebanon','0'),
('Jane Austen', '76122290', '70', 'jane.austen@outlook.com', 'America','450'),
('Jad Chahine', '76331414', '35', 'jad.chahine@outlook.com', 'Lebanon','690'),
('Mia Chamli', '03663958', '46', 'mia.chamli@outlook.com', 'London','790'),
('Sara Aoun', '70233283', '29', 'sara.aoun@outlook.com', 'Lebanon','0'),
('Celine Mahjoub', '76126200', '30', 'celine.mahjoub@outlook.com', 'China','0'),
('Ali Jaber', '76098625', '64', 'ali.jaber@outlook.com', 'Turkey','0'),
('Fadi Ghandour', '71822213', '76', 'fadi.ghandour@outlook.com', 'Lebanon','0')
;

select * from guest;

create table premium_guest(
premium_id int auto_increment,
guest_ID int,
guest_name varchar(100),
guest_phoneNb int,
guest_age int,
guest_email varchar(100),
guest_country varchar(50),
primary key(premium_id),
foreign key(guest_ID) references guest(guest_ID)
);
insert into premium_guest(guest_ID,guest_name,guest_phoneNb,guest_age,guest_email,guest_country) values 
('3','Hala Mikkawi','01232324','28','hala.mikkawi@gmail.com','Lebanon'),
('4','Karim Zeidan','01454545','30','karim.zeidan@gmail.com','UAE'),
('5','Mohamad Saamdi','0145658','22','mohamad.samadi@gmail.com','UAE'),
('6','Rawad Zaatari','01363698','27','rawad.zaatari@gmail.com','Lebanon'),
('8','Riham Isamil','01369658','55','riham.isamil@gmail.com','Spain'),
('9','Solar Yaman','01234552','36','solar.yaman@gmail.com','Lebanon'),
('12','Olivia Johnson', '01550550', '29', 'olivia.johnson@outlook.com', 'America'),
('14','Isabel Brown', '01001101', '32', 'isabel.brown@outlook.com', 'Africa'),
('18','Celine Kobeissy', '01111200', '40', 'celine.kobeissy@outlook.com', 'China'),
('19','Bella Koleilat', '01098625', '24', 'bella.koleilat@outlook.com', 'Italy'),
('22','Alaa Kiran', '01326489', '30', 'alaa.kiran@gmail.com', 'India'), 
('23','Tamara Morgan', '01975214','40', 'tamara.morgan@hotmail.com', 'USA'),
('24','Laura Bryan', '01529245','60', 'laura.bryan@outlook.com', 'Canada'),
('25','Iman Youssef', '01863253', '20', 'iman.youssef@gmail.com', 'Africa'),
('31','Lina Jaber', '76712093', '34', 'lina.jaber@outlook.com', 'Lebanon'), 
('34','Jane Austen', '76122290', '70', 'jane.austen@outlook.com', 'America'),
('35','Jad Chahine', '76331414', '35', 'jad.chahine@outlook.com', 'Lebanon'),
('36','Mia Chamli', '03663958', '46', 'mia.chamli@outlook.com', 'London')
;
select * from premium_guest;

create table employees(
emp_ID int auto_increment,
emp_name varchar(100),
emp_email varchar(100),
emp_phNum long,
emp_age int,
emp_city varchar(100),
emp_street varchar(100),
emp_extension int,
dept_name varchar(100), 
emp_salary int,
primary key(emp_ID)
);
insert into employees(emp_name,emp_email,emp_phNum,emp_age,emp_city,emp_street,emp_extension,dept_name,emp_salary) values 
('Zad Kojok','zad.kojok@TheFour.com','02587836','26','Lebanon-Beirut','Airport Street','1478','Reception',9000),
('Yara Akoum','yara.akoum@TheFour.com','02874593','27','Lebanon-Saida','Daleaa Street','1485','HouseKeeping',4600),
('Jana Zwiya','jana.zwiya@TheFour.com','02366978','26','Lebanon-Jbeil','Rabieh Street','1463','Accounting',9100),
('Hazem Joeudi','hazem.joeudi@TheFour.com','02251478','23','Lebanon-Jbeil','Rabieh Street','1474','Managment',5400),
('Ali Zein','ali.zein@TheFour.com','02147896','36','Lebanon-Tripoli','Hames Street','1430','Security',3000),
('Ghadi Merhi','ghadi.merhi@TheFour.com','02365214','45','Lebanon-Tyr','Zein Street','1432','Accoutning',6700),
('Rolanda Chhade','rolanda.chhade@TheFour.com','02369869','35','Lebanon-Beirut','Verdun Street','1440','Security',5600),
('Angela Kechtban','angela.kechtban@TheFour.com','02741850','32','Lebanon-Tripoli','Hames Street','1498','Sales and Marketing',7800),
('Marwa Antar','marwa.antar@TheFour.com','02001473','32','Lebanon-Saida','Hilaliyeh Street','1423','Housekeeping',2500),
('Manar Dafer','manar.dafer@TheFour.com','02225873','34','Lebanon-Jbeil','Hames Street','1410','Reception',3600),
('Zein Hamade', 'zein.hamade@TheFour.com', '70809809', '21', 'Lebanon-Baabda', 'Airport Street', '1254', 'Housekeeping', 7800),
('Fatima Baalbaki', 'fatima.baalbaki@TheFour.com', '70123855', '23', 'Lebanon-Beirut', 'Verdun Street', '3222', 'Reception', 9100),
('Hadi Charaf', 'hadi.charaf@TheFour.com', '70060935', '35','Lebanon-Baabda', 'Airport Street', '1202', 'Management', 1200),
('Abbas Khalil', 'abbas.khalil@TheFour.com', '71205288', '39', 'Lebanon-Beirut', 'Dbayeh Strret', '2303', 'Accounting', 4200),
('Sarah Amhaz', 'sarah.amhaz@TheFour.com', '70435339', '21', 'Lebanon-Baabda', 'Baabda Street', '1233', 'Security', 2000),
('Rayan Ghandour', 'rayan.ghandour@TheFour.com', '71525844', '28', 'Lebanon-Beirut', 'Bir Hassan Street', '1444', 'Maintenance', 2500),
('Alex Hamad', 'alex.hamad@TheFour.com', '03772083', '19', 'Lebanon-Baabda', 'Baabda Strret', '4766', 'Food and Beverage', 3600),
('Zeinab Chahoud', 'zeinab.chahoud@TheFour.com', '76052673', '44','Lebanon-Beirut', 'Jnah Street', '5987', 'HouseKeeping', 4200),
('Omar Kanso', 'omar.kanso@TheFour.com', '76222123', '31','Lebanon-Beirut', 'Dbayeh Street', '3285', 'Reception', 3200),
('Ihab Jihad', 'ihab.jihad@TheFour.com', '28356353', '30', 'Lebanon-Beirut','Abdulla Street', '1234', 'Management', 5800),
('Fahed Rabih', 'fahed.rabih@TheFour.com', '23857932', '33', 'Lebanon-Baalback','Ali Street', '5678', 'Accounting', 4500),
('Kazem Wael', 'kazem.wael@TheFour.com', '32589632', '22', 'Lebanon-Beirut', 'Fouad Street' ,'2345', 'HouseKeeping', 4500),
('Ahmad Issam', 'ahmad.issam@TheFour.com', '32985635', '27', 'Lebanon-Saida', 'Sharif Street','3456', 'Reception', 1700),
('Ali Rabeh', 'ali.rabeh@TheFour.com', '329573287', '28', 'Lebanon-Beit Shama', 'Osman Street','1345', 'Food and Beverages', 4500),
('Pamela Yaacoub', 'pamela.yaacoub@TheFour.com', '327846823', '29', 'Lebanon-Koraytem', 'Ankara Street','1667', 'Maintenance', 1400),
('Esmail Ayoub', 'esmail.ayoub@TheFour.com', '39826432', '39', 'Lebanon-Bhamdoun', 'Holland Street','1889', 'Security', 7600),
('Zeina Moazzen', 'zeina.moazzen@TheFour.com', '382956893', '40', 'Lebanon-Sour','Abdulla Street' ,'1334', 'HouseKeeping', 2500),
('Ruba Kassem', 'ruba.kassem@TheFour.com', '389265983', '35', 'Lebanon-Damour','Jaber Street' ,'1889', 'Human Resources', 3300),
('Nasim Alyan', 'nasim.alyan@TheFour.com', '3295732035', '26', 'Lebanon-Tripoli', 'Karim Street','1445', 'Sales and Marketing', 2000),
('Tania Hatoum' , 'tania.hatoum@theFour.com', '70812779', '28', 'Lebanon-Nabatieh', 'Hay El Saray Street' , '1154', 'Management', 3200),
('Roua Charife', 'roua.charife@theFour.com', '70133455', '25', 'Lebanon-Verdun', '10th Avenu Street' , '3122', 'House Keeping', 6000),
('Rami Zeineddine', 'rami.zeineddine@theFour.com', '71060235', '30', 'Lebanon-Kfarjoz' , 'Abar Fakhreddine Street' , '1292', 'Reception', 5100),
('Abbas Jaafar', 'abbas.jaafar@theFour.com', '71233288', '29', 'Lebanon-Baalbak', 'El Sakhra street' , '5113', 'Accounting', 3200),
('Lynn Hajjar', 'lynn.hajjar@theFour.com', '70435111', '23', 'Lebanon-Baabda', 'Saydaliye street', '1633', 'Security', 2250),
('Marwa Faaour', 'marwa.faaour@theFour.com', '71333844', '31', 'Lebanon-Jbeil', 'Elysee street', '1294', 'Management', 3300),
('Yara Karam' , 'yara.karam@theFour.com', '03745583', '20', 'Lebanon-Furn El Chebbek', ' Knise street' , '4236', 'Food and Beverage', 5000),
('Mireille Kaouk', 'mireille.kaouk@theFour.com', '76332673', '34', 'Lebanon-Saida', 'El nejme street' , '1987', 'HouseKeeping', 2500),
('Reine Ezzedine', 'reine.ezzedine@theFour.com', '76290223', '38', 'Lebanon-Dbayeh', 'Lor street' , '6525', 'Reception', 3600),
('Karim Naser', 'karim.naser@theFour.com', '03934539', '22', 'Lebanon-Khalde', 'Kfarchoun Street', '8309', 'Accounting', 2560),
('Leila Naser', 'leila.naser@theFour.com', '03587527', '24', 'Lebanon-Khalde', 'Kfarchoun Street', '8319', 'Sales and Marketing', 2590)
;


select * from employees;
drop table Room;
create table Room(
Room_number int,
room_type varchar(50),
floor_number int,
room_price double,
availability varchar(50),
PRIMARY KEY(Room_number)
);
insert into room(Room_number, room_type,floor_number,room_price,availability) values 
('101','Standard','1','200.00','Available'),
('102','Double','1','350.00','Occupied'),
('103','Standard','1','200.00','Available'),
('104','Family','1','450.00','Available'),
('105','Suite','1','550.00','Occupied'),
('106','Double','1','350.00','Available'),
('107','Standard','1','200.00','Occupied'),
('108','Suite','1','550.00','Occupied'),
('109','Family','1','450.00','Occupied'),
('110','Double','1','350.00','Occupied'),
('111', 'Family', '2', '450.00','Available'),
('112', 'Standard', '2', '200.00','Available'),
('113', 'Suite', '2', '550.00','Available'),
('114', 'Standard', '2', '200.00','Available'),
('115', 'Family', '2', '450.00','Occupied'),
('116', 'Standard', '2', '200.00','Available'),
('117', 'Standard', '2','200.00','Occupied'),
('118', 'Suite', '2', '550.00','Available'),
('119', 'Standard', '2', '200.00','Occupied'),
('120', 'Suite', '2', '550.00', 'Available'),
('121', 'Standard', '3', '200.00', 'Available'),
('122', 'Suite', '3', '550.00', 'Occupied'),
('123', 'Standard', '3', '200.00','Available'),
('124', 'Double', '3','350.00','Occupied'),
('125', 'Suite', '3', '550.00', 'Available'),
('126', 'Standard', '3', '200.00','Occupied'),
('127', 'Double', '3','350.00','Available'),
('128', 'Family', '3', '450.00', 'Occupied'),
('129', 'Family', '3', '450.00','Available'),
('131', 'Suite', '4', '550.00', 'Available'),
('132', 'Suite', '4', '550.00', 'Available'),
('133', 'Standard', '4','200.00','Occupied'),
('134', 'Double', '4','350.00','Occupied'),
('135', 'Standard', '4', '200.00', 'Available'),
('136', 'Standard', '4', '200.00','Occupied'),
('137', 'Double', '4','350.00','Occupied'),
('138', 'Family', '4', '450.00', 'Available'),
('139', 'Family', '4', '450.00','Occupied'),
('140', 'Suite', '4', '550.00','Occupied')
;
select * from Room;

create table Service(
service_id int auto_increment,
emp_ID int,
serv_type varchar(50),
Room_number int,
serv_time time,
PRIMARY KEY(service_id),
FOREIGN KEY(emp_ID) references employees(emp_ID)
);
insert Service(emp_ID, serv_type,Room_number,serv_time) values 
('1','Food Delivery','108','12:00:00'),
('2','Room Cleaning','102','02:25:00'),
('3','Dry Cleaning','110','06:32:00'),
('4','Laundry','109','05:07:00'),
('5','Food Delivery','103','01:00:00'),
('6','Room Cleaning','107','03:58:00'),
('7','Laundry','106','10:21:00'),
('8','Food Delivery','105','09:32:00'),
('9','Dry Cleaning','102','08:55:00'),
('10','Laundry','101','01:58:00'),
('11', 'Food Delivery', '120', '12:45:00'),
('12', 'Room Service', '121', '15:32:00'),
('13', 'Reception Guests', '122', '18:21:00'),
('14', 'Laundry', '123', '21:01:00'),
('15', 'Dry cleaning', '124', '13:12:00'),
('16', 'Housekeeping Service', '125', '18:57:00'),
('17', 'Laundry', '126', '23:34:00'),
('18', 'Dry cleaning', '127','14:17:00'),
('19', 'Housekeeping Service', '128', '12:56:00'),
('20', 'Room Service', '129', '13:42:00'),
('21', 'Food Delivery', '130', '16:23:00'),
('22', 'Catering services', '131', '23:44:00'),
('23', 'Laundry', '132', '23:44:00'),
('24', 'Dry cleaning', '133', '23:44:00'),
('25', 'Room Service', '134', '12:50:10'),
('26', 'Concierge services', '126', '1:31:00'),
('27', 'Room Service', '135', '18:11:00'),
('28', 'Doctor on call', '138','22:05:00'),
('29', 'Dry cleaning', '136', '12:12:00'),
('30', 'Doctor on call', '137', '19:57:00'),
('31', 'Laundry', '130', '23:44:00'),
('32', 'Dry cleaning', '139' ,'18:17:00'),
('33', 'Reception Guests', '128', '10:45:00'),
('34', 'Room Service', '121','11:31:00'),
('35', 'Reception Guests','122','78:11:00'),
('36', 'Laundry', '128','22:05:00'),
('37', 'Dry cleaning', '124','12:12:00'),
('38', ' Room Service', '113','19:57:00'),
('39', 'Laundry', '120', '23:44:00'),
('40', 'Dry cleaning', '124' ,'18:17:00')
;
select * from Service;


create table PremiumServices(
Pservice_ID int auto_increment, 
Discount_Rate decimal(3,2),
Reward_Points int,
Service_Type varchar(50),
PServ_stime time,
PServ_etime time,
PRIMARY KEY(Pservice_ID)
);

insert PremiumServices( Discount_Rate, Reward_Points,Service_Type, PServ_stime, PServ_etime) values  
('0.20','40','Car Parking','12:00:00','12:10:00'),
('0.15','30','VIP lounge','02:25:00','03:25:00'),
('0.07','14','Car Parking','06:32:00','06:47:00'),
('0.11','22','Rooftop bar','05:07:00','07:07:00'),
('0.15','30','VIP buffet ','01:00:00','01:50:00'),
('0.10','20','VIP lounge','03:58:00','04:30:00'),
('0.10','20','Spa','10:21:00','10:50:00'),
('0.13','26','Beauty Salon','03:32:11','05:00:00'),
('0.12','24','Rooftop bar','08:54:00','10:00:00'),
('0.10','20','Spa','01:18:00','03:30:00'),
('0.10','20','Car Parking','13:00:00','13:30:00'),
('0.05','10','Spa','14:30:00','15:30:00'),
('0.12','24','Car Parking','12:35:00','12:50:00'),
('0.14','28','Beauty Salon','17:05:00','18:05:00'),
('0.20','40','Vip Lounge','20:00:00','20:30:00'),
('0.06','12','Spa','12:40:00','13:40:00'),
('0.07','14','Spa','10:50:00','11:50:00'),
('0.13','26','Beauty Salon','13:00:00','13:40:00'),
('0.16','32','Rooftop Bar','21:00:00','22:35:00'),
('0.10','20','Car Parking','13:52:00','14:00:00')
;

select * from PremiumServices;

create table branch ( 
branch_id int auto_increment,
B_Country varchar(100),
B_City varchar(100),
B_Street varchar(100),
branch_zip int,
branch_phNum long,
primary key(branch_id)
);

insert branch(B_Country,B_City,B_Street, branch_zip, branch_phNum) values
('Lebanon','Beirut', 'Hamra Street', '123', '96103118119' ),
('Netherlands', 'Amsterdam', 'Kings Street', '23', '9881243432949'),
('Egypt' , 'Cairo', 'Ajaa Street','56', '9662282374'),
('Turkey' , 'Istanbul' , 'Taksim' , '111', '2891838123')
;

select * from branch;

create table restaurant( 
rest_name varchar(50),
branch_id int,
rest_open_time time,
rest_close_time time,
number_of_tables int,
rest_PhNum long,
rest_type varchar(50),
primary key(rest_name),
foreign key (branch_id) references branch(branch_id)
);
insert restaurant(rest_name,branch_id,rest_open_time, rest_close_time, number_of_tables, rest_phNum, rest_type) values
('Italiono1','1', '10:00:00', '24:00:00', '14', '01443223', 'Italian Food'), 
('BeBabel1','1', '8:00:00', '24:00:00', '11', '01022987', 'Lebanese Food'), 
('The Grill1','1', '11:00:00', '23:30:00', '12', '01765987', 'Mexican Food'), 
('ChopSticks1','1', '13:00:00', '24:00:00', '10', '01027345', 'Chinese Food'),
('Italiono2','2', '10:00:00', '24:00:00', '14', '015874693', 'Italian Food'), 
('BeBabel2','2', '8:00:00', '24:00:00', '11', '01257488', 'Lebanese Food'), 
('The Grill2','2', '11:00:00', '23:30:00', '12', '01223336', 'Mexican Food'), 
('ChopSticks2','2', '13:00:00', '24:00:00', '10', '01996688', 'Chinese Food'),
('Italiono3','3', '10:00:00', '24:00:00', '14', '01585745', 'Italian Food'), 
('BeBabel3','3', '8:00:00', '24:00:00', '11', '015696584', 'Lebanese Food'), 
('The Grill3','3' ,'11:00:00', '23:30:00', '12', '014745835', 'Mexican Food'), 
('ChopSticks3','3', '13:00:00', '24:00:00', '10', '012525896', 'Chinese Food'),
('Italiono4','4', '10:00:00', '24:00:00', '14', '012585476', 'Italian Food'), 
('BeBabel4','4', '8:00:00', '24:00:00', '11', '012363258', 'Lebanese Food'), 
('The Grill4','4', '11:00:00', '23:30:00', '12', '012788874', 'Mexican Food'), 
('ChopSticks4','4', '13:00:00', '24:00:00', '10', '012585964', 'Chinese Food')
;
select * from restaurant;


create table store(
store_name varchar(50),
store_phNum long,
opening_time time,
closing_time time,
branch_id int,
primary key(store_name),
foreign key (branch_id) references branch(branch_id)
);
insert into store(store_name, store_phNum, opening_time, closing_time, branch_id) values
('Sweet Store', '238956934','8:00:00','21:00:00','1'),
('Focal Feed','289357621','9:00:00','22:00:00','1'),
('Corner Cafe','839469349','8:00:00','16:30:00','2'),
('Healthy Treats','928357928','9:00:00','14:30:00','3'),
('Aqua','17432895','8:30:00','12:00:00','4'),
('Summer Gift Shop','928365235','9:00:00','12:00:00','4'),
('Stone Tech Zone','32846329','9:00:00','20:00:00','4'),
('Columbia','32958632','8:00:00','18:00:00','2'),
('Buffalo','32576945','9:00:00','19:00:00','3')
;
select * from store;
drop table visitor;
Create table visitor(
visitor_id int auto_increment,
visitor_name varchar(50),
visitor_phNum long,
Room_number int,
primary key (visitor_id),
foreign key (Room_number) references Room(Room_number) 
);
insert visitor(visitor_name, visitor_phNum, Room_number) values 
('Amjad Baalbaki','01258743','101'),
('Mahmoud Ali','01363696','102'),
('Jihad Mansour','01252525','103'),
('Rubina Ahamd','01236987','112'),
('Manal Dafer','01789654','112'),
('Perla Chahine','01369685','101'),
('Karim Maarouf','01363658','103'),
('Sarah Abdallah','01777888','106'),
('Bilal Sabayoun','01258593','107'),
('Hadi Saleh','01258796','106'),
('Ghadi Saleh','012578364','111'),
('Huda Merhi','014875962','117'),
('Nabila Yaman','01587496','101'),
('Hani Yehya','01259874','127'),
('Hana Chahine', '03970700','104'),
('Lea Hamdoun', '71482032','137'),
('Mira Hammoud', '76563212','121'),
('Louai Khalil', '78280101','125'),
('Mohammad Alama', '76250366','134'),
('Khaled Hamad', '81397414','136')
;
select * from visitor;

create table credit_card(
card_number varchar(17),
pin_code int,
expiry_date date,
primary key (card_number)
);
insert into credit_card(card_number, pin_code, expiry_date) values 
('3697895872365258',7412,'2024-05-01'),
('6554445521289655' ,3698,'2025-06-01'),
('1258746936652874',1254,'2029-05-01'),
('2589634715896325',8562,'2025-02-01'),
('6987456745896321',7412,'2024-04-01'),
('3698574589632158',1235,'2025-01-01'),
('6985411225874123',2365,'2028-08-01'),
('6987532145698741',8547,'2023-01-01'),
('8745985636521478',2587,'2027-09-01'),
('3201874159632541',2739,'2025-07-01'),
('9635214785236954',1478,'2026-07-01'),
('8745963215478262',2367,'2024-05-01'),
('8547412536987452',7563,'2025-08-01'),
('3265987845122525',6987,'2027-03-01'),
('1234560325970243',2145,'2025-07-01'),
('4574456256439173',2587,'2028-07-01'),
('3295728459874254',4563,'2025-04-01')
;

select * from credit_card;



create table Payment( 
payment_id int auto_increment,
payment_method varchar(30),
Room_number int,
total_amount int,
card_number varchar(17),
payment_details varchar(50),
primary key (payment_id),
foreign key (Room_number) references Room(Room_number),
foreign key (card_number) references credit_card(card_number)
);
insert Payment (payment_method,Room_number, total_amount, card_number, payment_details) values 
('Debit Card', '101','250', '3697895872365258','Room Reservation'),
('Credit Card', '101','550', '6554445521289655','Service'),
('Debit Card', '110','450', '1258746936652874','Room Reservation'),
('Credit Card', '120','560', '2589634715896325','Room Reservation'),
('Debit Card', '132','690', '6987456745896321','Service'),
('Debit card', '111','200', '3698574589632158','Room Reservation'),
('Debit Card', '123','350', '6985411225874123','Service'),
('Credit card', '125','750', '6987532145698741','Room Reservation'),
('Credit Card','140', '300', '8745985636521478','Service'),
('Debit card','114', '300', '3201874159632541','Room Reservation'),
('Credit card','125', '350', '9635214785236954','Room Reservation'),
('Debit Card', '119','250', '8745963215478262','Room Reservation'),
('Credit card','103', '550', '8547412536987452','Room Reservation'),
('Credit card','136', '350', '3265987845122525','Room Reservation'),
('Credit Card ', '115','300', '1234560325970243','Room Reservation'),
('Credit card', '123','300', '4574456256439173','Service'),
('Credit Card', '101','200', '3295728459874254','Room Reservation')
;
select * from Payment;



drop table Reservation_details;
create table Reservation_details(
reservation_id int auto_increment,
branch_id int,
check_in datetime,
check_out datetime,
payment_id int,
emp_id int,
primary key( reservation_id),
foreign key (branch_id) references branch(branch_id),
foreign key (payment_id) references Payment(payment_id),
foreign key (emp_id) references employees(emp_id)
);
insert Reservation_details(branch_id, check_in, check_out, payment_id, emp_id) values 
('1', '2020-03-05 2:00:00', '2020-03-06 12:00:00', '1', '1'),
('3', '2020-03-07 2:00:00', '2020-03-08 12:00:00', '2', '2'),
('3', '2019-01-07 2:00:00', '2019-01-08 12:00:00', '3', '3'),
('4', '2018-07-01 2:00:00', '2018-07-02 12:00:00', '4', '4'),
('2', '2020-10-12 2:00:00', '2020-10-13 12:00:00', '5', '5'),
('1', '2005-11-17 2:00:00', '2005-11-18 12:00:00', '6', '6'),
('2', '2015-01-07 2:00:00', '2015-01-08 12:00:00', '7', '7'),
('3', '2015-01-09 2:00:00', '2015-01-10 12:00:00', '8', '8'),
('2', '2019-06-28 2:00:00', '2019-06-29 12:00:00', '9', '9'),
('4', '2019-09-20 2:00:00', '2019-09-21 12:00:00', '10', '10'),
('1', '2020-10-24 2:00:00', '2020-10-25 12:00:00', '11', '11'),
('3', '2020-11-25 2:00:00', '2020-11-26 12:00:00', '12', '12'),
('3', '2020-08-21 2:00:00', '2020-08-22 12:00:00', '13', '13'),
('4', '2020-09-12 2:00:00', '2020-09-13 12:00:00', '14', '14'),
('2', '2020-05-14 2:00:00', '2020-05-15  12:00:00', '15', '15'),
('1', '2020-10-11  2:00:00', '2020-10-12 12:00:00', '16', '16');



select * from Reservation_details;


create table department(
dept_id int auto_increment,
dept_name varchar(100),
dept_phNum long,
primary key(dept_id)
);
insert department(dept_name, dept_phNum) values 
('Management', '01373088'),
('Accounting', '01882333'),
('HouseKeeping', '01611194'),
('Reception', '01396369'),
('Reception', '01662709'),
('Food and Beverages', '01332082'),
('Security', '01240414'),
('Maintenance', '01446346'),
('Human Resource', '01581599'),
('Sales and Marketing', '01642035')
;

select * from department;

create table Events(
event_id int auto_increment,
event_date_time datetime,
event_type varchar(50),
primary key (event_id)
);
insert Events(event_type,event_date_time) values 
('Workshop', '2021-12-15 20:00:00'),
('Ceminar', '2021-5-21 12:00:00'),
('Charity', '2021-7-13 14:00:00'),
('Birthday', '2021-7-11 20:30:00'),
('Workshop', '2021-5-21 18:30:00'),
('Birthday', '2021-10-25 17:00:00'),
('Workshop', '2021-8-26 13:00:00'),
('Valentines', '2022-2-14 20:00:00'),
('New Years Eve', '2022-12-31 23:59:59'),
('Ceminar', '2021-11-16 10:00:00'),
('New Years Eve', '2021-12-31 23:59:59')
;



Select  emp_id as ID , emp_name as Name, dept_name as Department from employees where dept_name= 'Management' or dept_name= 'Reception';
Select guest_ID as ID, guest_name as Name, guest_age as Age from guest where guest_age > 30;
Select guest_name as Name, reward_points as 'Reward Points' from guest where reward_points>600;
Select visitor_id ,visitor_name from Visitor where Room_number>120;
Select Emp_name as Name, emp_salary as Salary from employees where emp_salary > all (select emp_salary from employees where dept_name = 'Management');

#Delete from guest where guest_name= 'Yara Chahine';


select * from Events;
select * from Payment;
select * from reservation_details;
select * from credit_card;
select * from guest;
select * from employees;
select * from premium_guest;
select * from premiumservices;
select * from service;
select * from Room;

