package com.amazon.aps.iva.kg;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DownloadingDetails.kt */
/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;
    public final t c;

    public a(int i, long j, t tVar) {
        j.f(tVar, "resourceType");
        this.a = i;
        this.b = j;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + i.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "DownloadingDetails(downloadedCount=" + this.a + ", downloadedBytesSize=" + this.b + ", resourceType=" + this.c + ")";
    }
}
