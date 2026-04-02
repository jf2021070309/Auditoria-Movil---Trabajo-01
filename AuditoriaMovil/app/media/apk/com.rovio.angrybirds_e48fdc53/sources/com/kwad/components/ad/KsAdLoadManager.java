package com.kwad.components.ad;

import com.kwad.components.ad.adbit.c;
import com.kwad.components.core.c.d;
import com.kwad.components.core.c.f;
import java.util.List;
/* loaded from: classes.dex */
public final class KsAdLoadManager {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum Holder {
        INSTANCE;
        
        private final KsAdLoadManager mInstance = new KsAdLoadManager((byte) 0);

        Holder() {
        }
    }

    private KsAdLoadManager() {
    }

    /* synthetic */ KsAdLoadManager(byte b) {
        this();
    }

    public static KsAdLoadManager M() {
        return Holder.INSTANCE.mInstance;
    }

    public static void a(com.kwad.components.core.request.model.a aVar) {
        if (c.b(aVar)) {
            return;
        }
        d.mn().c(aVar);
    }

    public final synchronized <T> void a(T t) {
        f.my().add(t);
    }

    public final synchronized <T> void b(List<T> list) {
        for (T t : list) {
            f.my().add(t);
        }
    }
}
