package com.amazon.aps.iva.l50;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: WatchMusicInput.kt */
/* loaded from: classes2.dex */
public final class c implements Serializable {
    public final String b;
    public final t c;
    public final long d;

    public c(String str, t tVar) {
        j.f(str, "assetId");
        j.f(tVar, "assetType");
        this.b = str;
        this.c = tVar;
        this.d = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (j.a(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + l1.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchMusicInput(assetId=");
        sb.append(this.b);
        sb.append(", assetType=");
        sb.append(this.c);
        sb.append(", playheadSec=");
        return com.amazon.aps.iva.c.b.b(sb, this.d, ")");
    }
}
