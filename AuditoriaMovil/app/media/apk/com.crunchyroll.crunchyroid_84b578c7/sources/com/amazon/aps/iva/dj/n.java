package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.e0;
import java.util.List;
/* compiled from: SegmentAnalyticsComponent.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.fj.f<o> {
    public final j c;
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> d = f1.J(e0.a(com.amazon.aps.iva.pj.i.class));

    public n(k kVar) {
        this.c = kVar;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(com.amazon.aps.iva.xb0.l<? super o, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        lVar.invoke(new o());
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> f() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        if (aVar instanceof com.amazon.aps.iva.pj.i) {
            this.c.a((com.amazon.aps.iva.pj.i) aVar);
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
    }
}
