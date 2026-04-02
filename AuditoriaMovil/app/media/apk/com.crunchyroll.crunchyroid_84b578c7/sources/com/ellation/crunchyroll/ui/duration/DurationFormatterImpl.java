package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DurationFormatter.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationFormatterImpl;", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "formatDuration", "", "duration", "Lcom/ellation/crunchyroll/ui/duration/Duration;", "seconds", "", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DurationFormatterImpl implements DurationFormatter {
    private final Context context;

    public DurationFormatterImpl(Context context) {
        j.f(context, "context");
        this.context = context;
    }

    @Override // com.ellation.crunchyroll.ui.duration.DurationFormatter
    public String formatDuration(long j) {
        Duration durationFromSeconds;
        durationFromSeconds = DurationFormatterKt.durationFromSeconds(j);
        return formatDuration(durationFromSeconds);
    }

    private final String formatDuration(Duration duration) {
        String string = this.context.getString(R.string.format_hours_short, Long.valueOf(duration.getHours()));
        boolean z = true;
        if (!(duration.getHours() > 0)) {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        String string2 = this.context.getString(R.string.format_minutes_short, Long.valueOf(duration.getMinutes()));
        if (!(duration.getMinutes() > 0)) {
            string2 = null;
        }
        if (string2 == null) {
            string2 = "";
        }
        String string3 = this.context.getString(R.string.format_seconds_short, Long.valueOf(duration.getSeconds()));
        if (duration.getHours() != 0 || duration.getMinutes() != 0) {
            z = false;
        }
        String str = z ? string3 : null;
        String string4 = this.context.getString(R.string.format_episode_duration, string, string2, str != null ? str : "");
        j.e(string4, "context\n            .get…minutesText, secondsText)");
        return q.O0(string4).toString();
    }
}
