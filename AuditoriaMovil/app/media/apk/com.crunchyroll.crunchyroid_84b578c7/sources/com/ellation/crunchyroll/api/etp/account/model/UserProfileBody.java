package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UserProfileBody.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÂ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileBody;", "", "_username", "", "_profileName", "_maturityRating", "_extendedMaturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;)V", "extendedMaturityRatingBrazil", "getExtendedMaturityRatingBrazil", "()Ljava/lang/String;", "maturityRating", "getMaturityRating", "profileName", "getProfileName", "username", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserProfileBody {
    public static final int $stable = 0;
    @SerializedName("extended_maturity_rating")
    private final ProfileExtendedMaturityRating _extendedMaturityRating;
    @SerializedName("maturity_rating")
    private final String _maturityRating;
    @SerializedName("profile_name")
    private final String _profileName;
    @SerializedName("username")
    private final String _username;

    public UserProfileBody() {
        this(null, null, null, null, 15, null);
    }

    private final String component1() {
        return this._username;
    }

    private final String component2() {
        return this._profileName;
    }

    private final String component3() {
        return this._maturityRating;
    }

    private final ProfileExtendedMaturityRating component4() {
        return this._extendedMaturityRating;
    }

    public static /* synthetic */ UserProfileBody copy$default(UserProfileBody userProfileBody, String str, String str2, String str3, ProfileExtendedMaturityRating profileExtendedMaturityRating, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfileBody._username;
        }
        if ((i & 2) != 0) {
            str2 = userProfileBody._profileName;
        }
        if ((i & 4) != 0) {
            str3 = userProfileBody._maturityRating;
        }
        if ((i & 8) != 0) {
            profileExtendedMaturityRating = userProfileBody._extendedMaturityRating;
        }
        return userProfileBody.copy(str, str2, str3, profileExtendedMaturityRating);
    }

    public final UserProfileBody copy(String str, String str2, String str3, ProfileExtendedMaturityRating profileExtendedMaturityRating) {
        return new UserProfileBody(str, str2, str3, profileExtendedMaturityRating);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileBody)) {
            return false;
        }
        UserProfileBody userProfileBody = (UserProfileBody) obj;
        if (j.a(this._username, userProfileBody._username) && j.a(this._profileName, userProfileBody._profileName) && j.a(this._maturityRating, userProfileBody._maturityRating) && j.a(this._extendedMaturityRating, userProfileBody._extendedMaturityRating)) {
            return true;
        }
        return false;
    }

    public final String getExtendedMaturityRatingBrazil() {
        String brazil;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        if (profileExtendedMaturityRating == null || (brazil = profileExtendedMaturityRating.getBrazil()) == null) {
            return "16";
        }
        return brazil;
    }

    public final String getMaturityRating() {
        String str = this._maturityRating;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getProfileName() {
        String str = this._profileName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUsername() {
        String str = this._username;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this._username;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._profileName;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._maturityRating;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        if (profileExtendedMaturityRating != null) {
            i = profileExtendedMaturityRating.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        String str = this._username;
        String str2 = this._profileName;
        String str3 = this._maturityRating;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        StringBuilder b = a.b("UserProfileBody(_username=", str, ", _profileName=", str2, ", _maturityRating=");
        b.append(str3);
        b.append(", _extendedMaturityRating=");
        b.append(profileExtendedMaturityRating);
        b.append(")");
        return b.toString();
    }

    public UserProfileBody(String str, String str2, String str3, ProfileExtendedMaturityRating profileExtendedMaturityRating) {
        this._username = str;
        this._profileName = str2;
        this._maturityRating = str3;
        this._extendedMaturityRating = profileExtendedMaturityRating;
    }

    public /* synthetic */ UserProfileBody(String str, String str2, String str3, ProfileExtendedMaturityRating profileExtendedMaturityRating, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : profileExtendedMaturityRating);
    }
}
