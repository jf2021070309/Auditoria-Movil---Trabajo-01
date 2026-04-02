package com.ellation.crunchyroll.downloading.exoplayer;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.downloading.g0;
/* compiled from: ExoPlayerLocalVideosManagerImpl.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<g0, q> {
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(1);
        this.h = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(g0 g0Var) {
        g0 g0Var2 = g0Var;
        j.f(g0Var2, "$this$notify");
        g0Var2.x6(this.h);
        return q.a;
    }
}
