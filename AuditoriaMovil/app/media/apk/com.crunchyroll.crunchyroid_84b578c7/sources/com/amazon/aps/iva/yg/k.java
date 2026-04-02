package com.amazon.aps.iva.yg;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: EmailVerificationTimestamp.kt */
/* loaded from: classes.dex */
public final class k implements Serializable {
    @SerializedName("timestamp")
    private final long b;
    @SerializedName("id")
    private final String c = "";

    public k(long j) {
        this.b = j;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.b == kVar.b && com.amazon.aps.iva.yb0.j.a(this.c, kVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        long j = this.b;
        String str = this.c;
        return "EmailVerificationTimestamp(timestamp=" + j + ", id=" + str + ")";
    }
}
