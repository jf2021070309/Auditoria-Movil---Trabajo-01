package com.amazon.aps.iva.oc0;

import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.oc0.b;
import java.util.List;
/* compiled from: FunctionDescriptor.java */
/* loaded from: classes4.dex */
public interface v extends b {

    /* compiled from: FunctionDescriptor.java */
    /* loaded from: classes4.dex */
    public interface a<D extends v> {
        a<D> a(m1 m1Var);

        a<D> b(List<c1> list);

        D build();

        a c(Boolean bool);

        a<D> d(b0 b0Var);

        a<D> e(com.amazon.aps.iva.nd0.f fVar);

        a<D> f(q0 q0Var);

        a g(d dVar);

        a<D> h();

        a i();

        a<D> j(com.amazon.aps.iva.ee0.e0 e0Var);

        a k();

        a<D> l();

        a<D> m(com.amazon.aps.iva.pc0.h hVar);

        a<D> n(b.a aVar);

        a<D> o(k kVar);

        a<D> p();

        a<D> q(r rVar);

        a<D> r();
    }

    boolean B0();

    boolean C();

    a<? extends v> C0();

    @Override // com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.oc0.a, com.amazon.aps.iva.oc0.k
    v a();

    v b(q1 q1Var);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    v m0();

    boolean y0();
}
