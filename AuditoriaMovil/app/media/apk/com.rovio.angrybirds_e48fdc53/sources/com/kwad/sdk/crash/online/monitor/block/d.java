package com.kwad.sdk.crash.online.monitor.block;

import java.util.Random;
/* loaded from: classes.dex */
public final class d {
    private static com.kwad.sdk.crash.online.monitor.a.a aAW;

    public static com.kwad.sdk.crash.online.monitor.a.a EX() {
        return aAW;
    }

    public static boolean EY() {
        com.kwad.sdk.crash.online.monitor.a.a aVar = aAW;
        return aVar != null && aVar.Fb();
    }

    public static void d(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            if (aVar.Fe()) {
                com.kwad.sdk.core.e.c.d("perfMonitor.BlockManager", "allFuncDisable");
            } else if (!a.EV()) {
                com.kwad.sdk.core.e.c.d("perfMonitor.BlockManager", "!hasBlockMonitor");
            } else {
                a.a(aVar);
                aAW = aVar;
                boolean bq = a.bq(true);
                com.kwad.sdk.core.e.c.d("perfMonitor.BlockManager", "hasTenBlockHook:" + bq);
                if (aVar.aqX < new Random().nextFloat()) {
                    return;
                }
                b.a(aVar);
                if (aVar.Fc() && bq) {
                    BlockInjector.b(aVar);
                }
                if (aVar.Fd()) {
                    boolean br = a.br(false);
                    com.kwad.sdk.core.e.c.d("perfMonitor.BlockManager", "hasOtherBlockMonitor:" + br);
                    if (br) {
                        BlockInjector.tryProxyOtherOutput(aVar);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                com.kwad.sdk.crash.b.l(th);
            } catch (Exception e) {
            }
        }
    }
}
