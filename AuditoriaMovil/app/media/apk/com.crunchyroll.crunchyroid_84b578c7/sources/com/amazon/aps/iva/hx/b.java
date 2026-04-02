package com.amazon.aps.iva.hx;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import com.amazon.aps.iva.aq.j;
import com.amazon.aps.iva.bj.n;
import com.amazon.aps.iva.fm.f;
import com.amazon.aps.iva.fm.g;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ox.c;
import com.amazon.aps.iva.pm.e;
import com.amazon.aps.iva.qm.i;
import com.amazon.aps.iva.qm.y;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yw.d;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.api.AccountStateProvider;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.a;
import com.google.gson.Gson;
/* compiled from: EmailVerificationDependenciesImpl.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.yg.a {
    public final Application a;
    public final EtpAccountService b;
    public final com.amazon.aps.iva.xb0.a<String> c;
    public final l<Activity, Boolean> d;
    public final com.amazon.aps.iva.xb0.a<q> e;
    public final AccountStateProvider f;
    public final UserTokenInteractor g;
    public final com.amazon.aps.iva.hx.a h;
    public final Gson i;

    /* compiled from: EmailVerificationDependenciesImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {
        public final /* synthetic */ y a;

        public a(Fragment fragment) {
            this.a = j.o(fragment);
        }

        @Override // com.amazon.aps.iva.bj.n
        public final void a(com.amazon.aps.iva.xb0.a<q> aVar) {
            this.a.a(aVar);
        }
    }

    /* compiled from: EmailVerificationDependenciesImpl.kt */
    /* renamed from: com.amazon.aps.iva.hx.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0346b implements n {
        public final /* synthetic */ y a;

        public C0346b(h hVar) {
            com.amazon.aps.iva.yb0.j.f(hVar, "activity");
            c cVar = new c(hVar);
            f fVar = g.e;
            if (fVar != null) {
                i iVar = new i(new com.amazon.aps.iva.qm.a(fVar.f()), com.amazon.aps.iva.qm.b.h, cVar);
                e b = ((d0) com.ellation.crunchyroll.application.e.a()).c.b();
                g gVar = g.f;
                if (gVar != null) {
                    com.amazon.aps.iva.yb0.j.f(b, "userProfileStore");
                    com.amazon.aps.iva.fm.e eVar = gVar.c;
                    com.amazon.aps.iva.yb0.j.f(eVar, "profileActivationFlowMonitor");
                    this.a = new y(b, iVar, eVar);
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("feature");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }

        @Override // com.amazon.aps.iva.bj.n
        public final void a(com.amazon.aps.iva.xb0.a<q> aVar) {
            this.a.a(aVar);
        }
    }

    public b(CrunchyrollApplication crunchyrollApplication, EtpAccountService etpAccountService, com.amazon.aps.iva.yw.b bVar, com.amazon.aps.iva.yw.c cVar, d dVar, AccountStateProvider accountStateProvider, UserTokenInteractor userTokenInteractor) {
        com.amazon.aps.iva.yb0.j.f(etpAccountService, "accountService");
        com.amazon.aps.iva.yb0.j.f(cVar, "isOnHomeScreen");
        com.amazon.aps.iva.yb0.j.f(accountStateProvider, "accountStateProvider");
        com.amazon.aps.iva.yb0.j.f(userTokenInteractor, "userTokenInteractor");
        this.a = crunchyrollApplication;
        this.b = etpAccountService;
        this.c = bVar;
        this.d = cVar;
        this.e = dVar;
        this.f = accountStateProvider;
        this.g = userTokenInteractor;
        com.ellation.crunchyroll.application.a aVar = a.C0959a.a;
        if (aVar != null) {
            Object c = aVar.c().c(com.amazon.aps.iva.hx.a.class, "email_verification_banner");
            if (c != null) {
                this.h = (com.amazon.aps.iva.hx.a) c;
                this.i = GsonHolder.getInstance();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ellation.crunchyroll.features.emailverification.EmailVerificationBannerConfigImpl");
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final n a(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "activity");
        return new C0346b(hVar);
    }

    @Override // com.amazon.aps.iva.yg.a
    public final n b(Fragment fragment) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        return new a(fragment);
    }

    @Override // com.amazon.aps.iva.yg.a
    public final l<Activity, Boolean> d() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final com.amazon.aps.iva.xb0.a<q> e() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final com.amazon.aps.iva.xb0.a<String> g() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final EtpAccountService getAccountService() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final AccountStateProvider getAccountStateProvider() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.yg.a
    public final UserTokenInteractor getUserTokenInteractor() {
        return this.g;
    }
}
