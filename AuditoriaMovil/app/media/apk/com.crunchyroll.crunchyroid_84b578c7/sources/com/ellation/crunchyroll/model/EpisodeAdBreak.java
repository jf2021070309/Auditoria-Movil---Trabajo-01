package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: EpisodeAdBreak.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/model/EpisodeAdBreak;", "Ljava/io/Serializable;", "type", "", "offsetMs", "", "(Ljava/lang/String;I)V", "getOffsetMs", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EpisodeAdBreak implements Serializable {
    public static final int $stable = 0;
    @SerializedName("offset_ms")
    private final int offsetMs;
    @SerializedName("type")
    private final String type;

    public EpisodeAdBreak(String str, int i) {
        j.f(str, "type");
        this.type = str;
        this.offsetMs = i;
    }

    public static /* synthetic */ EpisodeAdBreak copy$default(EpisodeAdBreak episodeAdBreak, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = episodeAdBreak.type;
        }
        if ((i2 & 2) != 0) {
            i = episodeAdBreak.offsetMs;
        }
        return episodeAdBreak.copy(str, i);
    }

    public final String component1() {
        return this.type;
    }

    public final int component2() {
        return this.offsetMs;
    }

    public final EpisodeAdBreak copy(String str, int i) {
        j.f(str, "type");
        return new EpisodeAdBreak(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeAdBreak)) {
            return false;
        }
        EpisodeAdBreak episodeAdBreak = (EpisodeAdBreak) obj;
        if (j.a(this.type, episodeAdBreak.type) && this.offsetMs == episodeAdBreak.offsetMs) {
            return true;
        }
        return false;
    }

    public final int getOffsetMs() {
        return this.offsetMs;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.offsetMs) + (this.type.hashCode() * 31);
    }

    public String toString() {
        String str = this.type;
        int i = this.offsetMs;
        return "EpisodeAdBreak(type=" + str + ", offsetMs=" + i + ")";
    }
}
