package com.amazon.aps.iva.k;

import android.view.View;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.WeakHashMap;
/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public final class k extends k0 {
    public final /* synthetic */ g j;

    public k(g gVar) {
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.a9.k0, com.amazon.aps.iva.p3.s0
    public final void c() {
        g gVar = this.j;
        gVar.w.setVisibility(0);
        if (gVar.w.getParent() instanceof View) {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            g0.h.c((View) gVar.w.getParent());
        }
    }

    @Override // com.amazon.aps.iva.p3.s0
    public final void onAnimationEnd() {
        g gVar = this.j;
        gVar.w.setAlpha(1.0f);
        gVar.z.d(null);
        gVar.z = null;
    }
}
