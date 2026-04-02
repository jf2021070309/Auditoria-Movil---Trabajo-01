package com.amazon.aps.iva.gm;
/* compiled from: AssetSelectionScreen.kt */
/* loaded from: classes2.dex */
public final class y {
    public final com.amazon.aps.iva.ez.g<com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e>> a;
    public final com.amazon.aps.iva.dn.e b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public y(com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.pe0.a<com.amazon.aps.iva.hm.e>> gVar, com.amazon.aps.iva.dn.e eVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(gVar, "assetsCollections");
        com.amazon.aps.iva.yb0.j.f(eVar, "profileHeaderData");
        this.a = gVar;
        this.b = eVar;
        this.c = z;
    }

    public static y a(y yVar, com.amazon.aps.iva.ez.g gVar) {
        com.amazon.aps.iva.dn.e eVar = yVar.b;
        boolean z = yVar.c;
        yVar.getClass();
        com.amazon.aps.iva.yb0.j.f(eVar, "profileHeaderData");
        return new y(gVar, eVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && this.c == yVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetSelectionState(assetsCollections=");
        sb.append(this.a);
        sb.append(", profileHeaderData=");
        sb.append(this.b);
        sb.append(", isDoneButtonEnabled=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, ")");
    }
}
