package lang.wrapper.test;

public class WraaperTest2 {

    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        
        double sum = 0;

        for (String s : array) {
            sum += Double.valueOf(s);
        }
        System.out.println("sum = " + sum);
    }
}
