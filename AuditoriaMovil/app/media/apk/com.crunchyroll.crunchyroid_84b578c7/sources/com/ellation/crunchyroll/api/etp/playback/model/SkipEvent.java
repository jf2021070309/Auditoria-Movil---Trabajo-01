package com.ellation.crunchyroll.api.etp.playback.model;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
/* compiled from: SkipEvents.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEvent;", "", "endSeconds", "", "startSeconds", "seriesId", "", "type", "Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEventType;", "(DDLjava/lang/String;Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEventType;)V", "getEndSeconds", "()D", "getSeriesId", "()Ljava/lang/String;", "getStartSeconds", "getType", "()Lcom/ellation/crunchyroll/api/etp/playback/model/SkipEventType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkipEvent {
    public static final int $stable = 0;
    @SerializedName("end")
    private final double endSeconds;
    @SerializedName("seriesId")
    private final String seriesId;
    @SerializedName("start")
    private final double startSeconds;
    @SerializedName("type")
    private final SkipEventType type;

    public SkipEvent(double d, double d2, String str, SkipEventType skipEventType) {
        j.f(str, "seriesId");
        j.f(skipEventType, "type");
        this.endSeconds = d;
        this.startSeconds = d2;
        this.seriesId = str;
        this.type = skipEventType;
    }

    public static /* synthetic */ SkipEvent copy$default(SkipEvent skipEvent, double d, double d2, String str, SkipEventType skipEventType, int i, Object obj) {
        if ((i & 1) != 0) {
            d = skipEvent.endSeconds;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = skipEvent.startSeconds;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = skipEvent.seriesId;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            skipEventType = skipEvent.type;
        }
        return skipEvent.copy(d3, d4, str2, skipEventType);
    }

    public final double component1() {
        return this.endSeconds;
    }

    public final double component2() {
        return this.startSeconds;
    }

    public final String component3() {
        return this.seriesId;
    }

    public final SkipEventType component4() {
        return this.type;
    }

    public final SkipEvent copy(double d, double d2, String str, SkipEventType skipEventType) {
        j.f(str, "seriesId");
        j.f(skipEventType, "type");
        return new SkipEvent(d, d2, str, skipEventType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipEvent)) {
            return false;
        }
        SkipEvent skipEvent = (SkipEvent) obj;
        if (Double.compare(this.endSeconds, skipEvent.endSeconds) == 0 && Double.compare(this.startSeconds, skipEvent.startSeconds) == 0 && j.a(this.seriesId, skipEvent.seriesId) && this.type == skipEvent.type) {
            return true;
        }
        return false;
    }

    public final double getEndSeconds() {
        return this.endSeconds;
    }

    public final String getSeriesId() {
        return this.seriesId;
    }

    public final double getStartSeconds() {
        return this.startSeconds;
    }

    public final SkipEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.startSeconds);
        return this.type.hashCode() + a.b(this.seriesId, (hashCode + (Double.hashCode(this.endSeconds) * 31)) * 31, 31);
    }

    public String toString() {
        double d = this.endSeconds;
        double d2 = this.startSeconds;
        String str = this.seriesId;
        SkipEventType skipEventType = this.type;
        return "SkipEvent(endSeconds=" + d + ", startSeconds=" + d2 + ", seriesId=" + str + ", type=" + skipEventType + ")";
    }
}
