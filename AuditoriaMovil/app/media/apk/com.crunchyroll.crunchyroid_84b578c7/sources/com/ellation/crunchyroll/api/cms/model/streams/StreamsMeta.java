package com.ellation.crunchyroll.api.cms.model.streams;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: StreamsMeta.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÂ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/streams/StreamsMeta;", "", "_mediaId", "", "_audioLocale", "_subtitles", "", "Lcom/ellation/crunchyroll/api/model/Subtitle;", "_captions", "_bifs", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "audioLocale", "getAudioLocale", "()Ljava/lang/String;", "bifs", "getBifs", "()Ljava/util/List;", "captions", "getCaptions", "()Ljava/util/Map;", "mediaId", "getMediaId", "subtitles", "getSubtitles", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StreamsMeta {
    public static final int $stable = 8;
    @SerializedName("audio_locale")
    private final String _audioLocale;
    @SerializedName("bifs")
    private final List<String> _bifs;
    @SerializedName("captions")
    private final Map<String, Subtitle> _captions;
    @SerializedName("media_id")
    private final String _mediaId;
    @SerializedName("subtitles")
    private final Map<String, Subtitle> _subtitles;

    public StreamsMeta() {
        this(null, null, null, null, null, 31, null);
    }

    private final String component1() {
        return this._mediaId;
    }

    private final String component2() {
        return this._audioLocale;
    }

    private final Map<String, Subtitle> component3() {
        return this._subtitles;
    }

    private final Map<String, Subtitle> component4() {
        return this._captions;
    }

    private final List<String> component5() {
        return this._bifs;
    }

    public static /* synthetic */ StreamsMeta copy$default(StreamsMeta streamsMeta, String str, String str2, Map map, Map map2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamsMeta._mediaId;
        }
        if ((i & 2) != 0) {
            str2 = streamsMeta._audioLocale;
        }
        String str3 = str2;
        Map<String, Subtitle> map3 = map;
        if ((i & 4) != 0) {
            map3 = streamsMeta._subtitles;
        }
        Map map4 = map3;
        Map<String, Subtitle> map5 = map2;
        if ((i & 8) != 0) {
            map5 = streamsMeta._captions;
        }
        Map map6 = map5;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = streamsMeta._bifs;
        }
        return streamsMeta.copy(str, str3, map4, map6, list2);
    }

    public final StreamsMeta copy(String str, String str2, Map<String, Subtitle> map, Map<String, Subtitle> map2, List<String> list) {
        return new StreamsMeta(str, str2, map, map2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamsMeta)) {
            return false;
        }
        StreamsMeta streamsMeta = (StreamsMeta) obj;
        if (j.a(this._mediaId, streamsMeta._mediaId) && j.a(this._audioLocale, streamsMeta._audioLocale) && j.a(this._subtitles, streamsMeta._subtitles) && j.a(this._captions, streamsMeta._captions) && j.a(this._bifs, streamsMeta._bifs)) {
            return true;
        }
        return false;
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

    public final String getMediaId() {
        String str = this._mediaId;
        if (str == null) {
            return "";
        }
        return str;
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
        String str = this._mediaId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._audioLocale;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Map<String, Subtitle> map = this._subtitles;
        if (map == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = map.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Map<String, Subtitle> map2 = this._captions;
        if (map2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = map2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<String> list = this._bifs;
        if (list != null) {
            i = list.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        String str = this._mediaId;
        String str2 = this._audioLocale;
        Map<String, Subtitle> map = this._subtitles;
        Map<String, Subtitle> map2 = this._captions;
        List<String> list = this._bifs;
        StringBuilder b = a.b("StreamsMeta(_mediaId=", str, ", _audioLocale=", str2, ", _subtitles=");
        b.append(map);
        b.append(", _captions=");
        b.append(map2);
        b.append(", _bifs=");
        return com.amazon.aps.iva.oa.a.b(b, list, ")");
    }

    public StreamsMeta(String str, String str2, Map<String, Subtitle> map, Map<String, Subtitle> map2, List<String> list) {
        this._mediaId = str;
        this._audioLocale = str2;
        this._subtitles = map;
        this._captions = map2;
        this._bifs = list;
    }

    public /* synthetic */ StreamsMeta(String str, String str2, Map map, Map map2, List list, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : list);
    }
}
