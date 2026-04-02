package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SwitchProfileResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÂ\u0003JV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006)"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileResponse;", "", "_accessToken", "", "_refreshToken", "_expiresIn", "", "_tokenType", "_accountId", "_profileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "accessToken", "getAccessToken", "()Ljava/lang/String;", "accountId", "getAccountId", "expiresInSec", "getExpiresInSec", "()J", "profileId", "getProfileId", "refreshToken", "getRefreshToken", "tokenType", "getTokenType", "component1", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileResponse;", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchProfileResponse {
    public static final int $stable = 0;
    @SerializedName("access_token")
    private final String _accessToken;
    @SerializedName("account_id")
    private final String _accountId;
    @SerializedName("expires_in")
    private final Long _expiresIn;
    @SerializedName("profile_id")
    private final String _profileId;
    @SerializedName("refresh_token")
    private final String _refreshToken;
    @SerializedName("token_type")
    private final String _tokenType;

    public SwitchProfileResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final String component1() {
        return this._accessToken;
    }

    private final String component2() {
        return this._refreshToken;
    }

    private final Long component3() {
        return this._expiresIn;
    }

    private final String component4() {
        return this._tokenType;
    }

    private final String component5() {
        return this._accountId;
    }

    private final String component6() {
        return this._profileId;
    }

    public static /* synthetic */ SwitchProfileResponse copy$default(SwitchProfileResponse switchProfileResponse, String str, String str2, Long l, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchProfileResponse._accessToken;
        }
        if ((i & 2) != 0) {
            str2 = switchProfileResponse._refreshToken;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            l = switchProfileResponse._expiresIn;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str3 = switchProfileResponse._tokenType;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = switchProfileResponse._accountId;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = switchProfileResponse._profileId;
        }
        return switchProfileResponse.copy(str, str6, l2, str7, str8, str5);
    }

    public final SwitchProfileResponse copy(String str, String str2, Long l, String str3, String str4, String str5) {
        return new SwitchProfileResponse(str, str2, l, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchProfileResponse)) {
            return false;
        }
        SwitchProfileResponse switchProfileResponse = (SwitchProfileResponse) obj;
        if (j.a(this._accessToken, switchProfileResponse._accessToken) && j.a(this._refreshToken, switchProfileResponse._refreshToken) && j.a(this._expiresIn, switchProfileResponse._expiresIn) && j.a(this._tokenType, switchProfileResponse._tokenType) && j.a(this._accountId, switchProfileResponse._accountId) && j.a(this._profileId, switchProfileResponse._profileId)) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        String str = this._accessToken;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getAccountId() {
        String str = this._accountId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final long getExpiresInSec() {
        Long l = this._expiresIn;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String getProfileId() {
        String str = this._profileId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getRefreshToken() {
        String str = this._refreshToken;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getTokenType() {
        String str = this._tokenType;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this._accessToken;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._refreshToken;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l = this._expiresIn;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this._tokenType;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this._accountId;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this._profileId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i6 + i;
    }

    public String toString() {
        String str = this._accessToken;
        String str2 = this._refreshToken;
        Long l = this._expiresIn;
        String str3 = this._tokenType;
        String str4 = this._accountId;
        String str5 = this._profileId;
        StringBuilder b = a.b("SwitchProfileResponse(_accessToken=", str, ", _refreshToken=", str2, ", _expiresIn=");
        b.append(l);
        b.append(", _tokenType=");
        b.append(str3);
        b.append(", _accountId=");
        return f.a(b, str4, ", _profileId=", str5, ")");
    }

    public SwitchProfileResponse(String str, String str2, Long l, String str3, String str4, String str5) {
        this._accessToken = str;
        this._refreshToken = str2;
        this._expiresIn = l;
        this._tokenType = str3;
        this._accountId = str4;
        this._profileId = str5;
    }

    public /* synthetic */ SwitchProfileResponse(String str, String str2, Long l, String str3, String str4, String str5, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
