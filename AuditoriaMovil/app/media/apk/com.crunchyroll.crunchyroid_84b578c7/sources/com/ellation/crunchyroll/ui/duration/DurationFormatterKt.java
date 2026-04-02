package com.ellation.crunchyroll.ui.duration;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: DurationFormatter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0004"}, d2 = {"durationFromSeconds", "Lcom/ellation/crunchyroll/ui/duration/Duration;", "", "getFirstDurationNumber", "widgets_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DurationFormatterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Duration durationFromSeconds(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j);
        long seconds = j - TimeUnit.HOURS.toSeconds(hours);
        long minutes = timeUnit.toMinutes(seconds);
        return new Duration(hours, minutes, seconds - TimeUnit.MINUTES.toSeconds(minutes));
    }

    public static final long getFirstDurationNumber(long j) {
        boolean z;
        Duration durationFromSeconds = durationFromSeconds(j);
        Long valueOf = Long.valueOf(durationFromSeconds.getHours());
        boolean z2 = true;
        if (valueOf.longValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        Long l = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        Long valueOf2 = Long.valueOf(durationFromSeconds.getMinutes());
        if (valueOf2.longValue() <= 0) {
            z2 = false;
        }
        if (z2) {
            l = valueOf2;
        }
        if (l != null) {
            return l.longValue();
        }
        return durationFromSeconds.getSeconds();
    }
}
