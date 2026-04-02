package com.amazon.aps.iva.qj;
/* compiled from: VideoStreamSession.kt */
/* loaded from: classes.dex */
public final class u {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Long h;

    public u() {
        this(0, 0, 0, 0, 0, 0, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.a == uVar.a && this.b == uVar.b && this.c == uVar.c && this.d == uVar.d && this.e == uVar.e && this.f == uVar.f && this.g == uVar.g && com.amazon.aps.iva.yb0.j.a(this.h, uVar.h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int a = com.amazon.aps.iva.a0.r.a(this.f, com.amazon.aps.iva.a0.r.a(this.e, com.amazon.aps.iva.a0.r.a(this.d, com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a + i) * 31;
        Long l = this.h;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return i2 + hashCode;
    }

    public final String toString() {
        return "VideoStreamSession(renewInSeconds=" + this.a + ", noNetworkRetryIntervalInSeconds=" + this.b + ", noNetworkTimeoutInSeconds=" + this.c + ", maximumPauseInSeconds=" + this.d + ", sessionExpirationInSeconds=" + this.e + ", endOfVideoUnloadInSeconds=" + this.f + ", usesStreamLimits=" + this.g + ", sessionCreationTimeMs=" + this.h + ')';
    }

    public u(int i, int i2, int i3, int i4, int i5, int i6, Long l, int i7) {
        i = (i7 & 1) != 0 ? 0 : i;
        i2 = (i7 & 2) != 0 ? 0 : i2;
        i3 = (i7 & 4) != 0 ? 0 : i3;
        i4 = (i7 & 8) != 0 ? 0 : i4;
        i5 = (i7 & 16) != 0 ? 0 : i5;
        i6 = (i7 & 32) != 0 ? 0 : i6;
        l = (i7 & 128) != 0 ? null : l;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = false;
        this.h = l;
    }
}
