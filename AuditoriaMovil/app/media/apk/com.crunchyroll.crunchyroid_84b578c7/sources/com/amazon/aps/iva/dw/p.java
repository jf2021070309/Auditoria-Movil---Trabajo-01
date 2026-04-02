package com.amazon.aps.iva.dw;

import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e0 h;
    public final /* synthetic */ Throwable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e0 e0Var, Throwable th) {
        super(1);
        this.h = e0Var;
        this.i = th;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.z3(this.h.a(e0.b.FAILED), this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
