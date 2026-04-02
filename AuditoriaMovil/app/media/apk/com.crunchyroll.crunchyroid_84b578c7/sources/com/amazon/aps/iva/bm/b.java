package com.amazon.aps.iva.bm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: ProfilesCachingStrategy.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.strategies.ProfilesCachingStrategyImpl$2", f = "ProfilesCachingStrategy.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.qb0.i implements p<String, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, com.amazon.aps.iva.ob0.d<? super b> dVar) {
        super(2, dVar);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new b(this.h, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((b) create(str, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        this.h.d(0L);
        return q.a;
    }
}
