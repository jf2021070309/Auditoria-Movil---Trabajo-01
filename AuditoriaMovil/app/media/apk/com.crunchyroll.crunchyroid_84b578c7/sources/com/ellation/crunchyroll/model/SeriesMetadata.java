package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oa.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÂ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÂ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÆ\u0003J\u0093\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001a¨\u00064"}, d2 = {"Lcom/ellation/crunchyroll/model/SeriesMetadata;", "Lcom/ellation/crunchyroll/model/PanelMetadata;", "seasonCount", "", "episodeCount", "lastPublicEpisodeNumber", "", "isMature", "", "isMatureBlocked", "isDubbed", "isSubbed", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "contentDescriptors", "", "_subtitleLocales", "_audioLocales", "(IILjava/lang/String;ZZZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "availableAudioLocales", "getAvailableAudioLocales", "()Ljava/util/List;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "getContentDescriptors", "getEpisodeCount", "()I", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "()Z", "getLastPublicEpisodeNumber", "()Ljava/lang/String;", "originalAudio", "getOriginalAudio", "getSeasonCount", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SeriesMetadata extends PanelMetadata {
    public static final int $stable = 8;
    @SerializedName("audio_locales")
    private final List<String> _audioLocales;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("content_descriptors")
    private final List<String> contentDescriptors;
    @SerializedName("episode_count")
    private final int episodeCount;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    @SerializedName("is_dubbed")
    private final boolean isDubbed;
    @SerializedName("is_mature")
    private final boolean isMature;
    @SerializedName("mature_blocked")
    private final boolean isMatureBlocked;
    @SerializedName("is_subbed")
    private final boolean isSubbed;
    @SerializedName("last_public_episode_number")
    private final String lastPublicEpisodeNumber;
    @SerializedName("season_count")
    private final int seasonCount;

    public SeriesMetadata() {
        this(0, 0, null, false, false, false, false, null, null, null, null, 2047, null);
    }

    private final List<String> component10() {
        return this._subtitleLocales;
    }

    private final List<String> component11() {
        return this._audioLocales;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeriesMetadata copy$default(SeriesMetadata seriesMetadata, int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, int i3, Object obj) {
        int i4;
        int i5;
        String str2;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        ExtendedMaturityRating extendedMaturityRating2;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        if ((i3 & 1) != 0) {
            i4 = seriesMetadata.seasonCount;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = seriesMetadata.episodeCount;
        } else {
            i5 = i2;
        }
        if ((i3 & 4) != 0) {
            str2 = seriesMetadata.lastPublicEpisodeNumber;
        } else {
            str2 = str;
        }
        if ((i3 & 8) != 0) {
            z5 = seriesMetadata.isMature;
        } else {
            z5 = z;
        }
        if ((i3 & 16) != 0) {
            z6 = seriesMetadata.isMatureBlocked;
        } else {
            z6 = z2;
        }
        if ((i3 & 32) != 0) {
            z7 = seriesMetadata.isDubbed;
        } else {
            z7 = z3;
        }
        if ((i3 & 64) != 0) {
            z8 = seriesMetadata.isSubbed;
        } else {
            z8 = z4;
        }
        if ((i3 & 128) != 0) {
            extendedMaturityRating2 = seriesMetadata.extendedMaturityRating;
        } else {
            extendedMaturityRating2 = extendedMaturityRating;
        }
        if ((i3 & 256) != 0) {
            list4 = seriesMetadata.contentDescriptors;
        } else {
            list4 = list;
        }
        if ((i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            list5 = seriesMetadata._subtitleLocales;
        } else {
            list5 = list2;
        }
        if ((i3 & 1024) != 0) {
            list6 = seriesMetadata._audioLocales;
        } else {
            list6 = list3;
        }
        return seriesMetadata.copy(i4, i5, str2, z5, z6, z7, z8, extendedMaturityRating2, list4, list5, list6);
    }

    public final int component1() {
        return this.seasonCount;
    }

    public final int component2() {
        return this.episodeCount;
    }

    public final String component3() {
        return this.lastPublicEpisodeNumber;
    }

    public final boolean component4() {
        return this.isMature;
    }

    public final boolean component5() {
        return this.isMatureBlocked;
    }

    public final boolean component6() {
        return this.isDubbed;
    }

    public final boolean component7() {
        return this.isSubbed;
    }

    public final ExtendedMaturityRating component8() {
        return this.extendedMaturityRating;
    }

    public final List<String> component9() {
        return this.contentDescriptors;
    }

    public final SeriesMetadata copy(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<String> list3) {
        return new SeriesMetadata(i, i2, str, z, z2, z3, z4, extendedMaturityRating, list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesMetadata)) {
            return false;
        }
        SeriesMetadata seriesMetadata = (SeriesMetadata) obj;
        if (this.seasonCount == seriesMetadata.seasonCount && this.episodeCount == seriesMetadata.episodeCount && j.a(this.lastPublicEpisodeNumber, seriesMetadata.lastPublicEpisodeNumber) && this.isMature == seriesMetadata.isMature && this.isMatureBlocked == seriesMetadata.isMatureBlocked && this.isDubbed == seriesMetadata.isDubbed && this.isSubbed == seriesMetadata.isSubbed && j.a(this.extendedMaturityRating, seriesMetadata.extendedMaturityRating) && j.a(this.contentDescriptors, seriesMetadata.contentDescriptors) && j.a(this._subtitleLocales, seriesMetadata._subtitleLocales) && j.a(this._audioLocales, seriesMetadata._audioLocales)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableAudioLocales() {
        return this._audioLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableSubtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getContentDescriptors() {
        return this.contentDescriptors;
    }

    public final int getEpisodeCount() {
        return this.episodeCount;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    public final String getLastPublicEpisodeNumber() {
        return this.lastPublicEpisodeNumber;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public String getOriginalAudio() {
        List<String> list = this._audioLocales;
        if (list != null) {
            return (String) x.v0(list);
        }
        return null;
    }

    public final int getSeasonCount() {
        return this.seasonCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int a = r.a(this.episodeCount, Integer.hashCode(this.seasonCount) * 31, 31);
        String str = this.lastPublicEpisodeNumber;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        boolean z = this.isMature;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        boolean z2 = this.isMatureBlocked;
        int i6 = z2;
        if (z2 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        boolean z3 = this.isDubbed;
        int i8 = z3;
        if (z3 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z4 = this.isSubbed;
        if (!z4) {
            i3 = z4 ? 1 : 0;
        }
        int i10 = (i9 + i3) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = extendedMaturityRating.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        List<String> list = this.contentDescriptors;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        List<String> list2 = this._subtitleLocales;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        List<String> list3 = this._audioLocales;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i13 + i;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isDubbed() {
        return this.isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMature() {
        return this.isMature;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isMatureBlocked() {
        return this.isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        int i = this.seasonCount;
        int i2 = this.episodeCount;
        String str = this.lastPublicEpisodeNumber;
        boolean z = this.isMature;
        boolean z2 = this.isMatureBlocked;
        boolean z3 = this.isDubbed;
        boolean z4 = this.isSubbed;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this.contentDescriptors;
        List<String> list2 = this._subtitleLocales;
        List<String> list3 = this._audioLocales;
        StringBuilder a = com.amazon.aps.iva.b6.x.a("SeriesMetadata(seasonCount=", i, ", episodeCount=", i2, ", lastPublicEpisodeNumber=");
        a.append(str);
        a.append(", isMature=");
        a.append(z);
        a.append(", isMatureBlocked=");
        a.append(z2);
        a.append(", isDubbed=");
        a.append(z3);
        a.append(", isSubbed=");
        a.append(z4);
        a.append(", extendedMaturityRating=");
        a.append(extendedMaturityRating);
        a.append(", contentDescriptors=");
        a.append(list);
        a.append(", _subtitleLocales=");
        a.append(list2);
        a.append(", _audioLocales=");
        return a.b(a, list3, ")");
    }

    public /* synthetic */ SeriesMetadata(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, int i3, e eVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) == 0 ? z4 : false, (i3 & 128) != 0 ? null : extendedMaturityRating, (i3 & 256) != 0 ? z.b : list, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : list2, (i3 & 1024) == 0 ? list3 : null);
    }

    public SeriesMetadata(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<String> list3) {
        super(null);
        this.seasonCount = i;
        this.episodeCount = i2;
        this.lastPublicEpisodeNumber = str;
        this.isMature = z;
        this.isMatureBlocked = z2;
        this.isDubbed = z3;
        this.isSubbed = z4;
        this.extendedMaturityRating = extendedMaturityRating;
        this.contentDescriptors = list;
        this._subtitleLocales = list2;
        this._audioLocales = list3;
    }
}
