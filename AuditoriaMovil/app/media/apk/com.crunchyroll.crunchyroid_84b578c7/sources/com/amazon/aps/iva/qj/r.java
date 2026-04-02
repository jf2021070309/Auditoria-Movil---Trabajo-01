package com.amazon.aps.iva.qj;

import com.amazon.aps.iva.o0.t1;
/* compiled from: VideoSkipEvents.kt */
/* loaded from: classes.dex */
public final class r {
    public final long a;
    public final long b;
    public final s c;
    public final String d;

    public r(long j, long j2, s sVar) {
        com.amazon.aps.iva.yb0.j.f(sVar, "skipEventType");
        this.a = j;
        this.b = j2;
        this.c = sVar;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.a && this.b == rVar.b && this.c == rVar.c && com.amazon.aps.iva.yb0.j.a(this.d, rVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + com.amazon.aps.iva.b8.i.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSkipEvent(endMs=");
        sb.append(this.a);
        sb.append(", startMs=");
        sb.append(this.b);
        sb.append(", skipEventType=");
        sb.append(this.c);
        sb.append(", approverId=");
        return t1.b(sb, this.d, ')');
    }
}
