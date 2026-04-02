package com.amazon.aps.iva.i5;
/* compiled from: CoroutineLiveData.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {235}, m = "clearSource$lifecycle_livedata_ktx_release")
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.qb0.c {
    public /* synthetic */ Object h;
    public final /* synthetic */ androidx.lifecycle.c<Object> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.lifecycle.c<Object> cVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(dVar);
        this.i = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.m(this);
    }
}
