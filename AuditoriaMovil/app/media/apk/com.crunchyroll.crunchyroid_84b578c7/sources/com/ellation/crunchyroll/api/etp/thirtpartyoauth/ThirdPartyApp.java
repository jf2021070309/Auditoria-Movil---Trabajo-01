package com.ellation.crunchyroll.api.etp.thirtpartyoauth;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: ThirdPartyApp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyApp;", "", "platform", "", "(Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ThirdPartyApp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String DISCORD = "discord";
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String platform;

    /* compiled from: ThirdPartyApp.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyApp$Companion;", "", "()V", "DISCORD", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public ThirdPartyApp(String str) {
        j.f(str, "platform");
        this.platform = str;
    }

    public static /* synthetic */ ThirdPartyApp copy$default(ThirdPartyApp thirdPartyApp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyApp.platform;
        }
        return thirdPartyApp.copy(str);
    }

    public final String component1() {
        return this.platform;
    }

    public final ThirdPartyApp copy(String str) {
        j.f(str, "platform");
        return new ThirdPartyApp(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ThirdPartyApp) && j.a(this.platform, ((ThirdPartyApp) obj).platform)) {
            return true;
        }
        return false;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return this.platform.hashCode();
    }

    public String toString() {
        return e.e("ThirdPartyApp(platform=", this.platform, ")");
    }
}
