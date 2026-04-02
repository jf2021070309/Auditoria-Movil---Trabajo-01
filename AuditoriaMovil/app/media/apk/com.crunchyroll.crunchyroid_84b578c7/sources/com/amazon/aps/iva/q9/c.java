package com.amazon.aps.iva.q9;

import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.t9.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements com.amazon.aps.iva.p9.a<T> {
    public final ArrayList a = new ArrayList();
    public T b;
    public final com.amazon.aps.iva.r9.d<T> c;
    public a d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c(com.amazon.aps.iva.r9.d<T> dVar) {
        this.c = dVar;
    }

    @Override // com.amazon.aps.iva.p9.a
    public final void a(T t) {
        this.b = t;
        e(this.d, t);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t);

    public final void d(Collection collection) {
        this.a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.a.add(pVar.a);
            }
        }
        if (this.a.isEmpty()) {
            com.amazon.aps.iva.r9.d<T> dVar = this.c;
            synchronized (dVar.c) {
                if (dVar.d.remove(this) && dVar.d.isEmpty()) {
                    dVar.d();
                }
            }
        } else {
            com.amazon.aps.iva.r9.d<T> dVar2 = this.c;
            synchronized (dVar2.c) {
                if (dVar2.d.add(this)) {
                    if (dVar2.d.size() == 1) {
                        dVar2.e = dVar2.a();
                        m c = m.c();
                        int i = com.amazon.aps.iva.r9.d.f;
                        String.format("%s: initial state = %s", dVar2.getClass().getSimpleName(), dVar2.e);
                        c.a(new Throwable[0]);
                        dVar2.c();
                    }
                    a(dVar2.e);
                }
            }
        }
        e(this.d, this.b);
    }

    public final void e(a aVar, T t) {
        if (!this.a.isEmpty() && aVar != null) {
            if (t != null && !c(t)) {
                ArrayList arrayList = this.a;
                com.amazon.aps.iva.p9.d dVar = (com.amazon.aps.iva.p9.d) aVar;
                synchronized (dVar.c) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (dVar.a(str)) {
                            m c = m.c();
                            int i = com.amazon.aps.iva.p9.d.d;
                            String.format("Constraints met for %s", str);
                            c.a(new Throwable[0]);
                            arrayList2.add(str);
                        }
                    }
                    com.amazon.aps.iva.p9.c cVar = dVar.a;
                    if (cVar != null) {
                        cVar.g(arrayList2);
                    }
                }
                return;
            }
            ArrayList arrayList3 = this.a;
            com.amazon.aps.iva.p9.d dVar2 = (com.amazon.aps.iva.p9.d) aVar;
            synchronized (dVar2.c) {
                com.amazon.aps.iva.p9.c cVar2 = dVar2.a;
                if (cVar2 != null) {
                    cVar2.c(arrayList3);
                }
            }
        }
    }
}
