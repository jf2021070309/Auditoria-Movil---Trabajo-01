package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Settings;
/* compiled from: ContentContainer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\bU\u0010VJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0003Jâ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0010\b\u0002\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u0002HÖ\u0001J\t\u0010-\u001a\u00020\u0014HÖ\u0001J\u0013\u00100\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b4\u00103R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u00101\u001a\u0004\b5\u00103R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b6\u00103R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b:\u00103R\u001c\u0010 \u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\b<\u0010\fR\u001c\u0010!\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010;\u001a\u0004\b=\u0010\fR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010>\u001a\u0004\b?\u0010@R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010$\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010;\u001a\u0004\bD\u0010\fR\u001c\u0010%\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010;\u001a\u0004\bE\u0010\fR\u001c\u0010&\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\bG\u0010\u0016R\u001c\u0010'\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010F\u001a\u0004\bH\u0010\u0016R\"\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\bI\u0010CR\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010A\u001a\u0004\bJ\u0010CR\u001a\u0010L\u001a\u00020K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0011\u0010R\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bS\u0010Q¨\u0006W"}, d2 = {"Lcom/ellation/crunchyroll/model/Series;", "Lcom/ellation/crunchyroll/model/ContentContainer;", "", "component1", "component2", "component3", "component4", "Lcom/ellation/crunchyroll/model/Images;", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "component9", "", "component10", "component11", "component12", "", "component13", "()Ljava/lang/Integer;", "component14", "component15", "component16", "_id", "_channelId", "_title", "_description", "_images", "_contentProvider", "_isMature", "_isMatureBlocked", "extendedMaturityRating", "_contentDescriptors", "_isDubbed", "_isSubbed", "_episodeCount", "_seasonCount", "_audioLocales", "_subtitleLocales", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/ellation/crunchyroll/model/Series;", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "get_channelId", "get_title", "get_description", "Lcom/ellation/crunchyroll/model/Images;", "get_images", "()Lcom/ellation/crunchyroll/model/Images;", "get_contentProvider", "Ljava/lang/Boolean;", "get_isMature", "get_isMatureBlocked", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/util/List;", "get_contentDescriptors", "()Ljava/util/List;", "get_isDubbed", "get_isSubbed", "Ljava/lang/Integer;", "get_episodeCount", "get_seasonCount", "get_audioLocales", "get_subtitleLocales", "Lcom/amazon/aps/iva/x50/t;", "resourceType", "Lcom/amazon/aps/iva/x50/t;", "getResourceType", "()Lcom/amazon/aps/iva/x50/t;", "getEpisodeCount", "()I", "episodeCount", "getSeasonCount", "seasonCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ellation/crunchyroll/model/Images;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Series extends ContentContainer {
    public static final int $stable = 8;
    @SerializedName("audio_locales")
    private final List<String> _audioLocales;
    @SerializedName("channel_id")
    private final String _channelId;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName("content_provider")
    private final String _contentProvider;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("episode_count")
    private final Integer _episodeCount;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final Images _images;
    @SerializedName("is_dubbed")
    private final Boolean _isDubbed;
    @SerializedName("is_mature")
    private final Boolean _isMature;
    @SerializedName("mature_blocked")
    private final Boolean _isMatureBlocked;
    @SerializedName("is_subbed")
    private final Boolean _isSubbed;
    @SerializedName("season_count")
    private final Integer _seasonCount;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("title")
    private final String _title;
    @SerializedName("extended_maturity_rating")
    private final ExtendedMaturityRating extendedMaturityRating;
    private final t resourceType;

    public Series() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final String component1() {
        return this._id;
    }

    public final List<String> component10() {
        return this._contentDescriptors;
    }

    public final Boolean component11() {
        return this._isDubbed;
    }

    public final Boolean component12() {
        return this._isSubbed;
    }

    public final Integer component13() {
        return this._episodeCount;
    }

    public final Integer component14() {
        return this._seasonCount;
    }

    public final List<String> component15() {
        return this._audioLocales;
    }

    public final List<String> component16() {
        return this._subtitleLocales;
    }

    public final String component2() {
        return this._channelId;
    }

    public final String component3() {
        return this._title;
    }

    public final String component4() {
        return this._description;
    }

    public final Images component5() {
        return this._images;
    }

    public final String component6() {
        return this._contentProvider;
    }

    public final Boolean component7() {
        return this._isMature;
    }

    public final Boolean component8() {
        return this._isMatureBlocked;
    }

    public final ExtendedMaturityRating component9() {
        return this.extendedMaturityRating;
    }

    public final Series copy(String str, String str2, String str3, String str4, Images images, String str5, Boolean bool, Boolean bool2, ExtendedMaturityRating extendedMaturityRating, List<String> list, Boolean bool3, Boolean bool4, Integer num, Integer num2, List<String> list2, List<String> list3) {
        j.f(list2, "_audioLocales");
        j.f(list3, "_subtitleLocales");
        return new Series(str, str2, str3, str4, images, str5, bool, bool2, extendedMaturityRating, list, bool3, bool4, num, num2, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Series)) {
            return false;
        }
        Series series = (Series) obj;
        if (j.a(this._id, series._id) && j.a(this._channelId, series._channelId) && j.a(this._title, series._title) && j.a(this._description, series._description) && j.a(this._images, series._images) && j.a(this._contentProvider, series._contentProvider) && j.a(this._isMature, series._isMature) && j.a(this._isMatureBlocked, series._isMatureBlocked) && j.a(this.extendedMaturityRating, series.extendedMaturityRating) && j.a(this._contentDescriptors, series._contentDescriptors) && j.a(this._isDubbed, series._isDubbed) && j.a(this._isSubbed, series._isSubbed) && j.a(this._episodeCount, series._episodeCount) && j.a(this._seasonCount, series._seasonCount) && j.a(this._audioLocales, series._audioLocales) && j.a(this._subtitleLocales, series._subtitleLocales)) {
            return true;
        }
        return false;
    }

    public final int getEpisodeCount() {
        Integer num = this._episodeCount;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        return this.resourceType;
    }

    public final int getSeasonCount() {
        Integer num = this._seasonCount;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_audioLocales() {
        return this._audioLocales;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_channelId() {
        return this._channelId;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_contentDescriptors() {
        return this._contentDescriptors;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_contentProvider() {
        return this._contentProvider;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_description() {
        return this._description;
    }

    public final Integer get_episodeCount() {
        return this._episodeCount;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_id() {
        return this._id;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Images get_images() {
        return this._images;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isDubbed() {
        return this._isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isMature() {
        return this._isMature;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isMatureBlocked() {
        return this._isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public Boolean get_isSubbed() {
        return this._isSubbed;
    }

    public final Integer get_seasonCount() {
        return this._seasonCount;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public List<String> get_subtitleLocales() {
        return this._subtitleLocales;
    }

    @Override // com.ellation.crunchyroll.model.ContentContainer
    public String get_title() {
        return this._title;
    }

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
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._channelId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._title;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this._description;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Images images = this._images;
        if (images == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = images.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this._contentProvider;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Boolean bool = this._isMature;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool2 = this._isMatureBlocked;
        if (bool2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool2.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = extendedMaturityRating.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<String> list = this._contentDescriptors;
        if (list == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool3 = this._isDubbed;
        if (bool3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool3.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Boolean bool4 = this._isSubbed;
        if (bool4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool4.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Integer num = this._episodeCount;
        if (num == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Integer num2 = this._seasonCount;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return this._subtitleLocales.hashCode() + a.a(this._audioLocales, (i14 + i) * 31, 31);
    }

    public String toString() {
        String str = this._id;
        String str2 = this._channelId;
        String str3 = this._title;
        String str4 = this._description;
        Images images = this._images;
        String str5 = this._contentProvider;
        Boolean bool = this._isMature;
        Boolean bool2 = this._isMatureBlocked;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this._contentDescriptors;
        Boolean bool3 = this._isDubbed;
        Boolean bool4 = this._isSubbed;
        Integer num = this._episodeCount;
        Integer num2 = this._seasonCount;
        List<String> list2 = this._audioLocales;
        List<String> list3 = this._subtitleLocales;
        StringBuilder b = a.b("Series(_id=", str, ", _channelId=", str2, ", _title=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _description=", str4, ", _images=");
        b.append(images);
        b.append(", _contentProvider=");
        b.append(str5);
        b.append(", _isMature=");
        b.append(bool);
        b.append(", _isMatureBlocked=");
        b.append(bool2);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", _contentDescriptors=");
        b.append(list);
        b.append(", _isDubbed=");
        b.append(bool3);
        b.append(", _isSubbed=");
        b.append(bool4);
        b.append(", _episodeCount=");
        b.append(num);
        b.append(", _seasonCount=");
        b.append(num2);
        b.append(", _audioLocales=");
        b.append(list2);
        b.append(", _subtitleLocales=");
        b.append(list3);
        b.append(")");
        return b.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Series(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.ellation.crunchyroll.model.Images r23, java.lang.String r24, java.lang.Boolean r25, java.lang.Boolean r26, com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating r27, java.util.List r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.Integer r31, java.lang.Integer r32, java.util.List r33, java.util.List r34, int r35, com.amazon.aps.iva.yb0.e r36) {
        /*
            Method dump skipped, instructions count: 185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.model.Series.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ellation.crunchyroll.model.Images, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.util.List, java.util.List, int, com.amazon.aps.iva.yb0.e):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Series(String str, String str2, String str3, String str4, Images images, String str5, Boolean bool, Boolean bool2, ExtendedMaturityRating extendedMaturityRating, List<String> list, Boolean bool3, Boolean bool4, Integer num, Integer num2, List<String> list2, List<String> list3) {
        super(null);
        j.f(list2, "_audioLocales");
        j.f(list3, "_subtitleLocales");
        this._id = str;
        this._channelId = str2;
        this._title = str3;
        this._description = str4;
        this._images = images;
        this._contentProvider = str5;
        this._isMature = bool;
        this._isMatureBlocked = bool2;
        this.extendedMaturityRating = extendedMaturityRating;
        this._contentDescriptors = list;
        this._isDubbed = bool3;
        this._isSubbed = bool4;
        this._episodeCount = num;
        this._seasonCount = num2;
        this._audioLocales = list2;
        this._subtitleLocales = list3;
        this.resourceType = t.SERIES;
    }
}
