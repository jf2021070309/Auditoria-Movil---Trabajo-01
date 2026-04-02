package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.b0;
import com.amazon.aps.iva.v4.s;
import com.amazon.aps.iva.v4.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
public final class t0<T> implements e1<T> {
    public final p0 a;
    public final k1<?, ?> b;
    public final boolean c;
    public final p<?> d;

    public t0(k1<?, ?> k1Var, p<?> pVar, p0 p0Var) {
        this.b = k1Var;
        this.c = pVar.e(p0Var);
        this.d = pVar;
        this.a = p0Var;
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final void a(Object obj, l lVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.d.c(obj).k();
        while (k.hasNext()) {
            Map.Entry<?, Object> next = k.next();
            s.b bVar = (s.b) next.getKey();
            if (bVar.getLiteJavaType() == s1.MESSAGE) {
                bVar.isRepeated();
                bVar.isPacked();
                if (next instanceof b0.a) {
                    bVar.getNumber();
                    lVar.l(0, ((b0.a) next).b.getValue().b());
                } else {
                    bVar.getNumber();
                    lVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        k1<?, ?> k1Var = this.b;
        k1Var.r(k1Var.g(obj), lVar);
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final void b(T t, d1 d1Var, o oVar) throws IOException {
        k1 k1Var = this.b;
        l1 f = k1Var.f(t);
        p pVar = this.d;
        s<ET> d = pVar.d(t);
        do {
            try {
                if (d1Var.getFieldNumber() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                k1Var.n(t, f);
            }
        } while (c(d1Var, oVar, pVar, d, k1Var, f));
    }

    public final <UT, UB, ET extends s.b<ET>> boolean c(d1 d1Var, o oVar, p<ET> pVar, s<ET> sVar, k1<UT, UB> k1Var, UB ub) throws IOException {
        int tag = d1Var.getTag();
        p0 p0Var = this.a;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                w.e b = pVar.b(oVar, p0Var, tag >>> 3);
                if (b != null) {
                    pVar.h(b);
                    return true;
                }
                return k1Var.l(ub, d1Var);
            }
            return d1Var.skipField();
        }
        w.e eVar = null;
        int i = 0;
        h hVar = null;
        while (d1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = d1Var.getTag();
            if (tag2 == 16) {
                i = d1Var.readUInt32();
                eVar = pVar.b(oVar, p0Var, i);
            } else if (tag2 == 26) {
                if (eVar != null) {
                    pVar.h(eVar);
                } else {
                    hVar = d1Var.readBytes();
                }
            } else if (!d1Var.skipField()) {
                break;
            }
        }
        if (d1Var.getTag() == 12) {
            if (hVar != null) {
                if (eVar != null) {
                    pVar.i(eVar);
                } else {
                    k1Var.d(ub, i, hVar);
                }
            }
            return true;
        }
        throw new z("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final boolean equals(T t, T t2) {
        k1<?, ?> k1Var = this.b;
        if (!k1Var.g(t).equals(k1Var.g(t2))) {
            return false;
        }
        if (this.c) {
            p<?> pVar = this.d;
            return pVar.c(t).equals(pVar.c(t2));
        }
        return true;
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final int getSerializedSize(T t) {
        h1<?, Object> h1Var;
        k1<?, ?> k1Var = this.b;
        int i = 0;
        int i2 = k1Var.i(k1Var.g(t)) + 0;
        if (this.c) {
            s<?> c = this.d.c(t);
            int i3 = 0;
            while (true) {
                h1Var = c.a;
                if (i >= h1Var.e()) {
                    break;
                }
                i3 += s.f(h1Var.d(i));
                i++;
            }
            for (Map.Entry<?, Object> entry : h1Var.g()) {
                i3 += s.f(entry);
            }
            return i2 + i3;
        }
        return i2;
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final int hashCode(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final boolean isInitialized(T t) {
        return this.d.c(t).i();
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final void makeImmutable(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final void mergeFrom(T t, T t2) {
        Class<?> cls = f1.a;
        k1<?, ?> k1Var = this.b;
        k1Var.o(t, k1Var.k(k1Var.g(t), k1Var.g(t2)));
        if (this.c) {
            f1.B(this.d, t, t2);
        }
    }

    @Override // com.amazon.aps.iva.v4.e1
    public final T newInstance() {
        return (T) this.a.newBuilderForType().d();
    }
}
