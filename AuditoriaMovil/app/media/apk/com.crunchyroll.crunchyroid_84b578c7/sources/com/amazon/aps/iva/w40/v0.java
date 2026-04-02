package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ez.g;
import java.util.List;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class v0 extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public v0(Object obj) {
        super(1, obj, p0.class, "onFirstPageFailed", "onFirstPageFailed(Ljava/lang/Throwable;)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        List<com.amazon.aps.iva.uz.h> list;
        g.c<List<com.amazon.aps.iva.uz.h>> a;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "p0");
        p0 p0Var = (p0) this.receiver;
        p0Var.getClass();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.uz.h>>> vVar = p0Var.e;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.uz.h>> d = vVar.d();
        if (d != null && (a = d.a()) != null) {
            list = a.a;
        } else {
            list = null;
        }
        vVar.k(new g.a(list, th2));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
