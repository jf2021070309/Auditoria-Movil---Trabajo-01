package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallDurationFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatterImpl;", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "context", "Landroid/content/Context;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "(Landroid/content/Context;Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;)V", "formatTimeLeft", "", "playheadSec", "", "durationSec", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallDurationFormatterImpl implements SmallDurationFormatter {
    private final Context context;
    private final DurationFormatter durationFormatter;

    public SmallDurationFormatterImpl(Context context, DurationFormatter durationFormatter) {
        j.f(context, "context");
        j.f(durationFormatter, "durationFormatter");
        this.context = context;
        this.durationFormatter = durationFormatter;
    }

    @Override // com.ellation.crunchyroll.ui.duration.SmallDurationFormatter
    public String formatTimeLeft(long j, long j2) {
        boolean z = false;
        if (1 <= j && j < j2) {
            z = true;
        }
        if (z) {
            long j3 = j2 - j;
            String quantityString = this.context.getResources().getQuantityString(R.plurals.duration_left_format, (int) DurationFormatterKt.getFirstDurationNumber(j3), this.durationFormatter.formatDuration(j3));
            j.e(quantityString, "{\n                val se…          )\n            }");
            return quantityString;
        }
        return this.durationFormatter.formatDuration(j2);
    }
}
