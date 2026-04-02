package com.amazon.aps.iva.se0;
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class p extends l1 {
    public final n<?> f;

    public p(n<?> nVar) {
        this.f = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        q(th);
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.se0.y
    public final void q(Throwable th) {
        boolean m;
        o1 r = r();
        n<?> nVar = this.f;
        Throwable p = nVar.p(r);
        if (!nVar.t()) {
            m = false;
        } else {
            m = ((com.amazon.aps.iva.xe0.e) nVar.e).m(p);
        }
        if (!m) {
            nVar.J(p);
            if (!nVar.t()) {
                nVar.n();
            }
        }
    }
}
