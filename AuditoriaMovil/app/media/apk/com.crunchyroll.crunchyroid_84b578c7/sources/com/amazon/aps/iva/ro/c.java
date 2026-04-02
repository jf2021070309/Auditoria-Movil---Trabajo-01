package com.amazon.aps.iva.ro;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenAnalytics.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.us.b implements b {
    public final com.amazon.aps.iva.ds.a e;
    public final com.amazon.aps.iva.vs.a f;
    public final com.amazon.aps.iva.xb0.a<PlayableAsset> g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.vs.a aVar2, com.amazon.aps.iva.xb0.a<? extends PlayableAsset> aVar3, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar4) {
        super(aVar4);
        this.e = aVar;
        this.f = aVar2;
        this.g = aVar3;
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        e eVar;
        PlayableAsset invoke = this.g.invoke();
        if (invoke != null) {
            eVar = w.d.b(invoke);
        } else {
            eVar = null;
        }
        this.e.c(i.s(com.amazon.aps.iva.ls.a.EPISODE, f, eVar, null, null, new com.amazon.aps.iva.is.a[0], 24));
    }

    @Override // com.amazon.aps.iva.ro.b
    public final void y(PlayableAsset playableAsset, Throwable th) {
        e eVar;
        j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.EPISODE;
        if (playableAsset != null) {
            eVar = this.f.b(playableAsset);
        } else {
            eVar = null;
        }
        l1.L(this.e, th, new com.amazon.aps.iva.es.w(str, aVar, eVar, null, null, 52));
    }
}
