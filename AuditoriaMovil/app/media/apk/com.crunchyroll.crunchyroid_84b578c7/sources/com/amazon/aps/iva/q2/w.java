package com.amazon.aps.iva.q2;

import android.graphics.Rect;
import android.view.View;
import com.amazon.aps.iva.ee0.f1;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class w extends x {
    @Override // com.amazon.aps.iva.q2.x, com.amazon.aps.iva.q2.v
    public final void c(View view, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(view, "composeView");
        view.setSystemGestureExclusionRects(f1.M(new Rect(0, 0, i, i2)));
    }
}
