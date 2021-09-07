package ch07;

public class DoubleTest {

    public static void main(String[] args){

        double dNum = 3.14;
        //작은 크기의 자료를 큰 자료형에 저장하는 것은 자동으로 형변환이 된다.(int -> long)
        //But, 큰 크기의 자료를 작은 자료형에 저장하는 것은 오류를 발생시킨다.(double -> float)
        float fNum = 3.14F;
    }
}
