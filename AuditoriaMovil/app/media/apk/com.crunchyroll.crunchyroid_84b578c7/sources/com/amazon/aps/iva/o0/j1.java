package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.o0.i1;
/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes.dex */
public final class j1 {
    public static final i1 a(com.amazon.aps.iva.ob0.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "<this>");
        int i = i1.g0;
        i1 i1Var = (i1) gVar.get(i1.a.b);
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final <R> Object b(com.amazon.aps.iva.xb0.l<? super Long, ? extends R> lVar, com.amazon.aps.iva.ob0.d<? super R> dVar) {
        return a(dVar.getContext()).m0(lVar, dVar);
    }
}
