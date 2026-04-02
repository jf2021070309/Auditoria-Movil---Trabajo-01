package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CastAuthenticator.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÂ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastUserData;", "Lcom/amazon/aps/iva/ye/g;", "", "component1", "", "component2", "component3", "domain", "isUserAuthenticated", "countryOverride", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "Z", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastUserData implements g {
    public static final int $stable = 0;
    @SerializedName("country_override")
    private final String countryOverride;
    @SerializedName("domain")
    private final String domain;
    @SerializedName("is_user_authenticated")
    private final boolean isUserAuthenticated;

    public CastUserData(String str, boolean z, String str2) {
        j.f(str, "domain");
        this.domain = str;
        this.isUserAuthenticated = z;
        this.countryOverride = str2;
    }

    private final String component1() {
        return this.domain;
    }

    private final boolean component2() {
        return this.isUserAuthenticated;
    }

    private final String component3() {
        return this.countryOverride;
    }

    public static /* synthetic */ CastUserData copy$default(CastUserData castUserData, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = castUserData.domain;
        }
        if ((i & 2) != 0) {
            z = castUserData.isUserAuthenticated;
        }
        if ((i & 4) != 0) {
            str2 = castUserData.countryOverride;
        }
        return castUserData.copy(str, z, str2);
    }

    public final CastUserData copy(String str, boolean z, String str2) {
        j.f(str, "domain");
        return new CastUserData(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastUserData)) {
            return false;
        }
        CastUserData castUserData = (CastUserData) obj;
        if (j.a(this.domain, castUserData.domain) && this.isUserAuthenticated == castUserData.isUserAuthenticated && j.a(this.countryOverride, castUserData.countryOverride)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.domain.hashCode() * 31;
        boolean z = this.isUserAuthenticated;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.countryOverride;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }

    public String toString() {
        String str = this.domain;
        boolean z = this.isUserAuthenticated;
        String str2 = this.countryOverride;
        StringBuilder sb = new StringBuilder("CastUserData(domain=");
        sb.append(str);
        sb.append(", isUserAuthenticated=");
        sb.append(z);
        sb.append(", countryOverride=");
        return b.c(sb, str2, ")");
    }

    public /* synthetic */ CastUserData(String str, boolean z, String str2, int i, e eVar) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
