package com.amazon.aps.iva.t10;

import com.amazon.aps.iva.r10.a0;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: HistoryInitialData.kt */
/* loaded from: classes2.dex */
public final class d {
    public final List<a0> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends a0> list, String str) {
        j.f(list, "initialList");
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.a, dVar.a) && j.a(this.b, dVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "HistoryInitialData(initialList=" + this.a + ", nextPageUrl=" + this.b + ")";
    }
}
