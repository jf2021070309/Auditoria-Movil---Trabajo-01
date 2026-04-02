package com.kwad.sdk;

import com.kwad.sdk.components.DevelopMangerComponents;
import com.kwad.sdk.export.proxy.AdHttpProxy;
import java.util.Random;
/* loaded from: classes.dex */
public final class g {
    private static AdHttpProxy ahh;

    public static AdHttpProxy wW() {
        AdHttpProxy adHttpProxy = ahh;
        if (adHttpProxy != null) {
            return adHttpProxy;
        }
        if (com.kwad.framework.a.a.mp.booleanValue()) {
            return wX();
        }
        try {
            ahh = com.kwad.sdk.core.network.a.c.Bk() != null ? new com.kwad.sdk.core.network.c.b() : new com.kwad.sdk.core.network.c.a();
        } catch (Throwable th) {
            ahh = new com.kwad.sdk.core.network.c.a();
        }
        return ahh;
    }

    private static AdHttpProxy wX() {
        com.kwad.sdk.components.c.f(DevelopMangerComponents.class);
        return new Random().nextInt(5) != 0 ? new com.kwad.sdk.core.network.c.b() : new com.kwad.sdk.core.network.c.a();
    }
}
