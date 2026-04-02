package com.amazon.aps.iva.b8;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.amazon.aps.iva.b8.b2;
import com.google.common.base.Objects;
/* compiled from: SessionTokenImplBase.java */
/* loaded from: classes.dex */
public final class c2 implements b2.a {
    public static final String k = com.amazon.aps.iva.t5.g0.L(0);
    public static final String l = com.amazon.aps.iva.t5.g0.L(1);
    public static final String m = com.amazon.aps.iva.t5.g0.L(2);
    public static final String n = com.amazon.aps.iva.t5.g0.L(3);
    public static final String o = com.amazon.aps.iva.t5.g0.L(4);
    public static final String p = com.amazon.aps.iva.t5.g0.L(5);
    public static final String q = com.amazon.aps.iva.t5.g0.L(6);
    public static final String r = com.amazon.aps.iva.t5.g0.L(7);
    public static final String s = com.amazon.aps.iva.t5.g0.L(8);
    public static final com.amazon.aps.iva.q5.m t = new com.amazon.aps.iva.q5.m(12);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final ComponentName h;
    public final IBinder i;
    public final Bundle j;

    public c2(int i, int i2, int i3, int i4, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str2;
        this.h = componentName;
        this.i = iBinder;
        this.j = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        if (this.b != c2Var.b || this.c != c2Var.c || this.d != c2Var.d || this.e != c2Var.e || !TextUtils.equals(this.f, c2Var.f) || !TextUtils.equals(this.g, c2Var.g) || !com.amazon.aps.iva.t5.g0.a(this.h, c2Var.h) || !com.amazon.aps.iva.t5.g0.a(this.i, c2Var.i)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.b8.b2.a
    public final Bundle getExtras() {
        return new Bundle(this.j);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, this.h, this.i);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(k, this.b);
        bundle.putInt(l, this.c);
        bundle.putInt(m, this.d);
        bundle.putString(n, this.f);
        bundle.putString(o, this.g);
        com.amazon.aps.iva.k3.d.b(bundle, q, this.i);
        bundle.putParcelable(p, this.h);
        bundle.putBundle(r, this.j);
        bundle.putInt(s, this.e);
        return bundle;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f + " type=" + this.c + " libraryVersion=" + this.d + " interfaceVersion=" + this.e + " service=" + this.g + " IMediaSession=" + this.i + " extras=" + this.j + "}";
    }
}
