package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.se0.d1;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.api.etp.index.PolicyChangeMonitor;
import kotlin.Metadata;
/* compiled from: JwtInvalidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "", "Lcom/amazon/aps/iva/kb0/q;", "onConnectionRestored", "Lkotlin/Function0;", "onJwtInvalidated", "onMembershipStatusUpdated", "onMatureStatusChanged", "onAppInit", "onAppResume", "onUsernameSet", "onServiceAvailabilityRefresh", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface JwtInvalidator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: JwtInvalidator.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator$Companion;", "", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Lcom/ellation/crunchyroll/api/etp/index/PolicyChangeMonitor;", "policyChangeMonitor", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "etpIndexProvider", "Lkotlin/Function0;", "", "isAppResumed", "Lcom/amazon/aps/iva/se0/g0;", "scope", "Lcom/amazon/aps/iva/ob0/g;", "ioDispatcher", "Lcom/ellation/crunchyroll/api/etp/auth/JwtInvalidator;", "create", "<init>", "()V", "api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static JwtInvalidator create$default(Companion companion, UserTokenInteractor userTokenInteractor, PolicyChangeMonitor policyChangeMonitor, EtpIndexProvider etpIndexProvider, a aVar, g0 g0Var, g gVar, int i, Object obj) {
            if ((i & 16) != 0) {
                g0Var = d1.b;
            }
            g0 g0Var2 = g0Var;
            if ((i & 32) != 0) {
                gVar = r0.b;
            }
            return companion.create(userTokenInteractor, policyChangeMonitor, etpIndexProvider, aVar, g0Var2, gVar);
        }

        public final JwtInvalidator create(UserTokenInteractor userTokenInteractor, PolicyChangeMonitor policyChangeMonitor, EtpIndexProvider etpIndexProvider, a<Boolean> aVar, g0 g0Var, g gVar) {
            j.f(userTokenInteractor, "userTokenInteractor");
            j.f(policyChangeMonitor, "policyChangeMonitor");
            j.f(etpIndexProvider, "etpIndexProvider");
            j.f(aVar, "isAppResumed");
            j.f(g0Var, "scope");
            j.f(gVar, "ioDispatcher");
            return new JwtInvalidatorImpl(userTokenInteractor, policyChangeMonitor, etpIndexProvider, aVar, g0Var, gVar);
        }
    }

    void onAppInit();

    void onAppResume();

    void onConnectionRestored();

    void onMatureStatusChanged();

    void onMembershipStatusUpdated(a<q> aVar);

    void onServiceAvailabilityRefresh();

    void onUsernameSet();
}
