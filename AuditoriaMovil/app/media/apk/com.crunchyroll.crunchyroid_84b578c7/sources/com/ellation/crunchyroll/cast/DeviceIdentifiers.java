package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CastUserPreferenceProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ellation/crunchyroll/cast/DeviceIdentifiers;", "", "adId", "", "idType", "appId", "appName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "cast_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceIdentifiers {
    @SerializedName("rdid")
    private final String adId;
    @SerializedName("msid")
    private final String appId;
    @SerializedName("an")
    private final String appName;
    @SerializedName("idtype")
    private final String idType;

    public DeviceIdentifiers(String str, String str2, String str3, String str4) {
        j.f(str, "adId");
        j.f(str2, "idType");
        j.f(str3, "appId");
        j.f(str4, "appName");
        this.adId = str;
        this.idType = str2;
        this.appId = str3;
        this.appName = str4;
    }

    private final String component1() {
        return this.adId;
    }

    private final String component2() {
        return this.idType;
    }

    private final String component3() {
        return this.appId;
    }

    private final String component4() {
        return this.appName;
    }

    public static /* synthetic */ DeviceIdentifiers copy$default(DeviceIdentifiers deviceIdentifiers, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceIdentifiers.adId;
        }
        if ((i & 2) != 0) {
            str2 = deviceIdentifiers.idType;
        }
        if ((i & 4) != 0) {
            str3 = deviceIdentifiers.appId;
        }
        if ((i & 8) != 0) {
            str4 = deviceIdentifiers.appName;
        }
        return deviceIdentifiers.copy(str, str2, str3, str4);
    }

    public final DeviceIdentifiers copy(String str, String str2, String str3, String str4) {
        j.f(str, "adId");
        j.f(str2, "idType");
        j.f(str3, "appId");
        j.f(str4, "appName");
        return new DeviceIdentifiers(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceIdentifiers)) {
            return false;
        }
        DeviceIdentifiers deviceIdentifiers = (DeviceIdentifiers) obj;
        if (j.a(this.adId, deviceIdentifiers.adId) && j.a(this.idType, deviceIdentifiers.idType) && j.a(this.appId, deviceIdentifiers.appId) && j.a(this.appName, deviceIdentifiers.appName)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.appName.hashCode() + com.amazon.aps.iva.c80.a.b(this.appId, com.amazon.aps.iva.c80.a.b(this.idType, this.adId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.adId;
        String str2 = this.idType;
        return f.a(com.amazon.aps.iva.n4.a.b("DeviceIdentifiers(adId=", str, ", idType=", str2, ", appId="), this.appId, ", appName=", this.appName, ")");
    }

    public /* synthetic */ DeviceIdentifiers(String str, String str2, String str3, String str4, int i, e eVar) {
        this(str, str2, (i & 4) != 0 ? "com.crunchyroll.crunchyroid" : str3, (i & 8) != 0 ? "Crunchyroll" : str4);
    }
}
