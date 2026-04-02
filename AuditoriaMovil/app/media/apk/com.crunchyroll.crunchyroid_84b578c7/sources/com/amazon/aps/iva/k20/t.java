package com.amazon.aps.iva.k20;

import androidx.lifecycle.LiveData;
import java.util.List;
/* compiled from: CancellationRescueViewModel.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.ez.b implements s, com.amazon.aps.iva.d30.d {
    public final /* synthetic */ com.amazon.aps.iva.d30.d b;

    public t(com.amazon.aps.iva.d30.d dVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void E6(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.b.E6(str, bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> H0() {
        return this.b.H0();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void Q7(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.b.Q7(bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> R7() {
        return this.b.R7();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> e1() {
        return this.b.e1();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void n4() {
        this.b.n4();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void p2(com.amazon.aps.iva.b30.c cVar) {
        this.b.p2(cVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void w5(com.amazon.aps.iva.fs.b bVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        this.b.w5(bVar, str);
    }

    @Override // com.amazon.aps.iva.k20.s
    public final void x3(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        w5(bVar, str);
    }
}
