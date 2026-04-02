package com.amazon.aps.iva.nm;

import com.amazon.aps.iva.g8.m0;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ProfilesNavControllerAdapter.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.vi.b<c> {
    public final com.amazon.aps.iva.xb0.a<q> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m0 m0Var, com.amazon.aps.iva.ui.c cVar, com.amazon.aps.iva.xb0.a aVar) {
        super(m0Var, cVar);
        com.amazon.aps.iva.yb0.j.f(m0Var, "navController");
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.vi.b
    public final void c() {
        if (this.a.k() == null) {
            this.c.invoke();
        } else {
            super.c();
        }
    }
}
