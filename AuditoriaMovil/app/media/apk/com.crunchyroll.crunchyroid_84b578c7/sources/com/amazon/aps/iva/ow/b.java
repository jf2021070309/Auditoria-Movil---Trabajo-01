package com.amazon.aps.iva.ow;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
/* compiled from: SkipEventsCache.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.xe.a<SkipEvents> implements a {
    public b(Context context) {
        super(SkipEvents.class, context, "skip_events_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(SkipEvents skipEvents) {
        SkipEvents skipEvents2 = skipEvents;
        j.f(skipEvents2, "<this>");
        return skipEvents2.getMediaId();
    }
}
