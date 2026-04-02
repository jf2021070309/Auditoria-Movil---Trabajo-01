package net.hockeyapp.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import net.hockeyapp.android.Constants;
/* loaded from: classes4.dex */
public class DeviceUtils {
    private DeviceUtils() {
    }

    /* loaded from: classes4.dex */
    private static class a {
        public static final DeviceUtils a = new DeviceUtils();

        private a() {
        }
    }

    public static DeviceUtils getInstance() {
        return a.a;
    }

    public int getCurrentVersionCode(Context context) {
        return Integer.parseInt(Constants.APP_VERSION);
    }

    public String getAppName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return "";
            }
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }
}
