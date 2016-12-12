# --- First database schema

# --- !Ups

create table cliente (
  id                        bigint not null,
  name                      varchar(255),
  apellido                  varchar(255),
  ncedula                  varchar(255),
  nmesa                   varchar(255),
  norden                   varchar(255),
  constraint pk_company primary key (id))
;




create sequence cliente_seq start with 1000;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists cliente;

SET REFERENTIAL_INTEGRITY TRUE;


drop sequence if exists cliente_seq;

