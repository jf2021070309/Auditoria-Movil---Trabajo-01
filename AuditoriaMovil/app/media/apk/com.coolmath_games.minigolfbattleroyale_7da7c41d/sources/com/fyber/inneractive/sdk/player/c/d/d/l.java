package com.fyber.inneractive.sdk.player.c.d.d;

import com.fyber.inneractive.sdk.player.c.k.t;
/* loaded from: classes.dex */
final class l {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public l(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        com.fyber.inneractive.sdk.player.c.k.a.a(iArr.length == jArr2.length);
        com.fyber.inneractive.sdk.player.c.k.a.a(jArr.length == jArr2.length);
        com.fyber.inneractive.sdk.player.c.k.a.a(iArr2.length == jArr2.length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.a = jArr.length;
    }

    public final int a(long j) {
        for (int a = t.a(this.e, j, false); a >= 0; a--) {
            if ((this.f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int a = t.a(this.e, j, true, false); a < this.e.length; a++) {
            if ((this.f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
