package com.amazon.aps.iva.j30;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ez.g;
import java.util.List;
/* compiled from: UpsellV2ViewModel.kt */
/* loaded from: classes2.dex */
public final class e0 extends com.amazon.aps.iva.ez.b implements a0, com.amazon.aps.iva.d30.d {
    public final g b;
    public final h c;
    public final /* synthetic */ com.amazon.aps.iva.d30.d d;
    public final com.amazon.aps.iva.i5.u e;
    public final com.amazon.aps.iva.i5.u f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.amazon.aps.iva.d30.d dVar, g gVar, i iVar) {
        super(iVar);
        com.amazon.aps.iva.yb0.j.f(gVar, "input");
        this.b = gVar;
        this.c = iVar;
        this.d = dVar;
        this.e = com.amazon.aps.iva.i5.d0.c(H0(), new d0(this));
        this.f = com.amazon.aps.iva.i5.d0.b(R7(), new b0(this));
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void E6(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.d.E6(str, bVar);
    }

    @Override // com.amazon.aps.iva.j30.a0
    public final com.amazon.aps.iva.i5.u F() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> H0() {
        return this.d.H0();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void Q7(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.d.Q7(bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> R7() {
        return this.d.R7();
    }

    @Override // com.amazon.aps.iva.j30.a0
    public final com.amazon.aps.iva.i5.u c() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> e1() {
        return this.d.e1();
    }

    @Override // com.amazon.aps.iva.j30.a0
    public final com.amazon.aps.iva.b30.c l(int i) {
        com.amazon.aps.iva.b30.c cVar;
        g.c<List<com.amazon.aps.iva.b30.c>> a;
        List<com.amazon.aps.iva.b30.c> list;
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>> d = H0().d();
        if (d != null && (a = d.a()) != null && (list = a.a) != null) {
            cVar = list.get(i);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            this.d.p2(cVar);
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void n4() {
        this.d.n4();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void p2(com.amazon.aps.iva.b30.c cVar) {
        this.d.p2(cVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void w5(com.amazon.aps.iva.fs.b bVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        this.d.w5(bVar, str);
    }
}
