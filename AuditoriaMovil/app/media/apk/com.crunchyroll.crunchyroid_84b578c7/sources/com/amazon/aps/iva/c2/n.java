package com.amazon.aps.iva.c2;
/* compiled from: ParagraphStyle.kt */
/* loaded from: classes.dex */
public final class n {
    public final com.amazon.aps.iva.n2.h a;
    public final com.amazon.aps.iva.n2.j b;
    public final long c;
    public final com.amazon.aps.iva.n2.m d;
    public final q e;
    public final com.amazon.aps.iva.n2.f f;
    public final com.amazon.aps.iva.n2.e g;
    public final com.amazon.aps.iva.n2.d h;
    public final com.amazon.aps.iva.n2.n i;
    public final int j;
    public final int k;
    public final int l;

    public n(com.amazon.aps.iva.n2.h hVar, com.amazon.aps.iva.n2.j jVar, long j, com.amazon.aps.iva.n2.m mVar, q qVar, com.amazon.aps.iva.n2.f fVar, com.amazon.aps.iva.n2.e eVar, com.amazon.aps.iva.n2.d dVar, com.amazon.aps.iva.n2.n nVar) {
        int i;
        int i2;
        int i3;
        this.a = hVar;
        this.b = jVar;
        this.c = j;
        this.d = mVar;
        this.e = qVar;
        this.f = fVar;
        this.g = eVar;
        this.h = dVar;
        this.i = nVar;
        if (hVar != null) {
            i = hVar.a;
        } else {
            i = 5;
        }
        this.j = i;
        if (eVar != null) {
            i2 = eVar.a;
        } else {
            i2 = com.amazon.aps.iva.n2.e.b;
        }
        this.k = i2;
        if (dVar != null) {
            i3 = dVar.a;
        } else {
            i3 = 1;
        }
        this.l = i3;
        if (!com.amazon.aps.iva.o2.m.a(j, com.amazon.aps.iva.o2.m.c)) {
            if (!(com.amazon.aps.iva.o2.m.c(j) >= 0.0f)) {
                throw new IllegalStateException(("lineHeight can't be negative (" + com.amazon.aps.iva.o2.m.c(j) + ')').toString());
            }
        }
    }

    public final n a(n nVar) {
        if (nVar == null) {
            return this;
        }
        return o.a(this, nVar.a, nVar.b, nVar.c, nVar.d, nVar.e, nVar.f, nVar.g, nVar.h, nVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, nVar.b) && com.amazon.aps.iva.o2.m.a(this.c, nVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, nVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, nVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, nVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, nVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, nVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, nVar.i)) {
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
        int i8 = 0;
        com.amazon.aps.iva.n2.h hVar = this.a;
        if (hVar != null) {
            i = Integer.hashCode(hVar.a);
        } else {
            i = 0;
        }
        int i9 = i * 31;
        com.amazon.aps.iva.n2.j jVar = this.b;
        if (jVar != null) {
            i2 = Integer.hashCode(jVar.a);
        } else {
            i2 = 0;
        }
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        int a = com.amazon.aps.iva.b8.i.a(this.c, (i9 + i2) * 31, 31);
        com.amazon.aps.iva.n2.m mVar = this.d;
        if (mVar != null) {
            i3 = mVar.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (a + i3) * 31;
        q qVar = this.e;
        if (qVar != null) {
            i4 = qVar.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        com.amazon.aps.iva.n2.f fVar = this.f;
        if (fVar != null) {
            i5 = fVar.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        com.amazon.aps.iva.n2.e eVar = this.g;
        if (eVar != null) {
            i6 = Integer.hashCode(eVar.a);
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        com.amazon.aps.iva.n2.d dVar = this.h;
        if (dVar != null) {
            i7 = Integer.hashCode(dVar.a);
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        com.amazon.aps.iva.n2.n nVar = this.i;
        if (nVar != null) {
            i8 = nVar.hashCode();
        }
        return i14 + i8;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.a + ", textDirection=" + this.b + ", lineHeight=" + ((Object) com.amazon.aps.iva.o2.m.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + this.g + ", hyphens=" + this.h + ", textMotion=" + this.i + ')';
    }
}
