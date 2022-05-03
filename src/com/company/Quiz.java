package com.company;


import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> quizProblems = new ArrayList<>();
    private int currentScore = 0;
    private int totalScore = 0;


    public Quiz(ArrayList<Question> questions) {
        this.quizProblems = questions;
    }


    public ArrayList<Question> getQuizProblems() {
        return quizProblems;
    }
    public void setQuizProblems(ArrayList<Question> quizProblems) {
        this.quizProblems = quizProblems;
    }

    public int getCurrentScore() {
        return currentScore;
    }
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }


    public void addProblem(Question aProblem) {
        this.quizProblems.add(aProblem);
    }

    public void removeProblem(Question aProblem) {
        this.quizProblems.remove(aProblem);
    }

    public void runQuiz() {
        for (Question problem : this.quizProblems) {
            problem.showQuestion();
            problem.checkQuestion();
            this.totalScore += problem.getPoints();
        }
    }

    public void GradeQuiz() {
        int studentScore = 0;
        for (Question problem: this.quizProblems) {
            if (problem.getIsCorrect()) {
                studentScore += problem.getPoints();
            }
        }
        this.currentScore = studentScore;
        System.out.println("You scored " + this.currentScore + " out of " + this.totalScore);
    }
}
