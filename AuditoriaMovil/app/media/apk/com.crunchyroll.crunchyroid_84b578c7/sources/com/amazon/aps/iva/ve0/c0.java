package com.amazon.aps.iva.ve0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class c0 implements f<Object> {
    public final /* synthetic */ f b;
    public final /* synthetic */ f c;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q d;

    public c0(f fVar, f fVar2, com.amazon.aps.iva.xb0.q qVar) {
        this.b = fVar;
        this.c = fVar2;
        this.d = qVar;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super Object> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object r = com.amazon.aps.iva.e.w.r(dVar, e0.h, new d0(this.d, null), gVar, new f[]{this.b, this.c});
        if (r == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return r;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
