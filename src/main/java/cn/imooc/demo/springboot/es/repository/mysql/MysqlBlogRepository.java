package cn.imooc.demo.springboot.es.repository.mysql;

import cn.imooc.demo.springboot.es.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MysqlBlogRepository extends JpaRepository<MysqlBlog,Integer> {//key

}
