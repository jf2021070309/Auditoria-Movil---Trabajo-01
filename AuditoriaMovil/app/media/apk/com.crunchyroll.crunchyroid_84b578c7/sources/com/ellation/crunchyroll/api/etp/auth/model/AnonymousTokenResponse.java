package com.ellation.crunchyroll.api.etp.auth.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: AnonymousTokenResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/model/AnonymousTokenResponse;", "", "accessToken", "", "tokenType", "expiresInSec", "", "funUser", "Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "country", "(Ljava/lang/String;Ljava/lang/String;JLcom/ellation/crunchyroll/api/etp/auth/model/FunUser;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getCountry", "setCountry", "(Ljava/lang/String;)V", "getExpiresInSec", "()J", "getFunUser", "()Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "getTokenType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnonymousTokenResponse {
    public static final int $stable = 8;
    @SerializedName("access_token")
    private final String accessToken;
    @SerializedName("country")
    private String country;
    @SerializedName("expires_in")
    private final long expiresInSec;
    @SerializedName("fun_user")
    private final FunUser funUser;
    @SerializedName("token_type")
    private final String tokenType;

    public AnonymousTokenResponse(String str, String str2, long j, FunUser funUser, String str3) {
        j.f(str, "accessToken");
        j.f(str2, "tokenType");
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresInSec = j;
        this.funUser = funUser;
        this.country = str3;
    }

    public static /* synthetic */ AnonymousTokenResponse copy$default(AnonymousTokenResponse anonymousTokenResponse, String str, String str2, long j, FunUser funUser, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anonymousTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = anonymousTokenResponse.tokenType;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = anonymousTokenResponse.expiresInSec;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            funUser = anonymousTokenResponse.funUser;
        }
        FunUser funUser2 = funUser;
        if ((i & 16) != 0) {
            str3 = anonymousTokenResponse.country;
        }
        return anonymousTokenResponse.copy(str, str4, j2, funUser2, str3);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final String component2() {
        return this.tokenType;
    }

    public final long component3() {
        return this.expiresInSec;
    }

    public final FunUser component4() {
        return this.funUser;
    }

    public final String component5() {
        return this.country;
    }

    public final AnonymousTokenResponse copy(String str, String str2, long j, FunUser funUser, String str3) {
        j.f(str, "accessToken");
        j.f(str2, "tokenType");
        return new AnonymousTokenResponse(str, str2, j, funUser, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousTokenResponse)) {
            return false;
        }
        AnonymousTokenResponse anonymousTokenResponse = (AnonymousTokenResponse) obj;
        if (j.a(this.accessToken, anonymousTokenResponse.accessToken) && j.a(this.tokenType, anonymousTokenResponse.tokenType) && this.expiresInSec == anonymousTokenResponse.expiresInSec && j.a(this.funUser, anonymousTokenResponse.funUser) && j.a(this.country, anonymousTokenResponse.country)) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getCountry() {
        return this.country;
    }

    public final long getExpiresInSec() {
        return this.expiresInSec;
    }

    public final FunUser getFunUser() {
        return this.funUser;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int hashCode;
        int a = i.a(this.expiresInSec, a.b(this.tokenType, this.accessToken.hashCode() * 31, 31), 31);
        FunUser funUser = this.funUser;
        int i = 0;
        if (funUser == null) {
            hashCode = 0;
        } else {
            hashCode = funUser.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str = this.country;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.tokenType;
        long j = this.expiresInSec;
        FunUser funUser = this.funUser;
        String str3 = this.country;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("AnonymousTokenResponse(accessToken=", str, ", tokenType=", str2, ", expiresInSec=");
        b.append(j);
        b.append(", funUser=");
        b.append(funUser);
        return com.amazon.aps.iva.n4.a.a(b, ", country=", str3, ")");
    }

    public /* synthetic */ AnonymousTokenResponse(String str, String str2, long j, FunUser funUser, String str3, int i, e eVar) {
        this(str, str2, j, (i & 8) != 0 ? null : funUser, (i & 16) != 0 ? null : str3);
    }
}
