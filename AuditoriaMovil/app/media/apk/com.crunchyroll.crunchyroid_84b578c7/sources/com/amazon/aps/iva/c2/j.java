package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.d0.b2;
/* compiled from: MultiParagraphIntrinsics.kt */
/* loaded from: classes.dex */
public final class j {
    public final k a;
    public final int b;
    public final int c;

    public j(com.amazon.aps.iva.k2.d dVar, int i, int i2) {
        this.a = dVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, jVar.a) && this.b == jVar.b && this.c == jVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + com.amazon.aps.iva.a0.r.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return b2.b(sb, this.c, ')');
    }
}
