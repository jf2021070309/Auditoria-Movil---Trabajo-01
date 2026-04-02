package e.h.g;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
/* loaded from: classes.dex */
public class v0 {
    public static int a;

    /* renamed from: b  reason: collision with root package name */
    public static int f8395b;

    /* renamed from: c  reason: collision with root package name */
    public static float f8396c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f8397d;

    public static int a(Context context, boolean z) {
        if (z) {
            boolean p = p(context);
            if (z || f8395b == 0 || a == 0 || p != f8397d) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                float f2 = context.getResources().getDisplayMetrics().density;
                f8396c = f2;
                f8395b = (int) (displayMetrics.heightPixels / f2);
                a = (int) (displayMetrics.widthPixels / f2);
                f8397d = p;
            }
            return f8395b;
        }
        return context.getResources().getConfiguration().screenHeightDp;
    }

    public static int b(Context context, boolean z) {
        if (z) {
            boolean p = p(context);
            if (z || f8395b == 0 || a == 0 || p != f8397d) {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                float f2 = context.getResources().getDisplayMetrics().density;
                f8396c = f2;
                f8395b = (int) (displayMetrics.heightPixels / f2);
                a = (int) (displayMetrics.widthPixels / f2);
                f8397d = p;
            }
            return a;
        }
        return context.getResources().getConfiguration().screenWidthDp;
    }

    public static float c(Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean l() {
        return m(x0.f8405d);
    }

    public static boolean m(Context context) {
        return e() ? context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 : !h() || context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean n(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (packageManager != null) {
            return packageManager.hasSystemFeature("android.hardware.telephony");
        }
        return false;
    }

    public static boolean o(Activity activity) {
        return activity.getResources().getConfiguration().orientation == 2;
    }

    public static boolean p(Context context) {
        return context.getApplicationContext().getResources().getConfiguration().orientation == 1;
    }
}
