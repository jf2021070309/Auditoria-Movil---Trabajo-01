package com.amazon.aps.iva.q5;

import android.os.Bundle;
import com.amazon.aps.iva.q5.r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaTrack;
import com.google.common.base.Joiner;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.http2.Http2;
/* compiled from: Format.java */
/* loaded from: classes.dex */
public final class v implements k {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final f0 k;
    public final String l;
    public final String m;
    public final int n;
    public final List<byte[]> o;
    public final r p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final n y;
    public final int z;
    public static final v J = new v(new a());
    public static final String K = com.amazon.aps.iva.t5.g0.L(0);
    public static final String L = com.amazon.aps.iva.t5.g0.L(1);
    public static final String M = com.amazon.aps.iva.t5.g0.L(2);
    public static final String N = com.amazon.aps.iva.t5.g0.L(3);
    public static final String O = com.amazon.aps.iva.t5.g0.L(4);
    public static final String P = com.amazon.aps.iva.t5.g0.L(5);
    public static final String Q = com.amazon.aps.iva.t5.g0.L(6);
    public static final String R = com.amazon.aps.iva.t5.g0.L(7);
    public static final String S = com.amazon.aps.iva.t5.g0.L(8);
    public static final String T = com.amazon.aps.iva.t5.g0.L(9);
    public static final String U = com.amazon.aps.iva.t5.g0.L(10);
    public static final String V = com.amazon.aps.iva.t5.g0.L(11);
    public static final String W = com.amazon.aps.iva.t5.g0.L(12);
    public static final String X = com.amazon.aps.iva.t5.g0.L(13);
    public static final String Y = com.amazon.aps.iva.t5.g0.L(14);
    public static final String Z = com.amazon.aps.iva.t5.g0.L(15);
    public static final String k0 = com.amazon.aps.iva.t5.g0.L(16);
    public static final String v0 = com.amazon.aps.iva.t5.g0.L(17);
    public static final String w0 = com.amazon.aps.iva.t5.g0.L(18);
    public static final String x0 = com.amazon.aps.iva.t5.g0.L(19);
    public static final String y0 = com.amazon.aps.iva.t5.g0.L(20);
    public static final String z0 = com.amazon.aps.iva.t5.g0.L(21);
    public static final String A0 = com.amazon.aps.iva.t5.g0.L(22);
    public static final String B0 = com.amazon.aps.iva.t5.g0.L(23);
    public static final String C0 = com.amazon.aps.iva.t5.g0.L(24);
    public static final String D0 = com.amazon.aps.iva.t5.g0.L(25);
    public static final String E0 = com.amazon.aps.iva.t5.g0.L(26);
    public static final String F0 = com.amazon.aps.iva.t5.g0.L(27);
    public static final String G0 = com.amazon.aps.iva.t5.g0.L(28);
    public static final String H0 = com.amazon.aps.iva.t5.g0.L(29);
    public static final String I0 = com.amazon.aps.iva.t5.g0.L(30);
    public static final String J0 = com.amazon.aps.iva.t5.g0.L(31);
    public static final b K0 = new b(1);

    public v(a aVar) {
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = com.amazon.aps.iva.t5.g0.R(aVar.c);
        this.e = aVar.d;
        this.f = aVar.e;
        int i = aVar.f;
        this.g = i;
        int i2 = aVar.g;
        this.h = i2;
        this.i = i2 != -1 ? i2 : i;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        List<byte[]> list = aVar.m;
        this.o = list == null ? Collections.emptyList() : list;
        r rVar = aVar.n;
        this.p = rVar;
        this.q = aVar.o;
        this.r = aVar.p;
        this.s = aVar.q;
        this.t = aVar.r;
        int i3 = aVar.s;
        this.u = i3 == -1 ? 0 : i3;
        float f = aVar.t;
        this.v = f == -1.0f ? 1.0f : f;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        int i4 = aVar.A;
        this.C = i4 == -1 ? 0 : i4;
        int i5 = aVar.B;
        this.D = i5 != -1 ? i5 : 0;
        this.E = aVar.C;
        this.F = aVar.D;
        this.G = aVar.E;
        int i6 = aVar.F;
        if (i6 == 0 && rVar != null) {
            this.H = 1;
        } else {
            this.H = i6;
        }
    }

    public static String d(int i) {
        return W + "_" + Integer.toString(i, 36);
    }

