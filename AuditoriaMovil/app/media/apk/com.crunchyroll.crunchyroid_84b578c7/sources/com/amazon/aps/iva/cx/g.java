package com.amazon.aps.iva.cx;

import com.amazon.aps.iva.e4.t0;
import com.google.gson.annotations.SerializedName;
/* compiled from: DatadogConfigImpl.kt */
/* loaded from: classes2.dex */
public final class g {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("sample_rum_sessions")
    private final float b;
    @SerializedName("track_background_rum")
    private final boolean c;

    public final float a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.a == gVar.a && Float.compare(this.b, gVar.b) == 0 && this.c == gVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int b = t0.b(this.b, r0 * 31, 31);
        boolean z2 = this.c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return b + i;
    }

    public final String toString() {
        boolean z = this.a;
        float f = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder("DatadogConfigImpl(isEnabled=");
        sb.append(z);
        sb.append(", sampleRumSessions=");
        sb.append(f);
        sb.append(", trackBackgroundRumEvents=");
        return com.amazon.aps.iva.e4.e.c(sb, z2, ")");
    }
}
