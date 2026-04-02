package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PlayableAssetVersion.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "Ljava/io/Serializable;", "_audioLocale", "", "_assetId", "seasonId", "original", "", "_variant", "isPremiumOnly", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "assetId", "getAssetId", "()Ljava/lang/String;", "audioLocale", "getAudioLocale", "()Z", "getOriginal", "getSeasonId", "variant", "getVariant", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayableAssetVersion implements Serializable {
    public static final int $stable = 0;
    @SerializedName("guid")
    private final String _assetId;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("variant")
    private final String _variant;
    @SerializedName("is_premium_only")
    private final boolean isPremiumOnly;
    @SerializedName("original")
    private final boolean original;
    @SerializedName("season_guid")
    private final String seasonId;

    public PlayableAssetVersion() {
        this(null, null, null, false, null, false, 63, null);
    }

    private final String component1() {
        return this._audioLocale;
    }

    private final String component2() {
        return this._assetId;
    }

    private final String component5() {
        return this._variant;
    }

    public static /* synthetic */ PlayableAssetVersion copy$default(PlayableAssetVersion playableAssetVersion, String str, String str2, String str3, boolean z, String str4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playableAssetVersion._audioLocale;
        }
        if ((i & 2) != 0) {
            str2 = playableAssetVersion._assetId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = playableAssetVersion.seasonId;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = playableAssetVersion.original;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str4 = playableAssetVersion._variant;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z2 = playableAssetVersion.isPremiumOnly;
        }
        return playableAssetVersion.copy(str, str5, str6, z3, str7, z2);
    }

    public final String component3() {
        return this.seasonId;
    }

    public final boolean component4() {
        return this.original;
    }

    public final boolean component6() {
        return this.isPremiumOnly;
    }

    public final PlayableAssetVersion copy(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        return new PlayableAssetVersion(str, str2, str3, z, str4, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayableAssetVersion)) {
            return false;
        }
        PlayableAssetVersion playableAssetVersion = (PlayableAssetVersion) obj;
        if (j.a(this._audioLocale, playableAssetVersion._audioLocale) && j.a(this._assetId, playableAssetVersion._assetId) && j.a(this.seasonId, playableAssetVersion.seasonId) && this.original == playableAssetVersion.original && j.a(this._variant, playableAssetVersion._variant) && this.isPremiumOnly == playableAssetVersion.isPremiumOnly) {
            return true;
        }
        return false;
    }

    public final String getAssetId() {
        String str = this._assetId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getAudioLocale() {
        String str = this._audioLocale;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final boolean getOriginal() {
        return this.original;
    }

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final String getVariant() {
        String str = this._variant;
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
        String str = this._audioLocale;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._assetId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.seasonId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.original;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        String str4 = this._variant;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i8 = (i7 + i) * 31;
        boolean z2 = this.isPremiumOnly;
        if (!z2) {
            i5 = z2 ? 1 : 0;
        }
        return i8 + i5;
    }

    public final boolean isPremiumOnly() {
        return this.isPremiumOnly;
    }

    public String toString() {
        String str = this._audioLocale;
        String str2 = this._assetId;
        String str3 = this.seasonId;
        boolean z = this.original;
        String str4 = this._variant;
        boolean z2 = this.isPremiumOnly;
        StringBuilder b = a.b("PlayableAssetVersion(_audioLocale=", str, ", _assetId=", str2, ", seasonId=");
        b.append(str3);
        b.append(", original=");
        b.append(z);
        b.append(", _variant=");
        b.append(str4);
        b.append(", isPremiumOnly=");
        b.append(z2);
        b.append(")");
        return b.toString();
    }

    public PlayableAssetVersion(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        this._audioLocale = str;
        this._assetId = str2;
        this.seasonId = str3;
        this.original = z;
        this._variant = str4;
        this.isPremiumOnly = z2;
    }

    public /* synthetic */ PlayableAssetVersion(String str, String str2, String str3, boolean z, String str4, boolean z2, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? str4 : null, (i & 32) != 0 ? false : z2);
    }
}
