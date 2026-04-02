package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.y0;
/* compiled from: GlanceModifier.kt */
/* loaded from: classes.dex */
public final class g implements n {
    public final n b;
    public final n c;

    /* compiled from: GlanceModifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<String, n.c, String> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final String invoke(String str, n.c cVar) {
            boolean z;
            String str2 = str;
            n.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(str2, "acc");
            com.amazon.aps.iva.yb0.j.f(cVar2, "element");
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return cVar2.toString();
            }
            return str2 + ", " + cVar2;
        }
    }

    public g(n nVar, n nVar2) {
        com.amazon.aps.iva.yb0.j.f(nVar, "outer");
        com.amazon.aps.iva.yb0.j.f(nVar2, "inner");
        this.b = nVar;
        this.c = nVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.p4.n
    public final <R> R a(R r, com.amazon.aps.iva.xb0.p<? super R, ? super n.c, ? extends R> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "operation");
        return (R) this.c.a(this.b.a(r, pVar), pVar);
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean b(y0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "predicate");
        if (this.b.b(cVar) && this.c.b(cVar)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.p4.n
    public final boolean c(com.amazon.aps.iva.xb0.l<? super n.c, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        if (!this.b.c(lVar) && !this.c.c(lVar)) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.p4.n
    public final n d(n nVar) {
        return n.b.a(this, nVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.b, gVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, gVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("["), (String) a("", a.h), ']');
    }
}
