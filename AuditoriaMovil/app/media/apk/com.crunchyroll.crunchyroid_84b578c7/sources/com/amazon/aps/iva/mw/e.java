package com.amazon.aps.iva.mw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.downloading.g0;
/* compiled from: LocalVideosManagerQueue.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
    public final /* synthetic */ e0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e0 e0Var) {
        super(1);
        this.h = e0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, "$this$notify");
        g0Var2.A0(this.h.a(e0.b.STARTED));
        return q.a;
    }
}
