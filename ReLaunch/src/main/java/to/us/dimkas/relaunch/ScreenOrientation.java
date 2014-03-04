package to.us.dimkas.relaunch;

/**
 * Created by dimkas on 01.03.14.
 */

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;

public class ScreenOrientation {
    public static void set(Activity act, SharedPreferences prefs) {
        if (prefs.getString("screenOrientation", "NO").equals("PORTRAIT")) {
            act.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
        if (prefs.getString("screenOrientation", "NO").equals("LANDSCAPE")) {
            act.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }
}