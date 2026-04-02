package com.amazon.aps.iva.lm;
/* compiled from: ManageProfileScreen.kt */
/* loaded from: classes2.dex */
public final class f {
    public final com.amazon.aps.iva.mm.b a;
    public final com.amazon.aps.iva.dn.e b;

    public f(com.amazon.aps.iva.mm.b bVar, com.amazon.aps.iva.dn.e eVar) {
        this.a = bVar;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, fVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ManageProfileState(data=" + this.a + ", profileHeaderData=" + this.b + ")";
    }
}
