package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extindex = str.indexOf(ext);

        String fileName = str.substring(0,extindex);
        String extName = str.substring(extindex);

        System.out.println("filename = " + fileName);
        System.out.println("extname = " + extName);

    }
}