    public static String f(v vVar) {
        boolean z;
        String str;
        String str2;
        String o;
        int i;
        if (vVar == null) {
            return "null";
        }
        StringBuilder b = defpackage.c.b("id=");
        b.append(vVar.b);
        b.append(", mimeType=");
        b.append(vVar.m);
        int i2 = vVar.i;
        if (i2 != -1) {
            b.append(", bitrate=");
            b.append(i2);
        }
        String str3 = vVar.j;
        if (str3 != null) {
            b.append(", codecs=");
            b.append(str3);
        }
        boolean z2 = false;
        r rVar = vVar.p;
        if (rVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i3 = 0; i3 < rVar.e; i3++) {
                UUID uuid = rVar.b[i3].c;
                if (uuid.equals(l.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(l.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(l.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(l.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(l.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            b.append(", drm=[");
            Joiner.on(',').appendTo(b, (Iterable<? extends Object>) linkedHashSet);
            b.append(']');
        }
        int i4 = vVar.r;
        if (i4 != -1 && (i = vVar.s) != -1) {
            b.append(", res=");
            b.append(i4);
            b.append("x");
            b.append(i);
        }
        n nVar = vVar.y;
        if (nVar != null) {
            int i5 = nVar.b;
            int i6 = nVar.d;
            int i7 = nVar.c;
            if (i5 != -1 && i7 != -1 && i6 != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b.append(", color=");
                if (i5 != -1 && i7 != -1 && i6 != -1) {
                    z2 = true;
                }
                if (!z2) {
                    o = "NA";
                } else {
                    if (i5 != -1) {
                        if (i5 != 6) {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    str = "Undefined color space";
                                } else {
                                    str = "BT601";
                                }
                            } else {
                                str = "BT709";
                            }
                        } else {
                            str = "BT2020";
                        }
                    } else {
                        str = "Unset color space";
                    }
                    if (i7 != -1) {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                str2 = "Undefined color range";
                            } else {
                                str2 = "Limited range";
                            }
                        } else {
                            str2 = "Full range";
                        }
                    } else {
                        str2 = "Unset color range";
                    }
                    o = com.amazon.aps.iva.t5.g0.o("%s/%s/%s", str, str2, n.a(i6));
                }
                b.append(o);
            }
        }
        float f = vVar.t;
        if (f != -1.0f) {
            b.append(", fps=");
            b.append(f);
        }
        int i8 = vVar.z;
        if (i8 != -1) {
            b.append(", channels=");
            b.append(i8);
        }
        int i9 = vVar.A;
        if (i9 != -1) {
            b.append(", sample_rate=");
            b.append(i9);
        }
        String str4 = vVar.d;
        if (str4 != null) {
            b.append(", language=");
            b.append(str4);
        }
        String str5 = vVar.c;
        if (str5 != null) {
            b.append(", label=");
            b.append(str5);
        }
        int i10 = vVar.e;
        if (i10 != 0) {
            ArrayList arrayList = new ArrayList();
            if ((i10 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i10 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i10 & 2) != 0) {
                arrayList.add("forced");
            }
            b.append(", selectionFlags=[");
            Joiner.on(',').appendTo(b, (Iterable<? extends Object>) arrayList);
            b.append("]");
        }
        int i11 = vVar.f;
        if (i11 != 0) {
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add(MediaTrack.ROLE_MAIN);
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUPPLEMENTARY);
            }
            if ((i11 & 8) != 0) {
                arrayList2.add(MediaTrack.ROLE_COMMENTARY);
            }
            if ((i11 & 16) != 0) {
                arrayList2.add(MediaTrack.ROLE_DUB);
            }
            if ((i11 & 32) != 0) {
                arrayList2.add(MediaTrack.ROLE_EMERGENCY);
            }
            if ((i11 & 64) != 0) {
                arrayList2.add(MediaTrack.ROLE_CAPTION);
            }
            if ((i11 & 128) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUBTITLE);
            }
            if ((i11 & 256) != 0) {
                arrayList2.add(MediaTrack.ROLE_SIGN);
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i11 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i11 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i11 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i11 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
                arrayList2.add("trick-play");
            }
            b.append(", roleFlags=[");
            Joiner.on(',').appendTo(b, (Iterable<? extends Object>) arrayList2);
            b.append("]");
        }
        return b.toString();
    }

    public final a a() {
        return new a(this);
    }

    public final int b() {
        int i;
        int i2 = this.r;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(v vVar) {
        List<byte[]> list = this.o;
        if (list.size() != vVar.o.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), vVar.o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final Bundle e(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(K, this.b);
        bundle.putString(L, this.c);
        bundle.putString(M, this.d);
        bundle.putInt(N, this.e);
        bundle.putInt(O, this.f);
        bundle.putInt(P, this.g);
        bundle.putInt(Q, this.h);
        bundle.putString(R, this.j);
        if (!z) {
            bundle.putParcelable(S, this.k);
        }
        bundle.putString(T, this.l);
        bundle.putString(U, this.m);
        bundle.putInt(V, this.n);
        int i = 0;
        while (true) {
            List<byte[]> list = this.o;
            if (i >= list.size()) {
                break;
            }
            bundle.putByteArray(d(i), list.get(i));
            i++;
        }
        bundle.putParcelable(X, this.p);
        bundle.putLong(Y, this.q);
        bundle.putInt(Z, this.r);
        bundle.putInt(k0, this.s);
        bundle.putFloat(v0, this.t);
        bundle.putInt(w0, this.u);
        bundle.putFloat(x0, this.v);
        bundle.putByteArray(y0, this.w);
        bundle.putInt(z0, this.x);
        n nVar = this.y;
        if (nVar != null) {
            bundle.putBundle(A0, nVar.toBundle());
        }
        bundle.putInt(B0, this.z);
        bundle.putInt(C0, this.A);
        bundle.putInt(D0, this.B);
        bundle.putInt(E0, this.C);
        bundle.putInt(F0, this.D);
        bundle.putInt(G0, this.E);
        bundle.putInt(I0, this.F);
        bundle.putInt(J0, this.G);
        bundle.putInt(H0, this.H);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        int i2 = this.I;
        if (i2 != 0 && (i = vVar.I) != 0 && i2 != i) {
            return false;
        }
        if (this.e == vVar.e && this.f == vVar.f && this.g == vVar.g && this.h == vVar.h && this.n == vVar.n && this.q == vVar.q && this.r == vVar.r && this.s == vVar.s && this.u == vVar.u && this.x == vVar.x && this.z == vVar.z && this.A == vVar.A && this.B == vVar.B && this.C == vVar.C && this.D == vVar.D && this.E == vVar.E && this.F == vVar.F && this.G == vVar.G && this.H == vVar.H && Float.compare(this.t, vVar.t) == 0 && Float.compare(this.v, vVar.v) == 0 && com.amazon.aps.iva.t5.g0.a(this.b, vVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, vVar.c) && com.amazon.aps.iva.t5.g0.a(this.j, vVar.j) && com.amazon.aps.iva.t5.g0.a(this.l, vVar.l) && com.amazon.aps.iva.t5.g0.a(this.m, vVar.m) && com.amazon.aps.iva.t5.g0.a(this.d, vVar.d) && Arrays.equals(this.w, vVar.w) && com.amazon.aps.iva.t5.g0.a(this.k, vVar.k) && com.amazon.aps.iva.t5.g0.a(this.y, vVar.y) && com.amazon.aps.iva.t5.g0.a(this.p, vVar.p) && c(vVar)) {
            return true;
        }
        return false;
    }

    public final v g(v vVar) {
        String str;
        String str2;
        float f;
        r rVar;
        boolean z;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        if (this == vVar) {
            return this;
        }
        int i2 = g0.i(this.m);
        String str3 = vVar.b;
        String str4 = vVar.c;
        if (str4 == null) {
            str4 = this.c;
        }
        if ((i2 != 3 && i2 != 1) || (str = vVar.d) == null) {
            str = this.d;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = vVar.g;
        }
        int i4 = this.h;
        if (i4 == -1) {
            i4 = vVar.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String s = com.amazon.aps.iva.t5.g0.s(i2, vVar.j);
            if (com.amazon.aps.iva.t5.g0.a0(s).length == 1) {
                str5 = s;
            }
        }
        f0 f0Var = vVar.k;
        f0 f0Var2 = this.k;
        if (f0Var2 != null) {
            if (f0Var == null) {
                f0Var = f0Var2;
            } else {
                f0Var = f0Var2.a(f0Var.b);
            }
        }
        float f3 = this.t;
        if (f3 == -1.0f && i2 == 2) {
            f3 = vVar.t;
        }
        int i5 = this.e | vVar.e;
        int i6 = this.f | vVar.f;
        ArrayList arrayList = new ArrayList();
        r rVar2 = vVar.p;
        if (rVar2 != null) {
            r.b[] bVarArr = rVar2.b;
            int length = bVarArr.length;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                r.b bVar = bVarArr[i7];
                r.b[] bVarArr2 = bVarArr;
                if (bVar.f != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    arrayList.add(bVar);
                }
                i7++;
                length = i8;
                bVarArr = bVarArr2;
            }
            str2 = rVar2.d;
        } else {
            str2 = null;
        }
        r rVar3 = this.p;
        if (rVar3 != null) {
            if (str2 == null) {
                str2 = rVar3.d;
            }
            int size = arrayList.size();
            r.b[] bVarArr3 = rVar3.b;
            int length2 = bVarArr3.length;
            String str6 = str2;
            int i9 = 0;
            while (i9 < length2) {
                int i10 = length2;
                r.b bVar2 = bVarArr3[i9];
                r.b[] bVarArr4 = bVarArr3;
                if (bVar2.f != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            i = size;
                            f2 = f3;
                            if (((r.b) arrayList.get(i11)).c.equals(bVar2.c)) {
                                z2 = true;
                                break;
                            }
                            i11++;
                            f3 = f2;
                            size = i;
                        } else {
                            f2 = f3;
                            i = size;
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        arrayList.add(bVar2);
                    }
                } else {
                    f2 = f3;
                    i = size;
                }
                i9++;
                length2 = i10;
                bVarArr3 = bVarArr4;
                f3 = f2;
                size = i;
            }
            f = f3;
            str2 = str6;
        } else {
            f = f3;
        }
        if (arrayList.isEmpty()) {
            rVar = null;
        } else {
            rVar = new r(str2, arrayList);
        }
        a aVar = new a(this);
        aVar.a = str3;
        aVar.b = str4;
        aVar.c = str;
        aVar.d = i5;
        aVar.e = i6;
        aVar.f = i3;
        aVar.g = i4;
        aVar.h = str5;
        aVar.i = f0Var;
        aVar.n = rVar;
        aVar.r = f;
        return new v(aVar);
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.I == 0) {
            int i2 = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (527 + hashCode) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i3 + i) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (((((((((i4 + hashCode2) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            f0 f0Var = this.k;
            if (f0Var == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = f0Var.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            String str5 = this.l;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            String str6 = this.m;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            this.I = ((((((((((((((((((((Float.floatToIntBits(this.v) + ((((Float.floatToIntBits(this.t) + ((((((((((i8 + i2) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31)) * 31) + this.u) * 31)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H;
        }
        return this.I;
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        return e(false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.y);
        sb.append("], [");
        sb.append(this.z);
        sb.append(", ");
        return defpackage.e.f(sb, this.A, "])");
    }

    /* compiled from: Format.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public String a;
        public String b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        public String h;
        public f0 i;
        public String j;
        public String k;
        public int l;
        public List<byte[]> m;
        public r n;
        public long o;
        public int p;
        public int q;
        public float r;
        public int s;
        public float t;
        public byte[] u;
        public int v;
        public n w;
        public int x;
        public int y;
        public int z;

        public a() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
        }

        public final v a() {
            return new v(this);
        }

        @CanIgnoreReturnValue
        public final void b(int i) {
            this.a = Integer.toString(i);
        }

        public a(v vVar) {
            this.a = vVar.b;
            this.b = vVar.c;
            this.c = vVar.d;
            this.d = vVar.e;
            this.e = vVar.f;
            this.f = vVar.g;
            this.g = vVar.h;
            this.h = vVar.j;
            this.i = vVar.k;
            this.j = vVar.l;
            this.k = vVar.m;
            this.l = vVar.n;
            this.m = vVar.o;
            this.n = vVar.p;
            this.o = vVar.q;
            this.p = vVar.r;
            this.q = vVar.s;
            this.r = vVar.t;
            this.s = vVar.u;
            this.t = vVar.v;
            this.u = vVar.w;
            this.v = vVar.x;
            this.w = vVar.y;
            this.x = vVar.z;
            this.y = vVar.A;
            this.z = vVar.B;
            this.A = vVar.C;
            this.B = vVar.D;
            this.C = vVar.E;
            this.D = vVar.F;
            this.E = vVar.G;
            this.F = vVar.H;
        }
    }
}
