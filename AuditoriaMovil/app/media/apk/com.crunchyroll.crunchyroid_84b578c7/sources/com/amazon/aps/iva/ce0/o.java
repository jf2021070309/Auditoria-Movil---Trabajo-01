package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.s0;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.rc0.p0;
import com.amazon.aps.iva.rc0.x;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes4.dex */
public final class o extends p0 implements b {
    public final com.amazon.aps.iva.id0.h F;
    public final com.amazon.aps.iva.kd0.c G;
    public final com.amazon.aps.iva.kd0.g H;
    public final com.amazon.aps.iva.kd0.h I;
    public final j J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(com.amazon.aps.iva.oc0.k r13, com.amazon.aps.iva.oc0.s0 r14, com.amazon.aps.iva.pc0.h r15, com.amazon.aps.iva.nd0.f r16, com.amazon.aps.iva.oc0.b.a r17, com.amazon.aps.iva.id0.h r18, com.amazon.aps.iva.kd0.c r19, com.amazon.aps.iva.kd0.g r20, com.amazon.aps.iva.kd0.h r21, com.amazon.aps.iva.ce0.j r22, com.amazon.aps.iva.oc0.t0 r23) {
        /*
            r12 = this;
            r7 = r12
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            java.lang.String r0 = "containingDeclaration"
            r1 = r13
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            java.lang.String r0 = "annotations"
            r3 = r15
            com.amazon.aps.iva.yb0.j.f(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r17
            com.amazon.aps.iva.yb0.j.f(r5, r0)
            java.lang.String r0 = "proto"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "nameResolver"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            java.lang.String r0 = "typeTable"
            com.amazon.aps.iva.yb0.j.f(r10, r0)
            java.lang.String r0 = "versionRequirementTable"
            com.amazon.aps.iva.yb0.j.f(r11, r0)
            if (r23 != 0) goto L36
            com.amazon.aps.iva.oc0.t0$a r0 = com.amazon.aps.iva.oc0.t0.a
            r6 = r0
            goto L38
        L36:
            r6 = r23
        L38:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.F = r8
            r7.G = r9
            r7.H = r10
            r7.I = r11
            r0 = r22
            r7.J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.o.<init>(com.amazon.aps.iva.oc0.k, com.amazon.aps.iva.oc0.s0, com.amazon.aps.iva.pc0.h, com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.b$a, com.amazon.aps.iva.id0.h, com.amazon.aps.iva.kd0.c, com.amazon.aps.iva.kd0.g, com.amazon.aps.iva.kd0.h, com.amazon.aps.iva.ce0.j, com.amazon.aps.iva.oc0.t0):void");
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.g E() {
        return this.H;
    }

    @Override // com.amazon.aps.iva.rc0.p0, com.amazon.aps.iva.rc0.x
    public final x G0(b.a aVar, com.amazon.aps.iva.oc0.k kVar, v vVar, t0 t0Var, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.nd0.f fVar2;
        com.amazon.aps.iva.yb0.j.f(kVar, "newOwner");
        com.amazon.aps.iva.yb0.j.f(aVar, "kind");
        com.amazon.aps.iva.yb0.j.f(hVar, "annotations");
        s0 s0Var = (s0) vVar;
        if (fVar == null) {
            com.amazon.aps.iva.nd0.f name = getName();
            com.amazon.aps.iva.yb0.j.e(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        o oVar = new o(kVar, s0Var, hVar, fVar2, aVar, this.F, this.G, this.H, this.I, this.J, t0Var);
        oVar.x = this.x;
        return oVar;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.kd0.c H() {
        return this.G;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final j I() {
        return this.J;
    }

    @Override // com.amazon.aps.iva.ce0.k
    public final com.amazon.aps.iva.od0.p b0() {
        return this.F;
    }
}
