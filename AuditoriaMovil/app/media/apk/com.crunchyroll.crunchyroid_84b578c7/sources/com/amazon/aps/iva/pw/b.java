package com.amazon.aps.iva.pw;

import com.amazon.aps.iva.bw.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: StreamDataLoader.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<PlayableAsset, Throwable, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Throwable, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g.d.b bVar) {
        super(2);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(PlayableAsset playableAsset, Throwable th) {
        Throwable th2 = th;
        j.f(playableAsset, "<anonymous parameter 0>");
        j.f(th2, "e");
        this.h.invoke(th2);
        return q.a;
    }
}
