package ch09;

public class LocalVariableInfer {

    public static void main(String[] args){

        //JAVA 10 부터 지원되는 local variable inference
        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "hello";
        //str = 3; -> error
    }
}
