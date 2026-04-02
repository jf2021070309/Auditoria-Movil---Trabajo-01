package com.amazon.aps.iva.kx;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.b8.i;
import com.google.gson.annotations.SerializedName;
/* compiled from: InAppUpdatesConfigImpl.kt */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.my.a {
    @SerializedName("is_enabled")
    private final boolean a;
    @SerializedName("client_version_staleness_days")
    private final int b;
    @SerializedName("update_reminder_interval_sec")
    private final long c;
    @SerializedName("background_install_delay_sec")
    private final long d;

    @Override // com.amazon.aps.iva.my.a
    public final long a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.my.a
    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
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
        return Long.hashCode(this.d) + i.a(this.c, r.a(this.b, r0 * 31, 31), 31);
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        long j = this.c;
        long j2 = this.d;
        return "InAppUpdatesConfigImpl(isEnabled=" + z + ", clientVersionStalenessDays=" + i + ", updateReminderIntervalSec=" + j + ", backgroundInstallDelaySec=" + j2 + ")";
    }
}
