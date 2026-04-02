package com.amazon.aps.iva.ce0;

import com.amazon.aps.iva.oc0.s;
import com.amazon.aps.iva.rc0.x;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes4.dex */
public final class e extends com.amazon.aps.iva.qd0.m {
    public final /* synthetic */ List<Object> a;

    public e(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void c(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "fakeOverride");
        com.amazon.aps.iva.qd0.n.r(bVar, null);
        this.a.add(bVar);
    }

    @Override // com.amazon.aps.iva.qd0.m
    public final void s(com.amazon.aps.iva.oc0.b bVar, com.amazon.aps.iva.oc0.b bVar2) {
        com.amazon.aps.iva.yb0.j.f(bVar, "fromSuper");
        com.amazon.aps.iva.yb0.j.f(bVar2, "fromCurrent");
        if (bVar2 instanceof x) {
            ((x) bVar2).L0(s.a, bVar);
        }
    }
}
