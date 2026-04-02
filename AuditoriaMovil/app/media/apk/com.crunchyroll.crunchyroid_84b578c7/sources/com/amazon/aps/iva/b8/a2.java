package com.amazon.aps.iva.b8;

import android.os.Bundle;
import android.os.SystemClock;
/* compiled from: SessionResult.java */
/* loaded from: classes.dex */
public final class a2 implements com.amazon.aps.iva.q5.k {
    public static final String e = com.amazon.aps.iva.t5.g0.L(0);
    public static final String f = com.amazon.aps.iva.t5.g0.L(1);
    public static final String g = com.amazon.aps.iva.t5.g0.L(2);
    public static final com.amazon.aps.iva.q5.z h = new com.amazon.aps.iva.q5.z(10);
    public final int b;
    public final Bundle c;
    public final long d;

    public a2(int i) {
        this(Bundle.EMPTY, i, SystemClock.elapsedRealtime());
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.b);
        bundle.putBundle(f, this.c);
        bundle.putLong(g, this.d);
        return bundle;
    }

    public a2(Bundle bundle, int i, long j) {
        this.b = i;
        this.c = new Bundle(bundle);
        this.d = j;
    }
}
