package com.fyber.inneractive.sdk.player.c.d.c;

import com.fyber.inneractive.sdk.player.c.d.c.b;
import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
final class d implements b.a {
    private final long a;
    private final long b;
    private final long c;
    private final long[] d;
    private final long e;
    private final int f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(long j, long j2, long j3) {
        this(j, j2, j3, null, 0L, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
        this.e = j4;
        this.f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return this.d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        if (!b_()) {
            return this.a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.b);
        if (f > 0.0f) {
            if (f >= 100.0f) {
                r0 = 256.0f;
            } else {
                int i = (int) f;
                r0 = i != 0 ? (float) this.d[i - 1] : 0.0f;
                r0 += ((i < 99 ? (float) this.d[i] : 256.0f) - r0) * (f - i);
            }
        }
        long round = Math.round(r0 * 0.00390625d * this.e);
        long j2 = this.a;
        long j3 = round + j2;
        long j4 = this.c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - this.f) + this.e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.c.b.a
    public final long b(long j) {
        if (b_()) {
            long j2 = this.a;
            if (j >= j2) {
                double d = ((j - j2) * 256.0d) / this.e;
                int a = t.a(this.d, (long) d, false) + 1;
                long a2 = a(a);
                long j3 = a == 0 ? 0L : this.d[a - 1];
                long j4 = a == 99 ? 256L : this.d[a];
                return a2 + (j4 != j3 ? (long) (((a(a + 1) - a2) * (d - j3)) / (j4 - j3)) : 0L);
            }
        }
        return 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.b;
    }

    private long a(int i) {
        return (this.b * i) / 100;
    }
}
