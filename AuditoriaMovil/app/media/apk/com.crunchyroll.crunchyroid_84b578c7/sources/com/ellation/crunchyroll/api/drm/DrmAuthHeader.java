package com.ellation.crunchyroll.api.drm;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: DrmAuthHeader.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/ellation/crunchyroll/api/drm/DrmAuthHeader;", "", "userId", "", "sessionId", "assetId", "accountingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountingId", "()Ljava/lang/String;", "getAssetId", "getSessionId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrmAuthHeader {
    public static final int $stable = 0;
    @SerializedName("accounting_id")
    private final String accountingId;
    @SerializedName("asset_id")
    private final String assetId;
    @SerializedName("session_id")
    private final String sessionId;
    @SerializedName("user_id")
    private final String userId;

    public DrmAuthHeader(String str, String str2, String str3, String str4) {
        j.f(str, "userId");
        j.f(str2, "sessionId");
        j.f(str3, "assetId");
        j.f(str4, "accountingId");
        this.userId = str;
        this.sessionId = str2;
        this.assetId = str3;
        this.accountingId = str4;
    }

    public static /* synthetic */ DrmAuthHeader copy$default(DrmAuthHeader drmAuthHeader, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = drmAuthHeader.userId;
        }
        if ((i & 2) != 0) {
            str2 = drmAuthHeader.sessionId;
        }
        if ((i & 4) != 0) {
            str3 = drmAuthHeader.assetId;
        }
        if ((i & 8) != 0) {
            str4 = drmAuthHeader.accountingId;
        }
        return drmAuthHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.sessionId;
    }

    public final String component3() {
        return this.assetId;
    }

    public final String component4() {
        return this.accountingId;
    }

    public final DrmAuthHeader copy(String str, String str2, String str3, String str4) {
        j.f(str, "userId");
        j.f(str2, "sessionId");
        j.f(str3, "assetId");
        j.f(str4, "accountingId");
        return new DrmAuthHeader(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrmAuthHeader)) {
            return false;
        }
        DrmAuthHeader drmAuthHeader = (DrmAuthHeader) obj;
        if (j.a(this.userId, drmAuthHeader.userId) && j.a(this.sessionId, drmAuthHeader.sessionId) && j.a(this.assetId, drmAuthHeader.assetId) && j.a(this.accountingId, drmAuthHeader.accountingId)) {
            return true;
        }
        return false;
    }

    public final String getAccountingId() {
        return this.accountingId;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.accountingId.hashCode() + a.b(this.assetId, a.b(this.sessionId, this.userId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.sessionId;
        return f.a(com.amazon.aps.iva.n4.a.b("DrmAuthHeader(userId=", str, ", sessionId=", str2, ", assetId="), this.assetId, ", accountingId=", this.accountingId, ")");
    }
}
