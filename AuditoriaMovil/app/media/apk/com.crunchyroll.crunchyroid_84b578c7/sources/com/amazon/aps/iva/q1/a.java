package com.amazon.aps.iva.q1;

import com.amazon.aps.iva.q.c0;
/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class a {
    public long a;
    public float b;

    public a(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && Float.compare(this.b, aVar.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return c0.b(sb, this.b, ')');
    }
}
