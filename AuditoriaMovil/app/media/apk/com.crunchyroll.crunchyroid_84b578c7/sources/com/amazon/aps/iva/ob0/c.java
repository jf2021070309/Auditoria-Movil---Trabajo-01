package com.amazon.aps.iva.ob0;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.io.Serializable;
/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public final class c implements g, Serializable {
    public final g b;
    public final g.b c;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements p<String, g.b, String> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final String invoke(String str, g.b bVar) {
            boolean z;
            String str2 = str;
            g.b bVar2 = bVar;
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

    public c(g.b bVar, g gVar) {
        j.f(gVar, "left");
        j.f(bVar, "element");
        this.b = gVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                g gVar = cVar2.b;
                if (gVar instanceof c) {
                    cVar2 = (c) gVar;
                } else {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                g gVar2 = cVar3.b;
                if (gVar2 instanceof c) {
                    cVar3 = (c) gVar2;
                } else {
                    cVar3 = null;
                }
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g.b bVar = cVar4.c;
                if (!j.a(cVar.get(bVar.getKey()), bVar)) {
                    z = false;
                    break;
                }
                g gVar3 = cVar4.b;
                if (gVar3 instanceof c) {
                    cVar4 = (c) gVar3;
                } else {
                    j.d(gVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g.b bVar2 = (g.b) gVar3;
                    z = j.a(cVar.get(bVar2.getKey()), bVar2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        j.f(pVar, "operation");
        return pVar.invoke((Object) this.b.fold(r, pVar), this.c);
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final <E extends g.b> E get(g.c<E> cVar) {
        j.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e = (E) cVar2.c.get(cVar);
            if (e != null) {
                return e;
            }
            g gVar = cVar2.b;
            if (gVar instanceof c) {
                cVar2 = (c) gVar;
            } else {
                return (E) gVar.get(cVar);
            }
        }
    }

    public final int hashCode() {
        return this.c.hashCode() + this.b.hashCode();
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final g minusKey(g.c<?> cVar) {
        j.f(cVar, "key");
        g.b bVar = this.c;
        g.b bVar2 = bVar.get(cVar);
        g gVar = this.b;
        if (bVar2 != null) {
            return gVar;
        }
        g minusKey = gVar.minusKey(cVar);
        if (minusKey == gVar) {
            return this;
        }
        if (minusKey != h.b) {
            return new c(bVar, minusKey);
        }
        return bVar;
    }

    @Override // com.amazon.aps.iva.ob0.g
    public final g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public final String toString() {
        return t1.b(new StringBuilder("["), (String) fold("", a.h), ']');
    }
}
