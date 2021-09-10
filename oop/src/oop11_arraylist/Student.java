package oop11_arraylist;

import java.util.ArrayList;

public class Student {

    private int id;
    private int totalScore;
    private String name;
    public ArrayList<Subject> courses = new ArrayList<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addSubject(String subjectName, int score) {
        courses.add(new Subject(subjectName, score));
        totalScore += score;
    }

    public void showStudentInfo() {
        for(Subject subject : courses) {
            System.out.print(name + " 학생의");
            System.out.print(" " + subject.getSubjectName() + " 과목 성적은 ");
            System.out.println(subject.getScore() + "점 입니다.");
        }
        System.out.println(name + " 학생의 총점은 " + totalScore + "점 입니다.");
    }
}
