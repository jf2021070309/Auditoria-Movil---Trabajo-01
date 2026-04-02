package com.fyber.inneractive.sdk.player.c.d.c;

import com.fyber.inneractive.sdk.player.c.d.c.b;
import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
final class c implements b.a {
    private final long[] a;
    private final long[] b;
    private final long c;

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        return this.b[t.a(this.a, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.c.b.a
    public final long b(long j) {
        return this.a[t.a(this.b, j, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.c;
    }
}
