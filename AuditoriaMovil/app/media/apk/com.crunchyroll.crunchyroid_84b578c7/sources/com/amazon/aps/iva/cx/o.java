package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: PreselectedTierConfigImpl.kt */
/* loaded from: classes2.dex */
public final class o implements com.amazon.aps.iva.wh.c {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("tier")
    private final com.amazon.aps.iva.wh.b b;

    @Override // com.amazon.aps.iva.wh.c
    public final com.amazon.aps.iva.wh.b a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a == oVar.a && this.b == oVar.b) {
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

    @Override // com.amazon.aps.iva.wh.c
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        com.amazon.aps.iva.wh.b bVar = this.b;
        return "PreselectedTierConfigImpl(isEnabled=" + z + ", preselectedTier=" + bVar + ")";
    }
}
