package com.google.android.gms.measurement.internal;

import java.util.List;
/* loaded from: classes2.dex */
public final class zzfk implements com.google.android.gms.internal.measurement.zzr {
    public final /* synthetic */ zzfm zza;

    public zzfk(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i2, String str, List<String> list, boolean z, boolean z2) {
        int i3 = i2 - 1;
        zzej zzi = i3 != 0 ? i3 != 1 ? i3 != 3 ? i3 != 4 ? this.zza.zzs.zzay().zzi() : z ? this.zza.zzs.zzay().zzm() : !z2 ? this.zza.zzs.zzay().zzl() : this.zza.zzs.zzay().zzk() : this.zza.zzs.zzay().zzj() : z ? this.zza.zzs.zzay().zzh() : !z2 ? this.zza.zzs.zzay().zze() : this.zza.zzs.zzay().zzd() : this.zza.zzs.zzay().zzc();
        int size = list.size();
        if (size == 1) {
            zzi.zzb(str, list.get(0));
        } else if (size == 2) {
            zzi.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzi.zza(str);
        } else {
            zzi.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
