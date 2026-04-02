package com.amazon.aps.iva.ve0;

import com.amazon.aps.iva.ve0.t0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class o implements f<Object> {
    public final /* synthetic */ f b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.p c;

    public o(com.amazon.aps.iva.we0.i iVar, t0.b bVar) {
        this.b = iVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super Object> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object c = this.b.c(new p(new com.amazon.aps.iva.yb0.z(), gVar, this.c), dVar);
        if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return c;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
