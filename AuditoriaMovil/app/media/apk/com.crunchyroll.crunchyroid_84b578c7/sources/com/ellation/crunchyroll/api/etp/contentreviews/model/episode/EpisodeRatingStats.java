package com.ellation.crunchyroll.api.etp.contentreviews.model.episode;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: EpisodeRatingStats.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/episode/EpisodeRatingStats;", "Ljava/io/Serializable;", "displayed", "", "unit", "", "(DLjava/lang/String;)V", "rawRatingCount", "", "getRawRatingCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EpisodeRatingStats implements Serializable {
    public static final int $stable = 0;
    @SerializedName("displayed")
    private final double displayed;
    @SerializedName("unit")
    private final String unit;

    public EpisodeRatingStats(double d, String str) {
        this.displayed = d;
        this.unit = str;
    }

    private final double component1() {
        return this.displayed;
    }

    private final String component2() {
        return this.unit;
    }

    public static /* synthetic */ EpisodeRatingStats copy$default(EpisodeRatingStats episodeRatingStats, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = episodeRatingStats.displayed;
        }
        if ((i & 2) != 0) {
            str = episodeRatingStats.unit;
        }
        return episodeRatingStats.copy(d, str);
    }

    public final EpisodeRatingStats copy(double d, String str) {
        return new EpisodeRatingStats(d, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeRatingStats)) {
            return false;
        }
        EpisodeRatingStats episodeRatingStats = (EpisodeRatingStats) obj;
        if (Double.compare(this.displayed, episodeRatingStats.displayed) == 0 && j.a(this.unit, episodeRatingStats.unit)) {
            return true;
        }
        return false;
    }

    public final int getRawRatingCount() {
        double d;
        double d2;
        int i;
        String str = this.unit;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 75) {
                    if (hashCode == 77 && str.equals("M")) {
                        d2 = this.displayed;
                        i = 1000000;
                        d = d2 * i;
                    }
                } else if (str.equals("K")) {
                    d2 = this.displayed;
                    i = 1000;
                    d = d2 * i;
                }
            } else if (str.equals("B")) {
                d2 = this.displayed;
                i = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
                d = d2 * i;
            }
            return (int) d;
        }
        d = this.displayed;
        return (int) d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Double.hashCode(this.displayed) * 31;
        String str = this.unit;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        double d = this.displayed;
        String str = this.unit;
        return "EpisodeRatingStats(displayed=" + d + ", unit=" + str + ")";
    }

    public /* synthetic */ EpisodeRatingStats(double d, String str, int i, e eVar) {
        this(d, (i & 2) != 0 ? null : str);
    }
}
