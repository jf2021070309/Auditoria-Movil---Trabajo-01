package com.ellation.crunchyroll.ui.duration;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: DurationFormatter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "", "formatDuration", "", "seconds", "", "Companion", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DurationFormatter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DurationFormatter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/ui/duration/DurationFormatter$Companion;", "", "()V", "create", "Lcom/ellation/crunchyroll/ui/duration/DurationFormatter;", "context", "Landroid/content/Context;", "widgets_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final DurationFormatter create(Context context) {
            j.f(context, "context");
            return new DurationFormatterImpl(context);
        }
    }

    String formatDuration(long j);
}
