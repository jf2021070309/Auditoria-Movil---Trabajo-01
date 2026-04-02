package com.amazon.aps.iva.v40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SignUpPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "phoneNumber");
        d dVar = this.h;
        d.s6(dVar).b();
        d.s6(dVar).U1();
        dVar.g.b(new com.amazon.aps.iva.ee.a(str2, true));
        return q.a;
    }
}
