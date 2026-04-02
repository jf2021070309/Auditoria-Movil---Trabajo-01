package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class x {
    public static final com.amazon.aps.iva.d0.p1 a;
    public static final float b = 64;
    public static final float c = 36;
    public static final com.amazon.aps.iva.d0.p1 d;

    static {
        float f = 16;
        float f2 = 8;
        a = new com.amazon.aps.iva.d0.p1(f, f2, f, f2);
        d = new com.amazon.aps.iva.d0.p1(f2, f2, f2, f2);
    }

    public static g0 a(long j, long j2, com.amazon.aps.iva.o0.i iVar, int i, int i2) {
        long j3;
        long j4;
        iVar.s(1870371134);
        if ((i2 & 1) != 0) {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            j = ((c0) iVar.i(d0.a)).f();
        }
        long j5 = j;
        if ((i2 & 2) != 0) {
            j3 = d0.b(j5, iVar);
        } else {
            j3 = 0;
        }
        if ((i2 & 4) != 0) {
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
            com.amazon.aps.iva.o0.q3 q3Var = d0.a;
            j2 = defpackage.i.o(com.amazon.aps.iva.f1.x.b(((c0) iVar.i(q3Var)).e(), 0.12f), ((c0) iVar.i(q3Var)).h());
        }
        long j6 = j2;
        if ((i2 & 8) != 0) {
            e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
            j4 = com.amazon.aps.iva.f1.x.b(((c0) iVar.i(d0.a)).e(), com.amazon.aps.iva.hc.m.k(iVar));
        } else {
            j4 = 0;
        }
        e0.b bVar4 = com.amazon.aps.iva.o0.e0.a;
        g0 g0Var = new g0(j5, j3, j6, j4);
        iVar.G();
        return g0Var;
    }

    public static g0 b(long j, com.amazon.aps.iva.o0.i iVar, int i) {
        long j2;
        long j3;
        iVar.s(182742216);
        long j4 = 0;
        if ((i & 1) != 0) {
            j2 = com.amazon.aps.iva.f1.x.f;
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            j3 = ((c0) iVar.i(d0.a)).f();
        } else {
            j3 = j;
        }
        if ((i & 4) != 0) {
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
            j4 = com.amazon.aps.iva.f1.x.b(((c0) iVar.i(d0.a)).e(), com.amazon.aps.iva.hc.m.k(iVar));
        }
        e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
        g0 g0Var = new g0(j2, j3, j2, j4);
        iVar.G();
        return g0Var;
    }
}
