package cn.imooc.demo.springboot.es.entity.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 24989
 * DROP TABLE IF EXISTS `t_blog`;
 *
 * CREATE TABLE `t_blog` (
 *
 *   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
 *
 *   `title` varchar(60) DEFAULT NULL COMMENT '博客标题',
 *
 *   `author` varchar(60) DEFAULT NULL COMMENT '博客作者',
 *
 *   `content` mediumtext COMMENT '博客内容',
 *
 *   `create_time` datetime DEFAULT NULL COMMENT '创建时间',
 *
 *   `update_time` datetime DEFAULT NULL COMMENT '更新时间',
 *
 *   PRIMARY KEY (`id`)
 *
 * ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;
 */
@Data
@Table(name = "t_blog")
@Entity
public class MysqlBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    @Column(columnDefinition = "mediumtext")
    private String content;
    private Date createTime;
    private Date updateTime;
}
