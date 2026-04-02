package com.amazon.aps.iva.b8;

import android.os.Bundle;
/* compiled from: ConnectionRequest.java */
/* loaded from: classes.dex */
public final class f implements com.amazon.aps.iva.q5.k {
    public static final String g = com.amazon.aps.iva.t5.g0.L(0);
    public static final String h = com.amazon.aps.iva.t5.g0.L(1);
    public static final String i = com.amazon.aps.iva.t5.g0.L(2);
    public static final String j = com.amazon.aps.iva.t5.g0.L(3);
    public static final String k = com.amazon.aps.iva.t5.g0.L(4);
    public static final com.amazon.aps.iva.q5.e l = new com.amazon.aps.iva.q5.e(9);
    public final int b;
    public final int c;
    public final String d;
    public final int e;
    public final Bundle f;

    public f(int i2, int i3, String str, int i4, Bundle bundle) {
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = i4;
        this.f = bundle;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(g, this.b);
        bundle.putString(h, this.d);
        bundle.putInt(i, this.e);
        bundle.putBundle(j, this.f);
        bundle.putInt(k, this.c);
        return bundle;
    }
}
