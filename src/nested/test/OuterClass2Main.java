package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        // 여기에서 InnerClass hello() 메서드를 호출하라.
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
