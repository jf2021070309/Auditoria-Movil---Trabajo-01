package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ve0.u0;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
/* compiled from: RefreshTokenMonitor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&R\u0014\u0010\r\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "", "Lcom/ellation/crunchyroll/api/etp/auth/Token;", "token", "Lcom/amazon/aps/iva/kb0/q;", "onRefreshTokenValid", "", "signInFailed", "Ljava/lang/Exception;", "exception", "", Scopes.EMAIL, "onAuthFailure", "isRefreshTokenInvalid", "()Z", "Lcom/amazon/aps/iva/ve0/u0;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "getRefreshTokenState", "()Lcom/amazon/aps/iva/ve0/u0;", "refreshTokenState", "Companion", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface RefreshTokenMonitor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final RefreshTokenMonitor create() {
            return new RefreshTokenMonitorImpl();
        }
    }

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void onAuthFailure$default(RefreshTokenMonitor refreshTokenMonitor, boolean z, Exception exc, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                refreshTokenMonitor.onAuthFailure(z, exc, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAuthFailure");
        }
    }

    u0<TokenState> getRefreshTokenState();

    boolean isRefreshTokenInvalid();

    void onAuthFailure(boolean z, Exception exc, String str);

    void onRefreshTokenValid(Token token);
}
