package com.ellation.crunchyroll.model.music;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Artist.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0014J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÂ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÂ\u0003¢\u0006\u0002\u0010;J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÂ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÂ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u0004\u0018\u00010\rHÂ\u0003¢\u0006\u0002\u0010?J°\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0011\u0010#\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u001cR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019¨\u0006H"}, d2 = {"Lcom/ellation/crunchyroll/model/music/Artist;", "", "_id", "", "_type", "_name", "_description", "_isPublic", "", "_videos", "", "_concerts", "_totalConcertDurationMs", "", "_totalVideoDurationMs", "_genres", "Lcom/ellation/crunchyroll/model/music/MusicGenre;", "_images", "Lcom/ellation/crunchyroll/model/music/MusicImages;", "_connector", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/ellation/crunchyroll/model/music/MusicImages;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "Ljava/lang/Long;", "concerts", "getConcerts", "()Ljava/util/List;", "connector", "getConnector", "()Ljava/lang/String;", MediaTrack.ROLE_DESCRIPTION, "getDescription", "genres", "getGenres", "id", "getId", "images", "getImages", "()Lcom/ellation/crunchyroll/model/music/MusicImages;", "isPublic", "()Z", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "totalConcertDurationMs", "getTotalConcertDurationMs", "()J", "totalVideoDurationMs", "getTotalVideoDurationMs", "type", "getType", "videos", "getVideos", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "component8", "()Ljava/lang/Long;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Lcom/ellation/crunchyroll/model/music/MusicImages;Ljava/lang/String;)Lcom/ellation/crunchyroll/model/music/Artist;", "equals", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Artist {
    public static final int $stable = 8;
    @SerializedName("concerts")
    private final List<String> _concerts;
    @SerializedName("connector")
    private final String _connector;
    @SerializedName(MediaTrack.ROLE_DESCRIPTION)
    private final String _description;
    @SerializedName("genres")
    private final List<MusicGenre> _genres;
    @SerializedName("id")
    private final String _id;
    @SerializedName("images")
    private final MusicImages _images;
    @SerializedName("isPublic")
    private final Boolean _isPublic;
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String _name;
    @SerializedName("totalConcertDurationMs")
    private final Long _totalConcertDurationMs;
    @SerializedName("totalVideoDurationMs")
    private final Long _totalVideoDurationMs;
    @SerializedName("type")
    private final String _type;
    @SerializedName("videos")
    private final List<String> _videos;

    public Artist() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    private final String component1() {
        return this._id;
    }

    private final List<MusicGenre> component10() {
        return this._genres;
    }

    private final MusicImages component11() {
        return this._images;
    }

    private final String component12() {
        return this._connector;
    }

    private final String component2() {
        return this._type;
    }

    private final String component3() {
        return this._name;
    }

    private final String component4() {
        return this._description;
    }

    private final Boolean component5() {
        return this._isPublic;
    }

    private final List<String> component6() {
        return this._videos;
    }

    private final List<String> component7() {
        return this._concerts;
    }

    private final Long component8() {
        return this._totalConcertDurationMs;
    }

    private final Long component9() {
        return this._totalVideoDurationMs;
    }

    public final Artist copy(String str, String str2, String str3, String str4, Boolean bool, List<String> list, List<String> list2, Long l, Long l2, List<MusicGenre> list3, MusicImages musicImages, String str5) {
        return new Artist(str, str2, str3, str4, bool, list, list2, l, l2, list3, musicImages, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        if (j.a(this._id, artist._id) && j.a(this._type, artist._type) && j.a(this._name, artist._name) && j.a(this._description, artist._description) && j.a(this._isPublic, artist._isPublic) && j.a(this._videos, artist._videos) && j.a(this._concerts, artist._concerts) && j.a(this._totalConcertDurationMs, artist._totalConcertDurationMs) && j.a(this._totalVideoDurationMs, artist._totalVideoDurationMs) && j.a(this._genres, artist._genres) && j.a(this._images, artist._images) && j.a(this._connector, artist._connector)) {
            return true;
        }
        return false;
    }

    public final List<String> getConcerts() {
        List<String> list = this._concerts;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getConnector() {
        String str = this._connector;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getDescription() {
        String str = this._description;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<MusicGenre> getGenres() {
        List<MusicGenre> list = this._genres;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getId() {
        String str = this._id;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final MusicImages getImages() {
        MusicImages musicImages = this._images;
        if (musicImages == null) {
            return new MusicImages(null, null, null, 7, null);
        }
        return musicImages;
    }

    public final String getName() {
        String str = this._name;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final long getTotalConcertDurationMs() {
        Long l = this._totalConcertDurationMs;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long getTotalVideoDurationMs() {
        Long l = this._totalVideoDurationMs;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final String getType() {
        String str = this._type;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<String> getVideos() {
        List<String> list = this._videos;
        if (list == null) {
            return z.b;
        }
        return list;
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
        String str = this._id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._type;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._name;
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
        Boolean bool = this._isPublic;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<String> list = this._videos;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<String> list2 = this._concerts;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Long l = this._totalConcertDurationMs;
        if (l == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = l.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        Long l2 = this._totalVideoDurationMs;
        if (l2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = l2.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<MusicGenre> list3 = this._genres;
        if (list3 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list3.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        MusicImages musicImages = this._images;
        if (musicImages == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = musicImages.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str5 = this._connector;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i12 + i;
    }

    public final boolean isPublic() {
        Boolean bool = this._isPublic;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public String toString() {
        String str = this._id;
        String str2 = this._type;
        String str3 = this._name;
        String str4 = this._description;
        Boolean bool = this._isPublic;
        List<String> list = this._videos;
        List<String> list2 = this._concerts;
        Long l = this._totalConcertDurationMs;
        Long l2 = this._totalVideoDurationMs;
        List<MusicGenre> list3 = this._genres;
        MusicImages musicImages = this._images;
        String str5 = this._connector;
        StringBuilder b = a.b("Artist(_id=", str, ", _type=", str2, ", _name=");
        com.amazon.aps.iva.m80.a.c(b, str3, ", _description=", str4, ", _isPublic=");
        b.append(bool);
        b.append(", _videos=");
        b.append(list);
        b.append(", _concerts=");
        b.append(list2);
        b.append(", _totalConcertDurationMs=");
        b.append(l);
        b.append(", _totalVideoDurationMs=");
        b.append(l2);
        b.append(", _genres=");
        b.append(list3);
        b.append(", _images=");
        b.append(musicImages);
        b.append(", _connector=");
        b.append(str5);
        b.append(")");
        return b.toString();
    }

    public Artist(String str, String str2, String str3, String str4, Boolean bool, List<String> list, List<String> list2, Long l, Long l2, List<MusicGenre> list3, MusicImages musicImages, String str5) {
        this._id = str;
        this._type = str2;
        this._name = str3;
        this._description = str4;
        this._isPublic = bool;
        this._videos = list;
        this._concerts = list2;
        this._totalConcertDurationMs = l;
        this._totalVideoDurationMs = l2;
        this._genres = list3;
        this._images = musicImages;
        this._connector = str5;
    }

    public /* synthetic */ Artist(String str, String str2, String str3, String str4, Boolean bool, List list, List list2, Long l, Long l2, List list3, MusicImages musicImages, String str5, int i, e eVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? 0L : l, (i & 256) != 0 ? 0L : l2, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : list3, (i & 1024) != 0 ? null : musicImages, (i & 2048) == 0 ? str5 : null);
    }
}
