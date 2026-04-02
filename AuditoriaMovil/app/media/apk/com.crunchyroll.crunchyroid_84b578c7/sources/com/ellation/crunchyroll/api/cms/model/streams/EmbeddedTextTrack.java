package com.ellation.crunchyroll.api.cms.model.streams;

import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: EmbeddedTextTrack.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ellation/crunchyroll/api/cms/model/streams/EmbeddedTextTrack;", "Ljava/io/Serializable;", "_kind", "", "_format", "_language", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "kind", "getKind", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmbeddedTextTrack implements Serializable {
    public static final int $stable = 0;
    @SerializedName("format")
    private final String _format;
    @SerializedName("kind")
    private final String _kind;
    @SerializedName("language")
    private final String _language;

    public EmbeddedTextTrack() {
        this(null, null, null, 7, null);
    }

    private final String component1() {
        return this._kind;
    }

    private final String component2() {
        return this._format;
    }

    private final String component3() {
        return this._language;
    }

    public static /* synthetic */ EmbeddedTextTrack copy$default(EmbeddedTextTrack embeddedTextTrack, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = embeddedTextTrack._kind;
        }
        if ((i & 2) != 0) {
            str2 = embeddedTextTrack._format;
        }
        if ((i & 4) != 0) {
            str3 = embeddedTextTrack._language;
        }
        return embeddedTextTrack.copy(str, str2, str3);
    }

    public final EmbeddedTextTrack copy(String str, String str2, String str3) {
        return new EmbeddedTextTrack(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedTextTrack)) {
            return false;
        }
        EmbeddedTextTrack embeddedTextTrack = (EmbeddedTextTrack) obj;
        if (j.a(this._kind, embeddedTextTrack._kind) && j.a(this._format, embeddedTextTrack._format) && j.a(this._language, embeddedTextTrack._language)) {
            return true;
        }
        return false;
    }

    public final String getKind() {
        String str = this._kind;
        if (str == null) {
            return "";
        }
        return str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this._kind;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this._format;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this._language;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        String str = this._kind;
        String str2 = this._format;
        return b.c(a.b("EmbeddedTextTrack(_kind=", str, ", _format=", str2, ", _language="), this._language, ")");
    }

    public EmbeddedTextTrack(String str, String str2, String str3) {
        this._kind = str;
        this._format = str2;
        this._language = str3;
    }

    public /* synthetic */ EmbeddedTextTrack(String str, String str2, String str3, int i, e eVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
