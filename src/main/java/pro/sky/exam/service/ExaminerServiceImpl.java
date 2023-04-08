package pro.sky.exam.service;

import org.springframework.stereotype.Service;
import pro.sky.exam.exceptions.QuestionException;
import pro.sky.exam.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

//    @Override
//    public Collection<Question> getQuestions() {
//        return null;
//    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if(amount < 1) {
            throw new QuestionException("не может быть отрицательным");
        }

        if (amount > questionService.getall().size()) {
            throw new QuestionException("Слишком много вопросов");
        }

        Set<Question> result = new HashSet<>();

        while (result.size() < amount) {
            result.add(questionService.getRandomQuestion());
        }

        return result;
    }
}
