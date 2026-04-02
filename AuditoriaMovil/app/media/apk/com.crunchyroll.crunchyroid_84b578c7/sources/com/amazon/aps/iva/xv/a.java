package com.amazon.aps.iva.xv;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
/* compiled from: AssetSyncQuality.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("asset_id")
    private final String a;
    @SerializedName("quality")
    private final int b;

    public a(String str, int i) {
        j.f(str, "assetId");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
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
        if (j.a(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        return "AssetSyncQuality(assetId=" + str + ", quality=" + i + ")";
    }
}
