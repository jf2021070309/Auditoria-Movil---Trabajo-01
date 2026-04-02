package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.m;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.p;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.r;
import com.amazon.aps.iva.oc0.t;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.rc0.l0;
import com.amazon.aps.iva.rc0.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes4.dex */
public final class e implements n0 {
    public final /* synthetic */ l0 b;

    public e() {
        k kVar = k.a;
        l0 H0 = l0.H0(k.c, b0.OPEN, q.e, true, com.amazon.aps.iva.nd0.f.j(b.ERROR_PROPERTY.getDebugText()), b.a.DECLARATION, t0.a);
        h hVar = k.e;
        z zVar = z.b;
        H0.M0(hVar, zVar, null, null, zVar);
        this.b = H0;
    }

    @Override // com.amazon.aps.iva.oc0.e1
    public final boolean B() {
        return this.b.t;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(m<R, D> mVar, D d) {
        l0 l0Var = this.b;
        l0Var.getClass();
        return mVar.j(l0Var, d);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final q0 J() {
        return this.b.v;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean L() {
        return this.b.g;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final q0 M() {
        return this.b.w;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final t N() {
        return this.b.B;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return this.b.r;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final n0 a() {
        return this.b.a();
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final n0 b(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        return this.b.b(q1Var);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final boolean c0() {
        return this.b.c0();
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        return this.b.d();
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final com.amazon.aps.iva.oc0.b e0(com.amazon.aps.iva.oc0.k kVar, b0 b0Var, p pVar, b.a aVar) {
        return this.b.e0(kVar, b0Var, pVar, aVar);
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<c1> f() {
        return this.b.f();
    }

    @Override // com.amazon.aps.iva.oc0.n
    public final t0 g() {
        return this.b.g();
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return this.b.q;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        com.amazon.aps.iva.pc0.h annotations = this.b.getAnnotations();
        com.amazon.aps.iva.yb0.j.e(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final m0 getGetter() {
        return this.b.y;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final b.a getKind() {
        return this.b.getKind();
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.nd0.f getName() {
        return this.b.getName();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final e0 getReturnType() {
        return this.b.getReturnType();
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final p0 getSetter() {
        return this.b.z;
    }

    @Override // com.amazon.aps.iva.oc0.b1
    public final e0 getType() {
        return this.b.getType();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<y0> getTypeParameters() {
        return this.b.getTypeParameters();
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final r getVisibility() {
        return this.b.getVisibility();
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean isConst() {
        return this.b.p;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return this.b.isExternal();
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final com.amazon.aps.iva.sd0.g<?> j0() {
        return this.b.j0();
    }

    @Override // com.amazon.aps.iva.oc0.b, com.amazon.aps.iva.oc0.a
    public final Collection<? extends n0> k() {
        return this.b.k();
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final b0 o() {
        return this.b.o();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        this.b.getClass();
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final t r0() {
        return this.b.A;
    }

    @Override // com.amazon.aps.iva.oc0.n0
    public final ArrayList t() {
        return this.b.t();
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final List<q0> t0() {
        return this.b.t0();
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean u0() {
        return this.b.o;
    }

    @Override // com.amazon.aps.iva.oc0.b
    public final void z0(Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        this.b.z0(collection);
    }
}
