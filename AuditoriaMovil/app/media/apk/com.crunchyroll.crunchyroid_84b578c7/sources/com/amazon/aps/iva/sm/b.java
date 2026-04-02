package com.amazon.aps.iva.sm;

import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
/* compiled from: UsernameInputPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<a> {
    public final c b;
    public com.amazon.aps.iva.xb0.a<q> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(aVar, new j[0]);
        d dVar = d.e;
        com.amazon.aps.iva.yb0.j.f(aVar, "view");
        this.b = dVar;
    }

    public final String q6() {
        return com.amazon.aps.iva.oe0.q.O0(getView().getText()).toString();
    }

    public final void r6() {
        boolean z;
        if (this.b.c(q6()) && getView().G()) {
            getView().B(k.VALID);
            com.amazon.aps.iva.xb0.a<q> aVar = this.c;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (q6().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            getView().B(k.DEFAULT);
            com.amazon.aps.iva.xb0.a<q> aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            return;
        }
        getView().B(k.ERROR);
        com.amazon.aps.iva.xb0.a<q> aVar3 = this.c;
        if (aVar3 != null) {
            aVar3.invoke();
        }
    }
}
