package com.amazon.aps.iva.b8;

import android.os.Bundle;
import com.amazon.aps.iva.q5.l0;
import com.google.common.base.Objects;
/* compiled from: SessionPositionInfo.java */
/* loaded from: classes.dex */
public final class z1 implements com.amazon.aps.iva.q5.k {
    public static final l0.d l;
    public static final z1 m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final com.amazon.aps.iva.g1.n x;
    public final l0.d b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;

    static {
        l0.d dVar = new l0.d(null, 0, null, null, 0, 0L, 0L, -1, -1);
        l = dVar;
        m = new z1(dVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        n = com.amazon.aps.iva.t5.g0.L(0);
        o = com.amazon.aps.iva.t5.g0.L(1);
        p = com.amazon.aps.iva.t5.g0.L(2);
        q = com.amazon.aps.iva.t5.g0.L(3);
        r = com.amazon.aps.iva.t5.g0.L(4);
        s = com.amazon.aps.iva.t5.g0.L(5);
        t = com.amazon.aps.iva.t5.g0.L(6);
        u = com.amazon.aps.iva.t5.g0.L(7);
        v = com.amazon.aps.iva.t5.g0.L(8);
        w = com.amazon.aps.iva.t5.g0.L(9);
        x = new com.amazon.aps.iva.g1.n(11);
    }

    public z1(l0.d dVar, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        boolean z2;
        if (dVar.i != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.t(z == z2);
        this.b = dVar;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = i;
        this.h = j4;
        this.i = j5;
        this.j = j6;
        this.k = j7;
    }

    public final Bundle a(boolean z, boolean z2) {
        boolean z3;
        long j;
        long j2;
        long j3;
        long j4;
        Bundle bundle = new Bundle();
        bundle.putBundle(n, this.b.a(z, z2));
        int i = 0;
        if (z && this.c) {
            z3 = true;
        } else {
            z3 = false;
        }
        bundle.putBoolean(o, z3);
        bundle.putLong(p, this.d);
        long j5 = -9223372036854775807L;
        if (z) {
            j = this.e;
        } else {
            j = -9223372036854775807L;
        }
        bundle.putLong(q, j);
        long j6 = 0;
        if (z) {
            j2 = this.f;
        } else {
            j2 = 0;
        }
        bundle.putLong(r, j2);
        if (z) {
            i = this.g;
        }
        bundle.putInt(s, i);
        if (z) {
            j3 = this.h;
        } else {
            j3 = 0;
        }
        bundle.putLong(t, j3);
        if (z) {
            j4 = this.i;
        } else {
            j4 = -9223372036854775807L;
        }
        bundle.putLong(u, j4);
        if (z) {
            j5 = this.j;
        }
        bundle.putLong(v, j5);
        if (z) {
            j6 = this.k;
        }
        bundle.putLong(w, j6);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        if (this.b.equals(z1Var.b) && this.c == z1Var.c && this.d == z1Var.d && this.e == z1Var.e && this.f == z1Var.f && this.g == z1Var.g && this.h == z1Var.h && this.i == z1Var.i && this.j == z1Var.j && this.k == z1Var.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, Boolean.valueOf(this.c));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        return a(true, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        l0.d dVar = this.b;
        sb.append(dVar.c);
        sb.append(", periodIndex=");
        sb.append(dVar.f);
        sb.append(", positionMs=");
        sb.append(dVar.g);
        sb.append(", contentPositionMs=");
        sb.append(dVar.h);
        sb.append(", adGroupIndex=");
        sb.append(dVar.i);
        sb.append(", adIndexInAdGroup=");
        sb.append(dVar.j);
        sb.append("}, isPlayingAd=");
        sb.append(this.c);
        sb.append(", eventTimeMs=");
        sb.append(this.d);
        sb.append(", durationMs=");
        sb.append(this.e);
        sb.append(", bufferedPositionMs=");
        sb.append(this.f);
        sb.append(", bufferedPercentage=");
        sb.append(this.g);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.h);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.i);
        sb.append(", contentDurationMs=");
        sb.append(this.j);
        sb.append(", contentBufferedPositionMs=");
        return com.amazon.aps.iva.c.b.b(sb, this.k, "}");
    }
}
