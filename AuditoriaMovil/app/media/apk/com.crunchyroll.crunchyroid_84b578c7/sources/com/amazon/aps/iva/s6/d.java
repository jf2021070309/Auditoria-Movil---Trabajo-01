package com.amazon.aps.iva.s6;

import com.amazon.aps.iva.s6.g;
import com.google.common.collect.Ordering;
import java.util.Comparator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ d(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ordering<Integer> ordering = g.k;
                return 0;
            default:
                return g.h.f((g.h) obj, (g.h) obj2);
        }
    }
}
