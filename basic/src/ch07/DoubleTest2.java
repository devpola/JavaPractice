package ch07;

public class DoubleTest2 {

    public static void main(String[] args){

        double dNum = 1;

        for(int i = 0; i<10000; i++){
            dNum += 0.1;
        }

        System.out.print(dNum);
        //부동소수점 방식은 0을 표현할 수 없기 때문에 정확히 1001을 출력하지 못함
    }
}
