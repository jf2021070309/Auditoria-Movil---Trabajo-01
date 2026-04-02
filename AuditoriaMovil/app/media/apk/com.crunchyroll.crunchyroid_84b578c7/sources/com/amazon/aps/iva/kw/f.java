package com.amazon.aps.iva.kw;

import com.amazon.aps.iva.xb0.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: OfflinePlayheadsSynchronizer.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.playheads.OfflinePlayheadsSynchronizer", f = "OfflinePlayheadsSynchronizer.kt", l = {61, 65, 68, 71, 71}, m = "pushPlayheadsToSync")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public g h;
    public List i;
    public Collection j;
    public Iterator k;
    public l l;
    public com.amazon.aps.iva.ig.a m;
    public /* synthetic */ Object n;
    public final /* synthetic */ g o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.o = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return g.d(this.o, this);
    }
}
