package com.amazon.aps.iva.xw;

import com.amazon.aps.iva.ee0.f1;
import java.util.Iterator;
import java.util.List;
/* compiled from: ListExtensions.kt */
/* loaded from: classes2.dex */
public final class y {
    public static final List a(Object obj, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (com.amazon.aps.iva.yb0.j.a(it.next(), obj)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0 && i < f1.B(list)) {
            z = true;
        }
        if (z) {
            return list.subList(i + 1, list.size());
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    public static final <T> boolean b(List<? extends T> list, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        if (list.isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            if (!lVar.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
