package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.error.UserRestrictionException;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
/* compiled from: RefreshTokenMonitor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "", "()V", "TokenClearedOnSignInFailedState", "TokenClearedState", "TokenInvalidState", "TokenPresentState", "TokenRestrictedState", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenClearedOnSignInFailedState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenClearedState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenInvalidState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenPresentState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenRestrictedState;", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class TokenState {
    public static final int $stable = 0;

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenClearedOnSignInFailedState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "()V", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TokenClearedOnSignInFailedState extends TokenState {
        public static final int $stable = 0;
        public static final TokenClearedOnSignInFailedState INSTANCE = new TokenClearedOnSignInFailedState();

        private TokenClearedOnSignInFailedState() {
            super(null);
        }
    }

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenClearedState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "()V", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TokenClearedState extends TokenState {
        public static final int $stable = 0;
        public static final TokenClearedState INSTANCE = new TokenClearedState();

        private TokenClearedState() {
            super(null);
        }
    }

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenInvalidState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "()V", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TokenInvalidState extends TokenState {
        public static final int $stable = 0;
        public static final TokenInvalidState INSTANCE = new TokenInvalidState();

        private TokenInvalidState() {
            super(null);
        }
    }

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenPresentState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "token", "Lcom/ellation/crunchyroll/api/etp/auth/Token;", "(Lcom/ellation/crunchyroll/api/etp/auth/Token;)V", "getToken", "()Lcom/ellation/crunchyroll/api/etp/auth/Token;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TokenPresentState extends TokenState {
        public static final int $stable = 0;
        private final Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenPresentState(Token token) {
            super(null);
            j.f(token, "token");
            this.token = token;
        }

        public static /* synthetic */ TokenPresentState copy$default(TokenPresentState tokenPresentState, Token token, int i, Object obj) {
            if ((i & 1) != 0) {
                token = tokenPresentState.token;
            }
            return tokenPresentState.copy(token);
        }

        public final Token component1() {
            return this.token;
        }

        public final TokenPresentState copy(Token token) {
            j.f(token, "token");
            return new TokenPresentState(token);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof TokenPresentState) && j.a(this.token, ((TokenPresentState) obj).token)) {
                return true;
            }
            return false;
        }

        public final Token getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            Token token = this.token;
            return "TokenPresentState(token=" + token + ")";
        }
    }

    /* compiled from: RefreshTokenMonitor.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/TokenState$TokenRestrictedState;", "Lcom/ellation/crunchyroll/api/etp/auth/TokenState;", "exception", "Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;", Scopes.EMAIL, "", "(Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getException", "()Lcom/ellation/crunchyroll/api/etp/error/UserRestrictionException;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class TokenRestrictedState extends TokenState {
        public static final int $stable = 0;
        private final String email;
        private final UserRestrictionException exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenRestrictedState(UserRestrictionException userRestrictionException, String str) {
            super(null);
            j.f(userRestrictionException, "exception");
            this.exception = userRestrictionException;
            this.email = str;
        }

        public static /* synthetic */ TokenRestrictedState copy$default(TokenRestrictedState tokenRestrictedState, UserRestrictionException userRestrictionException, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                userRestrictionException = tokenRestrictedState.exception;
            }
            if ((i & 2) != 0) {
                str = tokenRestrictedState.email;
            }
            return tokenRestrictedState.copy(userRestrictionException, str);
        }

        public final UserRestrictionException component1() {
            return this.exception;
        }

        public final String component2() {
            return this.email;
        }

        public final TokenRestrictedState copy(UserRestrictionException userRestrictionException, String str) {
            j.f(userRestrictionException, "exception");
            return new TokenRestrictedState(userRestrictionException, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenRestrictedState)) {
                return false;
            }
            TokenRestrictedState tokenRestrictedState = (TokenRestrictedState) obj;
            if (j.a(this.exception, tokenRestrictedState.exception) && j.a(this.email, tokenRestrictedState.email)) {
                return true;
            }
            return false;
        }

        public final String getEmail() {
            return this.email;
        }

        public final UserRestrictionException getException() {
            return this.exception;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.exception.hashCode() * 31;
            String str = this.email;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            UserRestrictionException userRestrictionException = this.exception;
            String str = this.email;
            return "TokenRestrictedState(exception=" + userRestrictionException + ", email=" + str + ")";
        }
    }

    private TokenState() {
    }

    public /* synthetic */ TokenState(e eVar) {
        this();
    }
}
