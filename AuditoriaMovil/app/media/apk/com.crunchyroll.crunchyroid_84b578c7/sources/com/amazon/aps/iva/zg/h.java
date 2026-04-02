package com.amazon.aps.iva.zg;

import com.google.android.gms.common.Scopes;
/* compiled from: EmailVerificationBannerPresenter.kt */
/* loaded from: classes.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ g h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(1);
        this.h = gVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, Scopes.EMAIL);
        g.q6(this.h).showSnackbar(new o(str2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
