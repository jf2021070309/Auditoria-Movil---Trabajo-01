package com.amazon.aps.iva.s40;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SignUpFlowRouter.kt */
/* loaded from: classes2.dex */
public final class h implements c {
    public final l<com.amazon.aps.iva.h.c<com.crunchyroll.auth.c>, q> a;
    public com.amazon.aps.iva.xb0.a<q> b = g.h;
    public com.amazon.aps.iva.xb0.a<q> c = f.h;
    public com.amazon.aps.iva.xb0.a<q> d = e.h;
    public final com.amazon.aps.iva.h.c<com.crunchyroll.auth.c> e;

    public h(com.amazon.aps.iva.i.a aVar, l lVar, p pVar) {
        this.a = lVar;
        this.e = (com.amazon.aps.iva.h.c) pVar.invoke(aVar, new d(this));
    }

    @Override // com.amazon.aps.iva.s40.c
    public final void a(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.xb0.a<q> aVar3) {
        j.f(aVar3, "onCancel");
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    @Override // com.amazon.aps.iva.s40.c
    public final void b(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2, com.amazon.aps.iva.xb0.a<q> aVar3) {
        if (aVar != null) {
            this.b = aVar;
        }
        if (aVar2 != null) {
            this.c = aVar2;
        }
        if (aVar3 != null) {
            this.d = aVar3;
        }
        this.a.invoke(this.e);
    }
}
