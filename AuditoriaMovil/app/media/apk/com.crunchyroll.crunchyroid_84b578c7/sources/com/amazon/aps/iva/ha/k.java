package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.z9.d0;
/* compiled from: Repeater.java */
/* loaded from: classes.dex */
public final class k implements b {
    public final String a;
    public final com.amazon.aps.iva.ga.b b;
    public final com.amazon.aps.iva.ga.b c;
    public final com.amazon.aps.iva.ga.k d;
    public final boolean e;

    public k(String str, com.amazon.aps.iva.ga.b bVar, com.amazon.aps.iva.ga.b bVar2, com.amazon.aps.iva.ga.k kVar, boolean z) {
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        this.d = kVar;
        this.e = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.o(d0Var, bVar, this);
    }
}
