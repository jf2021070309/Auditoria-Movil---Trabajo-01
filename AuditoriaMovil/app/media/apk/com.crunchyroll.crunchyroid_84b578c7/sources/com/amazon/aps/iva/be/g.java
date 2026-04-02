package com.amazon.aps.iva.be;

import com.amazon.aps.iva.be.a;
import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yd.r;
import com.amazon.aps.iva.yd.v;
import com.crunchyroll.auth.a;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: AuthNavControllerAdapter.kt */
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.vi.b<a> {
    public final com.amazon.aps.iva.xb0.a<q> c;
    public final com.amazon.aps.iva.ee.i d;
    public final r e;
    public final l<String, q> f;
    public final l<com.amazon.aps.iva.fs.b, q> g;
    public final l<com.amazon.aps.iva.fs.b, q> h;
    public final com.amazon.aps.iva.xb0.a<q> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m0 m0Var, com.amazon.aps.iva.ui.c cVar, a.C0950a c0950a, com.amazon.aps.iva.ee.e eVar, v vVar, a.b bVar, a.c cVar2, a.d dVar, a.e eVar2) {
        super(m0Var, cVar);
        j.f(m0Var, "navController");
        j.f(eVar, "otpRouter");
        j.f(vVar, "emailMandatoryRouter");
        this.c = c0950a;
        this.d = eVar;
        this.e = vVar;
        this.f = bVar;
        this.g = cVar2;
        this.h = dVar;
        this.i = eVar2;
    }

    @Override // com.amazon.aps.iva.vi.b
    public final void b(com.amazon.aps.iva.vi.a aVar) {
        j.f(aVar, FirebaseAnalytics.Param.DESTINATION);
        if (aVar instanceof a.i) {
            this.d.b(((a.i) aVar).a);
        } else if (aVar instanceof a.c) {
            a.c cVar = (a.c) aVar;
            this.e.b(null);
        } else if (aVar instanceof a.e) {
            this.f.invoke(((a.e) aVar).a);
        } else {
            boolean z = aVar instanceof a.h;
            com.amazon.aps.iva.g8.i iVar = this.a;
            if (z) {
                if (iVar.o(iVar.i().l, true, false)) {
                    iVar.b();
                }
                super.b(aVar);
            } else if (aVar instanceof a.k) {
                if (iVar.o(iVar.i().l, true, false)) {
                    iVar.b();
                }
                super.b(aVar);
            } else if (!(aVar instanceof a.C0142a) && !(aVar instanceof a.f)) {
                if (aVar instanceof a.l) {
                    this.g.invoke(((a.l) aVar).a);
                } else if (aVar instanceof a.j) {
                    this.h.invoke(((a.j) aVar).a);
                } else if (aVar instanceof a.g) {
                    this.i.invoke();
                } else {
                    super.b(aVar);
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.vi.b
    public final void c() {
        if (this.a.k() == null) {
            this.c.invoke();
        } else {
            super.c();
        }
    }
}
