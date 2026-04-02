package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.e4.t0;
/* compiled from: MultiParagraph.kt */
/* loaded from: classes.dex */
public final class i {
    public final h a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public i(a aVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final com.amazon.aps.iva.e1.e a(com.amazon.aps.iva.e1.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        return eVar.d(com.amazon.aps.iva.e1.d.d(0.0f, this.f));
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return com.amazon.aps.iva.aq.j.j(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c && this.d == iVar.d && this.e == iVar.e && Float.compare(this.f, iVar.f) == 0 && Float.compare(this.g, iVar.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + t0.b(this.f, com.amazon.aps.iva.a0.r.a(this.e, com.amazon.aps.iva.a0.r.a(this.d, com.amazon.aps.iva.a0.r.a(this.c, com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return com.amazon.aps.iva.q.c0.b(sb, this.g, ')');
    }
}
