package time;

import java.time.ZoneId;

public class ZoneIdMain {

    static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZondId.systemDefault = " + zoneId);

        ZoneId seoulZondId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZondId = " + seoulZondId);
    }
}
