package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
        //문자열 비교는 ==이 아니라 equals()를 사용해야 한다.
    }
*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
