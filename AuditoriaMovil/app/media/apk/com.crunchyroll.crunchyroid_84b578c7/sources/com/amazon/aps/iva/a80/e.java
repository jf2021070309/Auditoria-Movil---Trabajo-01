package com.amazon.aps.iva.a80;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ViewPagerTransitionAccelerator.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, int i) {
        super(0);
        this.h = hVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.f.getView().N7(this.i);
        return q.a;
    }
}
