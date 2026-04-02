package com.rovio.fusion;

import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
/* loaded from: classes2.dex */
public class DeviceInfoWrapper {
    public static int getPPI() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Globals.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return ((int) (displayMetrics.ydpi + displayMetrics.xdpi)) / 2;
    }

    public static int getDisplayWidth() {
        Display defaultDisplay = Globals.getActivity().getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                return point.x;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else if (Build.VERSION.SDK_INT >= 13) {
            try {
                return ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } else {
            return defaultDisplay.getWidth();
        }
    }

    public static int getDisplayHeight() {
        Display defaultDisplay = Globals.getActivity().getWindowManager().getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                return point.y;
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        } else if (Build.VERSION.SDK_INT >= 13) {
            try {
                return ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e2) {
                e2.printStackTrace();
                return 0;
            }
        } else {
            return defaultDisplay.getHeight();
        }
    }

    public static int getDisplayDensityGroup() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Globals.getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int getDisplayConfigurationGroup() {
        return Globals.getActivity().getResources().getConfiguration().screenLayout & 15;
    }

    public static boolean hasSystemFeature(String str) {
        return Globals.getActivity().getPackageManager().hasSystemFeature(str);
    }
}
