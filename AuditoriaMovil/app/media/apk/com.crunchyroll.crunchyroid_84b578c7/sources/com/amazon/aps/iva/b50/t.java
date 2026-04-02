package com.amazon.aps.iva.b50;
/* compiled from: WatchlistCardMenuProvider.kt */
/* loaded from: classes2.dex */
public final class t {
    public final com.amazon.aps.iva.b60.k a;
    public final int b;

    public t(com.amazon.aps.iva.b60.k kVar, int i) {
        this.a = kVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && this.b == tVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WatchlistItemMenuData(watchlistItem=" + this.a + ", position=" + this.b + ")";
    }
}
