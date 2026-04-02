package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.d1;
import com.amazon.aps.iva.oc0.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes4.dex */
public class v0 extends w0 implements c1 {
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final com.amazon.aps.iva.ee0.e0 k;
    public final c1 l;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends v0 {
        public final com.amazon.aps.iva.kb0.m m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.oc0.a aVar, c1 c1Var, int i, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.ee0.e0 e0Var, boolean z, boolean z2, boolean z3, com.amazon.aps.iva.ee0.e0 e0Var2, com.amazon.aps.iva.oc0.t0 t0Var, com.amazon.aps.iva.xb0.a<? extends List<? extends d1>> aVar2) {
            super(aVar, c1Var, i, hVar, fVar, e0Var, z, z2, z3, e0Var2, t0Var);
            com.amazon.aps.iva.yb0.j.f(aVar, "containingDeclaration");
            this.m = com.amazon.aps.iva.kb0.f.b(aVar2);
        }

        @Override // com.amazon.aps.iva.rc0.v0, com.amazon.aps.iva.oc0.c1
        public final c1 W(com.amazon.aps.iva.mc0.e eVar, com.amazon.aps.iva.nd0.f fVar, int i) {
            com.amazon.aps.iva.pc0.h annotations = getAnnotations();
            com.amazon.aps.iva.yb0.j.e(annotations, "annotations");
            com.amazon.aps.iva.ee0.e0 type = getType();
            com.amazon.aps.iva.yb0.j.e(type, "type");
            return new a(eVar, null, i, annotations, fVar, type, w0(), this.i, this.j, this.k, com.amazon.aps.iva.oc0.t0.a, new u0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.amazon.aps.iva.oc0.a aVar, c1 c1Var, int i, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.ee0.e0 e0Var, boolean z, boolean z2, boolean z3, com.amazon.aps.iva.ee0.e0 e0Var2, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(aVar, hVar, fVar, e0Var, t0Var);
        c1 c1Var2;
        com.amazon.aps.iva.yb0.j.f(aVar, "containingDeclaration");
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(e0Var, "outType");
        com.amazon.aps.iva.yb0.j.f(t0Var, FirebaseAnalytics.Param.SOURCE);
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = e0Var2;
        if (c1Var == null) {
            c1Var2 = this;
        } else {
            c1Var2 = c1Var;
        }
        this.l = c1Var2;
    }

    @Override // com.amazon.aps.iva.oc0.k
    public final <R, D> R D0(com.amazon.aps.iva.oc0.m<R, D> mVar, D d) {
        return mVar.h(this, d);
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final boolean L() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public c1 W(com.amazon.aps.iva.mc0.e eVar, com.amazon.aps.iva.nd0.f fVar, int i) {
        com.amazon.aps.iva.pc0.h annotations = getAnnotations();
        com.amazon.aps.iva.yb0.j.e(annotations, "annotations");
        com.amazon.aps.iva.ee0.e0 type = getType();
        com.amazon.aps.iva.yb0.j.e(type, "type");
        return new v0(eVar, null, i, annotations, fVar, type, w0(), this.i, this.j, this.k, com.amazon.aps.iva.oc0.t0.a);
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.a b(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        if (q1Var.h()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public final int getIndex() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        q.i iVar = com.amazon.aps.iva.oc0.q.f;
        com.amazon.aps.iva.yb0.j.e(iVar, "LOCAL");
        return iVar;
    }

    @Override // com.amazon.aps.iva.oc0.d1
    public final /* bridge */ /* synthetic */ com.amazon.aps.iva.sd0.g j0() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a
    public final Collection<c1> k() {
        Collection<? extends com.amazon.aps.iva.oc0.a> k = d().k();
        com.amazon.aps.iva.yb0.j.e(k, "containingDeclaration.overriddenDescriptors");
        Collection<? extends com.amazon.aps.iva.oc0.a> collection = k;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(collection));
        for (com.amazon.aps.iva.oc0.a aVar : collection) {
            arrayList.add(aVar.f().get(this.g));
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public final boolean k0() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public final boolean l0() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public final com.amazon.aps.iva.ee0.e0 p0() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.oc0.c1
    public final boolean w0() {
        if (this.h && ((com.amazon.aps.iva.oc0.b) d()).getKind().isReal()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.k
    public final com.amazon.aps.iva.oc0.a d() {
        com.amazon.aps.iva.oc0.k d = super.d();
        com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (com.amazon.aps.iva.oc0.a) d;
    }

    @Override // com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.rc0.p, com.amazon.aps.iva.oc0.k
    public final c1 a() {
        c1 c1Var = this.l;
        return c1Var == this ? this : c1Var.a();
    }
}
