package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import kotlin.Metadata;
/* compiled from: EtpIndexProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "", "", "forceRefresh", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "getEtpIndex", "Lcom/amazon/aps/iva/kb0/q;", "invalidate", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpIndexProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: EtpIndexProvider.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider$Companion;", "", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "etpIndexStore", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "etpIndexService", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Lkotlin/Function1;", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "Lcom/amazon/aps/iva/kb0/q;", "onIndexRefresh", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "create", "<init>", "()V", "api_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final EtpIndexProvider create(EtpIndexStore etpIndexStore, EtpIndexService etpIndexService, UserTokenInteractor userTokenInteractor, l<? super EtpIndex, q> lVar) {
            j.f(etpIndexStore, "etpIndexStore");
            j.f(etpIndexService, "etpIndexService");
            j.f(userTokenInteractor, "userTokenInteractor");
            j.f(lVar, "onIndexRefresh");
            return new EtpIndexProviderImpl(etpIndexStore, etpIndexService, userTokenInteractor, lVar);
        }
    }

    /* compiled from: EtpIndexProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ EtpIndex getEtpIndex$default(EtpIndexProvider etpIndexProvider, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return etpIndexProvider.getEtpIndex(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEtpIndex");
        }
    }

    EtpIndex getEtpIndex(boolean z);

    void invalidate();
}
