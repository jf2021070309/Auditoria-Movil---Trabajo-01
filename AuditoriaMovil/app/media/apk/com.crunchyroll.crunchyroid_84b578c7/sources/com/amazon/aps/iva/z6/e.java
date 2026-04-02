package com.amazon.aps.iva.z6;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.e0;
import com.amazon.aps.iva.x6.f0;
import com.google.android.gms.ads.AdRequest;
/* compiled from: ChunkReader.java */
/* loaded from: classes.dex */
public final class e {
    public final f0 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public e(int i, int i2, long j, int i3, f0 f0Var) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        this.d = j;
        this.e = i3;
        this.a = f0Var;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        int i6 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = i4 | i6;
        if (i2 == 2) {
            i5 = i6 | 1650720768;
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.k = new long[AdRequest.MAX_CONTENT_URL_LENGTH];
        this.l = new int[AdRequest.MAX_CONTENT_URL_LENGTH];
    }

    public final e0 a(int i) {
        return new e0(((this.d * 1) / this.e) * this.l[i], this.k[i]);
    }

    public final d0.a b(long j) {
        int i = (int) (j / ((this.d * 1) / this.e));
        int e = g0.e(this.l, i, true, true);
        if (this.l[e] == i) {
            e0 a = a(e);
            return new d0.a(a, a);
        }
        e0 a2 = a(e);
        int i2 = e + 1;
        if (i2 < this.k.length) {
            return new d0.a(a2, a(i2));
        }
        return new d0.a(a2, a2);
    }
}
