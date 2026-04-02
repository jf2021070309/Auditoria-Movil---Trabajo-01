package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.rc0.l0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes4.dex */
public final class n extends l0 implements b {
    public final com.amazon.aps.iva.id0.m C;
    public final com.amazon.aps.iva.kd0.c D;
    public final com.amazon.aps.iva.kd0.g E;
    public final com.amazon.aps.iva.kd0.h F;
    public final j G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.amazon.aps.iva.oc0.k kVar, n0 n0Var, com.amazon.aps.iva.pc0.h hVar, b0 b0Var, com.amazon.aps.iva.oc0.r rVar, boolean z, com.amazon.aps.iva.nd0.f fVar, b.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.kd0.h hVar2, j jVar) {
        super(kVar, n0Var, hVar, b0Var, rVar, z, fVar, aVar, t0.a, z2, z3, z6, false, z4, z5);
        com.amazon.aps.iva.yb0.j.f(kVar, "containingDeclaration");
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        com.amazon.aps.iva.yb0.j.f(b0Var, "modality");
        com.amazon.aps.iva.yb0.j.f(rVar, "visibility");
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        com.amazon.aps.iva.yb0.j.f(hVar2, "versionRequirementTable");
        this.C = mVar;
        this.D = cVar;
        this.E = gVar;
        this.F = hVar2;
        this.G = jVar;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.g E() {
        return this.E;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.c H() {
        return this.D;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final j I() {
        return this.G;
    }

    @Override // com.amazon.aps.iva.rc0.l0
    public final l0 I0(com.amazon.aps.iva.oc0.k kVar, b0 b0Var, com.amazon.aps.iva.oc0.r rVar, n0 n0Var, b.a aVar, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(b0Var, "newModality");
        com.amazon.aps.iva.yb0.j.f(rVar, "newVisibility");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        com.amazon.aps.iva.yb0.j.f(fVar, "newName");
        return new n(kVar, n0Var, getAnnotations(), b0Var, rVar, this.g, fVar, aVar, this.o, this.p, isExternal(), this.t, this.q, this.C, this.D, this.E, this.F, this.G);
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.od0.p b0() {
        return this.C;
    }

    @Override // com.amazon.aps.iva.rc0.l0, com.amazon.aps.iva.oc0.a0
    public final boolean isExternal() {
        return l1.c(com.amazon.aps.iva.kd0.b.D, this.C.e, "IS_EXTERNAL_PROPERTY.get(proto.flags)");
    }
}
