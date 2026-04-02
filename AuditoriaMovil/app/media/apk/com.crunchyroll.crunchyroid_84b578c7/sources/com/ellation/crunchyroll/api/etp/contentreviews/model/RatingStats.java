package com.ellation.crunchyroll.api.etp.contentreviews.model;

import com.amazon.aps.iva.a0.r;
import com.amazon.aps.iva.n4.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: RatingStats.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÂ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/contentreviews/model/RatingStats;", "Ljava/io/Serializable;", "displayed", "", "percentage", "", "unit", "", "(DILjava/lang/String;)V", "count", "", "getCount", "()J", "getPercentage", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RatingStats implements Serializable {
    public static final int $stable = 0;
    @SerializedName("displayed")
    private final double displayed;
    @SerializedName("percentage")
    private final int percentage;
    @SerializedName("unit")
    private final String unit;

    public RatingStats(double d, int i, String str) {
        this.displayed = d;
        this.percentage = i;
        this.unit = str;
    }

    private final double component1() {
        return this.displayed;
    }

    private final String component3() {
        return this.unit;
    }

    public static /* synthetic */ RatingStats copy$default(RatingStats ratingStats, double d, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = ratingStats.displayed;
        }
        if ((i2 & 2) != 0) {
            i = ratingStats.percentage;
        }
        if ((i2 & 4) != 0) {
            str = ratingStats.unit;
        }
        return ratingStats.copy(d, i, str);
    }

    public final int component2() {
        return this.percentage;
    }

    public final RatingStats copy(double d, int i, String str) {
        return new RatingStats(d, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingStats)) {
            return false;
        }
        RatingStats ratingStats = (RatingStats) obj;
        if (Double.compare(this.displayed, ratingStats.displayed) == 0 && this.percentage == ratingStats.percentage && j.a(this.unit, ratingStats.unit)) {
            return true;
        }
        return false;
    }

    public final long getCount() {
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
            return (long) d;
        }
        d = this.displayed;
        return (long) d;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    public int hashCode() {
        int hashCode;
        int a = r.a(this.percentage, Double.hashCode(this.displayed) * 31, 31);
        String str = this.unit;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        double d = this.displayed;
        int i = this.percentage;
        String str = this.unit;
        StringBuilder sb = new StringBuilder("RatingStats(displayed=");
        sb.append(d);
        sb.append(", percentage=");
        sb.append(i);
        return a.a(sb, ", unit=", str, ")");
    }

    public /* synthetic */ RatingStats(double d, int i, String str, int i2, e eVar) {
        this(d, i, (i2 & 4) != 0 ? null : str);
    }
}
