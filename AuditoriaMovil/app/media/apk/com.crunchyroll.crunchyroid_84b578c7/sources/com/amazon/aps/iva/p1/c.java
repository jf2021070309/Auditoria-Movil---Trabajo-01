package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.b0.x0;
import com.amazon.aps.iva.v1.v2;
/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public interface c extends com.amazon.aps.iva.o2.c {
    Object G(n nVar, com.amazon.aps.iva.qb0.a aVar);

    default Object R(long j, x0 x0Var, com.amazon.aps.iva.ob0.d dVar) {
        return x0Var.invoke(this, dVar);
    }

    default long Y() {
        int i = com.amazon.aps.iva.e1.g.d;
        return com.amazon.aps.iva.e1.g.b;
    }

    long a();

    v2 getViewConfiguration();

    m v0();

    default <T> Object z0(long j, com.amazon.aps.iva.xb0.p<? super c, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> pVar, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        return pVar.invoke(this, dVar);
    }
}
