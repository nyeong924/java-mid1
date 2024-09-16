package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        //불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환학기 때문에 꼭 반환값을 받아야함

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
    }
}
