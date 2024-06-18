package org.example.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

    @Id
    private int questionId;

    private String question;

    @OneToOne
    private Answer answer;

    public Question(){}

    public Question(int questionId,String question,Answer answer){
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;

    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestion(){
        return question;
    }

    public Answer getAnswer(){
        return answer;
    }

    public void setQuestionId(int questionId){
        this.questionId = questionId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
