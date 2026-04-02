package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdvh {
    final /* synthetic */ zzdvi zza;
    private final Map<String, String> zzb = new ConcurrentHashMap();

    public zzdvh(zzdvi zzdviVar) {
        this.zza = zzdviVar;
    }

    public static /* synthetic */ zzdvh zza(zzdvh zzdvhVar) {
        Map<? extends String, ? extends String> map;
        Map<String, String> map2 = zzdvhVar.zzb;
        map = zzdvhVar.zza.zzc;
        map2.putAll(map);
        return zzdvhVar;
    }

    public final zzdvh zzb(zzfac zzfacVar) {
        this.zzb.put("gqi", zzfacVar.zzb);
        return this;
    }

    public final zzdvh zzc(zzezz zzezzVar) {
        this.zzb.put("aai", zzezzVar.zzw);
        return this;
    }

    public final zzdvh zzd(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final void zze() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdvg
            private final zzdvh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    public final String zzf() {
        zzdvn zzdvnVar;
        zzdvnVar = this.zza.zza;
        return zzdvnVar.zzc(this.zzb);
    }

    public final /* synthetic */ void zzg() {
        zzdvn zzdvnVar;
        zzdvnVar = this.zza.zza;
        zzdvnVar.zzb(this.zzb);
    }
}
