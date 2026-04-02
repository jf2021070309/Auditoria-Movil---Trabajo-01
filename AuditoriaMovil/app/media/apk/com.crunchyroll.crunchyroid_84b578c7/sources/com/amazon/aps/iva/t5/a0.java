package com.amazon.aps.iva.t5;

import java.util.Arrays;
/* compiled from: TimedValueQueue.java */
/* loaded from: classes.dex */
public final class a0<V> {
    public long[] a = new long[10];
    public V[] b = (V[]) new Object[10];
    public int c;
    public int d;

    public final synchronized void a(long j, V v) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i2 = this.c;
        int i3 = this.d;
        V[] vArr = this.b;
        int length = (i2 + i3) % vArr.length;
        this.a[length] = j;
        vArr[length] = v;
        this.d = i3 + 1;
    }

    public final synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final void c() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    public final V d(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = e();
            j2 = j3;
        }
        return v;
    }

    public final V e() {
        boolean z;
        if (this.d > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }
}
