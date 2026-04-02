package com.amazon.aps.iva.nx;

import com.google.gson.annotations.SerializedName;
/* compiled from: DecoderFallbackConfig.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("is_enabled")
    private final boolean a;

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.a;
        return "DecoderFallbackConfig(isEnabled=" + z + ")";
    }
}
