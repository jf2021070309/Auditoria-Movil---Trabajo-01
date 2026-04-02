package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.ab.f;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: UserProfileResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÂ\u0003JQ\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006&"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileResponse;", "", "_profileName", "", "_username", "_extendedMaturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;", "_maturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "_avatar", "_wallpaper", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;Ljava/lang/String;Ljava/lang/String;)V", "avatar", "getAvatar", "()Ljava/lang/String;", "background", "getBackground", "extendedMaturityRatingBrazil", "getExtendedMaturityRatingBrazil", "isMatureContentEnabled", "", "()Z", "profileName", "getProfileName", "userName", "getUserName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserProfileResponse {
    public static final int $stable = 0;
    @SerializedName("avatar")
    private final String _avatar;
    @SerializedName("extended_maturity_rating")
    private final ProfileExtendedMaturityRating _extendedMaturityRating;
    @SerializedName("maturity_rating")
    private final MaturePreference _maturityRating;
    @SerializedName("profile_name")
    private final String _profileName;
    @SerializedName("username")
    private final String _username;
    @SerializedName("wallpaper")
    private final String _wallpaper;

    public UserProfileResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final String component1() {
        return this._profileName;
    }

    private final String component2() {
        return this._username;
    }

    private final ProfileExtendedMaturityRating component3() {
        return this._extendedMaturityRating;
    }

    private final MaturePreference component4() {
        return this._maturityRating;
    }

    private final String component5() {
        return this._avatar;
    }

    private final String component6() {
        return this._wallpaper;
    }

    public static /* synthetic */ UserProfileResponse copy$default(UserProfileResponse userProfileResponse, String str, String str2, ProfileExtendedMaturityRating profileExtendedMaturityRating, MaturePreference maturePreference, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfileResponse._profileName;
        }
        if ((i & 2) != 0) {
            str2 = userProfileResponse._username;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            profileExtendedMaturityRating = userProfileResponse._extendedMaturityRating;
        }
        ProfileExtendedMaturityRating profileExtendedMaturityRating2 = profileExtendedMaturityRating;
        if ((i & 8) != 0) {
            maturePreference = userProfileResponse._maturityRating;
        }
        MaturePreference maturePreference2 = maturePreference;
        if ((i & 16) != 0) {
            str3 = userProfileResponse._avatar;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = userProfileResponse._wallpaper;
        }
        return userProfileResponse.copy(str, str5, profileExtendedMaturityRating2, maturePreference2, str6, str4);
    }

    public final UserProfileResponse copy(String str, String str2, ProfileExtendedMaturityRating profileExtendedMaturityRating, MaturePreference maturePreference, String str3, String str4) {
        return new UserProfileResponse(str, str2, profileExtendedMaturityRating, maturePreference, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResponse)) {
            return false;
        }
        UserProfileResponse userProfileResponse = (UserProfileResponse) obj;
        if (j.a(this._profileName, userProfileResponse._profileName) && j.a(this._username, userProfileResponse._username) && j.a(this._extendedMaturityRating, userProfileResponse._extendedMaturityRating) && this._maturityRating == userProfileResponse._maturityRating && j.a(this._avatar, userProfileResponse._avatar) && j.a(this._wallpaper, userProfileResponse._wallpaper)) {
            return true;
        }
        return false;
    }

    public final String getAvatar() {
        String str = this._avatar;
        if (str == null) {
            return "default.png";
        }
        return str;
    }

    public final String getBackground() {
        String str = this._wallpaper;
        if (str == null) {
            return "default.png";
        }
        return str;
    }

    public final String getExtendedMaturityRatingBrazil() {
        String brazil;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        if (profileExtendedMaturityRating == null || (brazil = profileExtendedMaturityRating.getBrazil()) == null) {
            return "16";
        }
        return brazil;
    }

    public final String getProfileName() {
        String str = this._profileName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUserName() {
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
        int hashCode4;
        int hashCode5;
        String str = this._profileName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._username;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        if (profileExtendedMaturityRating == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = profileExtendedMaturityRating.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        MaturePreference maturePreference = this._maturityRating;
        if (maturePreference == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = maturePreference.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str3 = this._avatar;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str4 = this._wallpaper;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i6 + i;
    }

    public final boolean isMatureContentEnabled() {
        if (this._maturityRating == MaturePreference.MATURE_CONTENT_ENABLED) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this._profileName;
        String str2 = this._username;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        MaturePreference maturePreference = this._maturityRating;
        String str3 = this._avatar;
        String str4 = this._wallpaper;
        StringBuilder b = a.b("UserProfileResponse(_profileName=", str, ", _username=", str2, ", _extendedMaturityRating=");
        b.append(profileExtendedMaturityRating);
        b.append(", _maturityRating=");
        b.append(maturePreference);
        b.append(", _avatar=");
        return f.a(b, str3, ", _wallpaper=", str4, ")");
    }

    public UserProfileResponse(String str, String str2, ProfileExtendedMaturityRating profileExtendedMaturityRating, MaturePreference maturePreference, String str3, String str4) {
        this._profileName = str;
        this._username = str2;
        this._extendedMaturityRating = profileExtendedMaturityRating;
        this._maturityRating = maturePreference;
        this._avatar = str3;
        this._wallpaper = str4;
    }

    public /* synthetic */ UserProfileResponse(String str, String str2, ProfileExtendedMaturityRating profileExtendedMaturityRating, MaturePreference maturePreference, String str3, String str4, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : profileExtendedMaturityRating, (i & 8) != 0 ? null : maturePreference, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
