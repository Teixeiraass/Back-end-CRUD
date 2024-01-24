CREATE TABLE IF NOT EXISTS `employees` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `data_entrada` datetime(6) DEFAULT NULL,
  `data_saida` datetime(6) DEFAULT NULL,
  `name` varchar(3000) NOT NULL,
  `salary` double NOT NULL,
  PRIMARY KEY (`id`)
)