package com.amazon.aps.iva.wu;

import com.amazon.aps.iva.yb0.d0;
/* compiled from: SingleJobRunner.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.coroutine.SingleJobRunner", f = "SingleJobRunner.kt", l = {18, 27}, m = "launchIfNotRunning")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.c {
    public d0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ e<Object, Object> j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e<Object, Object> eVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(dVar);
        this.j = eVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this, null);
    }
}
