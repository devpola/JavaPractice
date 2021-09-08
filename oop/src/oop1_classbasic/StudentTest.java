package oop1_classbasic;

public class StudentTest {

    public static void main(String[] args){

        Student studentKim = new Student();

        studentKim.studentID = 12345;
        studentKim.setStudentName("Kim");
        studentKim.address = "경주시";

        studentKim.showStudentInfo();

        System.out.println(studentKim); //classbasic.Student@27716f4
        //위 출력 결과에서 주소 값은 jvm이 부여한 virtual address of instance - heap 영역
        //studentKim -> reference variable
        //27716f4 -> reference value

        Student studentLee = new Student(123, "Lee", "서울시");
        studentLee.showStudentInfo();
    }
}
