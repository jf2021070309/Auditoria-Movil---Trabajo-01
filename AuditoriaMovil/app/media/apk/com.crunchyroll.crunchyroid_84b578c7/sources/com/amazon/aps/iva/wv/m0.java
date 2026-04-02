package com.amazon.aps.iva.wv;

import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import java.util.Collection;
/* compiled from: DownloadModelCache.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.StreamsCacheImpl", f = "DownloadModelCache.kt", l = {256, 263, 270}, m = "toLocalStreams")
/* loaded from: classes2.dex */
public final class m0 extends com.amazon.aps.iva.qb0.c {
    public l0 h;
    public Streams i;
    public Collection j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ l0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l0 l0Var, com.amazon.aps.iva.ob0.d<? super m0> dVar) {
        super(dVar);
        this.r = l0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        int i = l0.d;
        return this.r.j(null, this);
    }
}
