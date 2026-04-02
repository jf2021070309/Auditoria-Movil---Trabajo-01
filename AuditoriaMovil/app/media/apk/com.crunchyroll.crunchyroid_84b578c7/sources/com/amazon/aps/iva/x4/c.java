package com.amazon.aps.iva.x4;

import com.amazon.aps.iva.f1.x;
/* compiled from: ColorProvider.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.b5.a {
    public final long a;
    public final long b;

    public c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (x.c(this.a, cVar.a) && x.c(this.b, cVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = x.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DayNightColorProvider(day=" + ((Object) x.i(this.a)) + ", night=" + ((Object) x.i(this.b)) + ')';
    }
}
