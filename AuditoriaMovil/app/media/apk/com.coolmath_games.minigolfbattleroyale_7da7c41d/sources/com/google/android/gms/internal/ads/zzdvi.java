package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzdvi {
    private final zzdvn zza;
    private final Executor zzb;
    private final Map<String, String> zzc;

    public zzdvi(zzdvn zzdvnVar, Executor executor) {
        this.zza = zzdvnVar;
        this.zzc = zzdvnVar.zza();
        this.zzb = executor;
    }

    public final zzdvh zzd() {
        zzdvh zzdvhVar = new zzdvh(this);
        zzdvh.zza(zzdvhVar);
        return zzdvhVar;
    }
}
