package com.kwad.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import com.kwad.sdk.service.ServiceProvider;
/* loaded from: classes3.dex */
public final class ai {
    public static boolean IK() {
        return IL();
    }

    public static boolean IL() {
        return ServiceProvider.HA().getApplicationContext().getResources().getConfiguration().orientation == 1;
    }

    public static void b(Context context, boolean z) {
        try {
            Activity dt = com.kwad.sdk.m.l.dt(context);
            if (dt == null) {
                return;
            }
            if (z) {
                if (Build.VERSION.SDK_INT < 19) {
                    dt.getWindow().getDecorView().setSystemUiVisibility(8);
                } else {
                    dt.getWindow().getDecorView().setSystemUiVisibility(1792);
                }
            } else if (Build.VERSION.SDK_INT < 19) {
                dt.getWindow().getDecorView().setSystemUiVisibility(0);
            } else {
                dt.getWindow().getDecorView().setSystemUiVisibility(3846);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean cm(Context context) {
        Activity dt = com.kwad.sdk.m.l.dt(context);
        if (dt != null) {
            Window window = dt.getWindow();
            r0 = (window.getAttributes().flags & 1024) == 1024;
            window.setFlags(1024, 1024);
        }
        return r0;
    }

    public static void cn(Context context) {
        Activity dt = com.kwad.sdk.m.l.dt(context);
        if (dt != null) {
            dt.getWindow().clearFlags(1024);
        }
    }

    public static void co(Context context) {
        Activity dt = com.kwad.sdk.m.l.dt(context);
        if (dt != null) {
            dt.setRequestedOrientation(0);
        }
    }

    public static void cp(Context context) {
        Activity dt = com.kwad.sdk.m.l.dt(context);
        if (dt != null) {
            dt.setRequestedOrientation(1);
        }
    }
}
