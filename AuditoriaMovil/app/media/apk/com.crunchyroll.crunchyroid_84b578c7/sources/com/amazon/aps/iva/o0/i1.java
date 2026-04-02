package com.amazon.aps.iva.o0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes.dex */
public interface i1 extends g.b {
    public static final /* synthetic */ int g0 = 0;

    /* compiled from: MonotonicFrameClock.kt */
    /* loaded from: classes.dex */
    public static final class a implements g.c<i1> {
        public static final /* synthetic */ a b = new a();
    }

    @Override // com.amazon.aps.iva.ob0.g.b
    default g.c<?> getKey() {
        return a.b;
    }

    <R> Object m0(com.amazon.aps.iva.xb0.l<? super Long, ? extends R> lVar, com.amazon.aps.iva.ob0.d<? super R> dVar);
}
