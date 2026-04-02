package com.amazon.aps.iva.r10;

import com.amazon.aps.iva.ez.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: HistoryViewModel.kt */
/* loaded from: classes2.dex */
public final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>>, List<l>> {
    public static final o0 h = new o0();

    public o0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final List<l> invoke(com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> gVar) {
        boolean z;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<a0>> gVar2 = gVar;
        if (gVar2 instanceof g.c) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) ((g.c) gVar2).a) {
                if (obj instanceof l) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((l) next).c == j0.SELECTED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }
}
