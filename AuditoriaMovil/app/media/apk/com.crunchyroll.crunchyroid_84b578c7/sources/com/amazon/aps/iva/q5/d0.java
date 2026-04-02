package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.base.Objects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.Arrays;
/* compiled from: MediaMetadata.java */
/* loaded from: classes.dex */
public final class d0 implements k {
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final n0 i;
    public final n0 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    @Deprecated
    public final Integer p;
    public final Boolean q;
    public final Boolean r;
    @Deprecated
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;
    public static final d0 J = new d0(new a());
    public static final String K = com.amazon.aps.iva.t5.g0.L(0);
    public static final String L = com.amazon.aps.iva.t5.g0.L(1);
    public static final String M = com.amazon.aps.iva.t5.g0.L(2);
    public static final String N = com.amazon.aps.iva.t5.g0.L(3);
    public static final String O = com.amazon.aps.iva.t5.g0.L(4);
    public static final String P = com.amazon.aps.iva.t5.g0.L(5);
    public static final String Q = com.amazon.aps.iva.t5.g0.L(6);
    public static final String R = com.amazon.aps.iva.t5.g0.L(8);
    public static final String S = com.amazon.aps.iva.t5.g0.L(9);
    public static final String T = com.amazon.aps.iva.t5.g0.L(10);
    public static final String U = com.amazon.aps.iva.t5.g0.L(11);
    public static final String V = com.amazon.aps.iva.t5.g0.L(12);
    public static final String W = com.amazon.aps.iva.t5.g0.L(13);
    public static final String X = com.amazon.aps.iva.t5.g0.L(14);
    public static final String Y = com.amazon.aps.iva.t5.g0.L(15);
    public static final String Z = com.amazon.aps.iva.t5.g0.L(16);
    public static final String k0 = com.amazon.aps.iva.t5.g0.L(17);
    public static final String v0 = com.amazon.aps.iva.t5.g0.L(18);
    public static final String w0 = com.amazon.aps.iva.t5.g0.L(19);
    public static final String x0 = com.amazon.aps.iva.t5.g0.L(20);
    public static final String y0 = com.amazon.aps.iva.t5.g0.L(21);
    public static final String z0 = com.amazon.aps.iva.t5.g0.L(22);
    public static final String A0 = com.amazon.aps.iva.t5.g0.L(23);
    public static final String B0 = com.amazon.aps.iva.t5.g0.L(24);
    public static final String C0 = com.amazon.aps.iva.t5.g0.L(25);
    public static final String D0 = com.amazon.aps.iva.t5.g0.L(26);
    public static final String E0 = com.amazon.aps.iva.t5.g0.L(27);
    public static final String F0 = com.amazon.aps.iva.t5.g0.L(28);
    public static final String G0 = com.amazon.aps.iva.t5.g0.L(29);
    public static final String H0 = com.amazon.aps.iva.t5.g0.L(30);
    public static final String I0 = com.amazon.aps.iva.t5.g0.L(31);
    public static final String J0 = com.amazon.aps.iva.t5.g0.L(32);
    public static final String K0 = com.amazon.aps.iva.t5.g0.L(1000);
    public static final z L0 = new z(1);

    /* compiled from: MediaMetadata.java */
    /* loaded from: classes.dex */
    public static final class a {
        public Integer A;
        public Integer B;
        public CharSequence C;
        public CharSequence D;
        public CharSequence E;
        public Integer F;
        public Bundle G;
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;
        public n0 h;
        public n0 i;
        public byte[] j;
        public Integer k;
        public Uri l;
        public Integer m;
        public Integer n;
        public Integer o;
        public Boolean p;
        public Boolean q;
        public Integer r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public Integer w;
        public CharSequence x;
        public CharSequence y;
        public CharSequence z;

        public a(d0 d0Var) {
            this.a = d0Var.b;
            this.b = d0Var.c;
            this.c = d0Var.d;
            this.d = d0Var.e;
            this.e = d0Var.f;
            this.f = d0Var.g;
            this.g = d0Var.h;
            this.h = d0Var.i;
            this.i = d0Var.j;
            this.j = d0Var.k;
            this.k = d0Var.l;
            this.l = d0Var.m;
            this.m = d0Var.n;
            this.n = d0Var.o;
            this.o = d0Var.p;
            this.p = d0Var.q;
            this.q = d0Var.r;
            this.r = d0Var.t;
            this.s = d0Var.u;
            this.t = d0Var.v;
            this.u = d0Var.w;
            this.v = d0Var.x;
            this.w = d0Var.y;
            this.x = d0Var.z;
            this.y = d0Var.A;
            this.z = d0Var.B;
            this.A = d0Var.C;
            this.B = d0Var.D;
            this.C = d0Var.E;
            this.D = d0Var.F;
            this.E = d0Var.G;
            this.F = d0Var.H;
            this.G = d0Var.I;
        }

        @CanIgnoreReturnValue
        public final void a(int i, byte[] bArr) {
            if (this.j == null || com.amazon.aps.iva.t5.g0.a(Integer.valueOf(i), 3) || !com.amazon.aps.iva.t5.g0.a(this.k, 3)) {
                this.j = (byte[]) bArr.clone();
                this.k = Integer.valueOf(i);
            }
        }

        @CanIgnoreReturnValue
        public final void b(CharSequence charSequence) {
            this.d = charSequence;
        }

        @CanIgnoreReturnValue
        public final void c(CharSequence charSequence) {
            this.c = charSequence;
        }

        @CanIgnoreReturnValue
        public final void d(CharSequence charSequence) {
            this.b = charSequence;
        }

        @CanIgnoreReturnValue
        public final void e(CharSequence charSequence) {
            this.y = charSequence;
        }

