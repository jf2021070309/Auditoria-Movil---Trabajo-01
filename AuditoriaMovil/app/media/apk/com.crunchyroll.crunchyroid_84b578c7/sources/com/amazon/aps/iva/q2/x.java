package com.amazon.aps.iva.q2;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public class x implements v {
    @Override // com.amazon.aps.iva.q2.v
    public final void a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        com.amazon.aps.iva.yb0.j.f(windowManager, "windowManager");
        com.amazon.aps.iva.yb0.j.f(view, "popupView");
        com.amazon.aps.iva.yb0.j.f(layoutParams, "params");
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // com.amazon.aps.iva.q2.v
    public final void b(Rect rect, View view) {
        com.amazon.aps.iva.yb0.j.f(view, "composeView");
        com.amazon.aps.iva.yb0.j.f(rect, "outRect");
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // com.amazon.aps.iva.q2.v
    public void c(View view, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(view, "composeView");
    }
}
