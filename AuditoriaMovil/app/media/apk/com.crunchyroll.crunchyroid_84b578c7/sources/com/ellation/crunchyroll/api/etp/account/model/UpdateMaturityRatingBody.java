package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UpdateMaturityRatingBody.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UpdateMaturityRatingBody;", "", "maturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "(Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;)V", "getMaturityRating", "()Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdateMaturityRatingBody {
    public static final int $stable = 0;
    @SerializedName("maturity_rating")
    private final MaturePreference maturityRating;

    public UpdateMaturityRatingBody(MaturePreference maturePreference) {
        j.f(maturePreference, "maturityRating");
        this.maturityRating = maturePreference;
    }

    public static /* synthetic */ UpdateMaturityRatingBody copy$default(UpdateMaturityRatingBody updateMaturityRatingBody, MaturePreference maturePreference, int i, Object obj) {
        if ((i & 1) != 0) {
            maturePreference = updateMaturityRatingBody.maturityRating;
        }
        return updateMaturityRatingBody.copy(maturePreference);
    }

    public final MaturePreference component1() {
        return this.maturityRating;
    }

    public final UpdateMaturityRatingBody copy(MaturePreference maturePreference) {
        j.f(maturePreference, "maturityRating");
        return new UpdateMaturityRatingBody(maturePreference);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UpdateMaturityRatingBody) && this.maturityRating == ((UpdateMaturityRatingBody) obj).maturityRating) {
            return true;
        }
        return false;
    }

    public final MaturePreference getMaturityRating() {
        return this.maturityRating;
    }

    public int hashCode() {
        return this.maturityRating.hashCode();
    }

    public String toString() {
        MaturePreference maturePreference = this.maturityRating;
        return "UpdateMaturityRatingBody(maturityRating=" + maturePreference + ")";
    }
}
