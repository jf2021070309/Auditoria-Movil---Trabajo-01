package com.amazon.aps.iva.xd0;

import java.util.ArrayList;
/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes4.dex */
public final class f extends com.amazon.aps.iva.qd0.m {
    public final /* synthetic */ ArrayList<com.amazon.aps.iva.oc0.k> a;
    public final /* synthetic */ e b;

    public f(ArrayList<com.amazon.aps.iva.oc0.k> arrayList, e eVar) {
        this.a = arrayList;
        this.b = eVar;
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
        throw new IllegalStateException(("Conflict in scope of " + this.b.b + ": " + bVar + " vs " + bVar2).toString());
    }
}
