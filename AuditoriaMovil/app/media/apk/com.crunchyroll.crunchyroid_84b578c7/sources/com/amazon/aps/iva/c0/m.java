package com.amazon.aps.iva.c0;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.ve0.l0;
/* compiled from: InteractionSource.kt */
/* loaded from: classes.dex */
public final class m implements l {
    public final l0 a = t.g(0, 16, com.amazon.aps.iva.ue0.e.DROP_OLDEST, 1);

    @Override // com.amazon.aps.iva.c0.l
    public final boolean a(j jVar) {
        return this.a.b(jVar);
    }

    @Override // com.amazon.aps.iva.c0.l
    public final Object b(j jVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object a = this.a.a(jVar, dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.c0.k
    public final l0 c() {
        return this.a;
    }
}
