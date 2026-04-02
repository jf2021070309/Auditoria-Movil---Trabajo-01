package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfrg extends zzfre {
    public final AtomicReferenceFieldUpdater<zzfri<?>, Set<Throwable>> zza;
    public final AtomicIntegerFieldUpdater<zzfri<?>> zzb;

    public zzfrg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final void zza(zzfri<?> zzfriVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        this.zza.compareAndSet(zzfriVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb(zzfri<?> zzfriVar) {
        return this.zzb.decrementAndGet(zzfriVar);
    }
}
