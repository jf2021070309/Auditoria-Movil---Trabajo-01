package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
/* compiled from: WhatsAppHelpConfigImpl.kt */
/* loaded from: classes2.dex */
public final class t implements com.amazon.aps.iva.qd.b {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("whatsapp_url")
    private final String b;

    @Override // com.amazon.aps.iva.qd.b
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.a == tVar.a && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.b.hashCode() + (r0 * 31);
    }

    @Override // com.amazon.aps.iva.qd.b
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        return "WhatsAppHelpConfigImpl(isEnabled=" + z + ", helpUrl=" + str + ")";
    }
}
