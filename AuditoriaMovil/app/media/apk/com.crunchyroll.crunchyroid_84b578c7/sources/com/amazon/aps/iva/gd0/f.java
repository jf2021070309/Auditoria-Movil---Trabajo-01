package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.w;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.md0.d;
import com.amazon.aps.iva.od0.h;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: AbstractBinaryClassAnnotationLoader.kt */
/* loaded from: classes4.dex */
public final class f {
    public static final w a(com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
        h.f<com.amazon.aps.iva.id0.m, a.c> fVar = com.amazon.aps.iva.ld0.a.d;
        com.amazon.aps.iva.yb0.j.e(fVar, "propertySignature");
        a.c cVar2 = (a.c) com.amazon.aps.iva.kd0.e.a(mVar, fVar);
        if (cVar2 == null) {
            return null;
        }
        if (z) {
            d.a b = com.amazon.aps.iva.md0.h.b(mVar, cVar, gVar, z3);
            if (b == null) {
                return null;
            }
            return w.a.a(b);
        }
        if (z2) {
            if ((cVar2.c & 2) == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                a.b bVar = cVar2.e;
                com.amazon.aps.iva.yb0.j.e(bVar, "signature.syntheticMethod");
                String string = cVar.getString(bVar.d);
                String string2 = cVar.getString(bVar.e);
                com.amazon.aps.iva.yb0.j.f(string, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(string2, "desc");
                return new w(string.concat(string2));
            }
        }
        return null;
    }

    public static /* synthetic */ w b(com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, boolean z, boolean z2, int i) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 32) != 0) {
            z5 = true;
        }
        return a(mVar, cVar, gVar, z3, z4, z5);
    }
}
