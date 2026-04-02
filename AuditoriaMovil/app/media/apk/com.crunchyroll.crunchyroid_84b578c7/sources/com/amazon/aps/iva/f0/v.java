package com.amazon.aps.iva.f0;

import com.amazon.aps.iva.ee0.f1;
import java.util.List;
/* compiled from: LazyLayoutMeasureScope.kt */
/* loaded from: classes.dex */
public interface v extends com.amazon.aps.iva.s1.f0 {
    List<com.amazon.aps.iva.s1.u0> O(int i, long j);

    @Override // com.amazon.aps.iva.o2.c
    default long j(long j) {
        boolean z;
        if (j != com.amazon.aps.iva.e1.g.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f1.f(x(com.amazon.aps.iva.e1.g.d(j)), x(com.amazon.aps.iva.e1.g.b(j)));
        }
        return com.amazon.aps.iva.o2.g.c;
    }

    @Override // com.amazon.aps.iva.o2.c
    default float x(float f) {
        return f / getDensity();
    }
}
