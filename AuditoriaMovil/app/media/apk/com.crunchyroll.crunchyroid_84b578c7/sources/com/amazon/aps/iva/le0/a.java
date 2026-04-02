package com.amazon.aps.iva.le0;

import com.amazon.aps.iva.me0.c;
import com.amazon.aps.iva.xd0.i;
import com.amazon.aps.iva.yb0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: scopeUtils.kt */
/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        j.f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final c b(ArrayList arrayList) {
        boolean z;
        c cVar = new c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i iVar = (i) next;
            if (iVar != null && iVar != i.b.b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cVar.add(next);
            }
        }
        return cVar;
    }
}
