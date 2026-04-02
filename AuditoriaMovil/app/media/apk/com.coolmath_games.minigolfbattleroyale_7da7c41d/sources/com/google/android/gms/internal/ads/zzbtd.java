package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtd implements zzbpr<zzbtt> {
    final /* synthetic */ zzbtr zza;
    final /* synthetic */ zzbsn zzb;
    final /* synthetic */ zzbts zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbtd(zzbts zzbtsVar, zzbtr zzbtrVar, zzbsn zzbsnVar) {
        this.zzc = zzbtsVar;
        this.zza = zzbtrVar;
        this.zzb = zzbsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzbtt zzbttVar, Map map) {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zzi() != -1 && this.zza.zzi() != 1) {
                this.zzc.zzh = 0;
                zzbsn zzbsnVar = this.zzb;
                zzbsnVar.zzl("/log", zzbpq.zzg);
                zzbsnVar.zzl("/result", zzbpq.zzo);
                this.zza.zzg(this.zzb);
                this.zzc.zzg = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
