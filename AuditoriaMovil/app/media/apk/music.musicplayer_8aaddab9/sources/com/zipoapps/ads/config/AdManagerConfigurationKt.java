package com.zipoapps.ads.config;

import com.zipoapps.ads.config.AdManagerConfiguration;
import h.k;
import h.o.b.l;
import h.o.c.j;
/* loaded from: classes2.dex */
public final class AdManagerConfigurationKt {
    public static final AdManagerConfiguration adManagerConfig(l<? super AdManagerConfiguration.Builder, k> lVar) {
        j.e(lVar, "buildConfig");
        AdManagerConfiguration.Builder builder = new AdManagerConfiguration.Builder(null, null, null, null, null, null, 63, null);
        lVar.invoke(builder);
        return builder.build();
    }
}
