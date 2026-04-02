package com.amazon.aps.iva.p3;

import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: WindowCompat.java */
/* loaded from: classes.dex */
public final class u0 {

    /* compiled from: WindowCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Window window, boolean z) {
            int i;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* compiled from: WindowCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static void a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z);
        } else {
            a.a(window, z);
        }
    }
}
