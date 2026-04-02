package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÂ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015HÂ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0015HÂ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003JÙ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010H\u001a\u00020\f2\b\u0010I\u001a\u0004\u0018\u00010JHÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010,R\u0016\u0010\u0010\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010,R\u0016\u0010\u000e\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010,R\u0016\u0010\u000f\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010,R\u0016\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010,R\u0016\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0014\u0010/\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001dR\u0014\u00101\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010 ¨\u0006N"}, d2 = {"Lcom/ellation/crunchyroll/model/MovieMetadata;", "Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "_parentId", "", "_parentTitle", "availableDate", "Ljava/util/Date;", "freeAvailableDate", "premiumAvailableDate", "durationMs", "", "isPremiumOnly", "", "isAvailableOffline", "isMature", "isMatureBlocked", "isDubbed", "isSubbed", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "_contentDescriptors", "", "_subtitleLocales", "_versions", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "_audioLocale", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;JZZZZZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "audioLocale", "getAudioLocale", "()Ljava/lang/String;", "availableAudioLocales", "getAvailableAudioLocales", "()Ljava/util/List;", "getAvailableDate", "()Ljava/util/Date;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "contentDescriptors", "getContentDescriptors", "getDurationMs", "()J", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getFreeAvailableDate", "()Z", "originalAudio", "getOriginalAudio", "parentId", "getParentId", "parentTitle", "getParentTitle", "getPremiumAvailableDate", "versions", "getVersions", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MovieMetadata extends PlayableAssetPanelMetadata {
    public static final int $stable = 8;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName("movie_listing_id")
    private final String _parentId;
    @SerializedName("movie_listing_title")
    private final String _parentTitle;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("versions")
    private final List<PlayableAssetVersion> _versions;
    @SerializedName("available_date")
    private final Date availableDate;
    @SerializedName("duration_ms")
    private final long durationMs;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    @SerializedName("free_available_date")
    private final Date freeAvailableDate;
    @SerializedName("available_offline")
    private final boolean isAvailableOffline;
    @SerializedName("is_dubbed")
    private final boolean isDubbed;
    @SerializedName("is_mature")
    private final boolean isMature;
    @SerializedName("mature_blocked")
    private final boolean isMatureBlocked;
    @SerializedName("is_premium_only")
    private final boolean isPremiumOnly;
    @SerializedName("is_subbed")
    private final boolean isSubbed;
    @SerializedName("premium_available_date")
    private final Date premiumAvailableDate;

    public MovieMetadata() {
        this(null, null, null, null, null, 0L, false, false, false, false, false, false, null, null, null, null, null, 131071, null);
    }

    private final String component1() {
        return this._parentId;
    }

    private final List<String> component14() {
        return this._contentDescriptors;
    }

    private final List<String> component15() {
        return this._subtitleLocales;
    }

    private final List<PlayableAssetVersion> component16() {
        return this._versions;
    }

    private final String component17() {
        return this._audioLocale;
    }

    private final String component2() {
        return this._parentTitle;
    }

    public final boolean component10() {
        return this.isMatureBlocked;
    }

    public final boolean component11() {
        return this.isDubbed;
    }

    public final boolean component12() {
        return this.isSubbed;
    }

    public final ExtendedMaturityRating component13() {
        return this.extendedMaturityRating;
    }

    public final Date component3() {
        return this.availableDate;
    }

    public final Date component4() {
        return this.freeAvailableDate;
    }

    public final Date component5() {
        return this.premiumAvailableDate;
    }

    public final long component6() {
        return this.durationMs;
    }

    public final boolean component7() {
        return this.isPremiumOnly;
    }

    public final boolean component8() {
        return this.isAvailableOffline;
    }

    public final boolean component9() {
        return this.isMature;
    }

    public final MovieMetadata copy(String str, String str2, Date date, Date date2, Date date3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<PlayableAssetVersion> list3, String str3) {
        return new MovieMetadata(str, str2, date, date2, date3, j, z, z2, z3, z4, z5, z6, extendedMaturityRating, list, list2, list3, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieMetadata)) {
            return false;
        }
        MovieMetadata movieMetadata = (MovieMetadata) obj;
        if (j.a(this._parentId, movieMetadata._parentId) && j.a(this._parentTitle, movieMetadata._parentTitle) && j.a(this.availableDate, movieMetadata.availableDate) && j.a(this.freeAvailableDate, movieMetadata.freeAvailableDate) && j.a(this.premiumAvailableDate, movieMetadata.premiumAvailableDate) && this.durationMs == movieMetadata.durationMs && this.isPremiumOnly == movieMetadata.isPremiumOnly && this.isAvailableOffline == movieMetadata.isAvailableOffline && this.isMature == movieMetadata.isMature && this.isMatureBlocked == movieMetadata.isMatureBlocked && this.isDubbed == movieMetadata.isDubbed && this.isSubbed == movieMetadata.isSubbed && j.a(this.extendedMaturityRating, movieMetadata.extendedMaturityRating) && j.a(this._contentDescriptors, movieMetadata._contentDescriptors) && j.a(this._subtitleLocales, movieMetadata._subtitleLocales) && j.a(this._versions, movieMetadata._versions) && j.a(this._audioLocale, movieMetadata._audioLocale)) {
            return true;
        }
        return false;
    }

    public final String getAudioLocale() {
        return this._audioLocale;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableAudioLocales() {
        return z.b;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getAvailableDate() {
        return this.availableDate;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableSubtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getContentDescriptors() {
        List<String> list = this._contentDescriptors;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    @Override // com.ellation.crunchyroll.model.DurationProvider
    public long getDurationMs() {
        return this.durationMs;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getFreeAvailableDate() {
        return this.freeAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public String getOriginalAudio() {
        return null;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public String getParentId() {
        String str = this._parentId;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public String getParentTitle() {
        String str = this._parentTitle;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public Date getPremiumAvailableDate() {
        return this.premiumAvailableDate;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public List<PlayableAssetVersion> getVersions() {
        List<PlayableAssetVersion> list = this._versions;
        if (list == null) {
            return z.b;
        }
        return list;
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
        String str = this._parentId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._parentTitle;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Date date = this.availableDate;
        if (date == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = date.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Date date2 = this.freeAvailableDate;
        if (date2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = date2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Date date3 = this.premiumAvailableDate;
        if (date3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = date3.hashCode();
        }
        int a = i.a(this.durationMs, (i5 + hashCode5) * 31, 31);
        boolean z = this.isPremiumOnly;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (a + i7) * 31;
        boolean z2 = this.isAvailableOffline;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z3 = this.isMature;
        int i11 = z3;
        if (z3 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z4 = this.isMatureBlocked;
        int i13 = z4;
        if (z4 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z5 = this.isDubbed;
        int i15 = z5;
        if (z5 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z6 = this.isSubbed;
        if (!z6) {
            i6 = z6 ? 1 : 0;
        }
        int i17 = (i16 + i6) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = extendedMaturityRating.hashCode();
        }
        int i18 = (i17 + hashCode6) * 31;
        List<String> list = this._contentDescriptors;
        if (list == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list.hashCode();
        }
        int i19 = (i18 + hashCode7) * 31;
        List<String> list2 = this._subtitleLocales;
        if (list2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list2.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        List<PlayableAssetVersion> list3 = this._versions;
        if (list3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list3.hashCode();
        }
        int i21 = (i20 + hashCode9) * 31;
        String str3 = this._audioLocale;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i21 + i;
    }

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public boolean isAvailableOffline() {
        return this.isAvailableOffline;
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

    @Override // com.ellation.crunchyroll.model.PlayableAssetPanelMetadata
    public boolean isPremiumOnly() {
        return this.isPremiumOnly;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        String str = this._parentId;
        String str2 = this._parentTitle;
        Date date = this.availableDate;
        Date date2 = this.freeAvailableDate;
        Date date3 = this.premiumAvailableDate;
        long j = this.durationMs;
        boolean z = this.isPremiumOnly;
        boolean z2 = this.isAvailableOffline;
        boolean z3 = this.isMature;
        boolean z4 = this.isMatureBlocked;
        boolean z5 = this.isDubbed;
        boolean z6 = this.isSubbed;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this._contentDescriptors;
        List<String> list2 = this._subtitleLocales;
        List<PlayableAssetVersion> list3 = this._versions;
        String str3 = this._audioLocale;
        StringBuilder b = a.b("MovieMetadata(_parentId=", str, ", _parentTitle=", str2, ", availableDate=");
        b.append(date);
        b.append(", freeAvailableDate=");
        b.append(date2);
        b.append(", premiumAvailableDate=");
        b.append(date3);
        b.append(", durationMs=");
        b.append(j);
        b.append(", isPremiumOnly=");
        b.append(z);
        b.append(", isAvailableOffline=");
        b.append(z2);
        b.append(", isMature=");
        b.append(z3);
        b.append(", isMatureBlocked=");
        b.append(z4);
        b.append(", isDubbed=");
        b.append(z5);
        b.append(", isSubbed=");
        b.append(z6);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", _contentDescriptors=");
        b.append(list);
        b.append(", _subtitleLocales=");
        b.append(list2);
        b.append(", _versions=");
        b.append(list3);
        return a.a(b, ", _audioLocale=", str3, ")");
    }

    public /* synthetic */ MovieMetadata(String str, String str2, Date date, Date date2, Date date3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, String str3, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : date, (i & 8) != 0 ? null : date2, (i & 16) != 0 ? null : date3, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z4, (i & 1024) != 0 ? false : z5, (i & 2048) == 0 ? z6 : false, (i & 4096) != 0 ? null : extendedMaturityRating, (i & 8192) != 0 ? null : list, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list2, (i & 32768) != 0 ? null : list3, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : str3);
    }

    public MovieMetadata(String str, String str2, Date date, Date date2, Date date3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, List<PlayableAssetVersion> list3, String str3) {
        super(null);
        this._parentId = str;
        this._parentTitle = str2;
        this.availableDate = date;
        this.freeAvailableDate = date2;
        this.premiumAvailableDate = date3;
        this.durationMs = j;
        this.isPremiumOnly = z;
        this.isAvailableOffline = z2;
        this.isMature = z3;
        this.isMatureBlocked = z4;
        this.isDubbed = z5;
        this.isSubbed = z6;
        this.extendedMaturityRating = extendedMaturityRating;
        this._contentDescriptors = list;
        this._subtitleLocales = list2;
        this._versions = list3;
        this._audioLocale = str3;
    }
}
