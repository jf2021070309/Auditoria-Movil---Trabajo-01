package com.amazon.aps.iva.ee0;

import java.util.Map;
/* compiled from: TypeSubstitution.kt */
/* loaded from: classes4.dex */
public final class d1 extends e1 {
    public final /* synthetic */ Map<c1, j1> c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(Map<c1, ? extends j1> map, boolean z) {
        this.c = map;
        this.d = z;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ee0.m1
    public final boolean e() {
        return this.c.isEmpty();
    }

    @Override // com.amazon.aps.iva.ee0.e1
    public final j1 g(c1 c1Var) {
        com.amazon.aps.iva.yb0.j.f(c1Var, "key");
        return this.c.get(c1Var);
    }
}
