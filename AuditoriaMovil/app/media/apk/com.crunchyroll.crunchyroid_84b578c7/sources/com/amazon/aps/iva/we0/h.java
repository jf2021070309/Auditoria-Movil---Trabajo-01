package com.amazon.aps.iva.we0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ob0.e;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public abstract class h<S, T> extends f<T> {
    public final com.amazon.aps.iva.ve0.f<S> e;

    public h(int i, com.amazon.aps.iva.ob0.g gVar, com.amazon.aps.iva.ue0.e eVar, com.amazon.aps.iva.ve0.f fVar) {
        super(gVar, i, eVar);
        this.e = fVar;
    }

    @Override // com.amazon.aps.iva.we0.f, com.amazon.aps.iva.ve0.f
    public final Object c(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        boolean z;
        if (this.c == -3) {
            com.amazon.aps.iva.ob0.g context = dVar.getContext();
            com.amazon.aps.iva.ob0.g plus = context.plus(this.b);
            if (com.amazon.aps.iva.yb0.j.a(plus, context)) {
                Object i = i(gVar, dVar);
                if (i != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                    return com.amazon.aps.iva.kb0.q.a;
                }
                return i;
            }
            int i2 = com.amazon.aps.iva.ob0.e.h0;
            e.a aVar = e.a.b;
            if (com.amazon.aps.iva.yb0.j.a(plus.get(aVar), context.get(aVar))) {
                com.amazon.aps.iva.ob0.g context2 = dVar.getContext();
                if (gVar instanceof r) {
                    z = true;
                } else {
                    z = gVar instanceof n;
                }
                if (!z) {
                    gVar = new u(gVar, context2);
                }
                Object t0 = x.t0(plus, gVar, com.amazon.aps.iva.xe0.u.b(plus), new g(this, null), dVar);
                com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (t0 != aVar2) {
                    t0 = com.amazon.aps.iva.kb0.q.a;
                }
                if (t0 != aVar2) {
                    return com.amazon.aps.iva.kb0.q.a;
                }
                return t0;
            }
        }
        Object c = super.c(gVar, dVar);
        if (c != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return c;
    }

    @Override // com.amazon.aps.iva.we0.f
    public final Object d(com.amazon.aps.iva.ue0.q<? super T> qVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object i = i(new r(qVar), dVar);
        if (i != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return com.amazon.aps.iva.kb0.q.a;
        }
        return i;
    }

    public abstract Object i(com.amazon.aps.iva.ve0.g<? super T> gVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar);

    @Override // com.amazon.aps.iva.we0.f
    public final String toString() {
        return this.e + " -> " + super.toString();
    }
}
