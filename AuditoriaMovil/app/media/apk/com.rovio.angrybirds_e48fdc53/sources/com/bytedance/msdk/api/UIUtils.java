package com.bytedance.msdk.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.d0;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class UIUtils {
    public static final int VIVO_FILLET = 8;
    public static final int VIVO_NOTCH = 32;

    public static int dip2px(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static String getCurrProcessName(Context context) {
        return context == null ? "" : d0.a(context);
    }

    public static float getHeight(Activity activity) {
        if (activity == null) {
            return 0.0f;
        }
        hideBottomUIMenu(activity);
        float realHeight = getRealHeight(activity);
        if (hasNotchScreen(activity)) {
            realHeight -= getStatusBarHeight(activity);
        }
        return px2dip(activity, realHeight);
    }

    public static int getInt(String str, Activity activity) {
        if (isMiui()) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), new Integer(0))).intValue();
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
            } catch (Throwable th) {
                th.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static int getRealHeight(Context context) {
        if (context == null) {
            return 0;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static float getScreenWidthDp(Context context) {
        if (context == null) {
            return 0.0f;
        }
        float f = context.getResources().getDisplayMetrics().density;
        float f2 = context.getResources().getDisplayMetrics().widthPixels;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        return 0.5f + (f2 / f);
    }

    public static float getStatusBarHeight(Context context) {
        int identifier;
        if (context != null && (identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    public static boolean hasNotchAtHuawei(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean hasNotchAtOPPO(Context context) {
        if (context == null) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean hasNotchAtVivo(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean hasNotchScreen(Activity activity) {
        if (getInt("ro.miui.notch", activity) == 1 || hasNotchAtHuawei(activity) || hasNotchAtOPPO(activity) || hasNotchAtVivo(activity)) {
            return false;
        }
        isAndroidPHasNotch(activity);
        return false;
    }

    public static void hideBottomUIMenu(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8);
            } else if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(3842);
                activity.getWindow().addFlags(DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isAndroidPHasNotch(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class<?> cls = Class.forName("android.view.WindowInsets");
                return cls.getMethod("getDisplayCutout", new Class[0]).invoke(cls, new Object[0]) != null;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean isMainProcess(Context context) {
        if (context == null) {
            return true;
        }
        return d0.c(context);
    }

    public static boolean isMiui() {
        return Class.forName("miui.os.Build") != null;
    }

    public static int px2dip(Context context, float f) {
        if (context == null) {
            return 0;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static void removeFromParent(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
