package com.kwad.components.core.t;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kwad.sdk.utils.as;
import com.kwad.sdk.utils.s;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
/* loaded from: classes.dex */
public final class d {
    public static void a(Activity activity, int i, boolean z) {
        a(activity, 0, true, true);
    }

    public static void a(Activity activity, int i, boolean z, boolean z2) {
        if (qp()) {
            b(activity, i, z);
            if (z2) {
                return;
            }
            activity.findViewById(16908290).setPadding(0, com.kwad.sdk.d.a.a.getStatusBarHeight(activity), 0, 0);
        }
    }

    private static boolean a(Activity activity, boolean z) {
        try {
            int intValue = ((Integer) s.ak("android.view.MiuiWindowManager$LayoutParams", "EXTRA_FLAG_STATUS_BAR_DARK_MODE")).intValue();
            s.f(activity.getWindow(), "setExtraFlags", Integer.valueOf(intValue), Integer.valueOf(intValue));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void b(Activity activity, int i, boolean z) {
        Window window = activity.getWindow();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = TTAdConstant.EXT_PLUGIN_UNINSTALL;
        if (i2 < 21) {
            if (Build.VERSION.SDK_INT >= 19) {
                window.getDecorView().setSystemUiVisibility(TTAdConstant.EXT_PLUGIN_UNINSTALL);
                return;
            }
            return;
        }
        if (z && Build.VERSION.SDK_INT >= 23) {
            i3 = 9472;
            window.clearFlags(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS);
            window.addFlags(Integer.MIN_VALUE);
            if (as.IQ()) {
                a(activity, true);
            } else if (as.IR()) {
                i.b(activity, true);
            }
        }
        window.getDecorView().setSystemUiVisibility(i3);
        window.setStatusBarColor(i);
        window.setNavigationBarColor(window.getNavigationBarColor());
    }

    public static boolean qp() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
