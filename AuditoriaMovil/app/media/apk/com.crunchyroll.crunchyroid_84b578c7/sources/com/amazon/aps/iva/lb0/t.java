package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
/* compiled from: ReversedViews.kt */
/* loaded from: classes4.dex */
public class t extends s {
    public static final int b0(int i, List list) {
        if (new com.amazon.aps.iva.ec0.j(0, f1.B(list)).j(i)) {
            return f1.B(list) - i;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Element index ", i, " must be in range [");
        d.append(new com.amazon.aps.iva.ec0.j(0, f1.B(list)));
        d.append("].");
        throw new IndexOutOfBoundsException(d.toString());
    }

    public static final int c0(int i, List list) {
        if (new com.amazon.aps.iva.ec0.j(0, list.size()).j(i)) {
            return list.size() - i;
        }
        StringBuilder d = com.amazon.aps.iva.e4.e.d("Position index ", i, " must be in range [");
        d.append(new com.amazon.aps.iva.ec0.j(0, list.size()));
        d.append("].");
        throw new IndexOutOfBoundsException(d.toString());
    }

    public static final void d0(Collection collection, Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.yb0.j.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            collection.add(obj);
        }
    }

    public static final boolean e0(Collection collection, Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.yb0.j.f(objArr, "elements");
        return collection.addAll(m.B(objArr));
    }

    public static final Collection f0(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            iterable = x.X0(iterable);
        }
        return (Collection) iterable;
    }

    public static final boolean g0(Iterable iterable, com.amazon.aps.iva.xb0.l lVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static final boolean h0(List list, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof com.amazon.aps.iva.zb0.a) && !(list instanceof com.amazon.aps.iva.zb0.b)) {
                com.amazon.aps.iva.yb0.h0.g(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return g0(list, lVar, true);
            } catch (ClassCastException e) {
                com.amazon.aps.iva.yb0.j.j(com.amazon.aps.iva.yb0.h0.class.getName(), e);
                throw e;
            }
        }
        com.amazon.aps.iva.ec0.i it = new com.amazon.aps.iva.ec0.j(0, f1.B(list)).iterator();
        int i = 0;
        while (it.d) {
            int b = it.b();
            Object obj = list.get(b);
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i != b) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int B = f1.B(list);
        if (i > B) {
            return true;
        }
        while (true) {
            list.remove(B);
            if (B == i) {
                return true;
            }
            B--;
        }
    }

    public static final Object i0(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }
}
