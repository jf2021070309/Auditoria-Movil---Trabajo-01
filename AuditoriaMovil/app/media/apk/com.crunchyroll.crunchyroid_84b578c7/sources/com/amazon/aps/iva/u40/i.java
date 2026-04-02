package com.amazon.aps.iva.u40;

import com.amazon.aps.iva.kb0.q;
/* compiled from: SignInPresenter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "phoneNumber");
        g gVar = this.h;
        g.s6(gVar).b();
        g.s6(gVar).U1();
        gVar.k.b(new com.amazon.aps.iva.ee.a(str2, false));
        return q.a;
    }
}
