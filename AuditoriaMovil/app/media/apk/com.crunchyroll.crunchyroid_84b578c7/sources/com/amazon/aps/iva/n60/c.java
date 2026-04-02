package com.amazon.aps.iva.n60;

import com.amazon.aps.iva.cx.p;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.h;
import com.amazon.aps.iva.xb0.l;
/* compiled from: ScreenReloadDebouncer.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final h a;
    public final h b;
    public final h c;

    public c(p pVar, l lVar) {
        this.a = (h) lVar.invoke(Long.valueOf(pVar.c()));
        this.b = (h) lVar.invoke(Long.valueOf(pVar.b()));
        this.c = (h) lVar.invoke(Long.valueOf(pVar.a()));
    }

    @Override // com.amazon.aps.iva.n60.b
    public final void a(com.amazon.aps.iva.xb0.a<q> aVar) {
        this.b.a(aVar);
    }

    @Override // com.amazon.aps.iva.n60.b
    public final void b(com.amazon.aps.iva.xb0.a<q> aVar) {
        this.c.a(aVar);
    }

    @Override // com.amazon.aps.iva.n60.b
    public final void c(com.amazon.aps.iva.xb0.a<q> aVar) {
        this.a.a(aVar);
    }
}
