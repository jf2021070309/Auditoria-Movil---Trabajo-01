package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzvw {
    public static zzvr zza(ExecutorService executorService) {
        zzvr zzvsVar;
        if (executorService instanceof zzvr) {
            return (zzvr) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzvsVar = new zzvv((ScheduledExecutorService) executorService);
        } else {
            zzvsVar = new zzvs(executorService);
        }
        return zzvsVar;
    }

    public static Executor zzb() {
        return zzus.INSTANCE;
    }
}
