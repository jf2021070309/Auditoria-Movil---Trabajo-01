package com.amazon.aps.iva.oh;

import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: MarkAsWatchedData.kt */
/* loaded from: classes.dex */
public final class a {
    public final List<com.amazon.aps.iva.nz.a> a;
    public final com.amazon.aps.iva.ks.e b;

    public a(List<com.amazon.aps.iva.nz.a> list, com.amazon.aps.iva.ks.e eVar) {
        j.f(eVar, "contentMediaProperty");
        this.a = list;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkAsWatchedData(playheadUpdates=" + this.a + ", contentMediaProperty=" + this.b + ")";
    }
}
