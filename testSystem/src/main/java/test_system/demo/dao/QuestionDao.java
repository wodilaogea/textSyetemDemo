package test_system.demo.dao;

import org.apache.ibatis.annotations.*;
import test_system.demo.domain.Question;

import java.awt.print.Book;
import java.util.List;

/**
 * @author 邰子昊
 * @version 1.0
 */
@Mapper
public interface QuestionDao {
    @Select("select * from main;")
    List<Question> getAll();
    @Insert("insert into main (`title`,`type`,`answer`,`analysis`,`option`) values(#{title},#{type},#{answer},#{analysis},#{option})")
    public int add(Question question);
    @Delete("delete from main where `id` = #{id}")
    public int delete(Long id);
    @Update("update main set `type` = #{type},`title` = #{title},`answer` = #{answer},`analysis` = #{analysis},`option` = #{option} where `id` = #{id}")
    public int update(Question question);
}
