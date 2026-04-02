package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaxo implements Comparator<zzaxd> {
    public zzaxo(zzaxp zzaxpVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzaxd zzaxdVar, zzaxd zzaxdVar2) {
        zzaxd zzaxdVar3 = zzaxdVar;
        zzaxd zzaxdVar4 = zzaxdVar2;
        if (zzaxdVar3.zzb() >= zzaxdVar4.zzb()) {
            if (zzaxdVar3.zzb() > zzaxdVar4.zzb()) {
                return 1;
            }
            if (zzaxdVar3.zza() >= zzaxdVar4.zza()) {
                if (zzaxdVar3.zza() > zzaxdVar4.zza()) {
                    return 1;
                }
                float zzd = (zzaxdVar3.zzd() - zzaxdVar3.zzb()) * (zzaxdVar3.zzc() - zzaxdVar3.zza());
                float zzd2 = (zzaxdVar4.zzd() - zzaxdVar4.zzb()) * (zzaxdVar4.zzc() - zzaxdVar4.zza());
                if (zzd <= zzd2) {
                    return zzd < zzd2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
