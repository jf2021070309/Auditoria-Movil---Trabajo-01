package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public interface zzfsn extends ExecutorService {
    zzfsm<?> zza(Runnable runnable);

    <T> zzfsm<T> zzb(Callable<T> callable);
}
