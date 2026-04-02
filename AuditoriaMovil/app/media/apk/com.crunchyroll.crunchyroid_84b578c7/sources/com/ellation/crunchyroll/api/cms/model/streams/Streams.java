package com.ellation.crunchyroll.api.cms.model.streams;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.playback.model.SessionState;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: Streams.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÂ\u0003J#\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0005HÂ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÂ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÂ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÂ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u009f\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R*\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R)\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00050\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010\u001eR\u001d\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010\u001e¨\u00069"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/streams/Streams;", "Ljava/io/Serializable;", "_mediaId", "", "_streams", "", "Lcom/ellation/crunchyroll/api/cms/model/streams/Stream;", "_audioLocale", "_subtitles", "Lcom/ellation/crunchyroll/api/model/Subtitle;", "_captions", "_bifs", "", "sessionState", "Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;", "_assetId", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;Ljava/lang/String;)V", "value", "assetId", "getAssetId", "()Ljava/lang/String;", "setAssetId", "(Ljava/lang/String;)V", "audioLocale", "getAudioLocale", "bifs", "getBifs", "()Ljava/util/List;", "captions", "getCaptions", "()Ljava/util/Map;", "hlsStreams", "getHlsStreams", "mediaId", "getMediaId", "getSessionState", "()Lcom/ellation/crunchyroll/api/etp/playback/model/SessionState;", "streams", "getStreams", "subtitles", "getSubtitles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Streams implements Serializable {
    public static final int $stable = 8;
    @SerializedName("asset_id")
    private String _assetId;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("bifs")
    private final List<String> _bifs;
    @SerializedName("captions")
    private final Map<String, Subtitle> _captions;
    @SerializedName("media_id")
    private final String _mediaId;
    @SerializedName("streams")
    private final Map<String, Map<String, Stream>> _streams;
    @SerializedName("subtitles")
    private final Map<String, Subtitle> _subtitles;
    @SerializedName("session")
    private final SessionState sessionState;

    public Streams() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    private final String component1() {
        return this._mediaId;
    }

    private final Map<String, Map<String, Stream>> component2() {
        return this._streams;
    }

    private final String component3() {
        return this._audioLocale;
    }

    private final Map<String, Subtitle> component4() {
        return this._subtitles;
    }

    private final Map<String, Subtitle> component5() {
        return this._captions;
    }

    private final List<String> component6() {
        return this._bifs;
    }

    private final String component8() {
        return this._assetId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Streams copy$default(Streams streams, String str, Map map, String str2, Map map2, Map map3, List list, SessionState sessionState, String str3, int i, Object obj) {
        String str4;
        Map<String, Map<String, Stream>> map4;
        String str5;
        Map<String, Subtitle> map5;
        Map<String, Subtitle> map6;
        List<String> list2;
        SessionState sessionState2;
        String str6;
        if ((i & 1) != 0) {
            str4 = streams._mediaId;
        } else {
            str4 = str;
        }
        if ((i & 2) != 0) {
            map4 = streams._streams;
        } else {
            map4 = map;
        }
        if ((i & 4) != 0) {
            str5 = streams._audioLocale;
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            map5 = streams._subtitles;
        } else {
            map5 = map2;
        }
        if ((i & 16) != 0) {
            map6 = streams._captions;
        } else {
            map6 = map3;
        }
        if ((i & 32) != 0) {
            list2 = streams._bifs;
        } else {
            list2 = list;
        }
        if ((i & 64) != 0) {
            sessionState2 = streams.sessionState;
        } else {
            sessionState2 = sessionState;
        }
        if ((i & 128) != 0) {
            str6 = streams._assetId;
        } else {
            str6 = str3;
        }
        return streams.copy(str4, map4, str5, map5, map6, list2, sessionState2, str6);
    }

    public final SessionState component7() {
        return this.sessionState;
    }

    public final Streams copy(String str, Map<String, ? extends Map<String, Stream>> map, String str2, Map<String, Subtitle> map2, Map<String, Subtitle> map3, List<String> list, SessionState sessionState, String str3) {
        return new Streams(str, map, str2, map2, map3, list, sessionState, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Streams)) {
            return false;
        }
        Streams streams = (Streams) obj;
        if (j.a(this._mediaId, streams._mediaId) && j.a(this._streams, streams._streams) && j.a(this._audioLocale, streams._audioLocale) && j.a(this._subtitles, streams._subtitles) && j.a(this._captions, streams._captions) && j.a(this._bifs, streams._bifs) && j.a(this.sessionState, streams.sessionState) && j.a(this._assetId, streams._assetId)) {
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

    public final List<String> getBifs() {
        List<String> list = this._bifs;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final Map<String, Subtitle> getCaptions() {
        Map<String, Subtitle> map = this._captions;
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public final Map<String, Stream> getHlsStreams() {
        Map<String, Stream> map = getStreams().get("adaptive_hls");
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public final String getMediaId() {
        String str = this._mediaId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final SessionState getSessionState() {
        return this.sessionState;
    }

    public final Map<String, Map<String, Stream>> getStreams() {
        Map<String, Map<String, Stream>> map = this._streams;
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public final Map<String, Subtitle> getSubtitles() {
        Map<String, Subtitle> map = this._subtitles;
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this._mediaId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Map<String, Map<String, Stream>> map = this._streams;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this._audioLocale;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map<String, Subtitle> map2 = this._subtitles;
        if (map2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Map<String, Subtitle> map3 = this._captions;
        if (map3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = map3.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<String> list = this._bifs;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        SessionState sessionState = this.sessionState;
        if (sessionState == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = sessionState.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str3 = this._assetId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i8 + i;
    }

    public final void setAssetId(String str) {
        j.f(str, "value");
        this._assetId = str;
    }

    public String toString() {
        String str = this._mediaId;
        Map<String, Map<String, Stream>> map = this._streams;
        String str2 = this._audioLocale;
        Map<String, Subtitle> map2 = this._subtitles;
        Map<String, Subtitle> map3 = this._captions;
        List<String> list = this._bifs;
        SessionState sessionState = this.sessionState;
        String str3 = this._assetId;
        return "Streams(_mediaId=" + str + ", _streams=" + map + ", _audioLocale=" + str2 + ", _subtitles=" + map2 + ", _captions=" + map3 + ", _bifs=" + list + ", sessionState=" + sessionState + ", _assetId=" + str3 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Streams(String str, Map<String, ? extends Map<String, Stream>> map, String str2, Map<String, Subtitle> map2, Map<String, Subtitle> map3, List<String> list, SessionState sessionState, String str3) {
        this._mediaId = str;
        this._streams = map;
        this._audioLocale = str2;
        this._subtitles = map2;
        this._captions = map3;
        this._bifs = list;
        this.sessionState = sessionState;
        this._assetId = str3;
    }

    public /* synthetic */ Streams(String str, Map map, String str2, Map map2, Map map3, List list, SessionState sessionState, String str3, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : map3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : sessionState, (i & 128) == 0 ? str3 : null);
    }
}
