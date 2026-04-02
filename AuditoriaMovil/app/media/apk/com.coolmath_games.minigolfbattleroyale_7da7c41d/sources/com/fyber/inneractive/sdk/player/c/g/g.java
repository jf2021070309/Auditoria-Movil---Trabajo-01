package com.fyber.inneractive.sdk.player.c.g;

import com.fyber.inneractive.sdk.player.c.q;
/* loaded from: classes.dex */
public final class g extends q {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final boolean g;
    private final boolean h;

    @Override // com.fyber.inneractive.sdk.player.c.q
    public final int b() {
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.player.c.q
    public final int c() {
        return 1;
    }

    public g(long j, boolean z) {
        this(j, j, z);
    }

    private g(long j, long j2, boolean z) {
        this.c = j;
        this.d = j2;
        this.e = 0L;
        this.f = 0L;
        this.g = z;
        this.h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.q
    public final q.b a(int i, q.b bVar, long j) {
        com.fyber.inneractive.sdk.player.c.k.a.a(i, 1);
        long j2 = this.f;
        if (this.h) {
            j2 += j;
            if (j2 > this.d) {
                j2 = -9223372036854775807L;
            }
        }
        boolean z = this.g;
        boolean z2 = this.h;
        long j3 = this.d;
        long j4 = this.e;
        bVar.a = null;
        bVar.b = -9223372036854775807L;
        bVar.c = -9223372036854775807L;
        bVar.d = z;
        bVar.e = z2;
        bVar.h = j2;
        bVar.i = j3;
        bVar.f = 0;
        bVar.g = 0;
        bVar.j = j4;
        return bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.q
    public final q.a a(int i, q.a aVar, boolean z) {
        com.fyber.inneractive.sdk.player.c.k.a.a(i, 1);
        Object obj = z ? b : null;
        long j = this.c;
        aVar.a = obj;
        aVar.b = obj;
        aVar.c = 0;
        aVar.d = j;
        aVar.f = -this.e;
        aVar.e = false;
        return aVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.q
    public final int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }
}
