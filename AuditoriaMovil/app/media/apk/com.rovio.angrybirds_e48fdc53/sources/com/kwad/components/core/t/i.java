package com.kwad.components.core.t;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.kwad.sdk.utils.s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class i {
    private static Method Rn;
    private static Method Ro;
    private static Field Rp;
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;

    static {
        SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = 0;
        try {
            Rn = Activity.class.getMethod("setStatusBarDarkIcon", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Ro = Activity.class.getMethod("setStatusBarDarkIcon", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
        try {
            Rp = WindowManager.LayoutParams.class.getField("statusBarColor");
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
        try {
            SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = ((Integer) s.c(View.class, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR")).intValue();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    private static void a(Activity activity, boolean z, boolean z2) {
        Method method = Ro;
        if (method == null) {
            a(activity.getWindow(), z);
            return;
        }
        try {
            method.invoke(activity, Boolean.valueOf(z));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    private static void a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            a(window.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", z);
            return;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            g(decorView, z);
            setStatusBarColor(window, 0);
        }
    }

    private static boolean a(WindowManager.LayoutParams layoutParams, String str, boolean z) {
        try {
            int intValue = ((Integer) s.f(layoutParams, str)).intValue();
            int intValue2 = ((Integer) s.f(layoutParams, "meizuFlags")).intValue();
            int i = z ? intValue | intValue2 : (~intValue) & intValue2;
            if (intValue2 != i) {
                s.a(layoutParams, "meizuFlags", Integer.valueOf(i));
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static void b(Activity activity, boolean z) {
        a(activity, true, true);
    }

    private static void g(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        int i = z ? SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | systemUiVisibility : (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & systemUiVisibility;
        if (i != systemUiVisibility) {
            view.setSystemUiVisibility(i);
        }
    }

    private static void setStatusBarColor(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        Field field = Rp;
        if (field != null) {
            try {
                if (field.getInt(attributes) != 0) {
                    Rp.set(attributes, 0);
                    window.setAttributes(attributes);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
