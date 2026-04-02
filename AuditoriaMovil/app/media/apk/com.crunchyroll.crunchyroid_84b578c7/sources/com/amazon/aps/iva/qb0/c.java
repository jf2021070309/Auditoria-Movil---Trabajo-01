package com.amazon.aps.iva.qb0;

import com.amazon.aps.iva.ob0.e;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ContinuationImpl.kt */
/* loaded from: classes4.dex */
public abstract class c extends a {
    private final com.amazon.aps.iva.ob0.g _context;
    private transient com.amazon.aps.iva.ob0.d<Object> intercepted;

    public c(com.amazon.aps.iva.ob0.d<Object> dVar, com.amazon.aps.iva.ob0.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // com.amazon.aps.iva.ob0.d
    public com.amazon.aps.iva.ob0.g getContext() {
        com.amazon.aps.iva.ob0.g gVar = this._context;
        j.c(gVar);
        return gVar;
    }

    public final com.amazon.aps.iva.ob0.d<Object> intercepted() {
        com.amazon.aps.iva.ob0.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            com.amazon.aps.iva.ob0.e eVar = (com.amazon.aps.iva.ob0.e) getContext().get(e.a.b);
            if (eVar == null || (dVar = eVar.k(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public void releaseIntercepted() {
        com.amazon.aps.iva.ob0.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            com.amazon.aps.iva.ob0.g context = getContext();
            int i = com.amazon.aps.iva.ob0.e.h0;
            g.b bVar = context.get(e.a.b);
            j.c(bVar);
            ((com.amazon.aps.iva.ob0.e) bVar).f(dVar);
        }
        this.intercepted = b.b;
    }

    public c(com.amazon.aps.iva.ob0.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
