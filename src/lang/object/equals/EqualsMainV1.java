package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));

        System.out.println("equality = " + (user1.equals(user2)));
        //Object가 기본으로 제공하는 equals() 는 ==으로 동일성 비교를 제공한다.
        //동등성이라는 개념은 각각의 클래스마다 다르므로 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의해야함.
    }
}
