package com.amazon.aps.iva.xw;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.v1.t2;
/* compiled from: ActivityExtensions.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final void a(Activity activity) {
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        int systemBars;
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsBehavior(2);
            }
            insetsController2 = activity.getWindow().getInsetsController();
            if (insetsController2 != null) {
                systemBars = WindowInsets.Type.systemBars();
                insetsController2.hide(systemBars);
                return;
            }
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(7942);
    }

    public static final a b(Activity activity, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        return new a(lVar);
    }

    public static final void c(Activity activity, com.amazon.aps.iva.v0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        ComposeView composeView = new ComposeView(activity, null, 6);
        composeView.setViewCompositionStrategy(t2.a.a);
        composeView.setContent(aVar);
        activity.setContentView(composeView);
    }

    public static final void d(Activity activity, boolean z) {
        com.amazon.aps.iva.yb0.j.f(activity, "<this>");
        com.amazon.aps.iva.p3.u0.a(activity.getWindow(), z);
    }

    public static final void e(androidx.fragment.app.h hVar, int i) {
        Window window = hVar.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(com.amazon.aps.iva.d3.a.getColor(window.getContext(), i));
    }

    public static final void f(Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = activity.getWindow().getInsetsController();
            if (insetsController != null) {
                systemBars = WindowInsets.Type.systemBars();
                insetsController.show(systemBars);
                return;
            }
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(256);
    }
}
