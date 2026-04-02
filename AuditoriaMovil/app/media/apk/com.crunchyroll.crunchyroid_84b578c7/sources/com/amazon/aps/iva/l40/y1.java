package com.amazon.aps.iva.l40;
/* compiled from: ShowPageViewModel.kt */
/* loaded from: classes2.dex */
public final class y1 {
    public final String a;
    public final com.amazon.aps.iva.qz.a b;

    public y1(String str, com.amazon.aps.iva.qz.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "assets");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, y1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, y1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoredAssetListData(listingId=" + this.a + ", assets=" + this.b + ")";
    }
}
