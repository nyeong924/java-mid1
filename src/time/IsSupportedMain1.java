package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        // LocalDate는 날짜 정보만 가지고 있고, 분에 대한 정보는 없으므로 분에 대한 정보를 조회하려고 하면 예외가 발생.
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }
}
