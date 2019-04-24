package lab.grasi.service;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yy");

    public static long getYears() {

        long year = Calendar.getInstance().get(Calendar.YEAR) % 100;


        return year;
    }

}
