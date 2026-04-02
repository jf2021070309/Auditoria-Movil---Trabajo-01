package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfek<E> {
    private static final zzfsm<?> zza = zzfsd.zza(null);
    private final zzfsn zzb;
    private final ScheduledExecutorService zzc;
    private final zzfel<E> zzd;

    public zzfek(zzfsn zzfsnVar, ScheduledExecutorService scheduledExecutorService, zzfel<E> zzfelVar) {
        this.zzb = zzfsnVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfelVar;
    }

    public final <I> zzfej<I> zze(E e, zzfsm<I> zzfsmVar) {
        return new zzfej<>(this, e, zzfsmVar, Collections.singletonList(zzfsmVar), zzfsmVar);
    }

    public final zzfea zzf(E e, zzfsm<?>... zzfsmVarArr) {
        return new zzfea(this, e, Arrays.asList(zzfsmVarArr), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzg(E e);
}
