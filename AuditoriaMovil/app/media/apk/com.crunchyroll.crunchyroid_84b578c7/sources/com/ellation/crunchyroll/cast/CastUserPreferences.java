package com.ellation.crunchyroll.cast;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CastUserPreferenceProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ellation/crunchyroll/cast/CastUserPreferences;", "Lcom/amazon/aps/iva/ye/g;", "", "component1", "", "component2", "Lcom/ellation/crunchyroll/cast/DeviceIdentifiers;", "component3", "appLanguage", "autoplay", "deviceIdentifiers", "copy", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "Z", "Lcom/ellation/crunchyroll/cast/DeviceIdentifiers;", "<init>", "(Ljava/lang/String;ZLcom/ellation/crunchyroll/cast/DeviceIdentifiers;)V", "cast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CastUserPreferences implements g {
    @SerializedName("app_language")
    private final String appLanguage;
    @SerializedName("autoplay")
    private final boolean autoplay;
    @SerializedName("device_identifiers")
    private final DeviceIdentifiers deviceIdentifiers;

    public CastUserPreferences(String str, boolean z, DeviceIdentifiers deviceIdentifiers) {
        j.f(str, "appLanguage");
        this.appLanguage = str;
        this.autoplay = z;
        this.deviceIdentifiers = deviceIdentifiers;
    }

    private final String component1() {
        return this.appLanguage;
    }

    private final boolean component2() {
        return this.autoplay;
    }

    private final DeviceIdentifiers component3() {
        return this.deviceIdentifiers;
    }

    public static /* synthetic */ CastUserPreferences copy$default(CastUserPreferences castUserPreferences, String str, boolean z, DeviceIdentifiers deviceIdentifiers, int i, Object obj) {
        if ((i & 1) != 0) {
            str = castUserPreferences.appLanguage;
        }
        if ((i & 2) != 0) {
            z = castUserPreferences.autoplay;
        }
        if ((i & 4) != 0) {
            deviceIdentifiers = castUserPreferences.deviceIdentifiers;
        }
        return castUserPreferences.copy(str, z, deviceIdentifiers);
    }

    public final CastUserPreferences copy(String str, boolean z, DeviceIdentifiers deviceIdentifiers) {
        j.f(str, "appLanguage");
        return new CastUserPreferences(str, z, deviceIdentifiers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastUserPreferences)) {
            return false;
        }
        CastUserPreferences castUserPreferences = (CastUserPreferences) obj;
        if (j.a(this.appLanguage, castUserPreferences.appLanguage) && this.autoplay == castUserPreferences.autoplay && j.a(this.deviceIdentifiers, castUserPreferences.deviceIdentifiers)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.appLanguage.hashCode() * 31;
        boolean z = this.autoplay;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        DeviceIdentifiers deviceIdentifiers = this.deviceIdentifiers;
        if (deviceIdentifiers == null) {
            hashCode = 0;
        } else {
            hashCode = deviceIdentifiers.hashCode();
        }
        return i2 + hashCode;
    }

    public String toString() {
        String str = this.appLanguage;
        boolean z = this.autoplay;
        DeviceIdentifiers deviceIdentifiers = this.deviceIdentifiers;
        return "CastUserPreferences(appLanguage=" + str + ", autoplay=" + z + ", deviceIdentifiers=" + deviceIdentifiers + ")";
    }
}
