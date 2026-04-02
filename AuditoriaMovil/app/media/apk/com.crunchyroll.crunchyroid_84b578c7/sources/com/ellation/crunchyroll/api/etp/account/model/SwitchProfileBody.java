package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SwitchProfileBody.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/SwitchProfileBody;", "", "_type", "", "_refreshToken", "_profileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "profileId", "getProfileId", "()Ljava/lang/String;", "refreshToken", "getRefreshToken", "type", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SwitchProfileBody {
    public static final int $stable = 0;
    @SerializedName("profile_id")
    private final String _profileId;
    @SerializedName("refresh_token")
    private final String _refreshToken;
    @SerializedName("grant_type")
    private final String _type;

    public SwitchProfileBody() {
        this(null, null, null, 7, null);
    }

    private final String component1() {
        return this._type;
    }

    private final String component2() {
        return this._refreshToken;
    }

    private final String component3() {
        return this._profileId;
    }

    public static /* synthetic */ SwitchProfileBody copy$default(SwitchProfileBody switchProfileBody, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = switchProfileBody._type;
        }
        if ((i & 2) != 0) {
            str2 = switchProfileBody._refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = switchProfileBody._profileId;
        }
        return switchProfileBody.copy(str, str2, str3);
    }

    public final SwitchProfileBody copy(String str, String str2, String str3) {
        return new SwitchProfileBody(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchProfileBody)) {
            return false;
        }
        SwitchProfileBody switchProfileBody = (SwitchProfileBody) obj;
        if (j.a(this._type, switchProfileBody._type) && j.a(this._refreshToken, switchProfileBody._refreshToken) && j.a(this._profileId, switchProfileBody._profileId)) {
            return true;
        }
        return false;
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

    public final String getType() {
        String str = this._type;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this._type;
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
        String str3 = this._profileId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this._type;
        String str2 = this._refreshToken;
        return b.c(a.b("SwitchProfileBody(_type=", str, ", _refreshToken=", str2, ", _profileId="), this._profileId, ")");
    }

    public SwitchProfileBody(String str, String str2, String str3) {
        this._type = str;
        this._refreshToken = str2;
        this._profileId = str3;
    }

    public /* synthetic */ SwitchProfileBody(String str, String str2, String str3, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
