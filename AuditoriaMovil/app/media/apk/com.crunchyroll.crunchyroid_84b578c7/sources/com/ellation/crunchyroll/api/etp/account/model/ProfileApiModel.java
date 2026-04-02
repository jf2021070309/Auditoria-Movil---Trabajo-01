package com.ellation.crunchyroll.api.etp.account.model;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: ProfileApiModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0002\u0010\u0013J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\t\u0010/\u001a\u00020\u0010HÂ\u0003J\t\u00100\u001a\u00020\u0010HÂ\u0003J\t\u00101\u001a\u00020\u0010HÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u009f\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001J\u0013\u0010;\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u0016R\u0011\u0010\"\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010#\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0011\u0010$\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0016R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0013\u0010)\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0016¨\u0006@"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/model/ProfileApiModel;", "", "_profileId", "", "_profileName", "_maturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;", "_username", "_avatar", "_wallpaper", "_preferredSubtitleLanguage", "_preferredAudioLanguage", "_preferredCommunicationLanguage", "_extendedMaturityRating", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;", "_isSelected", "", "_canSwitch", "_isPrimaryProfile", "(Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/account/model/MaturePreference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/api/etp/account/model/ProfileExtendedMaturityRating;ZZZ)V", "audioLanguage", "getAudioLanguage", "()Ljava/lang/String;", "avatar", "getAvatar", "background", "getBackground", "canSwitch", "getCanSwitch", "()Z", "communicationLanguage", "getCommunicationLanguage", "extendedMaturityRatingBrazil", "getExtendedMaturityRatingBrazil", "isMatureContentEnabled", "isPrimaryProfile", "isSelected", "profileId", "getProfileId", "profileName", "getProfileName", "subtitleLanguage", "getSubtitleLanguage", "username", "getUsername", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileApiModel {
    public static final int $stable = 0;
    @SerializedName("avatar")
    private final String _avatar;
    @SerializedName("can_switch")
    private final boolean _canSwitch;
    @SerializedName("extended_maturity_rating")
    private final ProfileExtendedMaturityRating _extendedMaturityRating;
    @SerializedName("is_primary")
    private final boolean _isPrimaryProfile;
    @SerializedName("is_selected")
    private final boolean _isSelected;
    @SerializedName("maturity_rating")
    private final MaturePreference _maturityRating;
    @SerializedName("preferred_content_audio_language")
    private final String _preferredAudioLanguage;
    @SerializedName("preferred_communication_language")
    private final String _preferredCommunicationLanguage;
    @SerializedName("preferred_content_subtitle_language")
    private final String _preferredSubtitleLanguage;
    @SerializedName("profile_id")
    private final String _profileId;
    @SerializedName("profile_name")
    private final String _profileName;
    @SerializedName("username")
    private final String _username;
    @SerializedName("wallpaper")
    private final String _wallpaper;

    public ProfileApiModel() {
        this(null, null, null, null, null, null, null, null, null, null, false, false, false, 8191, null);
    }

    private final String component1() {
        return this._profileId;
    }

    private final ProfileExtendedMaturityRating component10() {
        return this._extendedMaturityRating;
    }

    private final boolean component11() {
        return this._isSelected;
    }

    private final boolean component12() {
        return this._canSwitch;
    }

    private final boolean component13() {
        return this._isPrimaryProfile;
    }

    private final String component2() {
        return this._profileName;
    }

    private final MaturePreference component3() {
        return this._maturityRating;
    }

    private final String component4() {
        return this._username;
    }

    private final String component5() {
        return this._avatar;
    }

    private final String component6() {
        return this._wallpaper;
    }

    private final String component7() {
        return this._preferredSubtitleLanguage;
    }

    private final String component8() {
        return this._preferredAudioLanguage;
    }

    private final String component9() {
        return this._preferredCommunicationLanguage;
    }

    public static /* synthetic */ ProfileApiModel copy$default(ProfileApiModel profileApiModel, String str, String str2, MaturePreference maturePreference, String str3, String str4, String str5, String str6, String str7, String str8, ProfileExtendedMaturityRating profileExtendedMaturityRating, boolean z, boolean z2, boolean z3, int i, Object obj) {
        String str9;
        String str10;
        MaturePreference maturePreference2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        ProfileExtendedMaturityRating profileExtendedMaturityRating2;
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 1) != 0) {
            str9 = profileApiModel._profileId;
        } else {
            str9 = str;
        }
        if ((i & 2) != 0) {
            str10 = profileApiModel._profileName;
        } else {
            str10 = str2;
        }
        if ((i & 4) != 0) {
            maturePreference2 = profileApiModel._maturityRating;
        } else {
            maturePreference2 = maturePreference;
        }
        if ((i & 8) != 0) {
            str11 = profileApiModel._username;
        } else {
            str11 = str3;
        }
        if ((i & 16) != 0) {
            str12 = profileApiModel._avatar;
        } else {
            str12 = str4;
        }
        if ((i & 32) != 0) {
            str13 = profileApiModel._wallpaper;
        } else {
            str13 = str5;
        }
        if ((i & 64) != 0) {
            str14 = profileApiModel._preferredSubtitleLanguage;
        } else {
            str14 = str6;
        }
        if ((i & 128) != 0) {
            str15 = profileApiModel._preferredAudioLanguage;
        } else {
            str15 = str7;
        }
        if ((i & 256) != 0) {
            str16 = profileApiModel._preferredCommunicationLanguage;
        } else {
            str16 = str8;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            profileExtendedMaturityRating2 = profileApiModel._extendedMaturityRating;
        } else {
            profileExtendedMaturityRating2 = profileExtendedMaturityRating;
        }
        if ((i & 1024) != 0) {
            z4 = profileApiModel._isSelected;
        } else {
            z4 = z;
        }
        if ((i & 2048) != 0) {
            z5 = profileApiModel._canSwitch;
        } else {
            z5 = z2;
        }
        if ((i & 4096) != 0) {
            z6 = profileApiModel._isPrimaryProfile;
        } else {
            z6 = z3;
        }
        return profileApiModel.copy(str9, str10, maturePreference2, str11, str12, str13, str14, str15, str16, profileExtendedMaturityRating2, z4, z5, z6);
    }

    public final ProfileApiModel copy(String str, String str2, MaturePreference maturePreference, String str3, String str4, String str5, String str6, String str7, String str8, ProfileExtendedMaturityRating profileExtendedMaturityRating, boolean z, boolean z2, boolean z3) {
        return new ProfileApiModel(str, str2, maturePreference, str3, str4, str5, str6, str7, str8, profileExtendedMaturityRating, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileApiModel)) {
            return false;
        }
        ProfileApiModel profileApiModel = (ProfileApiModel) obj;
        if (j.a(this._profileId, profileApiModel._profileId) && j.a(this._profileName, profileApiModel._profileName) && this._maturityRating == profileApiModel._maturityRating && j.a(this._username, profileApiModel._username) && j.a(this._avatar, profileApiModel._avatar) && j.a(this._wallpaper, profileApiModel._wallpaper) && j.a(this._preferredSubtitleLanguage, profileApiModel._preferredSubtitleLanguage) && j.a(this._preferredAudioLanguage, profileApiModel._preferredAudioLanguage) && j.a(this._preferredCommunicationLanguage, profileApiModel._preferredCommunicationLanguage) && j.a(this._extendedMaturityRating, profileApiModel._extendedMaturityRating) && this._isSelected == profileApiModel._isSelected && this._canSwitch == profileApiModel._canSwitch && this._isPrimaryProfile == profileApiModel._isPrimaryProfile) {
            return true;
        }
        return false;
    }

    public final String getAudioLanguage() {
        String str = this._preferredAudioLanguage;
        if (str == null) {
            return "";
        }
        return str;
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

    public final boolean getCanSwitch() {
        return this._canSwitch;
    }

    public final String getCommunicationLanguage() {
        String str = this._preferredCommunicationLanguage;
        if (str == null) {
            return "";
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

    public final String getProfileId() {
        String str = this._profileId;
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

    public final String getSubtitleLanguage() {
        return this._preferredSubtitleLanguage;
    }

    public final String getUsername() {
        String str = this._username;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        String str = this._profileId;
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
        MaturePreference maturePreference = this._maturityRating;
        if (maturePreference == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = maturePreference.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this._username;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this._avatar;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this._wallpaper;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this._preferredSubtitleLanguage;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this._preferredAudioLanguage;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str8 = this._preferredCommunicationLanguage;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        if (profileExtendedMaturityRating != null) {
            i = profileExtendedMaturityRating.hashCode();
        }
        int i11 = (i10 + i) * 31;
        boolean z = this._isSelected;
        int i12 = 1;
        int i13 = z;
        if (z != 0) {
            i13 = 1;
        }
        int i14 = (i11 + i13) * 31;
        boolean z2 = this._canSwitch;
        int i15 = z2;
        if (z2 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z3 = this._isPrimaryProfile;
        if (!z3) {
            i12 = z3 ? 1 : 0;
        }
        return i16 + i12;
    }

    public final boolean isMatureContentEnabled() {
        if (this._maturityRating == MaturePreference.MATURE_CONTENT_ENABLED) {
            return true;
        }
        return false;
    }

    public final boolean isPrimaryProfile() {
        return this._isPrimaryProfile;
    }

    public final boolean isSelected() {
        return this._isSelected;
    }

    public String toString() {
        String str = this._profileId;
        String str2 = this._profileName;
        MaturePreference maturePreference = this._maturityRating;
        String str3 = this._username;
        String str4 = this._avatar;
        String str5 = this._wallpaper;
        String str6 = this._preferredSubtitleLanguage;
        String str7 = this._preferredAudioLanguage;
        String str8 = this._preferredCommunicationLanguage;
        ProfileExtendedMaturityRating profileExtendedMaturityRating = this._extendedMaturityRating;
        boolean z = this._isSelected;
        boolean z2 = this._canSwitch;
        boolean z3 = this._isPrimaryProfile;
        StringBuilder b = a.b("ProfileApiModel(_profileId=", str, ", _profileName=", str2, ", _maturityRating=");
        b.append(maturePreference);
        b.append(", _username=");
        b.append(str3);
        b.append(", _avatar=");
        com.amazon.aps.iva.m80.a.c(b, str4, ", _wallpaper=", str5, ", _preferredSubtitleLanguage=");
        com.amazon.aps.iva.m80.a.c(b, str6, ", _preferredAudioLanguage=", str7, ", _preferredCommunicationLanguage=");
        b.append(str8);
        b.append(", _extendedMaturityRating=");
        b.append(profileExtendedMaturityRating);
        b.append(", _isSelected=");
        b.append(z);
        b.append(", _canSwitch=");
        b.append(z2);
        b.append(", _isPrimaryProfile=");
        return e.c(b, z3, ")");
    }

    public ProfileApiModel(String str, String str2, MaturePreference maturePreference, String str3, String str4, String str5, String str6, String str7, String str8, ProfileExtendedMaturityRating profileExtendedMaturityRating, boolean z, boolean z2, boolean z3) {
        this._profileId = str;
        this._profileName = str2;
        this._maturityRating = maturePreference;
        this._username = str3;
        this._avatar = str4;
        this._wallpaper = str5;
        this._preferredSubtitleLanguage = str6;
        this._preferredAudioLanguage = str7;
        this._preferredCommunicationLanguage = str8;
        this._extendedMaturityRating = profileExtendedMaturityRating;
        this._isSelected = z;
        this._canSwitch = z2;
        this._isPrimaryProfile = z3;
    }

    public /* synthetic */ ProfileApiModel(String str, String str2, MaturePreference maturePreference, String str3, String str4, String str5, String str6, String str7, String str8, ProfileExtendedMaturityRating profileExtendedMaturityRating, boolean z, boolean z2, boolean z3, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : maturePreference, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? profileExtendedMaturityRating : null, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z2, (i & 4096) == 0 ? z3 : false);
    }
}
