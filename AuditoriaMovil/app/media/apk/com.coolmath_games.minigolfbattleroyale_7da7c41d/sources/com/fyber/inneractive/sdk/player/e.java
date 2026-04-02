package com.fyber.inneractive.sdk.player;

import android.content.Context;
import com.fyber.inneractive.sdk.config.a.s;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class e {
    public static final com.fyber.inneractive.sdk.player.b.f a(Context context, s sVar) {
        boolean a;
        com.fyber.inneractive.sdk.player.b.d dVar;
        if (sVar != null) {
            try {
                a = ((com.fyber.inneractive.sdk.config.a.a.f) sVar.a(com.fyber.inneractive.sdk.config.a.a.f.class)).a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.a <= 3) {
                    IAlog.b("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                dVar = null;
            }
        } else {
            a = false;
        }
        dVar = new com.fyber.inneractive.sdk.player.b.d(context, a, sVar);
        return dVar == null ? new com.fyber.inneractive.sdk.player.b.a(context) : dVar;
    }
}
