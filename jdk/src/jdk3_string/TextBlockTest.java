package jdk3_string;

public class TextBlockTest {

    public static void main(String[] args) {

        //문자열을 """ """ 사이에 이어서 만들 수 있음
        //html, json 문자열을 만드는데 유용하게 사용 가능
        //java 13부터 지원
        String textBlocks = """
                Hello,
                hi,
                how r u""";
        System.out.println(textBlocks);

        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";

    }
}
