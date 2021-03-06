package com.amsavarthan.dude.models;

public class AllQuestionsModel extends QuestionID {

    private String name,id,subject,question,timestamp,answered_by;

    public AllQuestionsModel(){

    }

    public AllQuestionsModel(String name, String id, String subject, String question, String timestamp, String answered_by) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.question = question;
        this.answered_by = answered_by;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAnswered_by() {
        return answered_by;
    }

    public void setAnswered_by(String answered_by) {
        this.answered_by = answered_by;
    }

}
