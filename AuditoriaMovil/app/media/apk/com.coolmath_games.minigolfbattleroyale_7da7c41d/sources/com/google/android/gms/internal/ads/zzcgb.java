package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcgb extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcge zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}
