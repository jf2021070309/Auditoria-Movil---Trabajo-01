package com.ellation.crunchyroll.api.etp.auth;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.m80.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: UserTokenInteractorImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/Token;", "", "accessToken", "", "expireDateInMs", "", "accountId", "selectedProfileId", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAccountId", "getExpireDateInMs", "()J", "getSelectedProfileId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Token {
    public static final int $stable = 0;
    private final String accessToken;
    private final String accountId;
    private final long expireDateInMs;
    private final String selectedProfileId;

    public Token(String str, long j, String str2, String str3) {
        j.f(str, "accessToken");
        this.accessToken = str;
        this.expireDateInMs = j;
        this.accountId = str2;
        this.selectedProfileId = str3;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, long j, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.accessToken;
        }
        if ((i & 2) != 0) {
            j = token.expireDateInMs;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = token.accountId;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = token.selectedProfileId;
        }
        return token.copy(str, j2, str4, str3);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final long component2() {
        return this.expireDateInMs;
    }

    public final String component3() {
        return this.accountId;
    }

    public final String component4() {
        return this.selectedProfileId;
    }

    public final Token copy(String str, long j, String str2, String str3) {
        j.f(str, "accessToken");
        return new Token(str, j, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Token)) {
            return false;
        }
        Token token = (Token) obj;
        if (j.a(this.accessToken, token.accessToken) && this.expireDateInMs == token.expireDateInMs && j.a(this.accountId, token.accountId) && j.a(this.selectedProfileId, token.selectedProfileId)) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final long getExpireDateInMs() {
        return this.expireDateInMs;
    }

    public final String getSelectedProfileId() {
        return this.selectedProfileId;
    }

    public int hashCode() {
        int hashCode;
        int a = i.a(this.expireDateInMs, this.accessToken.hashCode() * 31, 31);
        String str = this.accountId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str2 = this.selectedProfileId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        String str = this.accessToken;
        long j = this.expireDateInMs;
        String str2 = this.accountId;
        String str3 = this.selectedProfileId;
        StringBuilder sb = new StringBuilder("Token(accessToken=");
        sb.append(str);
        sb.append(", expireDateInMs=");
        sb.append(j);
        a.c(sb, ", accountId=", str2, ", selectedProfileId=", str3);
        sb.append(")");
        return sb.toString();
    }
}
