package com.amazon.aps.iva.sk;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: PlayerPlayheadMonitor.kt */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final long b;
    public final boolean c;

    public b(long j, boolean z, String str) {
        j.f(str, "assetId");
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = i.a(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        return "PlayheadSave(assetId=" + this.a + ", playhead=" + this.b + ", isSuccess=" + this.c + ")";
    }
}
