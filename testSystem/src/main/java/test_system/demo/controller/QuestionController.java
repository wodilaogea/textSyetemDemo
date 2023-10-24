package test_system.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test_system.demo.domain.Question;
import test_system.demo.service.QuestionService;

import java.awt.print.Book;
import java.util.List;

/**
 * @author 邰子昊
 * @version 1.0
 */
@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping
    public List getAll() {
        return questionService.getAll();
    }
    @PostMapping
    public boolean save(@RequestBody Question question) {
        boolean flag = questionService.add(question);
        return flag;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id) {
        boolean flag = questionService.delete(id);
        return flag;
    }
    @PutMapping
    public boolean update(@RequestBody Question question) {
        boolean flag = questionService.update(question);
        return flag;
    }
}
