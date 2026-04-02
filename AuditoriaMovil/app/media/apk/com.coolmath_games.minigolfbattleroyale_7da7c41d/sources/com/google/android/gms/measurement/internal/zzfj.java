package com.google.android.gms.measurement.internal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
final class zzfj implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfj(zzfl zzflVar) {
        this.zza = zzflVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List<String> list, boolean z, boolean z2) {
        zzek zzj;
        int i2 = i - 1;
        if (i2 == 0) {
            zzj = this.zza.zzs.zzau().zzj();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzj = this.zza.zzs.zzau().zzk();
            } else if (i2 != 4) {
                zzj = this.zza.zzs.zzau().zzi();
            } else if (z) {
                zzj = this.zza.zzs.zzau().zzf();
            } else if (!z2) {
                zzj = this.zza.zzs.zzau().zzh();
            } else {
                zzj = this.zza.zzs.zzau().zze();
            }
        } else if (z) {
            zzj = this.zza.zzs.zzau().zzc();
        } else if (!z2) {
            zzj = this.zza.zzs.zzau().zzd();
        } else {
            zzj = this.zza.zzs.zzau().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzj.zzb(str, list.get(0));
        } else if (size == 2) {
            zzj.zzc(str, list.get(0), list.get(1));
        } else if (size == 3) {
            zzj.zzd(str, list.get(0), list.get(1), list.get(2));
        } else {
            zzj.zza(str);
        }
    }
}
