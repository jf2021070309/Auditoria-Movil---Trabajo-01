package com.amazon.aps.iva.li;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: WatchMusicAnalyticsFailureData.kt */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final t b;

    public b(String str, t tVar) {
        j.f(str, "assetId");
        j.f(tVar, "assetType");
        this.a = str;
        this.b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && this.b == bVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WatchMusicAnalyticsFailureData(assetId=" + this.a + ", assetType=" + this.b + ")";
    }
}
