package com.amazon.aps.iva.ee;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
/* compiled from: OtpFlowRouter.kt */
/* loaded from: classes.dex */
public final class e implements i {
    public final p<com.amazon.aps.iva.h.c<a>, a, q> a;
    public com.amazon.aps.iva.xb0.a<q> b;
    public com.amazon.aps.iva.xb0.a<q> c;
    public final com.amazon.aps.iva.h.c<a> d;

    public e(f fVar, p pVar, g gVar) {
        j.f(gVar, "startFlow");
        this.a = gVar;
        this.b = d.h;
        this.c = c.h;
        this.d = (com.amazon.aps.iva.h.c) pVar.invoke(fVar, new b(this));
    }

    @Override // com.amazon.aps.iva.ee.i
    public final void a(com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.a<q> aVar2) {
        j.f(aVar, "onOtpReceived");
        j.f(aVar2, "onCancel");
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.ee.i
    public final void b(a aVar) {
        j.f(aVar, "input");
        this.a.invoke(this.d, aVar);
    }
}
