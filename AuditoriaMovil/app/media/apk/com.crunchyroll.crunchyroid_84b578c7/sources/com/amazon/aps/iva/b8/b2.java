package com.amazon.aps.iva.b8;

import android.os.Bundle;
/* compiled from: SessionToken.java */
/* loaded from: classes.dex */
public final class b2 implements com.amazon.aps.iva.q5.k {
    public static final String c = com.amazon.aps.iva.t5.g0.L(0);
    public static final String d = com.amazon.aps.iva.t5.g0.L(1);
    public final a b;

    /* compiled from: SessionToken.java */
    /* loaded from: classes.dex */
    public interface a extends com.amazon.aps.iva.q5.k {
        Bundle getExtras();
    }

    public b2(int i, String str, p1 p1Var, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.b = new c2(i, 0, 1001001300, 2, str, "", null, p1Var, bundle);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b2)) {
            return false;
        }
        return this.b.equals(((b2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        a aVar = this.b;
        boolean z = aVar instanceof c2;
        String str = c;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(d, aVar.toBundle());
        return bundle;
    }

    public final String toString() {
        return this.b.toString();
    }

    public b2(Bundle bundle) {
        String str = c;
        com.amazon.aps.iva.cq.b.v(bundle.containsKey(str), "Impl type needs to be set.");
        int i = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(d);
        bundle2.getClass();
        if (i == 0) {
            this.b = (a) c2.t.e(bundle2);
        } else {
            this.b = (a) d2.n.e(bundle2);
        }
    }
}
