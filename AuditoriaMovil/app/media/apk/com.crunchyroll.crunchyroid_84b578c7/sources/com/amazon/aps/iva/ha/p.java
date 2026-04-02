package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.z9.d0;
/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public final class p implements b {
    public final String a;
    public final int b;
    public final com.amazon.aps.iva.ga.g c;
    public final boolean d;

    public p(String str, int i, com.amazon.aps.iva.ga.g gVar, boolean z) {
        this.a = str;
        this.b = i;
        this.c = gVar;
        this.d = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.q(d0Var, bVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return b2.b(sb, this.b, '}');
    }
}
