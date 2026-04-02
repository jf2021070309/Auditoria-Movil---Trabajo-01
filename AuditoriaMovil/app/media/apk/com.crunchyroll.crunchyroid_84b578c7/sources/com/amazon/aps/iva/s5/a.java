package com.amazon.aps.iva.s5;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.amazon.aps.iva.q5.a0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.t5.g0;
import com.google.common.base.Objects;
/* compiled from: Cue.java */
/* loaded from: classes.dex */
public final class a implements k {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final a0 K;
    public static final a s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence b;
    public final Layout.Alignment c;
    public final Layout.Alignment d;
    public final Bitmap e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    static {
        C0695a c0695a = new C0695a();
        c0695a.a = "";
        s = c0695a.a();
        t = g0.L(0);
        u = g0.L(1);
        v = g0.L(2);
        w = g0.L(3);
        x = g0.L(4);
        y = g0.L(5);
        z = g0.L(6);
        A = g0.L(7);
        B = g0.L(8);
        C = g0.L(9);
        D = g0.L(10);
        E = g0.L(11);
        F = g0.L(12);
        G = g0.L(13);
        H = g0.L(14);
        I = g0.L(15);
        J = g0.L(16);
        K = new a0(3);
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        boolean z3;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.amazon.aps.iva.cq.b.t(z3);
        }
        if (charSequence instanceof Spanned) {
            this.b = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.b = charSequence.toString();
        } else {
            this.b = null;
        }
        this.c = alignment;
        this.d = alignment2;
        this.e = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z2;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (TextUtils.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
            Bitmap bitmap = aVar.e;
            Bitmap bitmap2 = this.e;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q && this.r == aVar.r) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.c, this.d, this.e, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r));
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(t, this.b);
        bundle.putSerializable(u, this.c);
        bundle.putSerializable(v, this.d);
        bundle.putParcelable(w, this.e);
        bundle.putFloat(x, this.f);
        bundle.putInt(y, this.g);
        bundle.putInt(z, this.h);
        bundle.putFloat(A, this.i);
        bundle.putInt(B, this.j);
        bundle.putInt(C, this.o);
        bundle.putFloat(D, this.p);
        bundle.putFloat(E, this.k);
        bundle.putFloat(F, this.l);
        bundle.putBoolean(H, this.m);
        bundle.putInt(G, this.n);
        bundle.putInt(I, this.q);
        bundle.putFloat(J, this.r);
        return bundle;
    }

    /* compiled from: Cue.java */
    /* renamed from: com.amazon.aps.iva.s5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0695a {
        public CharSequence a;
        public Bitmap b;
        public Layout.Alignment c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public int o;
        public int p;
        public float q;

        public C0695a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public final a a() {
            return new a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }

        public C0695a(a aVar) {
            this.a = aVar.b;
            this.b = aVar.e;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.f;
            this.f = aVar.g;
            this.g = aVar.h;
            this.h = aVar.i;
            this.i = aVar.j;
            this.j = aVar.o;
            this.k = aVar.p;
            this.l = aVar.k;
            this.m = aVar.l;
            this.n = aVar.m;
            this.o = aVar.n;
            this.p = aVar.q;
            this.q = aVar.r;
        }
    }
}
