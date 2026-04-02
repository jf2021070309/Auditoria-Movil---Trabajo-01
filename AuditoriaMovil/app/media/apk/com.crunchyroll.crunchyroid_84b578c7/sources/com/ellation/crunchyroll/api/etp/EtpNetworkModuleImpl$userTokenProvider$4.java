package com.ellation.crunchyroll.api.etp;

import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.auth.ApiFunUserStore;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenStorage;
import com.ellation.crunchyroll.api.etp.error.ApiErrorKt;
import com.ellation.crunchyroll.api.etp.error.HttpException;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
import com.ellation.crunchyroll.application.e;
import kotlin.Metadata;
/* compiled from: EtpNetworkModule.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "httpException", "Lcom/amazon/aps/iva/kb0/q;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EtpNetworkModuleImpl$userTokenProvider$4 extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
    final /* synthetic */ EtpNetworkModuleImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpNetworkModuleImpl$userTokenProvider$4(EtpNetworkModuleImpl etpNetworkModuleImpl) {
        super(1);
        this.this$0 = etpNetworkModuleImpl;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public /* bridge */ /* synthetic */ q invoke(Throwable th) {
        invoke2(th);
        return q.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        a aVar;
        CrunchyrollApplication crunchyrollApplication;
        j.f(th, "httpException");
        String traceId = ApiErrorKt.getTraceId((HttpException) th);
        if (traceId != null) {
            RefreshTokenStorage refreshTokenStorage = this.this$0.getRefreshTokenStorage();
            c cVar = c.b;
            j.f(refreshTokenStorage, "refreshTokenStorage");
            cVar.e(new w(e.e("User has been logged out (X-Trace-Id: ", traceId, ")"), null, null, null, Long.valueOf(refreshTokenStorage.getLastUsedSeconds()), 30));
        }
        com.amazon.aps.iva.mf0.a.a.b(th);
        this.this$0.getRefreshTokenStorage().clearToken();
        RefreshTokenMonitor refreshTokenMonitor = this.this$0.getRefreshTokenMonitor();
        AccountApiModel m0 = e.d().m0();
        refreshTokenMonitor.onAuthFailure(false, (Exception) th, m0 != null ? m0.getEmail() : null);
        aVar = this.this$0.getFunUserStorage;
        ((ApiFunUserStore) aVar.invoke()).clear();
        crunchyrollApplication = this.this$0.application;
        crunchyrollApplication.f().d();
    }
}
