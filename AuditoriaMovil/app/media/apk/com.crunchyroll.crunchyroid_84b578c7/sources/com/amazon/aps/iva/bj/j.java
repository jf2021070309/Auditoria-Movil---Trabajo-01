package com.amazon.aps.iva.bj;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.o0.d2;
import com.ellation.crunchyroll.api.AccountStateProvider;
/* compiled from: AccountPendingStateComponent.kt */
/* loaded from: classes.dex */
public final class j implements c, m, com.amazon.aps.iva.i5.o, com.amazon.aps.iva.u70.j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {q.a(j.class, "viewModel", "getViewModel()Lcom/crunchyroll/pendingstategate/SendVerificationEmailViewModel;", 0)};
    public final Fragment b;
    public final /* synthetic */ com.amazon.aps.iva.u70.j c;
    public final d2 d;
    public final l e;

    public j(Fragment fragment, com.amazon.aps.iva.zg.n nVar, n nVar2, AccountStateProvider accountStateProvider) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        this.b = fragment;
        this.c = (com.amazon.aps.iva.u70.j) fragment;
        Context requireContext = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "fragment.requireContext()");
        this.d = new d2(requireContext);
        l a = k.a(this, nVar, nVar2, accountStateProvider, (o) new com.amazon.aps.iva.ez.f(fragment, p.class, new i(nVar)).getValue(this, f[0]), new b((com.amazon.aps.iva.us.a) fragment, com.amazon.aps.iva.ds.c.b));
        com.ellation.crunchyroll.mvp.lifecycle.a.a(a, this);
        this.e = a;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        com.amazon.aps.iva.yb0.j.e(childFragmentManager, "fragment.childFragmentManager");
        com.amazon.aps.iva.bo.e.h(childFragmentManager, "verify_email_dialog", fragment, new h(this), com.amazon.aps.iva.g70.i.h);
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
        f.a.a(d).show(this.b.getChildFragmentManager(), "verify_email_dialog");
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
