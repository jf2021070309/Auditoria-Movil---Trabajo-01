package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes.dex */
public final class zzcgb extends com.google.android.gms.ads.internal.util.zzb {
    public final /* synthetic */ zzcge zza;

    public zzcgb(zzcge zzcgeVar) {
        this.zza = zzcgeVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcgz zzcgzVar;
        Object obj;
        zzbjq zzbjqVar;
        context = this.zza.zze;
        zzcgzVar = this.zza.zzf;
        zzbjo zzbjoVar = new zzbjo(context, zzcgzVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zzl();
                zzbjqVar = this.zza.zzg;
                zzbjr.zza(zzbjqVar, zzbjoVar);
            } catch (IllegalArgumentException e2) {
                zzcgt.zzj("Cannot config CSI reporter.", e2);
            }
        }
    }
}
