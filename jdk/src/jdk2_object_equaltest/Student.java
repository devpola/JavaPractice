package jdk2_object_equaltest;

public class Student implements Cloneable{

    private int studentNumber;
    private String studentName;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String toString() {
        return studentNumber + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student std = (Student)obj;
            if(this.studentName == std.studentName)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }

    //객체의 원본을 복제하는데 사용하는 메서드
    //clone 메서드를 사용하면 객체의 정보가 동일한 또 다른 인스턴스가 생성되는 것이므로,
    //객체 지향 프로그램에서의 정보 은닉, 객체 보호의 관점에서 위배될 수 있음
    // 해당 클래스의 clone 메서드의 사용을 허용한다는 의미로 cloneable 인터페이스 명시해 중
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
