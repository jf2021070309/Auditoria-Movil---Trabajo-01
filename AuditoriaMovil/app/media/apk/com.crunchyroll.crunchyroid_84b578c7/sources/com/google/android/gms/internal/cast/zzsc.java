package com.google.android.gms.internal.cast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzsc {
    public static zzrx zza(ExecutorService executorService) {
        zzrx zzryVar;
        if (executorService instanceof zzrx) {
            return (zzrx) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzryVar = new zzsb((ScheduledExecutorService) executorService);
        } else {
            zzryVar = new zzry(executorService);
        }
        return zzryVar;
    }
}
