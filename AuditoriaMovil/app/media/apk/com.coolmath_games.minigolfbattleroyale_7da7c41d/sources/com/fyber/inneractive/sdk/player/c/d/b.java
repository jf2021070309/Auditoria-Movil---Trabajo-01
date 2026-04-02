package com.fyber.inneractive.sdk.player.c.d;

import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements g {
    private static final byte[] a = new byte[4096];
    private final com.fyber.inneractive.sdk.player.c.j.g b;
    private final long c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public b(com.fyber.inneractive.sdk.player.c.j.g gVar, long j, long j2) {
        this.b = gVar;
        this.d = j;
        this.c = j2;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final int a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int d = d(bArr, i, i2);
        if (d == 0) {
            d = a(bArr, i, i2, 0, true);
        }
        f(d);
        return d;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int d = d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = a(bArr, i, i2, d, z);
        }
        f(d);
        return d != -1;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final void b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        a(bArr, i, i2, false);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final int a(int i) throws IOException, InterruptedException {
        int d = d(i);
        if (d == 0) {
            byte[] bArr = a;
            d = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        f(d);
        return d;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (a(i2, z)) {
            System.arraycopy(this.e, this.f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final void c(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        b(bArr, i, i2, false);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final void c(int i) throws IOException, InterruptedException {
        a(i, false);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final void a() {
        this.f = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final long b() {
        return this.d + this.f;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final long c() {
        return this.d;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final long d() {
        return this.c;
    }

    private int d(int i) {
        int min = Math.min(this.g, i);
        e(min);
        return min;
    }

    private int d(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        e(min);
        return min;
    }

    private void e(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.e, i, bArr, 0, this.g);
        this.e = bArr;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int a2 = this.b.a(bArr, i + i3, i2 - i3);
        if (a2 == -1) {
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        return i3 + a2;
    }

    private void f(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.g
    public final void b(int i) throws IOException, InterruptedException {
        int d = d(i);
        while (d < i && d != -1) {
            byte[] bArr = a;
            d = a(bArr, -d, Math.min(i, bArr.length + d), d, false);
        }
        f(d);
    }

    private boolean a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, t.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = a(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f + i;
        this.f = i3;
        this.g = Math.max(this.g, i3);
        return true;
    }
}
