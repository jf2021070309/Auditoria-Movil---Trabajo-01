package com.amazon.aps.iva.bj;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.api.AccountStateProvider;
/* compiled from: AccountPendingStatePresenter.kt */
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.wy.b<m> {
    public final n b;
    public final AccountStateProvider c;
    public final o d;
    public final String e;
    public final com.amazon.aps.iva.bj.a f;

    /* compiled from: AccountPendingStatePresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.u70.i, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.u70.i iVar) {
            com.amazon.aps.iva.u70.i iVar2 = iVar;
            com.amazon.aps.iva.yb0.j.f(iVar2, "$this$observeEvent");
            l.this.getView().showSnackbar(iVar2);
            return q.a;
        }
    }

    /* compiled from: AccountPendingStatePresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.a<q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.xb0.a<q> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.invoke();
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, com.amazon.aps.iva.zg.n nVar, n nVar2, AccountStateProvider accountStateProvider, o oVar, String str, com.amazon.aps.iva.bj.b bVar) {
        super(mVar, nVar);
        com.amazon.aps.iva.yb0.j.f(mVar, "view");
        this.b = nVar2;
        this.c = accountStateProvider;
        this.d = oVar;
        this.e = str;
        this.f = bVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        com.amazon.aps.iva.ez.e.a(this.d.u5(), getView(), new a());
    }

    public final void q6(com.amazon.aps.iva.xb0.a<q> aVar) {
        AccountStateProvider accountStateProvider = this.c;
        if (accountStateProvider.getPendingRestrictions().contains(AccountPendingRestrictions.SET_USERNAME)) {
            this.b.a(new b(aVar));
        } else if (accountStateProvider.getPendingRestrictions().contains(AccountPendingRestrictions.VERIFY_EMAIL)) {
            getView().P5();
            this.f.b();
        } else {
            aVar.invoke();
        }
    }

    public final void r6(com.amazon.aps.iva.fs.b bVar) {
        this.f.a(bVar);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        this.d.I2(str);
    }
}
