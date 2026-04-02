package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfbj<T> {
    private final Deque<zzfsm<T>> zza = new LinkedBlockingDeque();
    private final Callable<T> zzb;
    private final zzfsn zzc;

    public zzfbj(Callable<T> callable, zzfsn zzfsnVar) {
        this.zzb = callable;
        this.zzc = zzfsnVar;
    }

    public final synchronized void zza(int i) {
        int size = i - this.zza.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }

    public final synchronized zzfsm<T> zzb() {
        zza(1);
        return this.zza.poll();
    }

    public final synchronized void zzc(zzfsm<T> zzfsmVar) {
        this.zza.addFirst(zzfsmVar);
    }
}
