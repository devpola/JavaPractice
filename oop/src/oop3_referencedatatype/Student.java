package oop3_referencedatatype;

public class Student {

    int studentID;
    String name;

    Subject korea;
    Subject math;

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(name + "학생의 총점은 " + total + "점 입니다.");
    }
}
