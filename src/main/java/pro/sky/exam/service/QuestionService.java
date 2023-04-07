package pro.sky.exam.service;

import pro.sky.exam.model.Question;

import java.util.Collection;

public interface QuestionService {
    String add(String question, String answer);

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getall();

    Question getRandomQuestion();
}
