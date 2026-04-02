package com.amazon.aps.iva.d0;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import com.amazon.aps.iva.a1.a;
import com.amazon.aps.iva.a1.b;
/* compiled from: Row.kt */
/* loaded from: classes.dex */
public final class y1 implements x1 {
    public static final y1 a = new y1();

    public final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, a.c cVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        return fVar.o(new VerticalAlignElement((b.C0098b) cVar));
    }

    public final com.amazon.aps.iva.a1.f b(com.amazon.aps.iva.a1.f fVar, boolean z) {
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
