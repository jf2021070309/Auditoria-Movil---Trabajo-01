package com.amazon.aps.iva.rl;

import com.amazon.aps.iva.a0.r;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
/* compiled from: PreferredQualityData.kt */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    @SerializedName("isAuto")
    private final boolean b;
    @SerializedName("width")
    private final int c;
    @SerializedName("height")
    private final int d;
    @SerializedName("bitrate")
    private final int e;

    public a(int i, int i2, int i3, boolean z) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
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
        if (this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.b;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.e) + r.a(this.d, r.a(this.c, r0 * 31, 31), 31);
    }

    public final String toString() {
        boolean z = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        return "PreferredQualityData(isAuto=" + z + ", width=" + i + ", height=" + i2 + ", bitrate=" + i3 + ")";
    }
}
