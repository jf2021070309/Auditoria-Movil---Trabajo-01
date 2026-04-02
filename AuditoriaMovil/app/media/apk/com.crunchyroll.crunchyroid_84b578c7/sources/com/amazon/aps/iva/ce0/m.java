package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
/* compiled from: DeserializedPackageMemberScope.kt */
/* loaded from: classes4.dex */
public final class m extends l {
    public final f0 g;
    public final String h;
    public final com.amazon.aps.iva.nd0.c i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.amazon.aps.iva.oc0.f0 r17, com.amazon.aps.iva.id0.k r18, com.amazon.aps.iva.kd0.c r19, com.amazon.aps.iva.kd0.a r20, com.amazon.aps.iva.ce0.j r21, com.amazon.aps.iva.ae0.l r22, java.lang.String r23, com.amazon.aps.iva.xb0.a<? extends java.util.Collection<com.amazon.aps.iva.nd0.f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r0 = r18
            r15 = r23
            java.lang.String r1 = "packageDescriptor"
            com.amazon.aps.iva.yb0.j.f(r14, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r19
            com.amazon.aps.iva.yb0.j.f(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r20
            com.amazon.aps.iva.yb0.j.f(r3, r1)
            java.lang.String r1 = "debugName"
            com.amazon.aps.iva.yb0.j.f(r15, r1)
            java.lang.String r1 = "classNames"
            r5 = r24
            com.amazon.aps.iva.yb0.j.f(r5, r1)
            com.amazon.aps.iva.kd0.g r10 = new com.amazon.aps.iva.kd0.g
            com.amazon.aps.iva.id0.s r1 = r0.h
            java.lang.String r4 = "proto.typeTable"
            com.amazon.aps.iva.yb0.j.e(r1, r4)
            r10.<init>(r1)
            com.amazon.aps.iva.kd0.h r1 = com.amazon.aps.iva.kd0.h.b
            com.amazon.aps.iva.id0.v r1 = r0.i
            java.lang.String r4 = "proto.versionRequirementTable"
            com.amazon.aps.iva.yb0.j.e(r1, r4)
            com.amazon.aps.iva.kd0.h r11 = com.amazon.aps.iva.kd0.h.a.a(r1)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            com.amazon.aps.iva.ae0.n r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List<com.amazon.aps.iva.id0.h> r2 = r0.e
            java.lang.String r3 = "proto.functionList"
            com.amazon.aps.iva.yb0.j.e(r2, r3)
            java.util.List<com.amazon.aps.iva.id0.m> r3 = r0.f
            java.lang.String r4 = "proto.propertyList"
            com.amazon.aps.iva.yb0.j.e(r3, r4)
            java.util.List<com.amazon.aps.iva.id0.q> r4 = r0.g
            java.lang.String r0 = "proto.typeAliasList"
            com.amazon.aps.iva.yb0.j.e(r4, r0)
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.g = r14
            r6.h = r15
            com.amazon.aps.iva.nd0.c r0 = r17.c()
            r6.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ce0.m.<init>(com.amazon.aps.iva.oc0.f0, com.amazon.aps.iva.id0.k, com.amazon.aps.iva.kd0.c, com.amazon.aps.iva.kd0.a, com.amazon.aps.iva.ce0.j, com.amazon.aps.iva.ae0.l, java.lang.String, com.amazon.aps.iva.xb0.a):void");
    }

    @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final Collection e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "kindFilter");
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
        Collection i = i(dVar, lVar, com.amazon.aps.iva.wc0.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<com.amazon.aps.iva.qc0.b> iterable = this.b.a.k;
        ArrayList arrayList = new ArrayList();
        for (com.amazon.aps.iva.qc0.b bVar : iterable) {
            t.d0(arrayList, bVar.c(this.i));
        }
        return x.L0(arrayList, i);
    }

    @Override // com.amazon.aps.iva.ce0.l, com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
    public final com.amazon.aps.iva.oc0.h g(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(dVar, FirebaseAnalytics.Param.LOCATION);
        com.amazon.aps.iva.vc0.a.b(this.b.a.i, dVar, this.g, fVar);
        return super.g(fVar, dVar);
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final void h(ArrayList arrayList, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "nameFilter");
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final com.amazon.aps.iva.nd0.b l(com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new com.amazon.aps.iva.nd0.b(this.i, fVar);
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final Set<com.amazon.aps.iva.nd0.f> n() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final Set<com.amazon.aps.iva.nd0.f> o() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final Set<com.amazon.aps.iva.nd0.f> p() {
        return b0.b;
    }

    @Override // com.amazon.aps.iva.ce0.l
    public final boolean q(com.amazon.aps.iva.nd0.f fVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (super.q(fVar)) {
            return true;
        }
        Iterable<com.amazon.aps.iva.qc0.b> iterable = this.b.a.k;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (com.amazon.aps.iva.qc0.b bVar : iterable) {
                if (bVar.b(this.i, fVar)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.h;
    }
}
