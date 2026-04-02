package com.kwad.components.core.n.b;

import android.content.Context;
import com.ksad.annotation.invoker.ForInvoker;
import com.kwad.components.core.n.b.a.g;
import com.kwad.components.offline.api.OfflineHostProvider;
import com.kwad.components.offline.c.c;
import com.kwad.sdk.utils.aw;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class b {
    private static final AtomicBoolean IW = new AtomicBoolean();

    @ForInvoker(methodId = "initOC")
    public static void ag(Context context) {
        com.kwad.components.offline.a.b.al(context);
        com.kwad.components.offline.b.b.al(context);
        c.al(context);
    }

    public static void init(final Context context) {
        AtomicBoolean atomicBoolean = IW;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        OfflineHostProvider.get().init(context, new g());
        com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.components.core.n.b.b.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                b.ag(context);
            }
        });
    }
}
