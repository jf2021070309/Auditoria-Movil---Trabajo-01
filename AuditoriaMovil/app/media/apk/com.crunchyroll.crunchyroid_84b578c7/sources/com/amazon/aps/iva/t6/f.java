package com.amazon.aps.iva.t6;

import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.Cast;
import java.util.Arrays;
/* compiled from: DefaultAllocator.java */
/* loaded from: classes.dex */
public final class f implements b {
    public int c;
    public int d;
    public final boolean a = true;
    public final int b = Cast.MAX_MESSAGE_LENGTH;
    public int e = 0;
    public a[] f = new a[100];

    public final synchronized void a() {
        int i = this.c;
        int i2 = this.b;
        int i3 = g0.a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.d);
        int i4 = this.e;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.f, max, i4, (Object) null);
        this.e = max;
    }
}
