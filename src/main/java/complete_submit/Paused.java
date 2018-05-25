package complete_submit;

/**
 * Created by user on 4/5/17 17:29.
 */
public class Paused {
    public static void time(long time) {
        long curretMillis = System.currentTimeMillis();
        long timeAfterPause = curretMillis + time;
        while (System.currentTimeMillis() < timeAfterPause){
            //do nothing here
        }
    }
}
