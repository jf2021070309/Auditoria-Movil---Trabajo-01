package com.amazon.aps.iva.a0;
/* compiled from: AndroidOverscroll.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.kt", l = {219, 244}, m = "applyToFling-BMRW4eQ")
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.qb0.c {
    public b h;
    public long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
        super(dVar);
        this.k = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, null, this);
    }
}
