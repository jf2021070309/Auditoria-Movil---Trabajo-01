package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
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

    public final <I> zzfej<I> zze(E e2, zzfsm<I> zzfsmVar) {
        return new zzfej<>(this, e2, zzfsmVar, Collections.singletonList(zzfsmVar), zzfsmVar);
    }

    public final zzfea zzf(E e2, zzfsm<?>... zzfsmVarArr) {
        return new zzfea(this, e2, Arrays.asList(zzfsmVarArr), null);
    }

    public abstract String zzg(E e2);
}
