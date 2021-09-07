package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        int day = switch(month){
            //JAVA 14부터 지원되는 switch expression
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일 입니다.");
                yield 31;
            }
            case 2 -> {
                System.out.println("한 달은 28일 입니다.");
                yield 28;
            }
            default -> {
                System.out.println("한 달은 30일 입니다.");
                yield 30;
            }
        };

        System.out.println(month + "월은" + day + "일 입니다.");
    }
}
