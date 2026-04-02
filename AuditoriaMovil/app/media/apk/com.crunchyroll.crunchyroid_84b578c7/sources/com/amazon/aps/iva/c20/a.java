package com.amazon.aps.iva.c20;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.vn.c;
import com.amazon.aps.iva.vw.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: CrStoreConfigImpl.kt */
/* loaded from: classes2.dex */
public final class a implements c {
    @SerializedName("is_enabled")
    private final boolean b;
    @SerializedName("store_url")
    private final String c;
    @SerializedName("experiment_name")
    private final String d;
    @SerializedName("experiment_id")
    private final String e;
    @SerializedName("variation_name")
    private final String f;
    @SerializedName("variation_id")
    private final String g;

    @Override // com.amazon.aps.iva.vw.a
    public final String L() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String M() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.vn.c
    public final String c0() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == aVar.b && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && j.a(this.g, aVar.g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.b;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.g.hashCode() + com.amazon.aps.iva.c80.a.b(this.f, com.amazon.aps.iva.c80.a.b(this.e, com.amazon.aps.iva.c80.a.b(this.d, com.amazon.aps.iva.c80.a.b(this.c, r0 * 31, 31), 31), 31), 31);
    }

    @Override // com.amazon.aps.iva.vn.c
    public final boolean isEnabled() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String j0() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.vw.a
    public final String l0() {
        return this.f;
    }

    public final String toString() {
        boolean z = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        StringBuilder sb = new StringBuilder("CrStoreConfigImpl(isEnabled=");
        sb.append(z);
        sb.append(", storeUrl=");
        sb.append(str);
        sb.append(", experimentName=");
        com.amazon.aps.iva.m80.a.c(sb, str2, ", experimentId=", str3, ", variationName=");
        return f.a(sb, str4, ", variationId=", str5, ")");
    }

    @Override // com.amazon.aps.iva.vw.a
    public final g y() {
        return a.C0810a.a(this);
    }
}
