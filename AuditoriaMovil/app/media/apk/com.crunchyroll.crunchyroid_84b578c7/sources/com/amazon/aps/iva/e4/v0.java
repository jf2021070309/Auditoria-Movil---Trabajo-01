package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.c0;
import com.amazon.aps.iva.e4.t;
import com.amazon.aps.iva.e4.x;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
/* compiled from: MessageSetSchema.java */
/* loaded from: classes.dex */
public final class v0<T> implements g1<T> {
    public final q0 a;
    public final n1<?, ?> b;
    public final boolean c;
    public final q<?> d;

    public v0(n1<?, ?> n1Var, q<?> qVar, q0 q0Var) {
        this.b = n1Var;
        this.c = qVar.e(q0Var);
        this.d = qVar;
        this.a = q0Var;
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void a(T t, f1 f1Var, p pVar) throws IOException {
        n1 n1Var = this.b;
        o1 f = n1Var.f(t);
        q qVar = this.d;
        t<ET> d = qVar.d(t);
        do {
            try {
                if (f1Var.getFieldNumber() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                n1Var.n(t, f);
            }
        } while (c(f1Var, pVar, qVar, d, n1Var, f));
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void b(Object obj, m mVar) throws IOException {
        Iterator<Map.Entry<?, Object>> k = this.d.c(obj).k();
        while (k.hasNext()) {
            Map.Entry<?, Object> next = k.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.getLiteJavaType() == v1.MESSAGE) {
                bVar.isRepeated();
                bVar.isPacked();
                if (next instanceof c0.a) {
                    bVar.getNumber();
                    mVar.l(0, ((c0.a) next).b.getValue().b());
                } else {
                    bVar.getNumber();
                    mVar.l(0, next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        n1<?, ?> n1Var = this.b;
        n1Var.r(n1Var.g(obj), mVar);
    }

    public final <UT, UB, ET extends t.b<ET>> boolean c(f1 f1Var, p pVar, q<ET> qVar, t<ET> tVar, n1<UT, UB> n1Var, UB ub) throws IOException {
        int tag = f1Var.getTag();
        q0 q0Var = this.a;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                x.e b = qVar.b(pVar, q0Var, tag >>> 3);
                if (b != null) {
                    qVar.h(b);
                    return true;
                }
                return n1Var.l(ub, f1Var);
            }
            return f1Var.skipField();
        }
        x.e eVar = null;
        int i = 0;
        i iVar = null;
        while (f1Var.getFieldNumber() != Integer.MAX_VALUE) {
            int tag2 = f1Var.getTag();
            if (tag2 == 16) {
                i = f1Var.readUInt32();
                eVar = qVar.b(pVar, q0Var, i);
            } else if (tag2 == 26) {
                if (eVar != null) {
                    qVar.h(eVar);
                } else {
                    iVar = f1Var.readBytes();
                }
            } else if (!f1Var.skipField()) {
                break;
            }
        }
        if (f1Var.getTag() == 12) {
            if (iVar != null) {
                if (eVar != null) {
                    qVar.i(eVar);
                } else {
                    n1Var.d(ub, i, iVar);
                }
            }
            return true;
        }
        throw new a0("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final boolean equals(T t, T t2) {
        n1<?, ?> n1Var = this.b;
        if (!n1Var.g(t).equals(n1Var.g(t2))) {
            return false;
        }
        if (this.c) {
            q<?> qVar = this.d;
            return qVar.c(t).equals(qVar.c(t2));
        }
        return true;
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final int getSerializedSize(T t) {
        j1<?, Object> j1Var;
        n1<?, ?> n1Var = this.b;
        int i = 0;
        int i2 = n1Var.i(n1Var.g(t)) + 0;
        if (this.c) {
            t<?> c = this.d.c(t);
            int i3 = 0;
            while (true) {
                j1Var = c.a;
                if (i >= j1Var.e()) {
                    break;
                }
                i3 += t.f(j1Var.d(i));
                i++;
            }
            for (Map.Entry<?, Object> entry : j1Var.g()) {
                i3 += t.f(entry);
            }
            return i2 + i3;
        }
        return i2;
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final int hashCode(T t) {
        int hashCode = this.b.g(t).hashCode();
        if (this.c) {
            return (hashCode * 53) + this.d.c(t).hashCode();
        }
        return hashCode;
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final boolean isInitialized(T t) {
        return this.d.c(t).i();
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void makeImmutable(T t) {
        this.b.j(t);
        this.d.f(t);
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final void mergeFrom(T t, T t2) {
        Class<?> cls = h1.a;
        n1<?, ?> n1Var = this.b;
        n1Var.o(t, n1Var.k(n1Var.g(t), n1Var.g(t2)));
        if (this.c) {
            h1.B(this.d, t, t2);
        }
    }

    @Override // com.amazon.aps.iva.e4.g1
    public final T newInstance() {
        return (T) this.a.newBuilderForType().d();
    }
}
