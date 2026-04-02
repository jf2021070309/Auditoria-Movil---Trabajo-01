package com.ellation.crunchyroll.api.etp.thirtpartyoauth;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ConnectedPlatforms.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ConnectedPlatforms;", "", "platforms", "", "Lcom/ellation/crunchyroll/api/etp/thirtpartyoauth/ThirdPartyApp;", "(Ljava/util/List;)V", "getPlatforms", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectedPlatforms {
    public static final int $stable = 8;
    @SerializedName("platforms")
    private final List<ThirdPartyApp> platforms;

    public ConnectedPlatforms(List<ThirdPartyApp> list) {
        j.f(list, "platforms");
        this.platforms = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConnectedPlatforms copy$default(ConnectedPlatforms connectedPlatforms, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectedPlatforms.platforms;
        }
        return connectedPlatforms.copy(list);
    }

    public final List<ThirdPartyApp> component1() {
        return this.platforms;
    }

    public final ConnectedPlatforms copy(List<ThirdPartyApp> list) {
        j.f(list, "platforms");
        return new ConnectedPlatforms(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ConnectedPlatforms) && j.a(this.platforms, ((ConnectedPlatforms) obj).platforms)) {
            return true;
        }
        return false;
    }

    public final List<ThirdPartyApp> getPlatforms() {
        return this.platforms;
    }

    public int hashCode() {
        return this.platforms.hashCode();
    }

    public String toString() {
        List<ThirdPartyApp> list = this.platforms;
        return "ConnectedPlatforms(platforms=" + list + ")";
    }
}
