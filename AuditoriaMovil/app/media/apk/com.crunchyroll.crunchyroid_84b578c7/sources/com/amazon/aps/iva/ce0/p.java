package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.o1;
import com.amazon.aps.iva.ee0.q1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.rc0.r0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.List;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes4.dex */
public final class p extends com.amazon.aps.iva.rc0.f implements k {
    public final com.amazon.aps.iva.de0.l i;
    public final com.amazon.aps.iva.id0.q j;
    public final com.amazon.aps.iva.kd0.c k;
    public final com.amazon.aps.iva.kd0.g l;
    public final com.amazon.aps.iva.kd0.h m;
    public final j n;
    public Collection<? extends r0> o;
    public m0 p;
    public m0 q;
    public List<? extends y0> r;
    public m0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.oc0.r rVar, com.amazon.aps.iva.id0.q qVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.h hVar2, j jVar) {
        super(kVar, hVar, fVar, rVar);
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        com.amazon.aps.iva.yb0.j.f(kVar, "containingDeclaration");
        com.amazon.aps.iva.yb0.j.f(rVar, "visibility");
        com.amazon.aps.iva.yb0.j.f(qVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(hVar2, "versionRequirementTable");
        this.i = lVar;
        this.j = qVar;
        this.k = cVar;
        this.l = gVar;
        this.m = hVar2;
        this.n = jVar;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.g E() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E0(java.util.List<? extends com.amazon.aps.iva.oc0.y0> r26, com.amazon.aps.iva.ee0.m0 r27, com.amazon.aps.iva.ee0.m0 r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.p.E0(java.util.List, com.amazon.aps.iva.ee0.m0, com.amazon.aps.iva.ee0.m0):void");
    }

    @Override // com.amazon.aps.iva.oc0.x0
    public final m0 G() {
        m0 m0Var = this.q;
        if (m0Var != null) {
            return m0Var;
        }
        com.amazon.aps.iva.yb0.j.m("expandedType");
        throw null;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.c H() {
        throw null;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final j I() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.oc0.v0
    public final com.amazon.aps.iva.oc0.i b(q1 q1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "substitutor");
        if (q1Var.h()) {
            return this;
        }
        com.amazon.aps.iva.de0.l lVar = this.i;
        com.amazon.aps.iva.oc0.k d = d();
        com.amazon.aps.iva.yb0.j.e(d, "containingDeclaration");
        com.amazon.aps.iva.pc0.h annotations = getAnnotations();
        com.amazon.aps.iva.yb0.j.e(annotations, "annotations");
        com.amazon.aps.iva.nd0.f name = getName();
        com.amazon.aps.iva.yb0.j.e(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p pVar = new p(lVar, d, annotations, name, this.f, this.j, this.k, this.l, this.m, this.n);
        List<y0> n = n();
        m0 o0 = o0();
        v1 v1Var = v1.INVARIANT;
        e0 i = q1Var.i(o0, v1Var);
        com.amazon.aps.iva.yb0.j.e(i, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        m0 a = o1.a(i);
        e0 i2 = q1Var.i(G(), v1Var);
        com.amazon.aps.iva.yb0.j.e(i2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        pVar.E0(n, a, o1.a(i2));
        return pVar;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final m0 m() {
        m0 m0Var = this.s;
        if (m0Var != null) {
            return m0Var;
        }
        com.amazon.aps.iva.yb0.j.m("defaultTypeImpl");
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.x0
    public final m0 o0() {
        m0 m0Var = this.p;
        if (m0Var != null) {
            return m0Var;
        }
        com.amazon.aps.iva.yb0.j.m("underlyingType");
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.x0
    public final com.amazon.aps.iva.oc0.e q() {
        if (l1.D(G())) {
            return null;
        }
        com.amazon.aps.iva.oc0.h k = G().I0().k();
        if (!(k instanceof com.amazon.aps.iva.oc0.e)) {
            return null;
        }
        return (com.amazon.aps.iva.oc0.e) k;
    }
}
