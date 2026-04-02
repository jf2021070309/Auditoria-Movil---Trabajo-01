package com.amazon.aps.iva.en;

import com.amazon.aps.iva.en.a;
import com.amazon.aps.iva.js.d0;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.restrictedstate.UserRestrictedStateActivity;
/* compiled from: UserRestrictedStatePresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final com.amazon.aps.iva.k50.b b;
    public final g c;
    public final b d;

    public e(UserRestrictedStateActivity userRestrictedStateActivity, com.amazon.aps.iva.k50.c cVar, g gVar, b bVar) {
        super(userRestrictedStateActivity, new j[0]);
        this.b = cVar;
        this.c = gVar;
        this.d = bVar;
    }

    @Override // com.amazon.aps.iva.en.d
    public final void e() {
        getView().closeScreen();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        d0 d0Var;
        g gVar = this.c;
        getView().setHeaderText(gVar.b.b);
        getView().kb(gVar.b.c);
        a aVar = gVar.b;
        com.amazon.aps.iva.yb0.j.f(aVar, "<this>");
        if (aVar instanceof a.C0227a) {
            d0Var = d0.a.a;
        } else if (aVar instanceof a.b) {
            d0Var = d0.b.a;
        } else {
            throw new h();
        }
        this.d.a(d0Var);
    }

    @Override // com.amazon.aps.iva.en.d
    public final void t5(String str, String str2, String str3) {
        this.b.s1(str, str2, str3);
    }
}
