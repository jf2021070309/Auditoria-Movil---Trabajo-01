package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.oc0.t0;
/* compiled from: ClassData.kt */
/* loaded from: classes4.dex */
public final class h {
    public final com.amazon.aps.iva.kd0.c a;
    public final com.amazon.aps.iva.id0.b b;
    public final com.amazon.aps.iva.kd0.a c;
    public final t0 d;

    public h(com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.id0.b bVar, com.amazon.aps.iva.kd0.a aVar, t0 t0Var) {
        com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
        com.amazon.aps.iva.yb0.j.f(bVar, "classProto");
        com.amazon.aps.iva.yb0.j.f(aVar, "metadataVersion");
        com.amazon.aps.iva.yb0.j.f(t0Var, "sourceElement");
        this.a = cVar;
        this.b = bVar;
        this.c = aVar;
        this.d = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, hVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
