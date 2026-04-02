package com.amazon.aps.iva.wv;

import com.google.gson.annotations.SerializedName;
/* compiled from: DownloadHistoryCache.kt */
/* loaded from: classes2.dex */
public final class i {
    @SerializedName("a")
    private final String a;
    @SerializedName("b")
    private final long b;

    public i(String str, long j) {
        com.amazon.aps.iva.yb0.j.f(str, "panelId");
        this.a = str;
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && this.b == iVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        return "DownloadHistoryRecord(panelId=" + str + ", date=" + j + ")";
    }
}
