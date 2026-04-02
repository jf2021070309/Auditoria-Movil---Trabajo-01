package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfsb<V> {
    private final boolean zza;
    private final zzfoj<zzfsm<? extends V>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzfsb(boolean z, boolean z2, zzfoj<zzfsm<? extends V>> zzfojVar) {
        this.zza = z;
        this.zzb = z2;
    }

    public final <C> zzfsm<C> zza(Callable<C> callable, Executor executor) {
        return new zzfrq(this.zzb, this.zza, executor, callable);
    }
}
