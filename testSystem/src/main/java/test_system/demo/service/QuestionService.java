package test_system.demo.service;

import org.springframework.transaction.annotation.Transactional;
import test_system.demo.domain.Question;

import java.awt.print.Book;
import java.util.List;

/**
 * @author 邰子昊
 * @version 1.0
 */
@Transactional
public interface QuestionService {
    public List<Question> getAll();
    public boolean add(Question question);
    public boolean delete(Long id);
    public boolean update(Question question);
}
