package com.amazon.aps.iva.y10;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: ViewExtensions.kt */
/* loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ e c;

    public d(View view, e eVar) {
        this.b = view;
        this.c = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            e eVar = this.c;
            eVar.c = eVar.a.getHeight();
            eVar.d = eVar.b.getHeight();
            int i = eVar.c;
            int i2 = eVar.d;
            eVar.getClass();
        }
    }
}
