package com.amazon.aps.iva.nd0;

import com.amazon.aps.iva.oe0.m;
/* compiled from: CallableId.kt */
/* loaded from: classes4.dex */
public final class a {
    public final c a;
    public final c b;
    public final f c;
    public final c d;

    static {
        c.j(h.f);
    }

    public a(c cVar, f fVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "packageName");
        this.a = cVar;
        this.b = null;
        this.c = fVar;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        c cVar = this.b;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31;
        c cVar2 = this.d;
        if (cVar2 != null) {
            i = cVar2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.e0(this.a.b(), '.', '/'));
        sb.append("/");
        c cVar = this.b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.c);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
