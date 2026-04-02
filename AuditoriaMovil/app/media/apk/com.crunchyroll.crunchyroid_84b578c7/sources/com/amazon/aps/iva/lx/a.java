package com.amazon.aps.iva.lx;

import com.google.gson.annotations.SerializedName;
/* compiled from: BrowseMusicConfigImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.bi.a {
    @SerializedName("is_enabled")
    private final boolean a;

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

    @Override // com.amazon.aps.iva.bi.a
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        return "BrowseMusicConfigImpl(isEnabled=" + z + ")";
    }
}
