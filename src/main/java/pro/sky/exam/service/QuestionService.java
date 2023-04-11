package pro.sky.exam.service;

import pro.sky.exam.model.Question;

import java.util.Collection;

 public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question remove(String question, String answer);

    Collection<Question> getall();

    Question getRandomQuestion();
}
