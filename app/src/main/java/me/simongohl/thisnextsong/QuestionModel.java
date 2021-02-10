package me.simongohl.thisnextsong;

public class QuestionModel {
    private int id;
    private String question;
    private String category;

    public QuestionModel(int id, String question, String category) {
        this.id = id;
        this.question = question;
        this.category = category;
    }

    public QuestionModel () {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
