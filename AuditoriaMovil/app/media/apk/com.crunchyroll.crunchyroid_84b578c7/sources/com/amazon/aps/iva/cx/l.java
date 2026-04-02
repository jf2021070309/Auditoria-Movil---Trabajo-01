package com.amazon.aps.iva.cx;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* compiled from: OtpConfigImpl.kt */
/* loaded from: classes2.dex */
public final class l implements com.amazon.aps.iva.vd.f {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("available_countries")
    private final String b;
    @SerializedName("sign_in_flow_update")
    private final boolean c;
    @SerializedName("account_screen_update")
    private final boolean d;

    @Override // com.amazon.aps.iva.vd.f
    public final List<String> a() {
        return com.amazon.aps.iva.oe0.q.E0(com.amazon.aps.iva.oe0.m.f0(this.b, " ", ""), new String[]{","});
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.a && com.amazon.aps.iva.yb0.j.a(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int b = com.amazon.aps.iva.c80.a.b(this.b, r0 * 31, 31);
        ?? r2 = this.c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (b + i2) * 31;
        boolean z2 = this.d;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    @Override // com.amazon.aps.iva.vd.f
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        return "OtpConfigImpl(isEnabled=" + z + ", _availableCountries=" + str + ", isSignInFlowUpdateEnabled=" + z2 + ", isAccountScreenUpdateEnabled=" + z3 + ")";
    }
}
