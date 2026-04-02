package com.amazon.aps.iva.kv;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: CrunchylistSearchInitialData.kt */
/* loaded from: classes2.dex */
public final class e {
    public final List<com.amazon.aps.iva.iv.b> a;
    public final int b;
    public final int c;

    public e(int i, int i2, List list) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + r.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrunchylistSearchInitialData(initialList=");
        sb.append(this.a);
        sb.append(", resultsPerPage=");
        sb.append(this.b);
        sb.append(", totalCount=");
        return defpackage.e.f(sb, this.c, ")");
    }
}
