package com.amazon.aps.iva.bj;

import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o0.d2;
import com.ellation.crunchyroll.api.AccountStateProvider;
/* compiled from: AccountPendingStateComponent.kt */
/* loaded from: classes.dex */
public final class g implements c, m, com.amazon.aps.iva.i5.o, com.amazon.aps.iva.u70.j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {q.a(g.class, "viewModel", "getViewModel()Lcom/crunchyroll/pendingstategate/SendVerificationEmailViewModel;", 0)};
    public final androidx.fragment.app.h b;
    public final /* synthetic */ com.amazon.aps.iva.u70.j c;
    public final d2 d;
    public final l e;

    public g(androidx.fragment.app.h hVar, com.amazon.aps.iva.zg.n nVar, n nVar2, AccountStateProvider accountStateProvider) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        this.b = hVar;
        this.c = (com.amazon.aps.iva.u70.j) hVar;
        this.d = new d2(hVar);
        f fVar = new f(nVar);
        e eVar = new e(hVar);
        com.amazon.aps.iva.yb0.j.f(f[0], "property");
        l a = k.a(this, nVar, nVar2, accountStateProvider, (o) com.amazon.aps.iva.ez.l.a(eVar.invoke(), p.class, fVar), new b((com.amazon.aps.iva.us.a) hVar, com.amazon.aps.iva.ds.c.b));
        com.ellation.crunchyroll.mvp.lifecycle.a.a(a, this);
        this.e = a;
        FragmentManager supportFragmentManager = hVar.getSupportFragmentManager();
        com.amazon.aps.iva.yb0.j.e(supportFragmentManager, "activity.supportFragmentManager");
        com.amazon.aps.iva.bo.e.h(supportFragmentManager, "verify_email_dialog", hVar, new d(this), com.amazon.aps.iva.g70.i.h);
    }

    @Override // com.amazon.aps.iva.bj.c
    public final void G(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        this.e.q6(aVar);
    }

    @Override // com.amazon.aps.iva.bj.m
    public final void P5() {
        f.a aVar = com.amazon.aps.iva.g70.f.e;
        com.amazon.aps.iva.g70.g d = this.d.d();
        aVar.getClass();
        f.a.a(d).show(this.b.getSupportFragmentManager(), "verify_email_dialog");
    }

    @Override // com.amazon.aps.iva.bj.c
    public final void b1(com.amazon.aps.iva.fs.b bVar) {
        this.e.r6(bVar);
    }

    @Override // com.amazon.aps.iva.i5.o
    public final androidx.lifecycle.g getLifecycle() {
        androidx.lifecycle.g lifecycle = this.b.getLifecycle();
        com.amazon.aps.iva.yb0.j.e(lifecycle, "<get-lifecycle>(...)");
        return lifecycle;
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        this.c.showSnackbar(iVar);
    }
}
