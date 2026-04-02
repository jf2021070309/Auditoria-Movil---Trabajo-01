package com.ellation.crunchyroll.model.maturityrating;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ExtendedMaturityRating.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/io/Serializable;", "system", "", "rating", FirebaseAnalytics.Param.LEVEL, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "getRating", "getSystem", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtendedMaturityRating implements Serializable {
    public static final int $stable = 0;
    @SerializedName(FirebaseAnalytics.Param.LEVEL)
    private final String level;
    @SerializedName("rating")
    private final String rating;
    @SerializedName("system")
    private final String system;

    public ExtendedMaturityRating(String str, String str2, String str3) {
        this.system = str;
        this.rating = str2;
        this.level = str3;
    }

    public static /* synthetic */ ExtendedMaturityRating copy$default(ExtendedMaturityRating extendedMaturityRating, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extendedMaturityRating.system;
        }
        if ((i & 2) != 0) {
            str2 = extendedMaturityRating.rating;
        }
        if ((i & 4) != 0) {
            str3 = extendedMaturityRating.level;
        }
        return extendedMaturityRating.copy(str, str2, str3);
    }

    public final String component1() {
        return this.system;
    }

    public final String component2() {
        return this.rating;
    }

    public final String component3() {
        return this.level;
    }

    public final ExtendedMaturityRating copy(String str, String str2, String str3) {
        return new ExtendedMaturityRating(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedMaturityRating)) {
            return false;
        }
        ExtendedMaturityRating extendedMaturityRating = (ExtendedMaturityRating) obj;
        if (j.a(this.system, extendedMaturityRating.system) && j.a(this.rating, extendedMaturityRating.rating) && j.a(this.level, extendedMaturityRating.level)) {
            return true;
        }
        return false;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getRating() {
        return this.rating;
    }

    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.system;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.rating;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.level;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.system;
        String str2 = this.rating;
        return b.c(a.b("ExtendedMaturityRating(system=", str, ", rating=", str2, ", level="), this.level, ")");
    }
}
