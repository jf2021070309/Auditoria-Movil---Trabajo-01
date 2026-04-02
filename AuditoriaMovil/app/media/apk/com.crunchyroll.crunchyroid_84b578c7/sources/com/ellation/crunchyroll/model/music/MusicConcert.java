package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
/* compiled from: MusicAsset.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00103\u001a\u00020\u001d\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010!¢\u0006\u0004\bo\u0010pJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÄ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÄ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÄ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016HÄ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÄ\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\nJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\nJ\t\u0010\u001e\u001a\u00020\u001dHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÄ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00010\bHÄ\u0003¢\u0006\u0004\b \u0010\nJ\u000b\u0010\"\u001a\u0004\u0018\u00010!HÄ\u0003J\u008a\u0002\u00107\u001a\u00020\u00002\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00162\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00103\u001a\u00020\u001d2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010!HÆ\u0001¢\u0006\u0004\b7\u00108J\t\u00109\u001a\u00020\u0002HÖ\u0001J\t\u0010;\u001a\u00020:HÖ\u0001J\u0013\u0010>\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b#\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b$\u0010?\u001a\u0004\bB\u0010AR\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\bC\u0010AR\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b&\u0010?\u001a\u0004\bD\u0010AR\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\bE\u0010AR\u001c\u0010(\u001a\u0004\u0018\u00010\b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b(\u0010F\u001a\u0004\bG\u0010\nR\u001c\u0010)\u001a\u0004\u0018\u00010\u000b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b)\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010*\u001a\u0004\u0018\u00010\r8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b*\u0010K\u001a\u0004\bL\u0010\u000fR\u001c\u0010+\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010M\u001a\u0004\bN\u0010OR\u001c\u0010,\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010-\u001a\u0004\u0018\u00010\u00148\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010S\u001a\u0004\bT\u0010UR\"\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010V\u001a\u0004\bW\u0010XR\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0014X\u0095\u0004¢\u0006\f\n\u0004\b/\u0010V\u001a\u0004\bY\u0010XR\u001c\u00100\u001a\u0004\u0018\u00010\u00198\u0014X\u0095\u0004¢\u0006\f\n\u0004\b0\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u00101\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010F\u001a\u0004\b]\u0010\nR\u001c\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010F\u001a\u0004\b^\u0010\nR\u001a\u00103\u001a\u00020\u001d8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u0010_\u001a\u0004\b`\u0010aR\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0014X\u0095\u0004¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\bb\u0010AR\u001c\u00105\u001a\u0004\u0018\u00010\b8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bc\u0010\nR\u001c\u00106\u001a\u0004\u0018\u00010!8\u0014X\u0095\u0004¢\u0006\f\n\u0004\b6\u0010d\u001a\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bg\u0010iR\u001a\u0010j\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\bj\u0010h\u001a\u0004\bj\u0010iR\u001a\u0010k\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010_\u001a\u0004\bl\u0010aR\u0014\u0010m\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010iR\u0014\u0010n\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010i¨\u0006q"}, d2 = {"Lcom/ellation/crunchyroll/model/music/MusicConcert;", "Lcom/ellation/crunchyroll/model/music/MusicAsset;", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Boolean;", "Lcom/ellation/crunchyroll/model/music/Artist;", "component7", "", "component8", "()Ljava/lang/Long;", "Ljava/util/Date;", "component9", "Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "component10", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "component11", "", "component12", "component13", "Lcom/ellation/crunchyroll/model/music/MusicImages;", "component14", "component15", "component16", "Lcom/amazon/aps/iva/x50/t;", "component17", "component18", "component19", "Lcom/ellation/crunchyroll/model/music/Artists;", "component20", "_id", "_title", "_description", "_copyright", "_licensor", "_isPremiumOnly", "_artist", "_durationMs", "releaseDate", "availability", "extendedMaturityRating", "contentDescriptors", "_animeIds", "_images", "_isMature", "_isMatureBlocked", "type", "_displayArtistName", "_displayArtistNameRequired", "_artists", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/music/Artist;Ljava/lang/Long;Ljava/util/Date;Lcom/ellation/crunchyroll/model/music/MusicAvailability;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Lcom/ellation/crunchyroll/model/music/MusicImages;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/amazon/aps/iva/x50/t;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/music/Artists;)Lcom/ellation/crunchyroll/model/music/MusicConcert;", "toString", "", "hashCode", "", "other", "equals", "Ljava/lang/String;", "get_id", "()Ljava/lang/String;", "get_title", "get_description", "get_copyright", "get_licensor", "Ljava/lang/Boolean;", "get_isPremiumOnly", "Lcom/ellation/crunchyroll/model/music/Artist;", "get_artist", "()Lcom/ellation/crunchyroll/model/music/Artist;", "Ljava/lang/Long;", "get_durationMs", "Ljava/util/Date;", "getReleaseDate", "()Ljava/util/Date;", "Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "getAvailability", "()Lcom/ellation/crunchyroll/model/music/MusicAvailability;", "Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "getExtendedMaturityRating", "()Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;", "Ljava/util/List;", "getContentDescriptors", "()Ljava/util/List;", "get_animeIds", "Lcom/ellation/crunchyroll/model/music/MusicImages;", "get_images", "()Lcom/ellation/crunchyroll/model/music/MusicImages;", "get_isMature", "get_isMatureBlocked", "Lcom/amazon/aps/iva/x50/t;", "getType", "()Lcom/amazon/aps/iva/x50/t;", "get_displayArtistName", "get_displayArtistNameRequired", "Lcom/ellation/crunchyroll/model/music/Artists;", "get_artists", "()Lcom/ellation/crunchyroll/model/music/Artists;", "isDubbed", "Z", "()Z", "isSubbed", "resourceType", "getResourceType", "isMature", "isMatureBlocked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/music/Artist;Ljava/lang/Long;Ljava/util/Date;Lcom/ellation/crunchyroll/model/music/MusicAvailability;Lcom/ellation/crunchyroll/model/maturityrating/ExtendedMaturityRating;Ljava/util/List;Ljava/util/List;Lcom/ellation/crunchyroll/model/music/MusicImages;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/amazon/aps/iva/x50/t;Ljava/lang/String;Ljava/lang/Boolean;Lcom/ellation/crunchyroll/model/music/Artists;)V", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MusicConcert extends MusicAsset {
    public static final int $stable = 8;
    @SerializedName("animeIds")
    private final List<String> _animeIds;
    @SerializedName("artist")
    private final Artist _artist;
    @SerializedName("artists")
    private final Artists _artists;
    @SerializedName("copyright")
    private final String _copyright;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("displayArtistName")
    private final String _displayArtistName;
    @SerializedName("displayArtistNameRequired")
    private final Boolean _displayArtistNameRequired;
    @SerializedName("durationMs")
    private final Long _durationMs;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final MusicImages _images;
    @SerializedName("isMature")
    private final Boolean _isMature;
    @SerializedName("matureBlocked")
    private final Boolean _isMatureBlocked;
    @SerializedName("isPremiumOnly")
    private final Boolean _isPremiumOnly;
    @SerializedName("licensor")
    private final String _licensor;
    @SerializedName("title")
    private final String _title;
    @SerializedName("availability")
    private final MusicAvailability availability;
    @SerializedName("content_descriptors")
    private final List<String> contentDescriptors;
    @SerializedName("maturityRatings")
    private final ExtendedMaturityRating extendedMaturityRating;
    private final boolean isDubbed;
    private final boolean isSubbed;
    @SerializedName("originalRelease")
    private final Date releaseDate;
    private final t resourceType;
    @SerializedName("type")
    private final t type;

    public MusicConcert() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final String component1() {
        return this._id;
    }

    public final MusicAvailability component10() {
        return this.availability;
    }

    public final ExtendedMaturityRating component11() {
        return this.extendedMaturityRating;
    }

    public final List<String> component12() {
        return this.contentDescriptors;
    }

    public final List<String> component13() {
        return this._animeIds;
    }

    public final MusicImages component14() {
        return this._images;
    }

    public final Boolean component15() {
        return this._isMature;
    }

    public final Boolean component16() {
        return this._isMatureBlocked;
    }

    public final t component17() {
        return this.type;
    }

    public final String component18() {
        return this._displayArtistName;
    }

    public final Boolean component19() {
        return this._displayArtistNameRequired;
    }

    public final String component2() {
        return this._title;
    }

    public final Artists component20() {
        return this._artists;
    }

    public final String component3() {
        return this._description;
    }

    public final String component4() {
        return this._copyright;
    }

    public final String component5() {
        return this._licensor;
    }

    public final Boolean component6() {
        return this._isPremiumOnly;
    }

    public final Artist component7() {
        return this._artist;
    }

    public final Long component8() {
        return this._durationMs;
    }

    public final Date component9() {
        return this.releaseDate;
    }

    public final MusicConcert copy(String str, String str2, String str3, String str4, String str5, Boolean bool, Artist artist, Long l, Date date, MusicAvailability musicAvailability, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, MusicImages musicImages, Boolean bool2, Boolean bool3, t tVar, String str6, Boolean bool4, Artists artists) {
        j.f(tVar, "type");
        return new MusicConcert(str, str2, str3, str4, str5, bool, artist, l, date, musicAvailability, extendedMaturityRating, list, list2, musicImages, bool2, bool3, tVar, str6, bool4, artists);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicConcert)) {
            return false;
        }
        MusicConcert musicConcert = (MusicConcert) obj;
        if (j.a(this._id, musicConcert._id) && j.a(this._title, musicConcert._title) && j.a(this._description, musicConcert._description) && j.a(this._copyright, musicConcert._copyright) && j.a(this._licensor, musicConcert._licensor) && j.a(this._isPremiumOnly, musicConcert._isPremiumOnly) && j.a(this._artist, musicConcert._artist) && j.a(this._durationMs, musicConcert._durationMs) && j.a(this.releaseDate, musicConcert.releaseDate) && j.a(this.availability, musicConcert.availability) && j.a(this.extendedMaturityRating, musicConcert.extendedMaturityRating) && j.a(this.contentDescriptors, musicConcert.contentDescriptors) && j.a(this._animeIds, musicConcert._animeIds) && j.a(this._images, musicConcert._images) && j.a(this._isMature, musicConcert._isMature) && j.a(this._isMatureBlocked, musicConcert._isMatureBlocked) && this.type == musicConcert.type && j.a(this._displayArtistName, musicConcert._displayArtistName) && j.a(this._displayArtistNameRequired, musicConcert._displayArtistNameRequired) && j.a(this._artists, musicConcert._artists)) {
            return true;
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public MusicAvailability getAvailability() {
        return this.availability;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public List<String> getContentDescriptors() {
        return this.contentDescriptors;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public ExtendedMaturityRating getExtendedMaturityRating() {
        return this.extendedMaturityRating;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Date getReleaseDate() {
        return this.releaseDate;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public t getResourceType() {
        return this.resourceType;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public t getType() {
        return this.type;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public List<String> get_animeIds() {
        return this._animeIds;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Artist get_artist() {
        return this._artist;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Artists get_artists() {
        return this._artists;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public String get_copyright() {
        return this._copyright;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public String get_description() {
        return this._description;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public String get_displayArtistName() {
        return this._displayArtistName;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Boolean get_displayArtistNameRequired() {
        return this._displayArtistNameRequired;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Long get_durationMs() {
        return this._durationMs;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public String get_id() {
        return this._id;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public MusicImages get_images() {
        return this._images;
    }

    public final Boolean get_isMature() {
        return this._isMature;
    }

    public final Boolean get_isMatureBlocked() {
        return this._isMatureBlocked;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public Boolean get_isPremiumOnly() {
        return this._isPremiumOnly;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
    public String get_licensor() {
        return this._licensor;
    }

    @Override // com.ellation.crunchyroll.model.music.MusicAsset
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
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._description;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this._copyright;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this._licensor;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Boolean bool = this._isPremiumOnly;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        Artist artist = this._artist;
        if (artist == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = artist.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l = this._durationMs;
        if (l == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Date date = this.releaseDate;
        if (date == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = date.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        MusicAvailability musicAvailability = this.availability;
        if (musicAvailability == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = musicAvailability.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        if (extendedMaturityRating == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = extendedMaturityRating.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        List<String> list = this.contentDescriptors;
        if (list == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        List<String> list2 = this._animeIds;
        if (list2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list2.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        MusicImages musicImages = this._images;
        if (musicImages == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = musicImages.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Boolean bool2 = this._isMature;
        if (bool2 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool2.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Boolean bool3 = this._isMatureBlocked;
        if (bool3 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool3.hashCode();
        }
        int a = l1.a(this.type, (i16 + hashCode16) * 31, 31);
        String str6 = this._displayArtistName;
        if (str6 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str6.hashCode();
        }
        int i17 = (a + hashCode17) * 31;
        Boolean bool4 = this._displayArtistNameRequired;
        if (bool4 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = bool4.hashCode();
        }
        int i18 = (i17 + hashCode18) * 31;
        Artists artists = this._artists;
        if (artists != null) {
            i = artists.hashCode();
        }
        return i18 + i;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isDubbed() {
        return this.isDubbed;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMature() {
        Boolean bool = this._isMature;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isMatureBlocked() {
        Boolean bool = this._isMatureBlocked;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.ellation.crunchyroll.model.LabeledContent
    public boolean isSubbed() {
        return this.isSubbed;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._title;
        String str3 = this._description;
        String str4 = this._copyright;
        String str5 = this._licensor;
        Boolean bool = this._isPremiumOnly;
        Artist artist = this._artist;
        Long l = this._durationMs;
        Date date = this.releaseDate;
        MusicAvailability musicAvailability = this.availability;
        ExtendedMaturityRating extendedMaturityRating = this.extendedMaturityRating;
        List<String> list = this.contentDescriptors;
        List<String> list2 = this._animeIds;
        MusicImages musicImages = this._images;
        Boolean bool2 = this._isMature;
        Boolean bool3 = this._isMatureBlocked;
        t tVar = this.type;
        String str6 = this._displayArtistName;
        Boolean bool4 = this._displayArtistNameRequired;
        Artists artists = this._artists;
        StringBuilder b = a.b("MusicConcert(_id=", str, ", _title=", str2, ", _description=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _copyright=", str4, ", _licensor=");
        b.append(str5);
        b.append(", _isPremiumOnly=");
        b.append(bool);
        b.append(", _artist=");
        b.append(artist);
        b.append(", _durationMs=");
        b.append(l);
        b.append(", releaseDate=");
        b.append(date);
        b.append(", availability=");
        b.append(musicAvailability);
        b.append(", extendedMaturityRating=");
        b.append(extendedMaturityRating);
        b.append(", contentDescriptors=");
        b.append(list);
        b.append(", _animeIds=");
        b.append(list2);
        b.append(", _images=");
        b.append(musicImages);
        b.append(", _isMature=");
        b.append(bool2);
        b.append(", _isMatureBlocked=");
        b.append(bool3);
        b.append(", type=");
        b.append(tVar);
        b.append(", _displayArtistName=");
        b.append(str6);
        b.append(", _displayArtistNameRequired=");
        b.append(bool4);
        b.append(", _artists=");
        b.append(artists);
        b.append(")");
        return b.toString();
    }

    public /* synthetic */ MusicConcert(String str, String str2, String str3, String str4, String str5, Boolean bool, Artist artist, Long l, Date date, MusicAvailability musicAvailability, ExtendedMaturityRating extendedMaturityRating, List list, List list2, MusicImages musicImages, Boolean bool2, Boolean bool3, t tVar, String str6, Boolean bool4, Artists artists, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? null : artist, (i & 128) != 0 ? 0L : l, (i & 256) != 0 ? null : date, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : musicAvailability, (i & 1024) != 0 ? null : extendedMaturityRating, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : list2, (i & 8192) != 0 ? null : musicImages, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Boolean.FALSE : bool2, (i & 32768) != 0 ? Boolean.FALSE : bool3, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? t.CONCERT : tVar, (i & 131072) != 0 ? null : str6, (i & 262144) != 0 ? Boolean.FALSE : bool4, (i & 524288) != 0 ? null : artists);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicConcert(String str, String str2, String str3, String str4, String str5, Boolean bool, Artist artist, Long l, Date date, MusicAvailability musicAvailability, ExtendedMaturityRating extendedMaturityRating, List<String> list, List<String> list2, MusicImages musicImages, Boolean bool2, Boolean bool3, t tVar, String str6, Boolean bool4, Artists artists) {
        super(null);
        j.f(tVar, "type");
        this._id = str;
        this._title = str2;
        this._description = str3;
        this._copyright = str4;
        this._licensor = str5;
        this._isPremiumOnly = bool;
        this._artist = artist;
        this._durationMs = l;
        this.releaseDate = date;
        this.availability = musicAvailability;
        this.extendedMaturityRating = extendedMaturityRating;
        this.contentDescriptors = list;
        this._animeIds = list2;
        this._images = musicImages;
        this._isMature = bool2;
        this._isMatureBlocked = bool3;
        this.type = tVar;
        this._displayArtistName = str6;
        this._displayArtistNameRequired = bool4;
        this._artists = artists;
        this.resourceType = getType();
    }
}
