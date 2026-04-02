package com.google.android.gms.internal.ads;

import java.util.Map;
/* loaded from: classes.dex */
public final class zzbte implements zzbpr<zzbtt> {
    public final /* synthetic */ zzbsn zza;
    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzcd zzb;
    public final /* synthetic */ zzbts zzc;

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
        int i2;
        obj = this.zzc.zza;
        synchronized (obj) {
            zzcgt.zzh("JS Engine is requesting an update");
            i2 = this.zzc.zzh;
            if (i2 == 0) {
                zzcgt.zzh("Starting reload.");
                this.zzc.zzh = 2;
                this.zzc.zzf(null);
            }
            this.zza.zzm("/requestReload", this.zzb.zza());
        }
    }
}
