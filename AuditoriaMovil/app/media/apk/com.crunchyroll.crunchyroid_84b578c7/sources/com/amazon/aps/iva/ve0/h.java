package com.amazon.aps.iva.ve0;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class h implements f<Object> {
    public final /* synthetic */ Object b;

    public h(o0 o0Var) {
        this.b = o0Var;
    }

    @Override // com.amazon.aps.iva.ve0.f
    public final Object c(g<? super Object> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object a = gVar.a(this.b, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
