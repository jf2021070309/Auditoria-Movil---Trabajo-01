package com.amazon.aps.iva.b8;

import android.app.PendingIntent;
import android.os.Bundle;
import com.amazon.aps.iva.q5.l0;
import com.google.common.collect.ImmutableList;
/* compiled from: ConnectionState.java */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.q5.k {
    public static final String l = com.amazon.aps.iva.t5.g0.L(0);
    public static final String m = com.amazon.aps.iva.t5.g0.L(1);
    public static final String n = com.amazon.aps.iva.t5.g0.L(2);
    public static final String o = com.amazon.aps.iva.t5.g0.L(9);
    public static final String p = com.amazon.aps.iva.t5.g0.L(3);
    public static final String q = com.amazon.aps.iva.t5.g0.L(4);
    public static final String r = com.amazon.aps.iva.t5.g0.L(5);
    public static final String s = com.amazon.aps.iva.t5.g0.L(6);
    public static final String t = com.amazon.aps.iva.t5.g0.L(7);
    public static final String u = com.amazon.aps.iva.t5.g0.L(8);
    public final int b;
    public final int c;
    public final j d;
    public final PendingIntent e;
    public final y1 f;
    public final l0.a g;
    public final l0.a h;
    public final Bundle i;
    public final r1 j;
    public final ImmutableList<b> k;

    public g(int i, int i2, j jVar, PendingIntent pendingIntent, ImmutableList<b> immutableList, y1 y1Var, l0.a aVar, l0.a aVar2, Bundle bundle, r1 r1Var) {
        this.b = i;
        this.c = i2;
        this.d = jVar;
        this.f = y1Var;
        this.g = aVar;
        this.h = aVar2;
        this.e = pendingIntent;
        this.i = bundle;
        this.j = r1Var;
        this.k = immutableList;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(l, this.b);
        com.amazon.aps.iva.k3.d.b(bundle, m, this.d.asBinder());
        bundle.putParcelable(n, this.e);
        ImmutableList<b> immutableList = this.k;
        if (!immutableList.isEmpty()) {
            bundle.putParcelableArrayList(o, com.amazon.aps.iva.t5.c.b(immutableList));
        }
        bundle.putBundle(p, this.f.toBundle());
        l0.a aVar = this.g;
        bundle.putBundle(q, aVar.toBundle());
        l0.a aVar2 = this.h;
        bundle.putBundle(r, aVar2.toBundle());
        bundle.putBundle(s, this.i);
        bundle.putBundle(t, this.j.c(q1.j(aVar, aVar2), false, false));
        bundle.putInt(u, this.c);
        return bundle;
    }
}
