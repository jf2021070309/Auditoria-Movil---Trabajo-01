package com.amazon.aps.iva.ew;

import com.google.gson.annotations.SerializedName;
/* compiled from: ContentExpiration.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("a")
    private final String a;
    @SerializedName("b")
    private final long b;

    public a(String str, long j) {
        com.amazon.aps.iva.yb0.j.f(str, "contentId");
        this.a = str;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && this.b == aVar.b) {
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
        return "ContentExpiration(contentId=" + str + ", expirationDate=" + j + ")";
    }
}
