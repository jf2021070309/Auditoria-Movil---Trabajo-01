package com.amazon.aps.iva.x90;

import com.amazon.aps.iva.yb0.j;
/* compiled from: Clock.kt */
/* loaded from: classes4.dex */
public final class d {
    public final long a;
    public final Long b;

    public d(Long l, long j) {
        this.a = j;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.a != dVar.a || !j.a(this.b, dVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.b;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return "KronosTime(posixTimeMs=" + this.a + ", timeSinceLastNtpSyncMs=" + this.b + ")";
    }
}
