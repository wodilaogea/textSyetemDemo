package test_system.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test_system.demo.dao.QuestionDao;
import test_system.demo.domain.Question;
import test_system.demo.service.QuestionService;

import java.awt.print.Book;
import java.util.List;

/**
 * @author 邰子昊
 * @version 1.0
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Override
    public List<Question> getAll() {
        List<Question> questions=questionDao.getAll();
        return questions;
    }

    @Override
    public boolean add(Question question) {
        return (questionDao.add(question) > 0);
    }

    @Override
    public boolean delete(Long id) {
        System.out.println(id);
        return questionDao.delete(id) > 0;
    }

    @Override
    public boolean update(Question question) {
        return questionDao.update(question) > 0;
    }
}
