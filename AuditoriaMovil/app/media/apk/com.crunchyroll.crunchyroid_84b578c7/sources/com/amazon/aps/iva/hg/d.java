package com.amazon.aps.iva.hg;
/* compiled from: BulkDownload.kt */
/* loaded from: classes.dex */
public final class d {
    public final int a;
    public final int b;

    public d() {
        this(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulkDownloadWatchedInfo(watchedAssetsCount=");
        sb.append(this.a);
        sb.append(", unwatchedAssetCount=");
        return defpackage.e.f(sb, this.b, ")");
    }

    public d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
