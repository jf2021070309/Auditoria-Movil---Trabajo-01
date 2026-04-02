package com.amazon.aps.iva.c1;

import com.amazon.aps.iva.kb0.q;
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class e implements com.amazon.aps.iva.o2.c {
    public a b = k.b;
    public i c;

    @Override // com.amazon.aps.iva.o2.c
    public final float O0() {
        return this.b.getDensity().O0();
    }

    public final i b(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.h1.c, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        i iVar = new i(lVar);
        this.c = iVar;
        return iVar;
    }

    @Override // com.amazon.aps.iva.o2.c
    public final float getDensity() {
        return this.b.getDensity().getDensity();
    }

    public final long h() {
        return this.b.h();
    }
}
