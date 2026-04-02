package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.rc0.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypeAliasConstructorDescriptor.kt */
/* loaded from: classes4.dex */
public final class s0 extends x implements r0 {
    public final com.amazon.aps.iva.de0.l F;
    public final com.amazon.aps.iva.oc0.x0 G;
    public final com.amazon.aps.iva.de0.j H;
    public com.amazon.aps.iva.oc0.d I;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] K = {com.amazon.aps.iva.yb0.e0.c(new com.amazon.aps.iva.yb0.v(com.amazon.aps.iva.yb0.e0.a(s0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
    public static final a J = new a();

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<s0> {
        public final /* synthetic */ com.amazon.aps.iva.oc0.d i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.oc0.d dVar) {
            super(0);
            this.i = dVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final s0 invoke() {
            q1 d;
            s0 s0Var = s0.this;
            com.amazon.aps.iva.de0.l lVar = s0Var.F;
            com.amazon.aps.iva.oc0.x0 x0Var = s0Var.G;
            com.amazon.aps.iva.oc0.d dVar = this.i;
            com.amazon.aps.iva.pc0.h annotations = dVar.getAnnotations();
            b.a kind = dVar.getKind();
            com.amazon.aps.iva.yb0.j.e(kind, "underlyingConstructorDescriptor.kind");
            com.amazon.aps.iva.oc0.x0 x0Var2 = s0Var.G;
            com.amazon.aps.iva.oc0.t0 g = x0Var2.g();
            com.amazon.aps.iva.yb0.j.e(g, "typeAliasDescriptor.source");
            s0 s0Var2 = new s0(lVar, x0Var, dVar, s0Var, annotations, kind, g);
            s0.J.getClass();
            d dVar2 = null;
            if (x0Var2.q() == null) {
                d = null;
            } else {
                d = q1.d(x0Var2.G());
            }
            if (d == null) {
                return null;
            }
            com.amazon.aps.iva.oc0.q0 J = dVar.J();
            if (J != null) {
                dVar2 = J.b(d);
            }
            d dVar3 = dVar2;
            List<com.amazon.aps.iva.oc0.q0> t0 = dVar.t0();
            com.amazon.aps.iva.yb0.j.e(t0, "underlyingConstructorDes…contextReceiverParameters");
            List<com.amazon.aps.iva.oc0.q0> list = t0;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (com.amazon.aps.iva.oc0.q0 q0Var : list) {
                arrayList.add(q0Var.b(d));
            }
            List<y0> n = x0Var2.n();
            List<c1> f = s0Var.f();
            com.amazon.aps.iva.ee0.e0 e0Var = s0Var.h;
            com.amazon.aps.iva.yb0.j.c(e0Var);
            s0Var2.J0(null, dVar3, arrayList, n, f, e0Var, com.amazon.aps.iva.oc0.b0.FINAL, x0Var2.getVisibility());
            return s0Var2;
        }
    }

    public /* synthetic */ s0() {
        throw null;
    }

    public s0(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.x0 x0Var, com.amazon.aps.iva.oc0.d dVar, r0 r0Var, com.amazon.aps.iva.pc0.h hVar, b.a aVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(aVar, x0Var, r0Var, t0Var, hVar, com.amazon.aps.iva.nd0.h.e);
        this.F = lVar;
        this.G = x0Var;
        this.t = x0Var.U();
        this.H = lVar.b(new b(dVar));
        this.I = dVar;
    }

    @Override // com.amazon.aps.iva.rc0.x
    public final x G0(b.a aVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.v vVar, com.amazon.aps.iva.oc0.t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        return new s0(this.F, this.G, this.I, this, hVar, b.a.DECLARATION, t0Var);
    }

    @Override // com.amazon.aps.iva.rc0.r0
    public final com.amazon.aps.iva.oc0.d P() {
        return this.I;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.b
    /* renamed from: P0 */
    public final r0 e0(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.b0 b0Var, com.amazon.aps.iva.oc0.p pVar, b.a aVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(pVar, "visibility");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        x.a aVar2 = (x.a) C0();
        aVar2.o(kVar);
        aVar2.d(b0Var);
        aVar2.q(pVar);
        aVar2.n(aVar);
        aVar2.m = false;
        com.amazon.aps.iva.oc0.v build = aVar2.build();
        com.amazon.aps.iva.yb0.j.d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r0) build;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    /* renamed from: Q0 */
    public final r0 a() {
        com.amazon.aps.iva.oc0.v a2 = super.a();
        com.amazon.aps.iva.yb0.j.d(a2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (r0) a2;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v, com.amazon.aps.iva.oc0.v0
    /* renamed from: R0 */
    public final s0 b(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        com.amazon.aps.iva.oc0.v b2 = super.b(q1Var);
        com.amazon.aps.iva.yb0.j.d(b2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        s0 s0Var = (s0) b2;
        com.amazon.aps.iva.ee0.e0 e0Var = s0Var.h;
        com.amazon.aps.iva.yb0.j.c(e0Var);
        com.amazon.aps.iva.oc0.d b3 = this.I.a().b(q1.d(e0Var));
        if (b3 == null) {
            return null;
        }
        s0Var.I = b3;
        return s0Var;
    }

    @Override // com.amazon.aps.iva.oc0.j
    public final boolean Y() {
        return this.I.Y();
    }

    @Override // com.amazon.aps.iva.oc0.j
    public final com.amazon.aps.iva.oc0.e Z() {
        com.amazon.aps.iva.oc0.e Z = this.I.Z();
        com.amazon.aps.iva.yb0.j.e(Z, "underlyingConstructorDescriptor.constructedClass");
        return Z;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.v, com.amazon.aps.iva.oc0.v0
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.oc0.j b(q1 q1Var) {
        throw null;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.i d() {
        return this.G;
    }

    @Override // com.amazon.aps.iva.rc0.x, com.amazon.aps.iva.oc0.a
    public final com.amazon.aps.iva.ee0.e0 getReturnType() {
        com.amazon.aps.iva.ee0.e0 e0Var = this.h;
        com.amazon.aps.iva.yb0.j.c(e0Var);
        return e0Var;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.k d() {
        return this.G;
    }
}
