package com.company;


public abstract class Question {

    private String questionStr;
    private String answerStr;
    private boolean isCorrect = false;
    private int points;
    private String userInput;


    public String getUserInput() {
        return userInput;
    }
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public Question(String aQuestionStr, int points) {
        this.questionStr = aQuestionStr;
        this.points = points;
    }



    public String getQuestionStr() {
        return questionStr;
    }
    public void setQuestionStr(String questionStr) {
        this.questionStr = questionStr;
    }

    public String getAnswer() { return this.answerStr; }
    public void setAnswer(String str) { this.answerStr = str; }

    public boolean getIsCorrect() {
        return isCorrect;
    }
    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public abstract void showQuestion();

    public abstract void checkQuestion();
}
