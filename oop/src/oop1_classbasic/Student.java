package oop1_classbasic;

public class Student {

    public int studentID;
    String studentName;
    public String address;

    //defalt constructor는 class 내부에 생성자가 "하나도" 없는 경우, 컴파일러가 자동으로 생성
    public Student(){}

    //overloading
    public Student(int studentID, String studentName, String address){
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
    }

    public void showStudentInfo(){
        System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        studentName = name;
    }
}
