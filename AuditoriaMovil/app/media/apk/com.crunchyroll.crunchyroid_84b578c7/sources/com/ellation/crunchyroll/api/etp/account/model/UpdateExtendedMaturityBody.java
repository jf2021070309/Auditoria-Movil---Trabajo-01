package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UpdateExtendedMaturityBody.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UpdateExtendedMaturityBody;", "", "extendedMaturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;", "(Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;)V", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdateExtendedMaturityBody {
    public static final int $stable = 0;
    @SerializedName("extended_maturity_rating")
    private final ProfileExtendedMaturityRating extendedMaturityRating;

    public UpdateExtendedMaturityBody(ProfileExtendedMaturityRating profileExtendedMaturityRating) {
        j.f(profileExtendedMaturityRating, "extendedMaturityRating");
        this.extendedMaturityRating = profileExtendedMaturityRating;
    }

    public static /* synthetic */ UpdateExtendedMaturityBody copy$default(UpdateExtendedMaturityBody updateExtendedMaturityBody, ProfileExtendedMaturityRating profileExtendedMaturityRating, int i, Object obj) {
        if ((i & 1) != 0) {
            profileExtendedMaturityRating = updateExtendedMaturityBody.extendedMaturityRating;
        }
        return updateExtendedMaturityBody.copy(profileExtendedMaturityRating);
    }

    public final ProfileExtendedMaturityRating component1() {
        return this.extendedMaturityRating;
    }

    public final UpdateExtendedMaturityBody copy(ProfileExtendedMaturityRating profileExtendedMaturityRating) {
        j.f(profileExtendedMaturityRating, "extendedMaturityRating");
        return new UpdateExtendedMaturityBody(profileExtendedMaturityRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateExtendedMaturityBody) && j.a(this.extendedMaturityRating, ((UpdateExtendedMaturityBody) obj).extendedMaturityRating)) {
            return true;
        }
        return false;
    }

    public final ProfileExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    public int hashCode() {
        return this.extendedMaturityRating.hashCode();
    }

    public String toString() {
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this.extendedMaturityRating;
        return "UpdateExtendedMaturityBody(extendedMaturityRating=" + profileExtendedMaturityRating + ")";
    }
}
