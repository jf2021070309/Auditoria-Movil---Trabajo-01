package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.f1.t0;
import com.amazon.aps.iva.n2.k;
import com.google.android.gms.ads.AdRequest;
/* compiled from: SpanStyle.kt */
/* loaded from: classes.dex */
public final class u {
    public final com.amazon.aps.iva.n2.k a;
    public final long b;
    public final com.amazon.aps.iva.h2.y c;
    public final com.amazon.aps.iva.h2.t d;
    public final com.amazon.aps.iva.h2.u e;
    public final com.amazon.aps.iva.h2.k f;
    public final String g;
    public final long h;
    public final com.amazon.aps.iva.n2.a i;
    public final com.amazon.aps.iva.n2.l j;
    public final com.amazon.aps.iva.j2.d k;
    public final long l;
    public final com.amazon.aps.iva.n2.i m;
    public final t0 n;
    public final r o;
    public final com.amazon.aps.iva.h1.f p;

    public u(com.amazon.aps.iva.n2.k kVar, long j, com.amazon.aps.iva.h2.y yVar, com.amazon.aps.iva.h2.t tVar, com.amazon.aps.iva.h2.u uVar, com.amazon.aps.iva.h2.k kVar2, String str, long j2, com.amazon.aps.iva.n2.a aVar, com.amazon.aps.iva.n2.l lVar, com.amazon.aps.iva.j2.d dVar, long j3, com.amazon.aps.iva.n2.i iVar, t0 t0Var, r rVar, com.amazon.aps.iva.h1.f fVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "textForegroundStyle");
        this.a = kVar;
        this.b = j;
        this.c = yVar;
        this.d = tVar;
        this.e = uVar;
        this.f = kVar2;
        this.g = str;
        this.h = j2;
        this.i = aVar;
        this.j = lVar;
        this.k = dVar;
        this.l = j3;
        this.m = iVar;
        this.n = t0Var;
        this.o = rVar;
        this.p = fVar;
    }

    public final com.amazon.aps.iva.f1.s a() {
        return this.a.d();
    }

    public final long b() {
        return this.a.b();
    }

    public final boolean c(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "other");
        if (this == uVar) {
            return true;
        }
        if (com.amazon.aps.iva.o2.m.a(this.b, uVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, uVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, uVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, uVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, uVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, uVar.g) && com.amazon.aps.iva.o2.m.a(this.h, uVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, uVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, uVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, uVar.k) && com.amazon.aps.iva.f1.x.c(this.l, uVar.l) && com.amazon.aps.iva.yb0.j.a(this.o, uVar.o)) {
            return true;
        }
        return false;
    }

    public final boolean d(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "other");
        if (!com.amazon.aps.iva.yb0.j.a(this.a, uVar.a) || !com.amazon.aps.iva.yb0.j.a(this.m, uVar.m) || !com.amazon.aps.iva.yb0.j.a(this.n, uVar.n) || !com.amazon.aps.iva.yb0.j.a(this.p, uVar.p)) {
            return false;
        }
        return true;
    }

    public final u e(u uVar) {
        if (uVar == null) {
            return this;
        }
        com.amazon.aps.iva.n2.k kVar = uVar.a;
        return w.a(this, kVar.b(), kVar.d(), kVar.a(), uVar.b, uVar.c, uVar.d, uVar.e, uVar.f, uVar.g, uVar.h, uVar.i, uVar.j, uVar.k, uVar.l, uVar.m, uVar.n, uVar.o, uVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (c(uVar) && d(uVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long b = b();
        int i13 = com.amazon.aps.iva.f1.x.h;
        int hashCode = Long.hashCode(b) * 31;
        com.amazon.aps.iva.f1.s a = a();
        int i14 = 0;
        if (a != null) {
            i = a.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = Float.hashCode(this.a.a());
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        int a2 = com.amazon.aps.iva.b8.i.a(this.b, (hashCode2 + ((hashCode + i) * 31)) * 31, 31);
        com.amazon.aps.iva.h2.y yVar = this.c;
        if (yVar != null) {
            i2 = yVar.b;
        } else {
            i2 = 0;
        }
        int i15 = (a2 + i2) * 31;
        com.amazon.aps.iva.h2.t tVar = this.d;
        if (tVar != null) {
            i3 = Integer.hashCode(tVar.a);
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        com.amazon.aps.iva.h2.u uVar = this.e;
        if (uVar != null) {
            i4 = Integer.hashCode(uVar.a);
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        com.amazon.aps.iva.h2.k kVar = this.f;
        if (kVar != null) {
            i5 = kVar.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str = this.g;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int a3 = com.amazon.aps.iva.b8.i.a(this.h, (i18 + i6) * 31, 31);
        com.amazon.aps.iva.n2.a aVar = this.i;
        if (aVar != null) {
            i7 = Float.hashCode(aVar.a);
        } else {
            i7 = 0;
        }
        int i19 = (a3 + i7) * 31;
        com.amazon.aps.iva.n2.l lVar = this.j;
        if (lVar != null) {
            i8 = lVar.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        com.amazon.aps.iva.j2.d dVar = this.k;
        if (dVar != null) {
            i9 = dVar.hashCode();
        } else {
            i9 = 0;
        }
        int a4 = com.amazon.aps.iva.b8.i.a(this.l, (i20 + i9) * 31, 31);
        com.amazon.aps.iva.n2.i iVar = this.m;
        if (iVar != null) {
            i10 = iVar.a;
        } else {
            i10 = 0;
        }
        int i21 = (a4 + i10) * 31;
        t0 t0Var = this.n;
        if (t0Var != null) {
            i11 = t0Var.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        r rVar = this.o;
        if (rVar != null) {
            i12 = rVar.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        com.amazon.aps.iva.h1.f fVar = this.p;
        if (fVar != null) {
            i14 = fVar.hashCode();
        }
        return i23 + i14;
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) com.amazon.aps.iva.f1.x.i(b())) + ", brush=" + a() + ", alpha=" + this.a.a() + ", fontSize=" + ((Object) com.amazon.aps.iva.o2.m.d(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) com.amazon.aps.iva.o2.m.d(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) com.amazon.aps.iva.f1.x.i(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    public u(long j, long j2, com.amazon.aps.iva.h2.y yVar, com.amazon.aps.iva.h2.t tVar, com.amazon.aps.iva.h2.u uVar, com.amazon.aps.iva.h2.k kVar, String str, long j3, com.amazon.aps.iva.n2.a aVar, com.amazon.aps.iva.n2.l lVar, com.amazon.aps.iva.j2.d dVar, long j4, com.amazon.aps.iva.n2.i iVar, t0 t0Var, int i) {
        this((i & 1) != 0 ? com.amazon.aps.iva.f1.x.g : j, (i & 2) != 0 ? com.amazon.aps.iva.o2.m.c : j2, (i & 4) != 0 ? null : yVar, (i & 8) != 0 ? null : tVar, (i & 16) != 0 ? null : uVar, (i & 32) != 0 ? null : kVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? com.amazon.aps.iva.o2.m.c : j3, (i & 256) != 0 ? null : aVar, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : lVar, (i & 1024) != 0 ? null : dVar, (i & 2048) != 0 ? com.amazon.aps.iva.f1.x.g : j4, (i & 4096) != 0 ? null : iVar, (i & 8192) != 0 ? null : t0Var, (r) null, (com.amazon.aps.iva.h1.f) null);
    }

    public u(long j, long j2, com.amazon.aps.iva.h2.y yVar, com.amazon.aps.iva.h2.t tVar, com.amazon.aps.iva.h2.u uVar, com.amazon.aps.iva.h2.k kVar, String str, long j3, com.amazon.aps.iva.n2.a aVar, com.amazon.aps.iva.n2.l lVar, com.amazon.aps.iva.j2.d dVar, long j4, com.amazon.aps.iva.n2.i iVar, t0 t0Var, r rVar, com.amazon.aps.iva.h1.f fVar) {
        this((j > com.amazon.aps.iva.f1.x.g ? 1 : (j == com.amazon.aps.iva.f1.x.g ? 0 : -1)) != 0 ? new com.amazon.aps.iva.n2.c(j) : k.b.a, j2, yVar, tVar, uVar, kVar, str, j3, aVar, lVar, dVar, j4, iVar, t0Var, rVar, fVar);
    }
}
