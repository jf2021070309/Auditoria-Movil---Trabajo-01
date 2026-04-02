package com.amazon.aps.iva.jx;

import com.amazon.aps.iva.a0.r;
import com.google.gson.annotations.SerializedName;
/* compiled from: InAppReviewConfigImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.ch.a {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("interval_between_attempts_min")
    private final int b;
    @SerializedName("app_launches_count_trigger")
    private final int c;
    @SerializedName("app_launches_period_trigger_min")
    private final int d;

    @Override // com.amazon.aps.iva.ch.a
    public final int a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ch.a
    public final int b() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.ch.a
    public final int c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d) {
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
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return Integer.hashCode(this.d) + r.a(this.c, r.a(this.b, r0 * 31, 31), 31);
    }

    @Override // com.amazon.aps.iva.ch.a
    public final boolean isEnabled() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "InAppReviewConfigImpl(isEnabled=" + z + ", intervalBetweenAttemptsMin=" + i + ", appLaunchesCountTrigger=" + i2 + ", appLaunchesPeriodTriggerMin=" + i3 + ")";
    }
}
