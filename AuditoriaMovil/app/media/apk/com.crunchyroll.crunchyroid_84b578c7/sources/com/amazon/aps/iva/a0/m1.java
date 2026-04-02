package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.b0.v0;
/* compiled from: Overscroll.kt */
/* loaded from: classes.dex */
public final class m1 implements p1 {
    public static final m1 a = new m1();

    @Override // com.amazon.aps.iva.a0.p1
    public final Object a(long j, v0.e eVar, com.amazon.aps.iva.ob0.d dVar) {
        Object invoke = eVar.invoke(new com.amazon.aps.iva.o2.o(j), dVar);
        if (invoke == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return invoke;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.a0.p1
    public final long b(long j, int i, v0.a aVar) {
        return ((com.amazon.aps.iva.e1.c) aVar.invoke(new com.amazon.aps.iva.e1.c(j))).a;
    }

    @Override // com.amazon.aps.iva.a0.p1
    public final boolean c() {
        return false;
    }

    @Override // com.amazon.aps.iva.a0.p1
    public final com.amazon.aps.iva.a1.f d() {
        int i = com.amazon.aps.iva.a1.f.a;
        return f.a.c;
    }
}
