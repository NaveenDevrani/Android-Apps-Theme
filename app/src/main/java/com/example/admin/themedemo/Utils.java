package com.example.admin.themedemo;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by admin on 19-Aug-18.
 */

public class Utils {
    private static int sTheme;
    public final static int THEME_DEFAULT = 0;
    public final static int THEME_DEFAULT1 = 1;
    public final static int THEME_DEFAULT2 = 2;
    public final static int THEME_DEFAULT3 = 3;


    //set theme to activity and restart it by crating a new activity

    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
       activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    //set theme acc to configuration

    public static void onActivityCreateTheme(Activity activity) {
        switch (sTheme) {
            case THEME_DEFAULT:
                activity.setTheme(R.style.FirstTheme);
                break;

            case THEME_DEFAULT1:
                activity.setTheme(R.style.SecTheme);
              break;

           case THEME_DEFAULT2:
               activity.setTheme(R.style.ThirdTheme);
               break;
            case THEME_DEFAULT3:
                activity.setTheme(R.style.ThirdTheme);
                break;

        }
    }

}
