package com.amazon.aps.iva.wo;
/* compiled from: WatchScreenAssetsAdapterModel.kt */
/* loaded from: classes2.dex */
public final class i implements g {
    public final String b;
    public final int c;

    public i(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, iVar.b) && this.c == iVar.c) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wo.g
    public final String getAdapterId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "WatchScreenAssetsHeaderAdapterModel(adapterId=" + this.b + ", title=" + this.c + ")";
    }
}
