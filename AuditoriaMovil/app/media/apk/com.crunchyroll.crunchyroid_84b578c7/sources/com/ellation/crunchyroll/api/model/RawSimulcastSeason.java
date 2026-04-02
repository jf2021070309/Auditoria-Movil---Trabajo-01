package com.ellation.crunchyroll.api.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SeasonListContainer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/model/RawSimulcastSeason;", "", "id", "", "localization", "Lcom/ellation/crunchyroll/api/model/RawSimulcastSeasonLocalization;", "(Ljava/lang/String;Lcom/ellation/crunchyroll/api/model/RawSimulcastSeasonLocalization;)V", "getId", "()Ljava/lang/String;", "getLocalization", "()Lcom/ellation/crunchyroll/api/model/RawSimulcastSeasonLocalization;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RawSimulcastSeason {
    public static final int $stable = 0;
    @SerializedName("id")
    private final String id;
    @SerializedName("localization")
    private final RawSimulcastSeasonLocalization localization;

    public RawSimulcastSeason(String str, RawSimulcastSeasonLocalization rawSimulcastSeasonLocalization) {
        j.f(str, "id");
        this.id = str;
        this.localization = rawSimulcastSeasonLocalization;
    }

    public static /* synthetic */ RawSimulcastSeason copy$default(RawSimulcastSeason rawSimulcastSeason, String str, RawSimulcastSeasonLocalization rawSimulcastSeasonLocalization, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rawSimulcastSeason.id;
        }
        if ((i & 2) != 0) {
            rawSimulcastSeasonLocalization = rawSimulcastSeason.localization;
        }
        return rawSimulcastSeason.copy(str, rawSimulcastSeasonLocalization);
    }

    public final String component1() {
        return this.id;
    }

    public final RawSimulcastSeasonLocalization component2() {
        return this.localization;
    }

    public final RawSimulcastSeason copy(String str, RawSimulcastSeasonLocalization rawSimulcastSeasonLocalization) {
        j.f(str, "id");
        return new RawSimulcastSeason(str, rawSimulcastSeasonLocalization);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawSimulcastSeason)) {
            return false;
        }
        RawSimulcastSeason rawSimulcastSeason = (RawSimulcastSeason) obj;
        if (j.a(this.id, rawSimulcastSeason.id) && j.a(this.localization, rawSimulcastSeason.localization)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final RawSimulcastSeasonLocalization getLocalization() {
        return this.localization;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        RawSimulcastSeasonLocalization rawSimulcastSeasonLocalization = this.localization;
        if (rawSimulcastSeasonLocalization == null) {
            hashCode = 0;
        } else {
            hashCode = rawSimulcastSeasonLocalization.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.id;
        RawSimulcastSeasonLocalization rawSimulcastSeasonLocalization = this.localization;
        return "RawSimulcastSeason(id=" + str + ", localization=" + rawSimulcastSeasonLocalization + ")";
    }
}
