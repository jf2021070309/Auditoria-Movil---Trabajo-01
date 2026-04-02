package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfrg extends zzfre {
    final AtomicReferenceFieldUpdater<zzfri<?>, Set<Throwable>> zza;
    final AtomicIntegerFieldUpdater<zzfri<?>> zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final void zza(zzfri<?> zzfriVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        this.zza.compareAndSet(zzfriVar, null, set2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb(zzfri<?> zzfriVar) {
        return this.zzb.decrementAndGet(zzfriVar);
    }
}
