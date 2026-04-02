package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: AccountDeletionConfig.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("external_url")
    private final String b;

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        return "AccountDeletionConfigImpl(isEnabled=" + z + ", externalUrl=" + str + ")";
    }
}
