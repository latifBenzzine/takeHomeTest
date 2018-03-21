
drop table if exists AppUser;
create table  if not exists AppUser
(
   id Long not null,
   name varchar(255) not null,
   email varchar(255) not null,
   phoneNumber varchar(50) not null,
   Locale varchar(2),
   birthDate Date,
   primary key(id)
);