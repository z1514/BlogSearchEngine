package cn.imooc.demo.springboot.es.repository.mysql;

import cn.imooc.demo.springboot.es.entity.mysql.MysqlBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MysqlBlogRepository extends JpaRepository<MysqlBlog,Integer> {//key

    @Query("select e from MysqlBlog e order by e.createTime desc")
    public List<MysqlBlog> queryAll();

    @Query("select e from MysqlBlog e where e.title " + "" +
            "like concat('%',:keyword,'%') or e.content like concat('%',:keyword,'%')")
    public List<MysqlBlog> queryBlogs(@Param("keyword") String keyword);
}
