package com.ellation.crunchyroll.api.cms.model.streams;

import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Stream.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006#"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/streams/Stream;", "Ljava/io/Serializable;", "_hardsubLocale", "", "_url", "_embeddedTextTracks", "", "Lcom/ellation/crunchyroll/api/cms/model/streams/EmbeddedTextTrack;", "_videoToken", "isNativeMediaSource", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "embeddedTextTrack", "getEmbeddedTextTrack", "()Ljava/util/List;", "hardsubLocale", "getHardsubLocale", "()Ljava/lang/String;", "()Z", ImagesContract.URL, "getUrl", "videoToken", "getVideoToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Stream implements Serializable {
    public static final int $stable = 8;
    @SerializedName("embedded_text_tracks")
    private final List<EmbeddedTextTrack> _embeddedTextTracks;
    @SerializedName("hardsub_locale")
    private final String _hardsubLocale;
    @SerializedName(ImagesContract.URL)
    private final String _url;
    private final transient String _videoToken;
    private final transient boolean isNativeMediaSource;

    public Stream() {
        this(null, null, null, null, false, 31, null);
    }

    private final String component1() {
        return this._hardsubLocale;
    }

    private final String component2() {
        return this._url;
    }

    private final List<EmbeddedTextTrack> component3() {
        return this._embeddedTextTracks;
    }

    private final String component4() {
        return this._videoToken;
    }

    public static /* synthetic */ Stream copy$default(Stream stream, String str, String str2, List list, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stream._hardsubLocale;
        }
        if ((i & 2) != 0) {
            str2 = stream._url;
        }
        String str4 = str2;
        List<EmbeddedTextTrack> list2 = list;
        if ((i & 4) != 0) {
            list2 = stream._embeddedTextTracks;
        }
        List list3 = list2;
        if ((i & 8) != 0) {
            str3 = stream._videoToken;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = stream.isNativeMediaSource;
        }
        return stream.copy(str, str4, list3, str5, z);
    }

    public final boolean component5() {
        return this.isNativeMediaSource;
    }

    public final Stream copy(String str, String str2, List<EmbeddedTextTrack> list, String str3, boolean z) {
        return new Stream(str, str2, list, str3, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stream)) {
            return false;
        }
        Stream stream = (Stream) obj;
        if (j.a(this._hardsubLocale, stream._hardsubLocale) && j.a(this._url, stream._url) && j.a(this._embeddedTextTracks, stream._embeddedTextTracks) && j.a(this._videoToken, stream._videoToken) && this.isNativeMediaSource == stream.isNativeMediaSource) {
            return true;
        }
        return false;
    }

    public final List<EmbeddedTextTrack> getEmbeddedTextTrack() {
        List<EmbeddedTextTrack> list = this._embeddedTextTracks;
        if (list == null) {
            return z.b;
        }
        return list;
    }

    public final String getHardsubLocale() {
        String str = this._hardsubLocale;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getUrl() {
        String str = this._url;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getVideoToken() {
        String str = this._videoToken;
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
        String str = this._hardsubLocale;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._url;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<EmbeddedTextTrack> list = this._embeddedTextTracks;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this._videoToken;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i5 = (i4 + i) * 31;
        boolean z = this.isNativeMediaSource;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        return i5 + i6;
    }

    public final boolean isNativeMediaSource() {
        return this.isNativeMediaSource;
    }

    public String toString() {
        String str = this._hardsubLocale;
        String str2 = this._url;
        List<EmbeddedTextTrack> list = this._embeddedTextTracks;
        String str3 = this._videoToken;
        boolean z = this.isNativeMediaSource;
        StringBuilder b = a.b("Stream(_hardsubLocale=", str, ", _url=", str2, ", _embeddedTextTracks=");
        b.append(list);
        b.append(", _videoToken=");
        b.append(str3);
        b.append(", isNativeMediaSource=");
        return e.c(b, z, ")");
    }

    public Stream(String str, String str2, List<EmbeddedTextTrack> list, String str3, boolean z) {
        this._hardsubLocale = str;
        this._url = str2;
        this._embeddedTextTracks = list;
        this._videoToken = str3;
        this.isNativeMediaSource = z;
    }

    public /* synthetic */ Stream(String str, String str2, List list, String str3, boolean z, int i, com.amazon.aps.iva.yb0.e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? false : z);
    }
}
