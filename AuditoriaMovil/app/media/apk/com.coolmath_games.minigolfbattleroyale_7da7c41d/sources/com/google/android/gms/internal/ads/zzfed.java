package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfed {
    public static final <O> zzfej<O> zza(zzfsm<O> zzfsmVar, Object obj, zzfek zzfekVar) {
        zzfsm zzfsmVar2;
        zzfsmVar2 = zzfek.zza;
        return new zzfej<>(zzfekVar, obj, zzfsmVar2, Collections.emptyList(), zzfsmVar);
    }

    public static final <O> zzfej<O> zzb(Callable<O> callable, Object obj, zzfek zzfekVar) {
        zzfsn zzfsnVar;
        zzfsnVar = zzfekVar.zzb;
        return zzc(callable, zzfsnVar, obj, zzfekVar);
    }

    public static final <O> zzfej<O> zzc(Callable<O> callable, zzfsn zzfsnVar, Object obj, zzfek zzfekVar) {
        zzfsm zzfsmVar;
        zzfsmVar = zzfek.zza;
        return new zzfej<>(zzfekVar, obj, zzfsmVar, Collections.emptyList(), zzfsnVar.zzb(callable));
    }

    public static final zzfej zzd(final zzfdx zzfdxVar, zzfsn zzfsnVar, Object obj, zzfek zzfekVar) {
        return zzc(new Callable(zzfdxVar) { // from class: com.google.android.gms.internal.ads.zzfec
            private final zzfdx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzfdxVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.zza.zza();
                return null;
            }
        }, zzfsnVar, obj, zzfekVar);
    }
}
