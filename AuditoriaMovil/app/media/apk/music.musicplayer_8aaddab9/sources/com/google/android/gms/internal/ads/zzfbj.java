package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzfbj<T> {
    @GuardedBy("this")
    private final Deque<zzfsm<T>> zza = new LinkedBlockingDeque();
    private final Callable<T> zzb;
    private final zzfsn zzc;

    public zzfbj(Callable<T> callable, zzfsn zzfsnVar) {
        this.zzb = callable;
        this.zzc = zzfsnVar;
    }

    public final synchronized void zza(int i2) {
        int size = i2 - this.zza.size();
        for (int i3 = 0; i3 < size; i3++) {
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
