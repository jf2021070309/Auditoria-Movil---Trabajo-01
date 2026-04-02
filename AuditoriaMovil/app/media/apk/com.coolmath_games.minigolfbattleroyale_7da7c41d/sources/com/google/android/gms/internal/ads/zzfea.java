package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfea {
    final /* synthetic */ zzfek zza;
    private final Object zzb;
    private final List<zzfsm<?>> zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfea(zzfek zzfekVar, Object obj, List list, zzfeb zzfebVar) {
        this.zza = zzfekVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final <O> zzfej<O> zza(Callable<O> callable) {
        zzfsn zzfsnVar;
        zzfsb zzo = zzfsd.zzo(this.zzc);
        zzfsm zza = zzo.zza(zzfdz.zza, zzchg.zzf);
        zzfek zzfekVar = this.zza;
        Object obj = this.zzb;
        List<zzfsm<?>> list = this.zzc;
        zzfsnVar = zzfekVar.zzb;
        return new zzfej<>(zzfekVar, obj, zza, list, zzo.zza(callable, zzfsnVar));
    }
}
