package com.amazon.aps.iva.ka0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
/* compiled from: MuxUiDelegate.kt */
/* loaded from: classes4.dex */
public final class b<PlayerView extends View> extends d0<PlayerView> {
    public final float c;

    public b(Context context, PlayerView playerview) {
        super(playerview);
        float f;
        Resources resources;
        DisplayMetrics displayMetrics;
        Activity activity;
        Display defaultDisplay;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        if (context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity != null) {
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    Point point = new Point(bounds.width(), bounds.height());
                    currentWindowMetrics2 = activity.getWindowManager().getCurrentWindowMetrics();
                    windowInsets = currentWindowMetrics2.getWindowInsets();
                    navigationBars = WindowInsets.Type.navigationBars();
                    displayCutout = WindowInsets.Type.displayCutout();
                    insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
                    com.amazon.aps.iva.yb0.j.e(insetsIgnoringVisibility, "activity.windowManager.c…e.displayCutout()\n      )");
                    Point point2 = new Point();
                    int i5 = point.x;
                    i = insetsIgnoringVisibility.right;
                    i2 = insetsIgnoringVisibility.left;
                    point2.x = i5 - (i2 + i);
                    int i6 = point.y;
                    i3 = insetsIgnoringVisibility.top;
                    i4 = insetsIgnoringVisibility.bottom;
                    point2.y = i6 - (i4 + i3);
                } else {
                    Point point3 = new Point();
                    WindowManager windowManager = activity.getWindowManager();
                    if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                        defaultDisplay.getSize(point3);
                    }
                    String simpleName = b.class.getSimpleName();
                    com.amazon.aps.iva.ia0.b.a(simpleName, "displayStuffLegacy: Legacy Screen Size Size: " + point3);
                }
                if (context == null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    f = displayMetrics.density;
                } else {
                    f = 0.0f;
                }
                this.c = f;
            }
        }
        new Point();
        if (context == null) {
        }
        f = 0.0f;
        this.c = f;
    }

    @Override // com.amazon.aps.iva.ka0.d0
    public final float a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ka0.d0
    public final Point b() {
        View view = (View) this.a.getValue(this, d0.b[0]);
        if (view != null) {
            Point point = new Point();
            point.x = view.getWidth();
            point.y = view.getHeight();
            return point;
        }
        return new Point();
    }
}
