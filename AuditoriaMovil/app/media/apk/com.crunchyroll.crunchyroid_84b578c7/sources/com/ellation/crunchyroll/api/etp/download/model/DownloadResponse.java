package com.ellation.crunchyroll.api.etp.download.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: DownloadResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/ellation/crunchyroll/api/etp/download/model/DownloadResponse;", "", "manifestUrl", "", "videoToken", "_subtitles", "", "Lcom/ellation/crunchyroll/api/model/Subtitle;", "_captions", "bifs", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getBifs", "()Ljava/lang/String;", "captions", "getCaptions", "()Ljava/util/Map;", "getManifestUrl", "subtitles", "getSubtitles", "getVideoToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DownloadResponse {
    public static final int $stable = 8;
    @SerializedName("captions")
    private final Map<String, Subtitle> _captions;
    @SerializedName("subtitles")
    private final Map<String, Subtitle> _subtitles;
    @SerializedName("bifs")
    private final String bifs;
    @SerializedName(ImagesContract.URL)
    private final String manifestUrl;
    @SerializedName("token")
    private final String videoToken;

    public DownloadResponse(String str, String str2, Map<String, Subtitle> map, Map<String, Subtitle> map2, String str3) {
        j.f(str, "manifestUrl");
        j.f(str2, "videoToken");
        this.manifestUrl = str;
        this.videoToken = str2;
        this._subtitles = map;
        this._captions = map2;
        this.bifs = str3;
    }

    private final Map<String, Subtitle> component3() {
        return this._subtitles;
    }

    private final Map<String, Subtitle> component4() {
        return this._captions;
    }

    public static /* synthetic */ DownloadResponse copy$default(DownloadResponse downloadResponse, String str, String str2, Map map, Map map2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadResponse.manifestUrl;
        }
        if ((i & 2) != 0) {
            str2 = downloadResponse.videoToken;
        }
        String str4 = str2;
        Map<String, Subtitle> map3 = map;
        if ((i & 4) != 0) {
            map3 = downloadResponse._subtitles;
        }
        Map map4 = map3;
        Map<String, Subtitle> map5 = map2;
        if ((i & 8) != 0) {
            map5 = downloadResponse._captions;
        }
        Map map6 = map5;
        if ((i & 16) != 0) {
            str3 = downloadResponse.bifs;
        }
        return downloadResponse.copy(str, str4, map4, map6, str3);
    }

    public final String component1() {
        return this.manifestUrl;
    }

    public final String component2() {
        return this.videoToken;
    }

    public final String component5() {
        return this.bifs;
    }

    public final DownloadResponse copy(String str, String str2, Map<String, Subtitle> map, Map<String, Subtitle> map2, String str3) {
        j.f(str, "manifestUrl");
        j.f(str2, "videoToken");
        return new DownloadResponse(str, str2, map, map2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadResponse)) {
            return false;
        }
        DownloadResponse downloadResponse = (DownloadResponse) obj;
        if (j.a(this.manifestUrl, downloadResponse.manifestUrl) && j.a(this.videoToken, downloadResponse.videoToken) && j.a(this._subtitles, downloadResponse._subtitles) && j.a(this._captions, downloadResponse._captions) && j.a(this.bifs, downloadResponse.bifs)) {
            return true;
        }
        return false;
    }

    public final String getBifs() {
        return this.bifs;
    }

    public final Map<String, Subtitle> getCaptions() {
        Map<String, Subtitle> map = this._captions;
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public final String getManifestUrl() {
        return this.manifestUrl;
    }

    public final Map<String, Subtitle> getSubtitles() {
        Map<String, Subtitle> map = this._subtitles;
        if (map == null) {
            return a0.b;
        }
        return map;
    }

    public final String getVideoToken() {
        return this.videoToken;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int b = a.b(this.videoToken, this.manifestUrl.hashCode() * 31, 31);
        Map<String, Subtitle> map = this._subtitles;
        int i = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Map<String, Subtitle> map2 = this._captions;
        if (map2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str = this.bifs;
        if (str != null) {
            i = str.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this.manifestUrl;
        String str2 = this.videoToken;
        Map<String, Subtitle> map = this._subtitles;
        Map<String, Subtitle> map2 = this._captions;
        String str3 = this.bifs;
        StringBuilder b = com.amazon.aps.iva.n4.a.b("DownloadResponse(manifestUrl=", str, ", videoToken=", str2, ", _subtitles=");
        b.append(map);
        b.append(", _captions=");
        b.append(map2);
        b.append(", bifs=");
        return b.c(b, str3, ")");
    }

    public /* synthetic */ DownloadResponse(String str, String str2, Map map, Map map2, String str3, int i, e eVar) {
        this(str, str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : map2, (i & 16) != 0 ? null : str3);
    }
}
