package com.amazon.aps.iva.t20;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.d0;
import java.util.List;
/* compiled from: ManageMembershipViewModel.kt */
/* loaded from: classes2.dex */
public final class u extends com.amazon.aps.iva.ez.b implements r, com.amazon.aps.iva.d30.d {
    public final com.amazon.aps.iva.j30.h b;
    public final /* synthetic */ com.amazon.aps.iva.d30.d c;
    public final com.amazon.aps.iva.i5.u d;

    public u(com.amazon.aps.iva.d30.d dVar, com.amazon.aps.iva.j30.i iVar) {
        super(iVar);
        this.b = iVar;
        this.c = dVar;
        this.d = d0.c(H0(), new t(this));
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void E6(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.c.E6(str, bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> H0() {
        return this.c.H0();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void Q7(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.c.Q7(bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> R7() {
        return this.c.R7();
    }

    @Override // com.amazon.aps.iva.t20.r
    public final com.amazon.aps.iva.i5.u c() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> e1() {
        return this.c.e1();
    }

    @Override // com.amazon.aps.iva.t20.r
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
            this.c.p2(cVar);
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void n4() {
        this.c.n4();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void p2(com.amazon.aps.iva.b30.c cVar) {
        this.c.p2(cVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void w5(com.amazon.aps.iva.fs.b bVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        this.c.w5(bVar, str);
    }
}
