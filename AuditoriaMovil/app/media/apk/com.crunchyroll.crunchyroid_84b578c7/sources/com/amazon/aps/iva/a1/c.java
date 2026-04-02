package com.amazon.aps.iva.a1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
public final class c implements f {
    public final f c;
    public final f d;

    /* compiled from: Modifier.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<String, f.b, String> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final String invoke(String str, f.b bVar) {
            boolean z;
            String str2 = str;
            f.b bVar2 = bVar;
            j.f(str2, "acc");
            j.f(bVar2, "element");
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public c(f fVar, f fVar2) {
        j.f(fVar, "outer");
        j.f(fVar2, "inner");
        this.c = fVar;
        this.d = fVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.a1.f
    public final <R> R a(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return (R) this.d.a(this.c.a(r, pVar), pVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (j.a(this.c, cVar.c) && j.a(this.d, cVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.aps.iva.a1.f
    public final boolean g(com.amazon.aps.iva.xb0.l<? super f.b, Boolean> lVar) {
        j.f(lVar, "predicate");
        if (this.c.g(lVar) && this.d.g(lVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("["), (String) a("", a.h), ']');
    }
}
