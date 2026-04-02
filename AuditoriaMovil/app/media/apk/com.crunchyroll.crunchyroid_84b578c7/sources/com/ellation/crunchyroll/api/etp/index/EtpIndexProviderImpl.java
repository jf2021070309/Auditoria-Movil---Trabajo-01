package com.ellation.crunchyroll.api.etp.index;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.UserTokenInteractor;
import com.ellation.crunchyroll.api.etp.index.model.EtpIndex;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EtpIndexProvider.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProviderImpl;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexProvider;", "Lcom/ellation/crunchyroll/api/etp/index/model/EtpIndex;", "Lcom/amazon/aps/iva/kb0/q;", "resetMarketingOptIn", "", "forceRefresh", "getEtpIndex", "invalidate", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "etpIndexStore", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "etpIndexService", "Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "userTokenInteractor", "Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;", "Lkotlin/Function1;", "onIndexRefresh", "Lcom/amazon/aps/iva/xb0/l;", "<init>", "(Lcom/ellation/crunchyroll/api/etp/index/EtpIndexStore;Lcom/ellation/crunchyroll/api/etp/index/EtpIndexService;Lcom/ellation/crunchyroll/api/etp/auth/UserTokenInteractor;Lcom/amazon/aps/iva/xb0/l;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpIndexProviderImpl implements EtpIndexProvider {
    private final EtpIndexService etpIndexService;
    private final EtpIndexStore etpIndexStore;
    private final l<EtpIndex, q> onIndexRefresh;
    private final UserTokenInteractor userTokenInteractor;

    /* JADX WARN: Multi-variable type inference failed */
    public EtpIndexProviderImpl(EtpIndexStore etpIndexStore, EtpIndexService etpIndexService, UserTokenInteractor userTokenInteractor, l<? super EtpIndex, q> lVar) {
        j.f(etpIndexStore, "etpIndexStore");
        j.f(etpIndexService, "etpIndexService");
        j.f(userTokenInteractor, "userTokenInteractor");
        j.f(lVar, "onIndexRefresh");
        this.etpIndexStore = etpIndexStore;
        this.etpIndexService = etpIndexService;
        this.userTokenInteractor = userTokenInteractor;
        this.onIndexRefresh = lVar;
    }

    private final void resetMarketingOptIn(EtpIndex etpIndex) {
        EtpIndex copy$default;
        if (etpIndex != null && (copy$default = EtpIndex.copy$default(etpIndex, false, false, 1, null)) != null) {
            this.etpIndexStore.save(copy$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:21:0x0034, B:24:0x003c, B:25:0x003f, B:26:0x0040, B:20:0x0030), top: B:36:0x0003 }] */
    @Override // com.ellation.crunchyroll.api.etp.index.EtpIndexProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ellation.crunchyroll.api.etp.index.model.EtpIndex getEtpIndex(boolean r4) {
        /*
            r3 = this;
            com.ellation.crunchyroll.api.etp.index.EtpIndexService r0 = r3.etpIndexService
            monitor-enter(r0)
            com.ellation.crunchyroll.api.etp.index.EtpIndexStore r1 = r3.etpIndexStore     // Catch: java.lang.Throwable -> L4f
            com.ellation.crunchyroll.api.etp.index.model.EtpIndex r1 = r1.get()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L10
            if (r4 == 0) goto Le
            goto L10
        Le:
            monitor-exit(r0)
            return r1
        L10:
            com.ellation.crunchyroll.api.etp.index.EtpIndexService r4 = r3.etpIndexService     // Catch: java.lang.Throwable -> L2d
            com.amazon.aps.iva.jf0.b r4 = r4.getIndex()     // Catch: java.lang.Throwable -> L2d
            com.amazon.aps.iva.jf0.a0 r4 = r4.execute()     // Catch: java.lang.Throwable -> L2d
            T r4 = r4.b     // Catch: java.lang.Throwable -> L2d
            com.ellation.crunchyroll.api.etp.index.model.EtpIndex r4 = (com.ellation.crunchyroll.api.etp.index.model.EtpIndex) r4     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L25
            com.amazon.aps.iva.kb0.q r2 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L23
            goto L34
        L23:
            r2 = move-exception
            goto L30
        L25:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "ETP Index body is empty"
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            throw r4     // Catch: java.lang.Throwable -> L2d
        L2d:
            r4 = move-exception
            r2 = r4
            r4 = 0
        L30:
            com.amazon.aps.iva.kb0.k$a r2 = com.amazon.aps.iva.ab.x.H(r2)     // Catch: java.lang.Throwable -> L4f
        L34:
            java.lang.Throwable r2 = com.amazon.aps.iva.kb0.k.a(r2)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L40
            if (r1 == 0) goto L3f
            r3.resetMarketingOptIn(r1)     // Catch: java.lang.Throwable -> L4f
        L3f:
            throw r2     // Catch: java.lang.Throwable -> L4f
        L40:
            com.ellation.crunchyroll.api.etp.index.EtpIndexStore r1 = r3.etpIndexStore     // Catch: java.lang.Throwable -> L4f
            com.amazon.aps.iva.yb0.j.c(r4)     // Catch: java.lang.Throwable -> L4f
            r1.save(r4)     // Catch: java.lang.Throwable -> L4f
            com.amazon.aps.iva.xb0.l<com.ellation.crunchyroll.api.etp.index.model.EtpIndex, com.amazon.aps.iva.kb0.q> r1 = r3.onIndexRefresh     // Catch: java.lang.Throwable -> L4f
            r1.invoke(r4)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return r4
        L4f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.api.etp.index.EtpIndexProviderImpl.getEtpIndex(boolean):com.ellation.crunchyroll.api.etp.index.model.EtpIndex");
    }

    @Override // com.ellation.crunchyroll.api.etp.index.EtpIndexProvider
    public void invalidate() {
        this.userTokenInteractor.invalidateJwt();
        this.etpIndexStore.invalidate();
    }
}
