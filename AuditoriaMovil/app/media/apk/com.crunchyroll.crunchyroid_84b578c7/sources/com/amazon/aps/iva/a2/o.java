package com.amazon.aps.iva.a2;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class o {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static final com.amazon.aps.iva.a1.f a(com.amazon.aps.iva.a1.f fVar, boolean z, com.amazon.aps.iva.xb0.l<? super c0, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "properties");
        return fVar.o(new AppendedSemanticsElement(lVar, z));
    }
}
