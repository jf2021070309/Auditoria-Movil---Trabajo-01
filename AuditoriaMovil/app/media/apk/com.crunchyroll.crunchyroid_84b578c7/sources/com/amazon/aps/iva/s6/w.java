package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.u0;
/* compiled from: TrackSelector.java */
/* loaded from: classes.dex */
public abstract class w {
    public a b;
    public com.amazon.aps.iva.t6.d c;

    public u0 I() {
        return u0.B;
    }

    public p1.a K() {
        return null;
    }

    public void N(a aVar, com.amazon.aps.iva.t6.d dVar) {
        this.b = aVar;
        this.c = dVar;
    }

    public boolean Q() {
        return this instanceof g;
    }

    public abstract void R(Object obj);

    public abstract x S(p1[] p1VarArr, o0 o0Var, v.b bVar, r0 r0Var) throws com.amazon.aps.iva.a6.l;

    public void release() {
        this.b = null;
        this.c = null;
    }

    /* compiled from: TrackSelector.java */
    /* loaded from: classes.dex */
    public interface a {
        void b();

        default void c() {
        }
    }

    public void T(com.amazon.aps.iva.q5.f fVar) {
    }

    public void U(u0 u0Var) {
    }
}
