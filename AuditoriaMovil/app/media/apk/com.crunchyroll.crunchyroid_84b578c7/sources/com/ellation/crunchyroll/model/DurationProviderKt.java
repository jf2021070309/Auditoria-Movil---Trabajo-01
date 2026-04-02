package com.ellation.crunchyroll.model;

import com.amazon.aps.iva.yb0.j;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: DurationProvider.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"durationSecs", "", "Lcom/ellation/crunchyroll/model/DurationProvider;", "getDurationSecs", "(Lcom/ellation/crunchyroll/model/DurationProvider;)J", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DurationProviderKt {
    public static final long getDurationSecs(DurationProvider durationProvider) {
        j.f(durationProvider, "<this>");
        return TimeUnit.MILLISECONDS.toSeconds(durationProvider.getDurationMs());
    }
}
