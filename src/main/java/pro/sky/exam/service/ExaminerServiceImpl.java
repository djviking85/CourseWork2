package pro.sky.exam.service;

import org.springframework.stereotype.Service;
import pro.sky.exam.model.Question;

import java.util.Collection;

@Service

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestioms() {
        return null;
    }
}
