package com.ellation.crunchyroll.api.etp.auth.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UserTokenResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000f¨\u0006*"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/auth/model/UserTokenResponse;", "", "accessToken", "", "tokenType", "expiresInSec", "", "refreshToken", "funUser", "Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "country", "selectedProfileId", "accountId", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getAccountId", "getCountry", "setCountry", "(Ljava/lang/String;)V", "getExpiresInSec", "()J", "getFunUser", "()Lcom/ellation/crunchyroll/api/etp/auth/model/FunUser;", "getRefreshToken", "getSelectedProfileId", "getTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserTokenResponse {
    public static final int $stable = 8;
    @SerializedName("access_token")
    private final String accessToken;
    @SerializedName("account_id")
    private final String accountId;
    @SerializedName("country")
    private String country;
    @SerializedName("expires_in")
    private final long expiresInSec;
    @SerializedName("fun_user")
    private final FunUser funUser;
    @SerializedName("refresh_token")
    private final String refreshToken;
    @SerializedName("profile_id")
    private final String selectedProfileId;
    @SerializedName("token_type")
    private final String tokenType;

    public UserTokenResponse(String str, String str2, long j, String str3, FunUser funUser, String str4, String str5, String str6) {
        j.f(str, "accessToken");
        j.f(str2, "tokenType");
        j.f(str5, "selectedProfileId");
        j.f(str6, "accountId");
        this.accessToken = str;
        this.tokenType = str2;
        this.expiresInSec = j;
        this.refreshToken = str3;
        this.funUser = funUser;
        this.country = str4;
        this.selectedProfileId = str5;
        this.accountId = str6;
    }

    public static /* synthetic */ UserTokenResponse copy$default(UserTokenResponse userTokenResponse, String str, String str2, long j, String str3, FunUser funUser, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        long j2;
        String str9;
        FunUser funUser2;
        String str10;
        String str11;
        String str12;
        if ((i & 1) != 0) {
            str7 = userTokenResponse.accessToken;
        } else {
            str7 = str;
        }
        if ((i & 2) != 0) {
            str8 = userTokenResponse.tokenType;
        } else {
            str8 = str2;
        }
        if ((i & 4) != 0) {
            j2 = userTokenResponse.expiresInSec;
        } else {
            j2 = j;
        }
        if ((i & 8) != 0) {
            str9 = userTokenResponse.refreshToken;
        } else {
            str9 = str3;
        }
        if ((i & 16) != 0) {
            funUser2 = userTokenResponse.funUser;
        } else {
            funUser2 = funUser;
        }
        if ((i & 32) != 0) {
            str10 = userTokenResponse.country;
        } else {
            str10 = str4;
        }
        if ((i & 64) != 0) {
            str11 = userTokenResponse.selectedProfileId;
        } else {
            str11 = str5;
        }
        if ((i & 128) != 0) {
            str12 = userTokenResponse.accountId;
        } else {
            str12 = str6;
        }
        return userTokenResponse.copy(str7, str8, j2, str9, funUser2, str10, str11, str12);
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

    public final String component4() {
        return this.refreshToken;
    }

    public final FunUser component5() {
        return this.funUser;
    }

    public final String component6() {
        return this.country;
    }

    public final String component7() {
        return this.selectedProfileId;
    }

    public final String component8() {
        return this.accountId;
    }

    public final UserTokenResponse copy(String str, String str2, long j, String str3, FunUser funUser, String str4, String str5, String str6) {
        j.f(str, "accessToken");
        j.f(str2, "tokenType");
        j.f(str5, "selectedProfileId");
        j.f(str6, "accountId");
        return new UserTokenResponse(str, str2, j, str3, funUser, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserTokenResponse)) {
            return false;
        }
        UserTokenResponse userTokenResponse = (UserTokenResponse) obj;
        if (j.a(this.accessToken, userTokenResponse.accessToken) && j.a(this.tokenType, userTokenResponse.tokenType) && this.expiresInSec == userTokenResponse.expiresInSec && j.a(this.refreshToken, userTokenResponse.refreshToken) && j.a(this.funUser, userTokenResponse.funUser) && j.a(this.country, userTokenResponse.country) && j.a(this.selectedProfileId, userTokenResponse.selectedProfileId) && j.a(this.accountId, userTokenResponse.accountId)) {
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

    public final String getCountry() {
        return this.country;
    }

    public final long getExpiresInSec() {
        return this.expiresInSec;
    }

    public final FunUser getFunUser() {
        return this.funUser;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getSelectedProfileId() {
        return this.selectedProfileId;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int a = i.a(this.expiresInSec, a.b(this.tokenType, this.accessToken.hashCode() * 31, 31), 31);
        String str = this.refreshToken;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        FunUser funUser = this.funUser;
        if (funUser == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = funUser.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.country;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.accountId.hashCode() + a.b(this.selectedProfileId, (i3 + i) * 31, 31);
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public String toString() {
        String str = this.accessToken;
        String str2 = this.tokenType;
        long j = this.expiresInSec;
        String str3 = this.refreshToken;
        FunUser funUser = this.funUser;
        String str4 = this.country;
        String str5 = this.selectedProfileId;
        String str6 = this.accountId;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("UserTokenResponse(accessToken=", str, ", tokenType=", str2, ", expiresInSec=");
        b.append(j);
        b.append(", refreshToken=");
        b.append(str3);
        b.append(", funUser=");
        b.append(funUser);
        b.append(", country=");
        b.append(str4);
        com.amazon.aps.iva.m80.a.c(b, ", selectedProfileId=", str5, ", accountId=", str6);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ UserTokenResponse(String str, String str2, long j, String str3, FunUser funUser, String str4, String str5, String str6, int i, e eVar) {
        this(str, str2, j, str3, (i & 16) != 0 ? null : funUser, (i & 32) != 0 ? null : str4, str5, str6);
    }
}
