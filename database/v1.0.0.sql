-- calendar_management.`calendar` definition
CREATE TABLE `calendar` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `center_id` bigint(20) NOT NULL,
  `group_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=300 DEFAULT CHARSET=utf8;

-- calendar_management.`calendar_day` definition
CREATE TABLE `calendar_day` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `year` int(11) NOT NULL,
  `date` varchar(25) DEFAULT NULL,
  `category_id` bigint(20) NOT NULL,
  `calendar_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8;

-- calendar_management.`category_day` definition
CREATE TABLE `category_day` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1206 DEFAULT CHARSET=utf8;


-- calendar_management.`center` definition
CREATE TABLE `center` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;


-- calendar_management.`group` definition
CREATE TABLE `group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `max_hour_year` double NOT NULL,
  `hours_week` double NOT NULL,
  `hours_from` double DEFAULT NULL,
  `hours_intensive` double DEFAULT NULL,
  `intensive_from` varchar(25) DEFAULT NULL,
  `intensive_to` varchar(25) DEFAULT NULL,
  `personal_days` double NOT NULL,
  `free_days` double DEFAULT NULL,
  `additional_days` double NOT NULL,
  `holidays` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1270 DEFAULT CHARSET=utf8;



INSERT INTO calendar_management.category_day (id, name) VALUES(1, 'Festivo');
INSERT INTO calendar_management.category_day (id, name) VALUES(2, 'Jornada normal');
INSERT INTO calendar_management.category_day (id, name) VALUES(3, 'Jornada intensiva');
