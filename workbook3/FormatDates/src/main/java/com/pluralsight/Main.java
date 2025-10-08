package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH: mm");

        ZonedDateTime nowGMT = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter gmtFormat = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm").withLocale(Locale.US);

        ZonedDateTime localZone = ZonedDateTime.now();
        DateTimeFormatter bonusFormat = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");

        System.out.println(now.format(format1));
        System.out.println(now.format(format2));
        System.out.println(now.format(format3));
        System.out.println(now.format(format4));
        System.out.println(nowGMT.format(gmtFormat) + " GMT");
        System.out.println(localZone.format(bonusFormat) + " PST");

    }
}