package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.o0.e0;
/* compiled from: MaterialTheme.kt */
/* loaded from: classes.dex */
public final class z0 implements com.amazon.aps.iva.n0.r {
    public static final z0 a = new z0();

    @Override // com.amazon.aps.iva.n0.r
    public final com.amazon.aps.iva.n0.h a(com.amazon.aps.iva.o0.i iVar) {
        com.amazon.aps.iva.n0.h hVar;
        iVar.s(-1419762518);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        long j = ((com.amazon.aps.iva.f1.x) iVar.i(f0.a)).a;
        if (((c0) iVar.i(d0.a)).i()) {
            if (defpackage.i.y(j) > 0.5d) {
                hVar = com.amazon.aps.iva.n0.s.b;
            } else {
                hVar = com.amazon.aps.iva.n0.s.c;
            }
        } else {
            hVar = com.amazon.aps.iva.n0.s.d;
        }
        iVar.G();
        return hVar;
    }

    @Override // com.amazon.aps.iva.n0.r
    public final long b(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(550536719);
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        long j = ((com.amazon.aps.iva.f1.x) iVar.i(f0.a)).a;
        boolean i = ((c0) iVar.i(d0.a)).i();
        float y = defpackage.i.y(j);
        if (!i && y < 0.5d) {
            j = com.amazon.aps.iva.f1.x.c;
        }
        iVar.G();
        return j;
    }
}
