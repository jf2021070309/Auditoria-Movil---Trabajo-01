package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.h2.k;
/* compiled from: Paragraph.kt */
/* loaded from: classes.dex */
public final class m {
    public static a a(String str, a0 a0Var, long j, com.amazon.aps.iva.o2.c cVar, k.a aVar, com.amazon.aps.iva.lb0.z zVar, int i, int i2) {
        com.amazon.aps.iva.lb0.z zVar2;
        int i3;
        int i4 = i2 & 32;
        com.amazon.aps.iva.lb0.z zVar3 = com.amazon.aps.iva.lb0.z.b;
        if (i4 != 0) {
            zVar2 = zVar3;
        } else {
            zVar2 = zVar;
        }
        if ((i2 & 64) == 0) {
            zVar3 = null;
        }
        com.amazon.aps.iva.lb0.z zVar4 = zVar3;
        if ((i2 & 128) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = i;
        }
        com.amazon.aps.iva.yb0.j.f(str, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        com.amazon.aps.iva.yb0.j.f(zVar2, "spanStyles");
        com.amazon.aps.iva.yb0.j.f(zVar4, "placeholders");
        return new a(new com.amazon.aps.iva.k2.d(a0Var, aVar, cVar, str, zVar2, zVar4), i3, false, j);
    }
}
