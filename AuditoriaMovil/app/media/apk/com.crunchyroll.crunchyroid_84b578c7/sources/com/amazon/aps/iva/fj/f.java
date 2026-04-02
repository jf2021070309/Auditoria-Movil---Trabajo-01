package com.amazon.aps.iva.fj;

import com.amazon.aps.iva.fj.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayerComponent.kt */
/* loaded from: classes.dex */
public abstract class f<TConfig extends g> implements a<TConfig> {
    public com.amazon.aps.iva.oj.a b;

    public static final Object h(f fVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c = fVar.i().a().c(new b(new c(fVar), fVar), dVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        if (c != aVar) {
            c = q.a;
        }
        if (c != aVar) {
            return q.a;
        }
        return c;
    }

    public final com.amazon.aps.iva.oj.a i() {
        com.amazon.aps.iva.oj.a aVar = this.b;
        if (aVar != null) {
            return aVar;
        }
        j.m("eventBus");
        throw null;
    }
}
