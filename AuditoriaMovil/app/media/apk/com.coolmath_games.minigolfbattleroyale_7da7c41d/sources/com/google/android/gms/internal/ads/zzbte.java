package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbte implements zzbpr<zzbtt> {
    final /* synthetic */ zzbsn zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcd zzb;
    final /* synthetic */ zzbts zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbte(zzbts zzbtsVar, zzaas zzaasVar, zzbsn zzbsnVar, com.google.android.gms.ads.internal.util.zzcd zzcdVar) {
        this.zzc = zzbtsVar;
        this.zza = zzbsnVar;
        this.zzb = zzcdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbpr, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzbtt zzbttVar, Map map) {
        Object obj;
        int i;
        obj = this.zzc.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zzh("JS Engine is requesting an update");
            i = this.zzc.zzh;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zzh("Starting reload.");
                this.zzc.zzh = 2;
                this.zzc.zzf(null);
            }
            this.zza.zzm("/requestReload", this.zzb.zza());
        }
    }
}
