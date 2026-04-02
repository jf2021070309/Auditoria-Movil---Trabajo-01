package com.amazon.aps.iva.de;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PhoneSignInMessagePresenter.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> {
    public final b b;

    /* compiled from: PhoneSignInMessagePresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<q, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(q qVar) {
            j.f(qVar, "$this$observeEvent");
            d.this.getView().showSnackbar(com.amazon.aps.iva.de.a.b);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c cVar) {
        super(eVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(eVar, "view");
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ez.e.a(this.b.a(), getView(), new a());
    }
}
