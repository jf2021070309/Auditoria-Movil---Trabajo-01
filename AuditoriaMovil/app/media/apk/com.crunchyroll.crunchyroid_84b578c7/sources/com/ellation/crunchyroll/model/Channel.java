package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/model/Channel;", "Ljava/io/Serializable;", "id", "", "cmsId", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCmsId", "()Ljava/lang/String;", "getId", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Channel implements Serializable {
    public static final int $stable = 0;
    @SerializedName("cms_id")
    private final String cmsId;
    @SerializedName("id")
    private final String id;
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public Channel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Channel copy$default(Channel channel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channel.id;
        }
        if ((i & 2) != 0) {
            str2 = channel.cmsId;
        }
        if ((i & 4) != 0) {
            str3 = channel.name;
        }
        return channel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.cmsId;
    }

    public final String component3() {
        return this.name;
    }

    public final Channel copy(String str, String str2, String str3) {
        j.f(str, "id");
        j.f(str2, "cmsId");
        j.f(str3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new Channel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        if (j.a(this.id, channel.id) && j.a(this.cmsId, channel.cmsId) && j.a(this.name, channel.name)) {
            return true;
        }
        return false;
    }

    public final String getCmsId() {
        return this.cmsId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + a.b(this.cmsId, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.cmsId;
        return b.c(com.amazon.aps.iva.n4.a.b("Channel(id=", str, ", cmsId=", str2, ", name="), this.name, ")");
    }

    public Channel(String str, String str2, String str3) {
        j.f(str, "id");
        j.f(str2, "cmsId");
        j.f(str3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.id = str;
        this.cmsId = str2;
        this.name = str3;
    }

    public /* synthetic */ Channel(String str, String str2, String str3, int i, e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
