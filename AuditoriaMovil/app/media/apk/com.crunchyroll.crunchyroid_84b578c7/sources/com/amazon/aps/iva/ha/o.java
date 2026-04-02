package com.amazon.aps.iva.ha;

import com.amazon.aps.iva.z9.d0;
import java.util.Arrays;
import java.util.List;
/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public final class o implements b {
    public final String a;
    public final List<b> b;
    public final boolean c;

    public o(String str, List<b> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.ha.b
    public final com.amazon.aps.iva.ba.b a(d0 d0Var, com.amazon.aps.iva.z9.h hVar, com.amazon.aps.iva.ia.b bVar) {
        return new com.amazon.aps.iva.ba.c(d0Var, bVar, this, hVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
