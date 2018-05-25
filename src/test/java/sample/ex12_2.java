package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by USER on 15/07/2017.
 */
public class ex12_2
{
    public static void main(String[] args)
    {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();

        sdf.applyPattern("hh:mm:ss");
        String date1 = sdf.format(today);
        System.out.println(date1);

        sdf.applyPattern("MM/dd/yy h:mm a");
        String date2 = sdf.format(today);
        System.out.println(date2);

        System.out.println(today.toString());

        sdf.applyPattern("MMM dd, yyy hh:mm:ss a");
        String date3 = sdf.format(today);
        System.out.println(date3);

        sdf.applyPattern("dd-MM-yyyy hh:mm:ss");
        String date4 = sdf.format(today);
        System.out.println(date4);

        sdf.applyPattern("E, MMM dd, yyyy");
        String date5 = sdf.format(today);
        System.out.println(date5);

    }
}
