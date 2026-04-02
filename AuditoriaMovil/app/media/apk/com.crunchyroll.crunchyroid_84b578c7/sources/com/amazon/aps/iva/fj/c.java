package com.amazon.aps.iva.fj;

import com.amazon.aps.iva.kb0.q;
/* compiled from: PlayerComponent.kt */
/* loaded from: classes.dex */
public final class c<T> implements com.amazon.aps.iva.ve0.g {
    public final /* synthetic */ f<g> b;

    public c(f<g> fVar) {
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.ve0.g
    public final Object a(Object obj, com.amazon.aps.iva.ob0.d dVar) {
        Object g = this.b.g((com.amazon.aps.iva.pj.a) obj, dVar);
        if (g != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q.a;
        }
        return g;
    }
}
