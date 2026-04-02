package com.amazon.aps.iva.ge0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oc0.a;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.p;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.q0;
import com.amazon.aps.iva.oc0.r;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.p0;
import com.amazon.aps.iva.rc0.x;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.List;
/* compiled from: ErrorFunctionDescriptor.kt */
/* loaded from: classes4.dex */
public final class c extends p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ge0.a aVar) {
        super(aVar, null, h.a.a, com.amazon.aps.iva.nd0.f.j(b.ERROR_FUNCTION.getDebugText()), b.a.DECLARATION, t0.a);
        com.amazon.aps.iva.yb0.j.f(aVar, "containingDeclaration");
        z zVar = z.b;
        J0(null, null, zVar, zVar, zVar, k.c(j.RETURN_TYPE_FOR_FUNCTION, new String[0]), b0.OPEN, q.e);
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v
    public final v.a<s0> C0() {
        return new a();
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x
    public final /* bridge */ /* synthetic */ v E0(com.amazon.aps.iva.oc0.k kVar, b0 b0Var, p pVar, b.a aVar) {
        P0(kVar, b0Var, pVar, aVar);
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x
    public final x G0(b.a aVar, com.amazon.aps.iva.oc0.k kVar, v vVar, t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.p0
    public final s0 P0(com.amazon.aps.iva.oc0.k kVar, b0 b0Var, p pVar, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(pVar, "visibility");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.b
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.oc0.b e0(com.amazon.aps.iva.oc0.k kVar, b0 b0Var, p pVar, b.a aVar) {
        P0(kVar, b0Var, pVar, aVar);
        return this;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v
    public final boolean isSuspend() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.a
    public final <V> V q0(a.InterfaceC0568a<V> interfaceC0568a) {
        return null;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.b
    public final void z0(Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "overriddenDescriptors");
    }

    /* compiled from: ErrorFunctionDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a implements v.a<s0> {
        public a() {
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> a(m1 m1Var) {
            com.amazon.aps.iva.yb0.j.f(m1Var, "substitution");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final s0 build() {
            return c.this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> d(b0 b0Var) {
            com.amazon.aps.iva.yb0.j.f(b0Var, "modality");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> e(com.amazon.aps.iva.nd0.f fVar) {
            com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> j(e0 e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "type");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> m(com.amazon.aps.iva.pc0.h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "additionalAnnotations");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> n(b.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "kind");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> o(com.amazon.aps.iva.oc0.k kVar) {
            com.amazon.aps.iva.yb0.j.f(kVar, "owner");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> q(r rVar) {
            com.amazon.aps.iva.yb0.j.f(rVar, "visibility");
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> h() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a i() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a k() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> l() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> p() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> r() {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> b(List<? extends c1> list) {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a c(Boolean bool) {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a<s0> f(q0 q0Var) {
            return this;
        }

        @Override // com.amazon.aps.iva.oc0.v.a
        public final v.a g(com.amazon.aps.iva.oc0.d dVar) {
            return this;
        }
    }
}
