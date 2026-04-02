package com.sdk.ksdk.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public class UIUtils {
    public static final int VIVO_FILLET = 8;
    public static final int VIVO_NOTCH = 32;

    public static float getScreenWidthDp(Context context) {
        float scale = context.getResources().getDisplayMetrics().density;
        float width = context.getResources().getDisplayMetrics().widthPixels;
        return (width / (scale <= 0.0f ? 1.0f : scale)) + 0.5f;
    }

    public static float getHeight(Activity activity) {
        hideBottomUIMenu(activity);
        int realHeight = getRealHeight(activity);
        if (hasNotchScreen(activity)) {
            float height = px2dip(activity, realHeight - getStatusBarHeight(activity));
            return height;
        }
        float height2 = realHeight;
        return px2dip(activity, height2);
    }

    public static void hideBottomUIMenu(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                View v = activity.getWindow().getDecorView();
                v.setSystemUiVisibility(8);
            } else if (Build.VERSION.SDK_INT >= 19) {
                View decorView = activity.getWindow().getDecorView();
                decorView.setSystemUiVisibility(3842);
                activity.getWindow().addFlags(DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getRealHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        DisplayMetrics dm = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            display.getRealMetrics(dm);
        } else {
            display.getMetrics(dm);
        }
        int realHeight = dm.heightPixels;
        return realHeight;
    }

    public static float getStatusBarHeight(Context context) {
        int resourceId = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId <= 0) {
            return 0.0f;
        }
        float height = context.getApplicationContext().getResources().getDimensionPixelSize(resourceId);
        return height;
    }

    public static int px2dip(Context context, float pxValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) ((pxValue / (scale <= 0.0f ? 1.0f : scale)) + 0.5f);
    }

    public static boolean hasNotchScreen(Activity activity) {
        return getInt("ro.miui.notch", activity) == 1 || hasNotchAtHuawei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVivo(activity) || isAndroidPHasNotch(activity);
    }

    public static boolean isAndroidPHasNotch(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            Class windowInsets = Class.forName("android.view.WindowInsets");
            Method method = windowInsets.getMethod("getDisplayCutout", new Class[0]);
            Object displayCutout = method.invoke(windowInsets, new Object[0]);
            if (displayCutout == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int getInt(String key, Activity activity) {
        if (!isMiui()) {
            return 0;
        }
        try {
            ClassLoader classLoader = activity.getClassLoader();
            Class SystemProperties = classLoader.loadClass("android.os.SystemProperties");
            Class[] paramTypes = {String.class, Integer.TYPE};
            Method getInt = SystemProperties.getMethod("getInt", paramTypes);
            Object[] params = {new String(key), new Integer(0)};
            int result = ((Integer) getInt.invoke(SystemProperties, params)).intValue();
            return result;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return 0;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    public static boolean hasNotchAtHuawei(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class HwNotchSizeUtil = classLoader.loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Method get = HwNotchSizeUtil.getMethod("hasNotchInScreen", new Class[0]);
            boolean ret = ((Boolean) get.invoke(HwNotchSizeUtil, new Object[0])).booleanValue();
            return ret;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e2) {
            return false;
        } catch (Exception e3) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean hasNotchAtVivo(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class FtFeature = classLoader.loadClass("android.util.FtFeature");
            Method method = FtFeature.getMethod("isFeatureSupport", Integer.TYPE);
            boolean ret = ((Boolean) method.invoke(FtFeature, 32)).booleanValue();
            return ret;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (NoSuchMethodException e2) {
            return false;
        } catch (Exception e3) {
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean hasNotchAtOPPO(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean isMiui() {
        Class<?> clz;
        try {
            clz = Class.forName("miui.os.Build");
        } catch (Exception e) {
        }
        if (clz == null) {
            return false;
        }
        return true;
    }

    public static boolean isPortrait(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 1;
    }
}
