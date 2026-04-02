package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: ElevationOverlay.kt */
/* loaded from: classes.dex */
public final class l0 implements r0 {
    public static final l0 a = new l0();

    @Override // com.amazon.aps.iva.m0.r0
    public final long a(long j, float f, com.amazon.aps.iva.o0.i iVar, int i) {
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        c0 c0Var = (c0) iVar.i(d0.a);
        if (Float.compare(f, 0) > 0 && !c0Var.i()) {
            com.amazon.aps.iva.o0.q3 q3Var = s0.a;
            return defpackage.i.o(com.amazon.aps.iva.f1.x.b(d0.b(j, iVar), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j);
        }
        return j;
    }
}
