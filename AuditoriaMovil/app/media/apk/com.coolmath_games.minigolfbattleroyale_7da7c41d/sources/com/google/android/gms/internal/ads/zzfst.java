package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfst {
    public static Executor zza() {
        return zzfrr.INSTANCE;
    }

    public static zzfsn zzb(ExecutorService executorService) {
        zzfsn zzfspVar;
        if (executorService instanceof zzfsn) {
            return (zzfsn) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfspVar = new zzfss((ScheduledExecutorService) executorService);
        } else {
            zzfspVar = new zzfsp(executorService);
        }
        return zzfspVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzfqw<?> zzfqwVar) {
        if (executor != null) {
            return executor == zzfrr.INSTANCE ? executor : new zzfso(executor, zzfqwVar);
        }
        throw null;
    }
}
