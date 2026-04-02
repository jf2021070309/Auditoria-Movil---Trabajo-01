package com.amazon.aps.iva.ys;

import com.google.gson.annotations.SerializedName;
/* compiled from: UserInteractionTrackerConfig.kt */
/* loaded from: classes2.dex */
public final class s {
    @SerializedName("is_enabled")
    private final boolean a;

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && this.a == ((s) obj).a) {
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
        return "UserInteractionTrackerConfig(isEnabled=" + z + ")";
    }
}
