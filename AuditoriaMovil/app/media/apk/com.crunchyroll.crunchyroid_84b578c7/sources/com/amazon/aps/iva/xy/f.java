package com.amazon.aps.iva.xy;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
/* compiled from: FlowExtensions.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.mvp.flow.FlowExtensionsKt$mapResourceFlow$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements p {
    public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new f(dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(Object obj, Object obj2) {
        new f((com.amazon.aps.iva.ob0.d) obj2).invokeSuspend(q.a);
        return null;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        x.i0(obj);
        return null;
    }
}
