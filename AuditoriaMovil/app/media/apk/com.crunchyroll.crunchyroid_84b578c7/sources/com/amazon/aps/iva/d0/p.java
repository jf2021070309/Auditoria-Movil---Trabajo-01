package com.amazon.aps.iva.d0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
/* compiled from: Column.kt */
/* loaded from: classes.dex */
public final class p implements o {
    public static final p a = new p();

    @Override // com.amazon.aps.iva.d0.o
    public final com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.a1.f fVar) {
        b.a aVar = a.C0097a.m;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        return fVar.o(new HorizontalAlignElement(aVar));
    }

    @Override // com.amazon.aps.iva.d0.o
    public final com.amazon.aps.iva.a1.f c(com.amazon.aps.iva.a1.f fVar, boolean z) {
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        if (1.0f > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return fVar.o(new LayoutWeightElement(z));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
