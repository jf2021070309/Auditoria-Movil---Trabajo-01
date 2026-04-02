package com.amazon.aps.iva.k70;

import com.amazon.aps.iva.i70.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wy.j;
/* compiled from: PasswordInputPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<a> {
    public final c b;
    public com.amazon.aps.iva.xb0.a<q> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(aVar, new j[0]);
        com.amazon.aps.iva.n1.c cVar = com.amazon.aps.iva.n1.c.d;
        com.amazon.aps.iva.yb0.j.f(aVar, "view");
        this.b = cVar;
    }

    public final void q6(String str) {
        boolean z;
        k kVar;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            kVar = k.DEFAULT;
        } else if (this.b.b(str) && getView().G()) {
            kVar = k.VALID;
        } else {
            kVar = k.ERROR;
        }
        getView().B(kVar);
    }
}
