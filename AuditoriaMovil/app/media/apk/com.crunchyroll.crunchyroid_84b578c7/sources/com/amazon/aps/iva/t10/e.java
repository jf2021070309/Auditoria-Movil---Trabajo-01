package com.amazon.aps.iva.t10;

import com.amazon.aps.iva.yb0.j;
/* compiled from: HistoryDataSourceFactory.kt */
/* loaded from: classes2.dex */
public final class e {
    public final String a;
    public final int b;

    public e(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.a, eVar.a) && this.b == eVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "HistoryModel(nextUrlHref=" + this.a + ", total=" + this.b + ")";
    }
}
