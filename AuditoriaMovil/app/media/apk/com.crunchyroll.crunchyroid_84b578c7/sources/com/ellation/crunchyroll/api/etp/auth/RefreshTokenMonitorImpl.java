package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.TokenState;
import com.ellation.crunchyroll.api.etp.error.InvalidRefreshTokenException;
import com.ellation.crunchyroll.api.etp.error.UserRestrictionException;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RefreshTokenMonitor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitorImpl;", "Lcom/ellation/crunchyroll/api/etp/auth/RefreshTokenMonitor;", "Lcom/amazon/aps/iva/kb0/q;", "onRefreshTokenClear", "Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;", "exception", "", Scopes.EMAIL, "onRefreshTokenRestricted", "onRefreshTokenClearDueSignInFailed", "onRefreshTokenInvalid", "", "signInFailed", "Ljava/lang/Exception;", "onAuthFailure", "Lcom/ellation/crunchyroll/api/etp/auth/Token;", "token", "onRefreshTokenValid", "Lcom/amazon/aps/iva/ve0/g0;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "refreshTokenState", "Lcom/amazon/aps/iva/ve0/g0;", "getRefreshTokenState", "()Lcom/amazon/aps/iva/ve0/g0;", "isRefreshTokenInvalid", "()Z", "<init>", "()V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RefreshTokenMonitorImpl implements RefreshTokenMonitor {
    private final g0<TokenState> refreshTokenState = x.e(null);

    private final void onRefreshTokenClear() {
        getRefreshTokenState().setValue(TokenState.TokenClearedState.INSTANCE);
    }

    private final void onRefreshTokenClearDueSignInFailed() {
        getRefreshTokenState().setValue(TokenState.TokenClearedOnSignInFailedState.INSTANCE);
    }

    private final void onRefreshTokenInvalid() {
        getRefreshTokenState().setValue(TokenState.TokenInvalidState.INSTANCE);
    }

    private final void onRefreshTokenRestricted(UserRestrictionException userRestrictionException, String str) {
        getRefreshTokenState().setValue(new TokenState.TokenRestrictedState(userRestrictionException, str));
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor
    public boolean isRefreshTokenInvalid() {
        return getRefreshTokenState().getValue() instanceof TokenState.TokenInvalidState;
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor
    public void onAuthFailure(boolean z, Exception exc, String str) {
        if (exc instanceof UserRestrictionException) {
            onRefreshTokenRestricted((UserRestrictionException) exc, str);
        } else if (exc instanceof InvalidRefreshTokenException) {
            onRefreshTokenInvalid();
        } else if (z) {
            onRefreshTokenClearDueSignInFailed();
        } else {
            onRefreshTokenClear();
        }
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor
    public void onRefreshTokenValid(Token token) {
        j.f(token, "token");
        getRefreshTokenState().setValue(new TokenState.TokenPresentState(token));
    }

    @Override // com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor
    public g0<TokenState> getRefreshTokenState() {
        return this.refreshTokenState;
    }
}
