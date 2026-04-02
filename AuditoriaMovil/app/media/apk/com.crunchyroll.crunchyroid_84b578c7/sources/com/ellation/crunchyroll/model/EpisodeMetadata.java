package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
/* compiled from: PanelMetadata.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010 J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010D\u001a\u00020\u0011HÆ\u0003J\t\u0010E\u001a\u00020\u0011HÆ\u0003J\t\u0010F\u001a\u00020\u0011HÆ\u0003J\t\u0010G\u001a\u00020\u0011HÆ\u0003J\t\u0010H\u001a\u00020\u0011HÆ\u0003J\t\u0010I\u001a\u00020\u0011HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0011\u0010K\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÂ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aHÂ\u0003J\u0011\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÂ\u0003J\u0011\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001aHÂ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010Q\u001a\u00020\u0006HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003J§\u0002\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010Y\u001a\u00020\u00112\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0016\u0010\u0005\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0016\u0010\u0012\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00104R\u0016\u0010\u0015\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00104R\u0016\u0010\u0013\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00104R\u0016\u0010\u0014\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00104R\u0016\u0010\u0010\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u00104R\u0016\u0010\u0016\u001a\u00020\u00118\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u00104R\u0016\u00105\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010#R\u0014\u00107\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010#R\u0014\u00109\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010#R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010&¨\u0006_"}, d2 = {"Lcom/ellation/crunchyroll/model/EpisodeMetadata;", "Lcom/ellation/crunchyroll/model/PlayableAssetPanelMetadata;", "_parentId", "", "_parentTitle", "durationMs", "", "seasonId", "seasonTitle", "seasonNumber", "episodeNumber", "episode", "availableDate", "Ljava/util/Date;", "freeAvailableDate", "premiumAvailableDate", "isPremiumOnly", "", "isAvailableOffline", "isMature", "isMatureBlocked", "isDubbed", "isSubbed", "extendedMaturityRating", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "_contentDescriptors", "", "_versions", "Lcom/ellation/crunchyroll/model/PlayableAssetVersion;", "_subtitleLocales", "_audioLocales", "_audioLocale", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZZZZZLcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "audioLocale", "getAudioLocale", "()Ljava/lang/String;", "availableAudioLocales", "getAvailableAudioLocales", "()Ljava/util/List;", "getAvailableDate", "()Ljava/util/Date;", "availableSubtitleLocales", "getAvailableSubtitleLocales", "contentDescriptors", "getContentDescriptors", "getDurationMs", "()J", "getEpisode", "getEpisodeNumber", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getFreeAvailableDate", "()Z", "originalAudio", "getOriginalAudio", "parentId", "getParentId", "parentTitle", "getParentTitle", "getPremiumAvailableDate", "getSeasonId", "getSeasonNumber", "getSeasonTitle", "versions", "getVersions", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EpisodeMetadata extends PlayableAssetPanelMetadata {
    public static final int $stable = 8;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("audio_locales")
    private final List<String> _audioLocales;
    @SerializedName("content_descriptors")
    private final List<String> _contentDescriptors;
    @SerializedName("series_id")
    private final String _parentId;
    @SerializedName("series_title")
    private final String _parentTitle;
    @SerializedName("subtitle_locales")
    private final List<String> _subtitleLocales;
    @SerializedName("versions")
    private final List<PlayableAssetVersion> _versions;
    @SerializedName("available_date")
    private final Date availableDate;
    @SerializedName("duration_ms")
    private final long durationMs;
    @SerializedName("episode")
    private final String episode;
    @SerializedName("episode_number")
    private final String episodeNumber;
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
    @SerializedName("season_id")
    private final String seasonId;
    @SerializedName("season_number")
    private final String seasonNumber;
    @SerializedName("season_title")
    private final String seasonTitle;

    public EpisodeMetadata() {
        this(null, null, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, null, null, null, null, null, null, 8388607, null);
    }

    private final String component1() {
        return this._parentId;
    }

    private final List<String> component19() {
        return this._contentDescriptors;
    }

    private final String component2() {
        return this._parentTitle;
    }

    private final List<PlayableAssetVersion> component20() {
        return this._versions;
    }

    private final List<String> component21() {
        return this._subtitleLocales;
    }

    private final List<String> component22() {
        return this._audioLocales;
    }

    private final String component23() {
        return this._audioLocale;
    }

    public final Date component10() {
        return this.freeAvailableDate;
    }

    public final Date component11() {
        return this.premiumAvailableDate;
    }

    public final boolean component12() {
        return this.isPremiumOnly;
    }

    public final boolean component13() {
        return this.isAvailableOffline;
    }

    public final boolean component14() {
        return this.isMature;
    }

    public final boolean component15() {
        return this.isMatureBlocked;
    }

    public final boolean component16() {
        return this.isDubbed;
    }

    public final boolean component17() {
        return this.isSubbed;
    }

    public final ExtendedMaturityRating component18() {
        return this.extendedMaturityRating;
    }

    public final long component3() {
        return this.durationMs;
    }

    public final String component4() {
        return this.seasonId;
    }

    public final String component5() {
        return this.seasonTitle;
    }

    public final String component6() {
        return this.seasonNumber;
    }

    public final String component7() {
        return this.episodeNumber;
    }

    public final String component8() {
        return this.episode;
    }

    public final Date component9() {
        return this.availableDate;
    }

    public final EpisodeMetadata copy(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Date date, Date date2, Date date3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<PlayableAssetVersion> list2, List<String> list3, List<String> list4, String str8) {
        return new EpisodeMetadata(str, str2, j, str3, str4, str5, str6, str7, date, date2, date3, z, z2, z3, z4, z5, z6, extendedMaturityRating, list, list2, list3, list4, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeMetadata)) {
            return false;
        }
        EpisodeMetadata episodeMetadata = (EpisodeMetadata) obj;
        if (j.a(this._parentId, episodeMetadata._parentId) && j.a(this._parentTitle, episodeMetadata._parentTitle) && this.durationMs == episodeMetadata.durationMs && j.a(this.seasonId, episodeMetadata.seasonId) && j.a(this.seasonTitle, episodeMetadata.seasonTitle) && j.a(this.seasonNumber, episodeMetadata.seasonNumber) && j.a(this.episodeNumber, episodeMetadata.episodeNumber) && j.a(this.episode, episodeMetadata.episode) && j.a(this.availableDate, episodeMetadata.availableDate) && j.a(this.freeAvailableDate, episodeMetadata.freeAvailableDate) && j.a(this.premiumAvailableDate, episodeMetadata.premiumAvailableDate) && this.isPremiumOnly == episodeMetadata.isPremiumOnly && this.isAvailableOffline == episodeMetadata.isAvailableOffline && this.isMature == episodeMetadata.isMature && this.isMatureBlocked == episodeMetadata.isMatureBlocked && this.isDubbed == episodeMetadata.isDubbed && this.isSubbed == episodeMetadata.isSubbed && j.a(this.extendedMaturityRating, episodeMetadata.extendedMaturityRating) && j.a(this._contentDescriptors, episodeMetadata._contentDescriptors) && j.a(this._versions, episodeMetadata._versions) && j.a(this._subtitleLocales, episodeMetadata._subtitleLocales) && j.a(this._audioLocales, episodeMetadata._audioLocales) && j.a(this._audioLocale, episodeMetadata._audioLocale)) {
            return true;
        }
        return false;
    }

    public final String getAudioLocale() {
        return this._audioLocale;
    }

    @Override // com.ellation.crunchyroll.model.PanelMetadata
    public List<String> getAvailableAudioLocales() {
        List<PlayableAssetVersion> list = this._versions;
        if (list != null) {
            List<PlayableAssetVersion> list2 = list;
            ArrayList arrayList = new ArrayList(r.Y(list2));
            for (PlayableAssetVersion playableAssetVersion : list2) {
                arrayList.add(playableAssetVersion.getAudioLocale());
            }
            return arrayList;
        }
        return null;
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

    public final String getEpisode() {
        return this.episode;
    }

    public final String getEpisodeNumber() {
        return this.episodeNumber;
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
        Object obj;
        List<PlayableAssetVersion> list = this._versions;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((PlayableAssetVersion) obj).getOriginal()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        PlayableAssetVersion playableAssetVersion = (PlayableAssetVersion) obj;
        if (playableAssetVersion == null) {
            return null;
        }
        return playableAssetVersion.getAudioLocale();
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

    public final String getSeasonId() {
        return this.seasonId;
    }

    public final String getSeasonNumber() {
        return this.seasonNumber;
    }

    public final String getSeasonTitle() {
        return this.seasonTitle;
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
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
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
        int a = i.a(this.durationMs, (i2 + hashCode2) * 31, 31);
        String str3 = this.seasonId;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (a + hashCode3) * 31;
        String str4 = this.seasonTitle;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str5 = this.seasonNumber;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        String str6 = this.episodeNumber;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        String str7 = this.episode;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Date date = this.availableDate;
        if (date == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = date.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Date date2 = this.freeAvailableDate;
        if (date2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date2.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        Date date3 = this.premiumAvailableDate;
        if (date3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = date3.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        boolean z = this.isPremiumOnly;
        int i11 = 1;
        int i12 = z;
        if (z != 0) {
            i12 = 1;
        }
        int i13 = (i10 + i12) * 31;
        boolean z2 = this.isAvailableOffline;
        int i14 = z2;
        if (z2 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z3 = this.isMature;
        int i16 = z3;
        if (z3 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z4 = this.isMatureBlocked;
        int i18 = z4;
        if (z4 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z5 = this.isDubbed;
        int i20 = z5;
        if (z5 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z6 = this.isSubbed;
        if (!z6) {
            i11 = z6 ? 1 : 0;
        }
        int i22 = (i21 + i11) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = extendedMaturityRating.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List<String> list = this._contentDescriptors;
        if (list == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        List<PlayableAssetVersion> list2 = this._versions;
        if (list2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list2.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        List<String> list3 = this._subtitleLocales;
        if (list3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list3.hashCode();
        }
        int i26 = (i25 + hashCode14) * 31;
        List<String> list4 = this._audioLocales;
        if (list4 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = list4.hashCode();
        }
        int i27 = (i26 + hashCode15) * 31;
        String str8 = this._audioLocale;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i27 + i;
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
        long j = this.durationMs;
        String str3 = this.seasonId;
        String str4 = this.seasonTitle;
        String str5 = this.seasonNumber;
        String str6 = this.episodeNumber;
        String str7 = this.episode;
        Date date = this.availableDate;
        Date date2 = this.freeAvailableDate;
        Date date3 = this.premiumAvailableDate;
        boolean z = this.isPremiumOnly;
        boolean z2 = this.isAvailableOffline;
        boolean z3 = this.isMature;
        boolean z4 = this.isMatureBlocked;
        boolean z5 = this.isDubbed;
        boolean z6 = this.isSubbed;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this._contentDescriptors;
        List<PlayableAssetVersion> list2 = this._versions;
        List<String> list3 = this._subtitleLocales;
        List<String> list4 = this._audioLocales;
        String str8 = this._audioLocale;
        StringBuilder b = a.b("EpisodeMetadata(_parentId=", str, ", _parentTitle=", str2, ", durationMs=");
        b.append(j);
        b.append(", seasonId=");
        b.append(str3);
        com.amazon.aps.iva.m80.a.c(b, ", seasonTitle=", str4, ", seasonNumber=", str5);
        com.amazon.aps.iva.m80.a.c(b, ", episodeNumber=", str6, ", episode=", str7);
        b.append(", availableDate=");
        b.append(date);
        b.append(", freeAvailableDate=");
        b.append(date2);
        b.append(", premiumAvailableDate=");
        b.append(date3);
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
        b.append(", _versions=");
        b.append(list2);
        b.append(", _subtitleLocales=");
        b.append(list3);
        b.append(", _audioLocales=");
        b.append(list4);
        return a.a(b, ", _audioLocale=", str8, ")");
    }

    public /* synthetic */ EpisodeMetadata(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Date date, Date date2, Date date3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List list, List list2, List list3, List list4, String str8, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : date, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : date2, (i & 1024) != 0 ? null : date3, (i & 2048) != 0 ? false : z, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z4, (i & 32768) != 0 ? false : z5, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? false : z6, (i & 131072) != 0 ? null : extendedMaturityRating, (i & 262144) != 0 ? null : list, (i & 524288) != 0 ? null : list2, (i & 1048576) != 0 ? null : list3, (i & 2097152) != 0 ? null : list4, (i & 4194304) != 0 ? null : str8);
    }

    public EpisodeMetadata(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, Date date, Date date2, Date date3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<PlayableAssetVersion> list2, List<String> list3, List<String> list4, String str8) {
        super(null);
        this._parentId = str;
        this._parentTitle = str2;
        this.durationMs = j;
        this.seasonId = str3;
        this.seasonTitle = str4;
        this.seasonNumber = str5;
        this.episodeNumber = str6;
        this.episode = str7;
        this.availableDate = date;
        this.freeAvailableDate = date2;
        this.premiumAvailableDate = date3;
        this.isPremiumOnly = z;
        this.isAvailableOffline = z2;
        this.isMature = z3;
        this.isMatureBlocked = z4;
        this.isDubbed = z5;
        this.isSubbed = z6;
        this.extendedMaturityRating = extendedMaturityRating;
        this._contentDescriptors = list;
        this._versions = list2;
        this._subtitleLocales = list3;
        this._audioLocales = list4;
        this._audioLocale = str8;
    }
}
