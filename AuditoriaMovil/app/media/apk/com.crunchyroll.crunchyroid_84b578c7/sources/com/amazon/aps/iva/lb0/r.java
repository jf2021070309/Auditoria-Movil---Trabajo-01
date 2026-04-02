package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: IteratorsJVM.kt */
/* loaded from: classes4.dex */
public class r extends f1 {
    public static final int Y(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static final ArrayList Z(Iterable iterable) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            t.d0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }
}
