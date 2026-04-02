package com.amazon.aps.iva.e0;

import java.util.List;
import java.util.Map;
/* compiled from: LazyListMeasureResult.kt */
/* loaded from: classes.dex */
public final class b0 implements y, com.amazon.aps.iva.s1.e0 {
    public final c0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<j> e;
    public final int f;
    public final /* synthetic */ com.amazon.aps.iva.s1.e0 g;

    public b0(c0 c0Var, int i, boolean z, float f, com.amazon.aps.iva.s1.e0 e0Var, List list, int i2, com.amazon.aps.iva.b0.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "measureResult");
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        this.a = c0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = list;
        this.f = i2;
        this.g = e0Var;
    }

    @Override // com.amazon.aps.iva.e0.y
    public final int a() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.e0.y
    public final List<j> b() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.s1.e0
    public final Map<com.amazon.aps.iva.s1.a, Integer> c() {
        return this.g.c();
    }

    @Override // com.amazon.aps.iva.s1.e0
    public final void d() {
        this.g.d();
    }

    @Override // com.amazon.aps.iva.s1.e0
    public final int getHeight() {
        return this.g.getHeight();
    }

    @Override // com.amazon.aps.iva.s1.e0
    public final int getWidth() {
        return this.g.getWidth();
    }
}
