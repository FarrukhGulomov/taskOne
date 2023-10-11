package uz.pdp.appDataRest.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

    public static Date expireDate() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");

        try {
            currentDate = dateFormat.parse(dateFormat.format(currentDate));
            return currentDate;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