        @CanIgnoreReturnValue
        public final void f(CharSequence charSequence) {
            this.z = charSequence;
        }

        @CanIgnoreReturnValue
        public final void g(Integer num) {
            this.t = num;
        }

        @CanIgnoreReturnValue
        public final void h(Integer num) {
            this.s = num;
        }

        @CanIgnoreReturnValue
        public final void i(Integer num) {
            this.r = num;
        }

        @CanIgnoreReturnValue
        public final void j(Integer num) {
            this.w = num;
        }

        @CanIgnoreReturnValue
        public final void k(Integer num) {
            this.v = num;
        }

        @CanIgnoreReturnValue
        public final void l(Integer num) {
            this.u = num;
        }

        @CanIgnoreReturnValue
        public final void m(CharSequence charSequence) {
            this.a = charSequence;
        }

        @CanIgnoreReturnValue
        public final void n(Integer num) {
            this.n = num;
        }

        @CanIgnoreReturnValue
        public final void o(Integer num) {
            this.m = num;
        }

        @CanIgnoreReturnValue
        public final void p(CharSequence charSequence) {
            this.x = charSequence;
        }
    }

    public d0(a aVar) {
        Boolean bool = aVar.p;
        Integer num = aVar.o;
        Integer num2 = aVar.F;
        int i = 1;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i2 = i;
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            bool = Boolean.valueOf(num.intValue() != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                num2 = Integer.valueOf(i2);
            }
        }
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = num;
        this.q = bool;
        this.r = aVar.q;
        Integer num3 = aVar.r;
        this.s = num3;
        this.t = num3;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        this.E = aVar.C;
        this.F = aVar.D;
        this.G = aVar.E;
        this.H = num2;
        this.I = aVar.G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (com.amazon.aps.iva.t5.g0.a(this.b, d0Var.b) && com.amazon.aps.iva.t5.g0.a(this.c, d0Var.c) && com.amazon.aps.iva.t5.g0.a(this.d, d0Var.d) && com.amazon.aps.iva.t5.g0.a(this.e, d0Var.e) && com.amazon.aps.iva.t5.g0.a(this.f, d0Var.f) && com.amazon.aps.iva.t5.g0.a(this.g, d0Var.g) && com.amazon.aps.iva.t5.g0.a(this.h, d0Var.h) && com.amazon.aps.iva.t5.g0.a(this.i, d0Var.i) && com.amazon.aps.iva.t5.g0.a(this.j, d0Var.j) && Arrays.equals(this.k, d0Var.k) && com.amazon.aps.iva.t5.g0.a(this.l, d0Var.l) && com.amazon.aps.iva.t5.g0.a(this.m, d0Var.m) && com.amazon.aps.iva.t5.g0.a(this.n, d0Var.n) && com.amazon.aps.iva.t5.g0.a(this.o, d0Var.o) && com.amazon.aps.iva.t5.g0.a(this.p, d0Var.p) && com.amazon.aps.iva.t5.g0.a(this.q, d0Var.q) && com.amazon.aps.iva.t5.g0.a(this.r, d0Var.r) && com.amazon.aps.iva.t5.g0.a(this.t, d0Var.t) && com.amazon.aps.iva.t5.g0.a(this.u, d0Var.u) && com.amazon.aps.iva.t5.g0.a(this.v, d0Var.v) && com.amazon.aps.iva.t5.g0.a(this.w, d0Var.w) && com.amazon.aps.iva.t5.g0.a(this.x, d0Var.x) && com.amazon.aps.iva.t5.g0.a(this.y, d0Var.y) && com.amazon.aps.iva.t5.g0.a(this.z, d0Var.z) && com.amazon.aps.iva.t5.g0.a(this.A, d0Var.A) && com.amazon.aps.iva.t5.g0.a(this.B, d0Var.B) && com.amazon.aps.iva.t5.g0.a(this.C, d0Var.C) && com.amazon.aps.iva.t5.g0.a(this.D, d0Var.D) && com.amazon.aps.iva.t5.g0.a(this.E, d0Var.E) && com.amazon.aps.iva.t5.g0.a(this.F, d0Var.F) && com.amazon.aps.iva.t5.g0.a(this.G, d0Var.G) && com.amazon.aps.iva.t5.g0.a(this.H, d0Var.H)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence(K, charSequence);
        }
        CharSequence charSequence2 = this.c;
        if (charSequence2 != null) {
            bundle.putCharSequence(L, charSequence2);
        }
        CharSequence charSequence3 = this.d;
        if (charSequence3 != null) {
            bundle.putCharSequence(M, charSequence3);
        }
        CharSequence charSequence4 = this.e;
        if (charSequence4 != null) {
            bundle.putCharSequence(N, charSequence4);
        }
        CharSequence charSequence5 = this.f;
        if (charSequence5 != null) {
            bundle.putCharSequence(O, charSequence5);
        }
        CharSequence charSequence6 = this.g;
        if (charSequence6 != null) {
            bundle.putCharSequence(P, charSequence6);
        }
        CharSequence charSequence7 = this.h;
        if (charSequence7 != null) {
            bundle.putCharSequence(Q, charSequence7);
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(T, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(U, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(z0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(A0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(B0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(E0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(F0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(H0, charSequence13);
        }
        n0 n0Var = this.i;
        if (n0Var != null) {
            bundle.putBundle(R, n0Var.toBundle());
        }
        n0 n0Var2 = this.j;
        if (n0Var2 != null) {
            bundle.putBundle(S, n0Var2.toBundle());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(V, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(W, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(X, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(J0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Y, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(Z, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(k0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(v0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(w0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(x0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(y0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(C0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(D0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(G0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(I0, num13.intValue());
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(K0, bundle2);
        }
        return bundle;
    }
}
