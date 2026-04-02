package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SmallDurationFormatter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "", "formatTimeLeft", "", "playheadSec", "", "durationSec", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SmallDurationFormatter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: SmallDurationFormatter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/duration/SmallDurationFormatter;", "context", "Landroid/content/Context;", "durationFormatter", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ SmallDurationFormatter create$default(Companion companion, Context context, DurationFormatter durationFormatter, int i, Object obj) {
            if ((i & 2) != 0) {
                durationFormatter = DurationFormatter.Companion.create(context);
            }
            return companion.create(context, durationFormatter);
        }

        public final SmallDurationFormatter create(Context context, DurationFormatter durationFormatter) {
            j.f(context, "context");
            j.f(durationFormatter, "durationFormatter");
            return new SmallDurationFormatterImpl(context, durationFormatter);
        }
    }

    String formatTimeLeft(long j, long j2);
}
