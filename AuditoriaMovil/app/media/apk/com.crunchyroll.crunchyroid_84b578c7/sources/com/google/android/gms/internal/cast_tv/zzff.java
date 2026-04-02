package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzff extends zzep {
    final /* synthetic */ long zza;
    final /* synthetic */ zzeq zzb;
    final /* synthetic */ zzfj zzc;

    public zzff(zzfj zzfjVar, long j, zzeq zzeqVar) {
        this.zzc = zzfjVar;
        this.zza = j;
        this.zzb = zzeqVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzeq
    public final void zze(zzew zzewVar) {
        int zzd = zzewVar.zza().zzd() - 1;
        if (zzd != 1) {
            if (zzd != 2) {
                if (zzd != 3) {
                    if (zzd == 4) {
                        zzfj.zzM(this.zzc, this.zza);
                    }
                } else {
                    zzfj.zzM(this.zzc, this.zza);
                }
            } else {
                zzfj.zzM(this.zzc, this.zza);
            }
        } else {
            zzfj zzfjVar = this.zzc;
            zzfjVar.zzP(zzfjVar.zzj(), this.zza);
        }
        zzeq zzeqVar = this.zzb;
        if (zzeqVar != null) {
            try {
                zzeqVar.zze(zzewVar);
            } catch (RemoteException unused) {
            }
        }
    }
}
