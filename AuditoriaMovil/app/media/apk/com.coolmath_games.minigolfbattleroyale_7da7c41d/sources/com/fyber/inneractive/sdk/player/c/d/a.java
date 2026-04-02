package com.fyber.inneractive.sdk.player.c.d;

import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
public final class a implements m {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final boolean b_() {
        return true;
    }

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long b() {
        return this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.m
    public final long a(long j) {
        return this.c[t.a(this.e, j, true)];
    }
}
