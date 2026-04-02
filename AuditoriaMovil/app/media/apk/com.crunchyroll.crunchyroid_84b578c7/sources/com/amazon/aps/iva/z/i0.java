package com.amazon.aps.iva.z;

import com.amazon.aps.iva.z.h0;
/* compiled from: InfiniteTransition.kt */
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Object h;
    public final /* synthetic */ h0.a<Object, Object> i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ g0<Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Number number, h0.a aVar, Number number2, g0 g0Var) {
        super(0);
        this.h = number;
        this.i = aVar;
        this.j = number2;
        this.k = g0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        h0.a<Object, Object> aVar = this.i;
        Object obj = aVar.b;
        ?? r2 = this.h;
        boolean a = com.amazon.aps.iva.yb0.j.a(r2, obj);
        ?? r3 = this.j;
        if (!a || !com.amazon.aps.iva.yb0.j.a(r3, aVar.c)) {
            g0<Object> g0Var = this.k;
            com.amazon.aps.iva.yb0.j.f(g0Var, "animationSpec");
            aVar.b = r2;
            aVar.c = r3;
            aVar.f = g0Var;
            aVar.g = new z0<>(g0Var, aVar.d, r2, r3);
            aVar.k.b.setValue(Boolean.TRUE);
            aVar.h = false;
            aVar.i = true;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
