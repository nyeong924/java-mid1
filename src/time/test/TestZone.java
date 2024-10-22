package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {

        ZonedDateTime zdt = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdt1 = zdt.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zdt2 = zdt.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 = " + zdt);
        System.out.println("런던의 회의 시간 = " + zdt1);
        System.out.println("뉴욕의 회의 시간 = " + zdt2);


    }
}
