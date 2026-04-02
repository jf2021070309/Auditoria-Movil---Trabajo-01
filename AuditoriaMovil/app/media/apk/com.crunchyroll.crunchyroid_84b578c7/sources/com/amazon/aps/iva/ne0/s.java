package com.amazon.aps.iva.ne0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.ne0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: _Sequences.kt */
/* loaded from: classes4.dex */
public class s extends o {
    public static final <T> int T(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                f1.R();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> h<T> U(h<? extends T> hVar, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i != 0) {
                if (hVar instanceof c) {
                    return ((c) hVar).a(i);
                }
                return new b(hVar, i);
            }
            return hVar;
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Requested element count ", i, " is less than zero.").toString());
    }

    public static final e V(h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        return new e(hVar, true, lVar);
    }

    public static final e W(h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        return new e(hVar, false, lVar);
    }

    public static final Object X(e eVar) {
        e.a aVar = new e.a(eVar);
        if (!aVar.hasNext()) {
            return null;
        }
        return aVar.next();
    }

    public static final f Y(h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        return new f(hVar, lVar, r.b);
    }

    public static String Z(h hVar, String str) {
        com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : hVar) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            com.amazon.aps.iva.aq.k.g(sb, obj, null);
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> T a0(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final u b0(h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        return new u(hVar, lVar);
    }

    public static final e c0(h hVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        return W(new u(hVar, lVar), q.h);
    }

    public static final Comparable d0(u uVar) {
        Iterator it = uVar.a.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        com.amazon.aps.iva.xb0.l<T, R> lVar = uVar.b;
        Comparable comparable = (Comparable) lVar.invoke(next);
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) lVar.invoke(it.next());
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final f e0(h hVar, Object obj) {
        return k.Q(k.S(hVar, k.S(obj)));
    }

    public static final <T> List<T> f0(h<? extends T> hVar) {
        Iterator<? extends T> it = hVar.iterator();
        if (!it.hasNext()) {
            return z.b;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return f1.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final ArrayList g0(h hVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
