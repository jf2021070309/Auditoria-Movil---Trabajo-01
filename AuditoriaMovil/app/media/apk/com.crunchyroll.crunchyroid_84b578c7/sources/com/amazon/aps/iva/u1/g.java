package com.amazon.aps.iva.u1;

import com.amazon.aps.iva.o0.g2;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: CompositionLocalConsumerModifierNode.kt */
/* loaded from: classes.dex */
public final class g {
    public static final Object a(f fVar, g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(g2Var, ImagesContract.LOCAL);
        if (fVar.V().n) {
            return i.e(fVar).v.b(g2Var);
        }
        throw new IllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.".toString());
    }
}
