package com.amazon.aps.iva.ee0;

import java.util.ArrayList;
import java.util.List;
/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes4.dex */
public final class t0 extends e1 {
    public final /* synthetic */ List<c1> c;

    public t0(ArrayList arrayList) {
        this.c = arrayList;
    }

    @Override // com.amazon.aps.iva.ee0.e1
    public final j1 g(c1 c1Var) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "key");
        if (this.c.contains(c1Var)) {
            com.amazon.aps.iva.oc0.h k = c1Var.k();
            com.amazon.aps.iva.yb0.j.d(k, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return s1.m((com.amazon.aps.iva.oc0.y0) k);
        }
        return null;
    }
}
