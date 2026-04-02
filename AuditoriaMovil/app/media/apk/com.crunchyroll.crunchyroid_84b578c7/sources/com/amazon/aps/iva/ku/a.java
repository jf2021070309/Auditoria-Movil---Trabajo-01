package com.amazon.aps.iva.ku;

import android.app.Activity;
import android.view.ViewTreeObserver;
/* compiled from: CommentsGlobalLayoutListener.kt */
/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Activity b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> d;

    public a(androidx.fragment.app.h hVar, l lVar, m mVar) {
        this.b = hVar;
        this.c = lVar;
        this.d = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (com.amazon.aps.iva.aq.k.s(this.b)) {
            this.c.invoke();
        } else {
            this.d.invoke();
        }
    }
}
