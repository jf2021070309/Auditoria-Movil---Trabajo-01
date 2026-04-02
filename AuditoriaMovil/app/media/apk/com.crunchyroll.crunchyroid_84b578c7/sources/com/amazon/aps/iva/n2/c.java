package com.amazon.aps.iva.n2;

import com.amazon.aps.iva.f1.s;
import com.amazon.aps.iva.f1.x;
/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final class c implements k {
    public final long a;

    public c(long j) {
        boolean z;
        this.a = j;
        if (j != x.g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
    }

    @Override // com.amazon.aps.iva.n2.k
    public final float a() {
        return x.d(this.a);
    }

    @Override // com.amazon.aps.iva.n2.k
    public final long b() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.n2.k
    public final s d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && x.c(this.a, ((c) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = x.h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) x.i(this.a)) + ')';
    }
}
