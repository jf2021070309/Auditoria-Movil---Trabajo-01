package com.amazon.aps.iva.wv;

import java.util.Iterator;
import java.util.Map;
/* compiled from: DownloadModelCache.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PlayheadsCacheImpl", f = "DownloadModelCache.kt", l = {451}, m = "readAll")
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.qb0.c {
    public d0 h;
    public Map i;
    public Iterator j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ d0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, com.amazon.aps.iva.ob0.d<? super c0> dVar) {
        super(dVar);
        this.m = d0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, this);
    }
}
