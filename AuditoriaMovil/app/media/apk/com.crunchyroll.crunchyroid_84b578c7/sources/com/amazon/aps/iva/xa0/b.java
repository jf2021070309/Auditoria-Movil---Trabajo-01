package com.amazon.aps.iva.xa0;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.yb0.j;
import java.util.WeakHashMap;
/* compiled from: Insetter.kt */
/* loaded from: classes4.dex */
public final class b implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        j.f(view, "v");
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        j.f(view, "v");
    }
}
