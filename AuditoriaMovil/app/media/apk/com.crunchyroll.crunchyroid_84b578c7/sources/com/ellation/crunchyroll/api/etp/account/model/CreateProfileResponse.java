package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CreateProfileResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/CreateProfileResponse;", "", "_accountId", "", "_profileId", "(Ljava/lang/String;Ljava/lang/String;)V", "accountId", "getAccountId", "()Ljava/lang/String;", "profileId", "getProfileId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreateProfileResponse {
    public static final int $stable = 0;
    @SerializedName("account_id")
    private final String _accountId;
    @SerializedName("profile_id")
    private final String _profileId;

    public CreateProfileResponse() {
        this(null, null, 3, null);
    }

    private final String component1() {
        return this._accountId;
    }

    private final String component2() {
        return this._profileId;
    }

    public static /* synthetic */ CreateProfileResponse copy$default(CreateProfileResponse createProfileResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createProfileResponse._accountId;
        }
        if ((i & 2) != 0) {
            str2 = createProfileResponse._profileId;
        }
        return createProfileResponse.copy(str, str2);
    }

    public final CreateProfileResponse copy(String str, String str2) {
        return new CreateProfileResponse(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateProfileResponse)) {
            return false;
        }
        CreateProfileResponse createProfileResponse = (CreateProfileResponse) obj;
        if (j.a(this._accountId, createProfileResponse._accountId) && j.a(this._profileId, createProfileResponse._profileId)) {
            return true;
        }
        return false;
    }

    public final String getAccountId() {
        String str = this._accountId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getProfileId() {
        String str = this._profileId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        String str = this._accountId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._profileId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return e.b("CreateProfileResponse(_accountId=", this._accountId, ", _profileId=", this._profileId, ")");
    }

    public CreateProfileResponse(String str, String str2) {
        this._accountId = str;
        this._profileId = str2;
    }

    public /* synthetic */ CreateProfileResponse(String str, String str2, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
