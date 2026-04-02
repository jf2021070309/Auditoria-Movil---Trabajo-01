package com.amazon.aps.iva.b20;

import com.google.gson.annotations.SerializedName;
/* compiled from: SimulcastConfig.kt */
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("version")
    private final b a;

    public final b a() {
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
        return this.a.hashCode();
    }

    public final String toString() {
        b bVar = this.a;
        return "SimulcastConfigImpl(version=" + bVar + ")";
    }
}
