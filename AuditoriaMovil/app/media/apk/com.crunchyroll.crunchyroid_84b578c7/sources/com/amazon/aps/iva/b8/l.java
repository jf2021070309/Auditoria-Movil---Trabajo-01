package com.amazon.aps.iva.b8;

import android.os.Bundle;
/* compiled from: MediaLibraryService.java */
/* loaded from: classes.dex */
public final class l implements com.amazon.aps.iva.q5.k {
    public static final String f = com.amazon.aps.iva.t5.g0.L(0);
    public static final String g = com.amazon.aps.iva.t5.g0.L(1);
    public static final String h = com.amazon.aps.iva.t5.g0.L(2);
    public static final String i = com.amazon.aps.iva.t5.g0.L(3);
    public static final com.amazon.aps.iva.g1.f j = new com.amazon.aps.iva.g1.f(6);
    public final Bundle b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public l(Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.b = new Bundle(bundle);
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, this.b);
        bundle.putBoolean(g, this.c);
        bundle.putBoolean(h, this.d);
        bundle.putBoolean(i, this.e);
        return bundle;
    }
}
