package com.amazon.aps.iva.lb0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes4.dex */
public class s extends r {
    public static final <T> void a0(List<T> list, Comparator<? super T> comparator) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
