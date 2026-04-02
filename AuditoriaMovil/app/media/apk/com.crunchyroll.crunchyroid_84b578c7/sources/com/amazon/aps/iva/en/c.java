package com.amazon.aps.iva.en;

import com.amazon.aps.iva.js.d0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: UserRestrictedStateAnalytics.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ds.a a;

    public c(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.en.b
    public final void a(d0 d0Var) {
        j.f(d0Var, "modalType");
        this.a.c(new com.amazon.aps.iva.es.j(com.amazon.aps.iva.ls.a.AUTHENTICATION_RESTRICTED_MODAL, d0Var));
    }
}
