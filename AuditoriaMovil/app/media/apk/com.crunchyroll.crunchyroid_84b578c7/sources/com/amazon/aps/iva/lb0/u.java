package com.amazon.aps.iva.lb0;

import java.util.ArrayList;
/* compiled from: _CollectionsJvm.kt */
/* loaded from: classes4.dex */
public class u extends t {
    public static final ArrayList j0(Iterable iterable, Class cls) {
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
