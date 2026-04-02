package com.amazon.aps.iva.kg;

import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: DownloadingDetailsInput.kt */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final t b;

    public b(String str, t tVar) {
        j.f(str, "containerId");
        j.f(tVar, "resourceType");
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
        return "DownloadingDetailsInput(containerId=" + this.a + ", resourceType=" + this.b + ")";
    }
}
