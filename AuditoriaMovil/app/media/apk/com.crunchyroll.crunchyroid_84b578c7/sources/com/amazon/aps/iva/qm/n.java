package com.amazon.aps.iva.qm;

import com.crunchyroll.profiles.presentation.profileactivation.ProfileActivationActivityLegacy;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.JwtInvalidator;
/* compiled from: ProfileActivationModule.kt */
/* loaded from: classes2.dex */
public final class n implements m {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {com.amazon.aps.iva.k.q.a(n.class, "viewModel", "getViewModel()Lcom/crunchyroll/profiles/presentation/profileactivation/ProfileActivationViewModelImpl;", 0)};
    public final ProfileActivationActivityLegacy a;
    public final EtpAccountService b;
    public final com.amazon.aps.iva.jm.y c;
    public final JwtInvalidator d;
    public final com.amazon.aps.iva.kb0.m e;
    public final com.amazon.aps.iva.ez.a f;
    public final com.amazon.aps.iva.kb0.m g;

    /* compiled from: ProfileActivationModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o invoke() {
            n nVar = n.this;
            ProfileActivationActivityLegacy profileActivationActivityLegacy = nVar.a;
            b0 b0Var = (b0) nVar.f.getValue(nVar, n.h[0]);
            ProfileActivationActivityLegacy profileActivationActivityLegacy2 = nVar.a;
            com.amazon.aps.iva.yb0.j.f(profileActivationActivityLegacy2, "context");
            d0 d0Var = new d0(profileActivationActivityLegacy2);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.rm.b bVar = new com.amazon.aps.iva.rm.b(new com.amazon.aps.iva.fs.d());
            com.amazon.aps.iva.yb0.j.f(profileActivationActivityLegacy, "view");
            com.amazon.aps.iva.jm.y yVar = nVar.c;
            com.amazon.aps.iva.yb0.j.f(yVar, "userAssetsProvider");
            return new s(profileActivationActivityLegacy, b0Var, yVar, d0Var, bVar);
        }
    }

    /* compiled from: ProfileActivationModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final k invoke() {
            int i = k.j0;
            n nVar = n.this;
            EtpAccountService etpAccountService = nVar.b;
            com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
            JwtInvalidator jwtInvalidator = nVar.d;
            com.amazon.aps.iva.yb0.j.f(jwtInvalidator, "jwtInvalidator");
            return new l(etpAccountService, jwtInvalidator);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ProfileActivationModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, b0> {
        public final /* synthetic */ com.amazon.aps.iva.pm.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.pm.e eVar) {
            super(1);
            this.i = eVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final b0 invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            n nVar = n.this;
            return new b0((k) nVar.e.getValue(), com.amazon.aps.iva.n1.c.h(nVar.b, this.i, nVar.c));
        }
    }

    public n(ProfileActivationActivityLegacy profileActivationActivityLegacy, EtpAccountService etpAccountService, com.amazon.aps.iva.jm.y yVar, com.amazon.aps.iva.pm.e eVar, JwtInvalidator jwtInvalidator) {
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(yVar, "userAssetsProvider");
        com.amazon.aps.iva.yb0.j.f(eVar, "userProfileStore");
        com.amazon.aps.iva.yb0.j.f(jwtInvalidator, "jwtInvalidator");
        this.a = profileActivationActivityLegacy;
        this.b = etpAccountService;
        this.c = yVar;
        this.d = jwtInvalidator;
        this.e = com.amazon.aps.iva.kb0.f.b(new b());
        this.f = new com.amazon.aps.iva.ez.a(b0.class, new c(profileActivationActivityLegacy), new d(eVar));
        this.g = com.amazon.aps.iva.kb0.f.b(new a());
    }

    @Override // com.amazon.aps.iva.qm.m
    public final o getPresenter() {
        return (o) this.g.getValue();
    }
}
