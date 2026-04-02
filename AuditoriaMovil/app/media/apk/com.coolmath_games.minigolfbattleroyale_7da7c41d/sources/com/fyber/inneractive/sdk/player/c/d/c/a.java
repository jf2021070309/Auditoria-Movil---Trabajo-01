package com.fyber.inneractive.sdk.player.c.d.c;

import com.fyber.inneractive.sdk.player.c.d.c.b;
import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
final class a implements b.a {
    private final long a;
    private final int b;
    private final long c;

    public a(long j, int i, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2 == -1 ? -9223372036854775807L : b(j2);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return this.c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        long j2 = this.c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return this.a + ((t.a(j, j2) * this.b) / 8000000);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.c.b.a
    public final long b(long j) {
        return ((Math.max(0L, j - this.a) * 1000000) * 8) / this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.c;
    }
}
