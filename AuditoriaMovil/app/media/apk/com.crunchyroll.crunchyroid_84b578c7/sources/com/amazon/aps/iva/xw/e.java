package com.amazon.aps.iva.xw;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: AppBarLayoutExtensions.kt */
/* loaded from: classes2.dex */
public final class e {
    public static final AppBarLayout.Behavior a(AppBarLayout appBarLayout) {
        AppBarLayout.Behavior behavior;
        com.amazon.aps.iva.yb0.j.f(appBarLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).a;
        if (cVar instanceof AppBarLayout.Behavior) {
            behavior = (AppBarLayout.Behavior) cVar;
        } else {
            behavior = null;
        }
        if (behavior == null) {
            return new AppBarLayout.Behavior();
        }
        return behavior;
    }
}
