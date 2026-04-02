package com.amazon.aps.iva.cz;

import android.view.View;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class a implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ k c;
    public final /* synthetic */ View d;

    public a(View view, k kVar, View view2) {
        this.b = view;
        this.c = kVar;
        this.d = view2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        j.f(view, "view");
        this.b.removeOnAttachStateChangeListener(this);
        o a = i0.a(this.d);
        j.c(a);
        com.ellation.crunchyroll.mvp.lifecycle.a.a(this.c, a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        j.f(view, "view");
    }
}
