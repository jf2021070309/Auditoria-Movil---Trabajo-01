package com.amazon.aps.iva.l70;

import com.amazon.aps.iva.ab0.h;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.j;
import com.amazon.aps.iva.x50.m;
/* compiled from: PhoneNumberInputPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<a> {
    public final com.amazon.aps.iva.ab0.d b;
    public final d c;
    public boolean d;
    public boolean e;
    public h f;
    public final j g;
    public com.amazon.aps.iva.xb0.a<q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, com.amazon.aps.iva.ab0.d dVar, m mVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        w wVar = w.c;
        com.amazon.aps.iva.yb0.j.f(aVar, "view");
        this.b = dVar;
        this.c = wVar;
        this.g = new j(500L, mVar, new b(this, aVar));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.g.cancel();
    }

    public final String q6() {
        return com.amazon.aps.iva.oe0.m.f0(getView().getText(), " ", "");
    }

    public final void r6() {
        boolean z;
        boolean z2 = this.e;
        j jVar = this.g;
        if (!z2) {
            if (this.c.a(q6()) && getView().G()) {
                jVar.setValue(k.VALID);
                return;
            }
        }
        if (!this.e) {
            if (q6().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !com.amazon.aps.iva.yb0.j.a(q6(), "+")) {
                jVar.setValue(k.ERROR);
                return;
            }
        }
        getView().B(k.DEFAULT);
        jVar.cancel();
        com.amazon.aps.iva.xb0.a<q> aVar = this.h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
