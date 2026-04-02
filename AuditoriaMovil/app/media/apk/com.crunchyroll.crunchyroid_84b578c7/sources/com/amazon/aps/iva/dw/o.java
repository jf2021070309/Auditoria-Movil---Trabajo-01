package com.amazon.aps.iva.dw;

import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
/* loaded from: classes2.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ String h;
    public final /* synthetic */ Throwable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, Throwable th) {
        super(1);
        this.h = str;
        this.i = th;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        com.amazon.aps.iva.yb0.j.f(g0Var2, "$this$notify");
        g0Var2.z3(new e0.a(this.h, "", "", t.UNDEFINED, e0.b.FAILED), this.i);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
