package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.c2.b;
import com.amazon.aps.iva.h2.k;
import java.util.List;
/* compiled from: TextLayoutResult.kt */
/* loaded from: classes.dex */
public final class x {
    public final b a;
    public final a0 b;
    public final List<b.C0158b<p>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final com.amazon.aps.iva.o2.c g;
    public final com.amazon.aps.iva.o2.l h;
    public final k.a i;
    public final long j;

    public x() {
        throw null;
    }

    public x(b bVar, a0 a0Var, List list, int i, boolean z, int i2, com.amazon.aps.iva.o2.c cVar, com.amazon.aps.iva.o2.l lVar, k.a aVar, long j) {
        com.amazon.aps.iva.yb0.j.f(bVar, "text");
        com.amazon.aps.iva.yb0.j.f(a0Var, "style");
        com.amazon.aps.iva.yb0.j.f(list, "placeholders");
        com.amazon.aps.iva.yb0.j.f(cVar, "density");
        com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
        com.amazon.aps.iva.yb0.j.f(aVar, "fontFamilyResolver");
        this.a = bVar;
        this.b = a0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = cVar;
        this.h = lVar;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.a, xVar.a) || !com.amazon.aps.iva.yb0.j.a(this.b, xVar.b) || !com.amazon.aps.iva.yb0.j.a(this.c, xVar.c) || this.d != xVar.d || this.e != xVar.e) {
            return false;
        }
        if (this.f == xVar.f) {
            z = true;
        } else {
            z = false;
        }
        if (z && com.amazon.aps.iva.yb0.j.a(this.g, xVar.g) && this.h == xVar.h && com.amazon.aps.iva.yb0.j.a(this.i, xVar.i) && com.amazon.aps.iva.o2.a.b(this.j, xVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        List<b.C0158b<p>> list = this.c;
        int a = com.amazon.aps.iva.a0.r.a(this.f, com.amazon.aps.iva.a0.r.b(this.e, (defpackage.a.a(list, (hashCode + (this.a.hashCode() * 31)) * 31, 31) + this.d) * 31, 31), 31);
        int hashCode2 = this.h.hashCode();
        int hashCode3 = this.i.hashCode();
        return Long.hashCode(this.j) + ((hashCode3 + ((hashCode2 + ((this.g.hashCode() + a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) com.amazon.aps.iva.e1.d.l(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) com.amazon.aps.iva.o2.a.k(this.j)) + ')';
    }
}
