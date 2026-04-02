package com.amazon.aps.iva.d0;

import androidx.compose.foundation.layout.LayoutWeightElement;
/* compiled from: Column.kt */
/* loaded from: classes.dex */
public interface o {
    static com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        if (1.0f > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return fVar.o(new LayoutWeightElement(true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.a1.f fVar);

    com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, boolean z);
}
