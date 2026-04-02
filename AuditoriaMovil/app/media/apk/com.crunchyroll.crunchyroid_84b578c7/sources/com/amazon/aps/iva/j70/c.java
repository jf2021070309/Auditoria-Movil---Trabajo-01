package com.amazon.aps.iva.j70;

import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.j;
import com.amazon.aps.iva.x50.m;
/* compiled from: EmailInputPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<a> {
    public final d b;
    public final j c;
    public com.amazon.aps.iva.xb0.a<q> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, m mVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        w wVar = w.d;
        com.amazon.aps.iva.yb0.j.f(aVar, "view");
        this.b = wVar;
        this.c = new j(500L, mVar, new b(this, aVar));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onDestroy() {
        this.c.cancel();
    }

    public final String q6() {
        return com.amazon.aps.iva.oe0.q.O0(getView().getText()).toString();
    }

    public final void r6() {
        boolean z;
        boolean b = this.b.b(q6());
        j jVar = this.c;
        if (b && getView().G()) {
            jVar.setValue(k.VALID);
            return;
        }
        if (q6().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getView().B(k.DEFAULT);
            jVar.cancel();
            com.amazon.aps.iva.xb0.a<q> aVar = this.d;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        jVar.setValue(k.ERROR);
    }
}
