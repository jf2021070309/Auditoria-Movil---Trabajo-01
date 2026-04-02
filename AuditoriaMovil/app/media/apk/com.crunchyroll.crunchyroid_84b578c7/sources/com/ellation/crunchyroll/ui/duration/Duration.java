package com.ellation.crunchyroll.ui.duration;

import com.amazon.aps.iva.b8.i;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DurationFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/Duration;", "", "hours", "", "minutes", "seconds", "(JJJ)V", "getHours", "()J", "getMinutes", "getSeconds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Duration {
    private final long hours;
    private final long minutes;
    private final long seconds;

    public Duration(long j, long j2, long j3) {
        this.hours = j;
        this.minutes = j2;
        this.seconds = j3;
    }

    public static /* synthetic */ Duration copy$default(Duration duration, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = duration.hours;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = duration.minutes;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = duration.seconds;
        }
        return duration.copy(j4, j5, j3);
    }

    public final long component1() {
        return this.hours;
    }

    public final long component2() {
        return this.minutes;
    }

    public final long component3() {
        return this.seconds;
    }

    public final Duration copy(long j, long j2, long j3) {
        return new Duration(j, j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duration)) {
            return false;
        }
        Duration duration = (Duration) obj;
        if (this.hours == duration.hours && this.minutes == duration.minutes && this.seconds == duration.seconds) {
            return true;
        }
        return false;
    }

    public final long getHours() {
        return this.hours;
    }

    public final long getMinutes() {
        return this.minutes;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Long.hashCode(this.seconds) + i.a(this.minutes, Long.hashCode(this.hours) * 31, 31);
    }

    public String toString() {
        long j = this.hours;
        long j2 = this.minutes;
        long j3 = this.seconds;
        return "Duration(hours=" + j + ", minutes=" + j2 + ", seconds=" + j3 + ")";
    }
}
