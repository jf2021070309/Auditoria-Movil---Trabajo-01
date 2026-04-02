package com.ellation.crunchyroll.api.etp.thirtpartyoauth;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: ThirdPartyAppAuthUrls.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyAppAuthUrls;", "", "authorizeUrl", "", "mobileAuthorizeUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthorizeUrl", "()Ljava/lang/String;", "getMobileAuthorizeUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThirdPartyAppAuthUrls {
    public static final int $stable = 0;
    @SerializedName("authorize_url")
    private final String authorizeUrl;
    @SerializedName("mobile_authorize_url")
    private final String mobileAuthorizeUrl;

    public ThirdPartyAppAuthUrls(String str, String str2) {
        j.f(str, "authorizeUrl");
        j.f(str2, "mobileAuthorizeUrl");
        this.authorizeUrl = str;
        this.mobileAuthorizeUrl = str2;
    }

    public static /* synthetic */ ThirdPartyAppAuthUrls copy$default(ThirdPartyAppAuthUrls thirdPartyAppAuthUrls, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyAppAuthUrls.authorizeUrl;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyAppAuthUrls.mobileAuthorizeUrl;
        }
        return thirdPartyAppAuthUrls.copy(str, str2);
    }

    public final String component1() {
        return this.authorizeUrl;
    }

    public final String component2() {
        return this.mobileAuthorizeUrl;
    }

    public final ThirdPartyAppAuthUrls copy(String str, String str2) {
        j.f(str, "authorizeUrl");
        j.f(str2, "mobileAuthorizeUrl");
        return new ThirdPartyAppAuthUrls(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyAppAuthUrls)) {
            return false;
        }
        ThirdPartyAppAuthUrls thirdPartyAppAuthUrls = (ThirdPartyAppAuthUrls) obj;
        if (j.a(this.authorizeUrl, thirdPartyAppAuthUrls.authorizeUrl) && j.a(this.mobileAuthorizeUrl, thirdPartyAppAuthUrls.mobileAuthorizeUrl)) {
            return true;
        }
        return false;
    }

    public final String getAuthorizeUrl() {
        return this.authorizeUrl;
    }

    public final String getMobileAuthorizeUrl() {
        return this.mobileAuthorizeUrl;
    }

    public int hashCode() {
        return this.mobileAuthorizeUrl.hashCode() + (this.authorizeUrl.hashCode() * 31);
    }

    public String toString() {
        return e.b("ThirdPartyAppAuthUrls(authorizeUrl=", this.authorizeUrl, ", mobileAuthorizeUrl=", this.mobileAuthorizeUrl, ")");
    }
}
