package com.amazon.aps.iva.kw;

import com.ellation.crunchyroll.api.etp.content.model.Playhead;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: OfflinePlayheadsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer", f = "OfflinePlayheadsSynchronizer.kt", l = {93}, m = "toPlayheadCacheModels")
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.qb0.c {
    public g h;
    public Collection i;
    public Iterator j;
    public Playhead k;
    public Collection l;
    public /* synthetic */ Object m;
    public final /* synthetic */ g n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
        super(dVar);
        this.n = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return g.e(this.n, null, this);
    }
}
