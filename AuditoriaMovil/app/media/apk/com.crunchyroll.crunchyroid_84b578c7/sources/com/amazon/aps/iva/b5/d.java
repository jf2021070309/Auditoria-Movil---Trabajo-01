package com.amazon.aps.iva.b5;

import com.amazon.aps.iva.f1.x;
/* compiled from: ColorProvider.kt */
/* loaded from: classes.dex */
public final class d implements a {
    public final long a;

    public d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && x.c(this.a, ((d) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = x.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) x.i(this.a)) + ')';
    }
}
