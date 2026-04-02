package com.ellation.crunchyroll.api.etp.content.model.customlists;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: CustomListItemPositionUpdateRequest.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemPositionUpdateRequest;", "", "refContentId", "", FirebaseAnalytics.Param.LOCATION, "Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemLocation;", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemLocation;)V", "getLocation", "()Lcom/ellation/crunchyroll/api/etp/content/model/customlists/CustomListItemLocation;", "getRefContentId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomListItemPositionUpdateRequest {
    public static final int $stable = 0;
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private final CustomListItemLocation location;
    @SerializedName("ref_content_id")
    private final String refContentId;

    public CustomListItemPositionUpdateRequest(String str, CustomListItemLocation customListItemLocation) {
        j.f(str, "refContentId");
        j.f(customListItemLocation, FirebaseAnalytics.Param.LOCATION);
        this.refContentId = str;
        this.location = customListItemLocation;
    }

    public static /* synthetic */ CustomListItemPositionUpdateRequest copy$default(CustomListItemPositionUpdateRequest customListItemPositionUpdateRequest, String str, CustomListItemLocation customListItemLocation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customListItemPositionUpdateRequest.refContentId;
        }
        if ((i & 2) != 0) {
            customListItemLocation = customListItemPositionUpdateRequest.location;
        }
        return customListItemPositionUpdateRequest.copy(str, customListItemLocation);
    }

    public final String component1() {
        return this.refContentId;
    }

    public final CustomListItemLocation component2() {
        return this.location;
    }

    public final CustomListItemPositionUpdateRequest copy(String str, CustomListItemLocation customListItemLocation) {
        j.f(str, "refContentId");
        j.f(customListItemLocation, FirebaseAnalytics.Param.LOCATION);
        return new CustomListItemPositionUpdateRequest(str, customListItemLocation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomListItemPositionUpdateRequest)) {
            return false;
        }
        CustomListItemPositionUpdateRequest customListItemPositionUpdateRequest = (CustomListItemPositionUpdateRequest) obj;
        if (j.a(this.refContentId, customListItemPositionUpdateRequest.refContentId) && this.location == customListItemPositionUpdateRequest.location) {
            return true;
        }
        return false;
    }

    public final CustomListItemLocation getLocation() {
        return this.location;
    }

    public final String getRefContentId() {
        return this.refContentId;
    }

    public int hashCode() {
        return this.location.hashCode() + (this.refContentId.hashCode() * 31);
    }

    public String toString() {
        String str = this.refContentId;
        CustomListItemLocation customListItemLocation = this.location;
        return "CustomListItemPositionUpdateRequest(refContentId=" + str + ", location=" + customListItemLocation + ")";
    }
}
