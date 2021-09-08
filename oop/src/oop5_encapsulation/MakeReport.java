package oop5_encapsulation;

//접근 제한자를 통한 정보 은닉을 활용하여 캡슐화
//대부분의 멤버 변수 및 메서드 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함

public class MakeReport {

    StringBuffer buffer = new StringBuffer();

    private String line = "============================================\n";
    private String title = "    이름\t    주소\t\t  전화번호    \n";

    private void makeHeader(){
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody(){
        buffer.append("James \t");
        buffer.append("Seoul Korea \t");
        buffer.append("010-2222-3333\n");

        buffer.append("Minsu \t");
        buffer.append("Gyeongju Korea \t");
        buffer.append("010-1111-5555\n");
    }

    private void makeFooter(){
        buffer.append(line);
    }

    public String getReport(){
        //client 입장에서 report가 만들어지는 과정은 알아야 하는 사항은 아니다.
        //report가 만들어지고, 그 결과만을 얻으면 되는 것
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }
}
