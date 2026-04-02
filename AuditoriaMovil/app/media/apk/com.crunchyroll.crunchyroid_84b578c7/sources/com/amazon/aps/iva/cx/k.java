package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: MembershipCardConfigImpl.kt */
/* loaded from: classes2.dex */
public final class k implements com.amazon.aps.iva.th.a {
    public static final a b = new a();
    @SerializedName("is_enabled")
    private final boolean a;

    /* compiled from: MembershipCardConfigImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && this.a == ((k) obj).a) {
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

    @Override // com.amazon.aps.iva.th.a
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        return "MembershipCardConfigImpl(isEnabled=" + z + ")";
    }
}
