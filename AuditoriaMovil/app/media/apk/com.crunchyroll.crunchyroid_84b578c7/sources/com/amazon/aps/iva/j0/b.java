package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.h1.a;
/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ float h;
    public final /* synthetic */ com.amazon.aps.iva.f1.i0 i;
    public final /* synthetic */ com.amazon.aps.iva.f1.y j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(float f, com.amazon.aps.iva.f1.i0 i0Var, com.amazon.aps.iva.f1.y yVar) {
        super(1);
        this.h = f;
        this.i = i0Var;
        this.j = yVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$onDrawWithContent");
        cVar2.f1();
        a.b R0 = cVar2.R0();
        long h = R0.h();
        R0.a().n();
        float f = this.h;
        com.amazon.aps.iva.h1.b bVar = R0.a;
        bVar.g(f, 0.0f);
        bVar.d(com.amazon.aps.iva.e1.c.b);
        com.amazon.aps.iva.h1.e.N(cVar2, this.i, this.j);
        R0.a().g();
        R0.b(h);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
