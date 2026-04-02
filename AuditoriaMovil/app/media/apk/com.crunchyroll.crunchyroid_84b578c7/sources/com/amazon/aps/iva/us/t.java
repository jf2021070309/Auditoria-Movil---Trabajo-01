package com.amazon.aps.iva.us;

import com.google.gson.annotations.SerializedName;
/* compiled from: SingularConfig.kt */
/* loaded from: classes2.dex */
public final class t {
    @SerializedName("is_enabled")
    private final boolean a;

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && this.a == ((t) obj).a) {
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
        return "SingularConfig(isEnabled=" + z + ")";
    }
}
