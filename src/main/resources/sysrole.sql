/*
-- Query: SELECT * FROM spr.spr_sysrole
LIMIT 0, 1000

-- Date: 2022-03-30 13:58
*/
INSERT INTO spr_sysrole (`id`,`created_by`,`created_date`,`modified_by`,`modified_date`,`code`,`is_system`,`name`,`data_permission_token_id`) VALUES ('0e1a23631cdb43c7ac8d3b3c537028dd','SparrowSystem','2021-11-11 13:34:02','SparrowSystem','2021-11-11 13:34:02','SYSADMIN','1','系统管理员',NULL);
INSERT INTO spr_sysrole (`id`,`created_by`,`created_date`,`modified_by`,`modified_date`,`code`,`is_system`,`name`,`data_permission_token_id`) VALUES ('7311c3fbcf384de49b841931cde0a864','SparrowSystem','2021-11-11 13:34:02','SparrowSystem','2021-11-11 13:34:02','ADMIN','1','管理员',NULL);
INSERT INTO spr_sysrole (`id`,`created_by`,`created_date`,`modified_by`,`modified_date`,`code`,`is_system`,`name`,`data_permission_token_id`) VALUES ('ff8080817fe92689017fe934e6030001','ROOT','2022-01-29 06:42:24',NULL,'2022-03-27 06:44:51','SUPER_ADMIN',NULL,'超级管理员',NULL);
INSERT INTO spr_sysrole (`id`,`created_by`,`created_date`,`modified_by`,`modified_date`,`code`,`is_system`,`name`,`data_permission_token_id`) VALUES ('ff8080817fe92689017fe93493670000','ROOT','2022-01-29 06:42:24',NULL,'2022-03-27 06:44:51','SUPER_SYSADMIN',NULL,'超级系统管理员',NULL);


/*SUPER_SYSADMIN*/
insert into spr_sysrole_menu(menu_id,sysrole_id,include_sub_menu) values('9323b05e30b34ed2aea7d4d9de6a69df','ff8080817fe92689017fe93493670000',true);
insert into spr_sysrole_menu(menu_id,sysrole_id,include_sub_menu) values('da2d086402b84cc69d548153d8f81469','ff8080817fe92689017fe93493670000',true);
insert into spr_sysrole_menu(menu_id,sysrole_id,include_sub_menu) values('523129a909f340ce90b5816f2e67e14b','ff8080817fe92689017fe93493670000',true);
/*ADMIN*/
insert into spr_sysrole_menu(menu_id,sysrole_id,include_sub_menu) values('9323b05e30b34ed2aea7d4d9de6a69df','7311c3fbcf384de49b841931cde0a864',true);
/*SYSADMIN*/
insert into spr_sysrole_menu(menu_id,sysrole_id,include_sub_menu) values('da2d086402b84cc69d548153d8f81469','0e1a23631cdb43c7ac8d3b3c537028dd',true);

insert into SPR_USER_SYSROLE(sysrole_id, username) values('0e1a23631cdb43c7ac8d3b3c537028dd','forwarder1');
insert into SPR_USER_SYSROLE(sysrole_id, username) values('7311c3fbcf384de49b841931cde0a864','shipper1');