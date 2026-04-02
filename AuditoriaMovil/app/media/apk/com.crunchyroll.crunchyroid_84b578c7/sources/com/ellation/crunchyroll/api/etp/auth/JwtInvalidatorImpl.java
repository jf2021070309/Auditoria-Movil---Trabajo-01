package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JwtInvalidator.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0018\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidatorImpl;", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onJwtInvalidated", "invalidate", "invalidateIndex", "onConnectionRestored", "onMembershipStatusUpdated", "onMatureStatusChanged", "onAppInit", "onAppResume", "onUsernameSet", "onServiceAvailabilityRefresh", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "policyChangeMonitor", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "etpIndexProvider", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "", "isAppResumed", "Lcom/amazon/aps/iva/xb0/a;", "Lcom/amazon/aps/iva/se0/g0;", "scope", "Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/ob0/g;", "ioDispatcher", "Lcom/amazon/aps/iva/ob0/g;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;Lcom/amazon/aps/iva/xb0/a;Lcom/amazon/aps/iva/se0/g0;Lcom/amazon/aps/iva/ob0/g;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class JwtInvalidatorImpl implements JwtInvalidator {
    private final EtpIndexProvider etpIndexProvider;
    private final g ioDispatcher;
    private final a<Boolean> isAppResumed;
    private final PolicyChangeMonitor policyChangeMonitor;
    private final g0 scope;
    private final UserTokenInteractor userTokenInteractor;

    public JwtInvalidatorImpl(UserTokenInteractor userTokenInteractor, PolicyChangeMonitor policyChangeMonitor, EtpIndexProvider etpIndexProvider, a<Boolean> aVar, g0 g0Var, g gVar) {
        j.f(userTokenInteractor, "userTokenInteractor");
        j.f(policyChangeMonitor, "policyChangeMonitor");
        j.f(etpIndexProvider, "etpIndexProvider");
        j.f(aVar, "isAppResumed");
        j.f(g0Var, "scope");
        j.f(gVar, "ioDispatcher");
        this.userTokenInteractor = userTokenInteractor;
        this.policyChangeMonitor = policyChangeMonitor;
        this.etpIndexProvider = etpIndexProvider;
        this.isAppResumed = aVar;
        this.scope = g0Var;
        this.ioDispatcher = gVar;
    }

    private final void invalidate(a<q> aVar) {
        this.userTokenInteractor.invalidateJwt();
        aVar.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void invalidate$default(JwtInvalidatorImpl jwtInvalidatorImpl, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = JwtInvalidatorImpl$invalidate$1.INSTANCE;
        }
        jwtInvalidatorImpl.invalidate(aVar);
    }

    private final void invalidateIndex() {
        invalidate$default(this, null, 1, null);
        i.d(this.scope, this.ioDispatcher, null, new JwtInvalidatorImpl$invalidateIndex$1(this, null), 2);
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onAppInit() {
        invalidateIndex();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onAppResume() {
        invalidate$default(this, null, 1, null);
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onConnectionRestored() {
        if (this.isAppResumed.invoke().booleanValue()) {
            invalidate$default(this, null, 1, null);
        }
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onMatureStatusChanged() {
        invalidate$default(this, null, 1, null);
        this.policyChangeMonitor.onMaturitySettingsChanged();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onMembershipStatusUpdated(a<q> aVar) {
        j.f(aVar, "onJwtInvalidated");
        invalidate(aVar);
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onServiceAvailabilityRefresh() {
        invalidateIndex();
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.JwtInvalidator
    public void onUsernameSet() {
        invalidate$default(this, null, 1, null);
    }
}
