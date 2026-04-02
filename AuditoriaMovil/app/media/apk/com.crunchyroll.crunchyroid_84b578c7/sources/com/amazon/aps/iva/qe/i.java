package com.amazon.aps.iva.qe;

import com.crunchyroll.crunchyroid.R;
/* compiled from: InGraceNotificationInput.kt */
/* loaded from: classes.dex */
public final class i extends d {
    public final long f;
    public final boolean g;

    public i(long j, boolean z) {
        super(R.string.in_grace_start_notification_title, R.string.in_grace_start_notification_subtitle, j, z);
        this.f = j;
        this.g = z;
    }

    @Override // com.amazon.aps.iva.qe.d
    public final long a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.qe.d
    public final boolean b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f == iVar.f && this.g == iVar.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = Long.hashCode(this.f) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "InGracePeriodStartNotification(timeLeftMs=" + this.f + ", isFinalNotificationEnabled=" + this.g + ")";
    }
}
