package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public interface zzfsn extends ExecutorService {
    zzfsm<?> zza(Runnable runnable);

    <T> zzfsm<T> zzb(Callable<T> callable);
}
