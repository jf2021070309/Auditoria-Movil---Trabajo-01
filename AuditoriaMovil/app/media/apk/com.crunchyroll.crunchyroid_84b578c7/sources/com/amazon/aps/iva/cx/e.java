package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: BulkSyncConfigImpl.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.u00.q {
    @SerializedName("is_enabled")
    private final boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.a == ((e) obj).a) {
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

    @Override // com.amazon.aps.iva.u00.q
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        return "BulkSyncConfigImpl(isEnabled=" + z + ")";
    }
}
