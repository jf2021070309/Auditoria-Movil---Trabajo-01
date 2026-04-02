package com.amazon.aps.iva.xt;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentsAnalytics.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.ls.a f;
    public final com.amazon.aps.iva.xb0.a<PlayableAsset> g;
    public final com.amazon.aps.iva.vs.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.xb0.a aVar2, com.amazon.aps.iva.xb0.a aVar3) {
        super(aVar3);
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        w wVar = w.d;
        j.f(aVar, "screen");
        this.e = cVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        e eVar;
        com.amazon.aps.iva.ls.a aVar = this.f;
        PlayableAsset invoke = this.g.invoke();
        if (invoke != null) {
            eVar = this.h.b(invoke);
        } else {
            eVar = null;
        }
        this.e.c(i.s(aVar, f, eVar, null, null, new com.amazon.aps.iva.is.a[0], 24));
    }

    @Override // com.amazon.aps.iva.xt.b
    public final void a(Throwable th) {
        j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.e, th, new com.amazon.aps.iva.es.w(message, this.f, null, null, null, 60));
    }
}
