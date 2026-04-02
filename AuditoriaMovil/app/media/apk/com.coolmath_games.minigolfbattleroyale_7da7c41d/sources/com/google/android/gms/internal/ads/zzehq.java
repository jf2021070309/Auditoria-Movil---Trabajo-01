package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzehq {
    private final zzfbe zza;
    private final zzdtc zzb;
    private final zzdvi zzc;
    private final zzffc zzd;

    public zzehq(zzfbe zzfbeVar, zzdtc zzdtcVar, zzdvi zzdviVar, zzffc zzffcVar) {
        this.zza = zzfbeVar;
        this.zzb = zzdtcVar;
        this.zzc = zzdviVar;
        this.zzd = zzffcVar;
    }

    public final void zza(zzfac zzfacVar, zzezz zzezzVar, int i, @Nullable zzeeg zzeegVar, long j) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgi)).booleanValue()) {
            zzdvh zzd = this.zzc.zzd();
            zzd.zzb(zzfacVar);
            zzd.zzc(zzezzVar);
            zzd.zzd("action", "adapter_status");
            zzd.zzd("adapter_l", String.valueOf(j));
            zzd.zzd("sc", Integer.toString(i));
            if (zzeegVar != null) {
                zzd.zzd("arec", Integer.toString(zzeegVar.zzb().zza));
                String zza = this.zza.zza(zzeegVar.getMessage());
                if (zza != null) {
                    zzd.zzd("areec", zza);
                }
            }
            zzdtb zzd2 = this.zzb.zzd(zzezzVar.zzt);
            if (zzd2 != null) {
                zzd.zzd("ancn", zzd2.zza);
                zzbya zzbyaVar = zzd2.zzb;
                if (zzbyaVar != null) {
                    zzd.zzd("adapter_v", zzbyaVar.toString());
                }
                zzbya zzbyaVar2 = zzd2.zzc;
                if (zzbyaVar2 != null) {
                    zzd.zzd("adapter_sv", zzbyaVar2.toString());
                }
            }
            zzd.zze();
            return;
        }
        zzffb zza2 = zzffb.zza("adapter_status");
        zza2.zzh(zzfacVar);
        zza2.zzi(zzezzVar);
        zza2.zzc("adapter_l", String.valueOf(j));
        zza2.zzc("sc", Integer.toString(i));
        if (zzeegVar != null) {
            zza2.zzc("arec", Integer.toString(zzeegVar.zzb().zza));
            String zza3 = this.zza.zza(zzeegVar.getMessage());
            if (zza3 != null) {
                zza2.zzc("areec", zza3);
            }
        }
        zzdtb zzd3 = this.zzb.zzd(zzezzVar.zzt);
        if (zzd3 != null) {
            zza2.zzc("ancn", zzd3.zza);
            zzbya zzbyaVar3 = zzd3.zzb;
            if (zzbyaVar3 != null) {
                zza2.zzc("adapter_v", zzbyaVar3.toString());
            }
            zzbya zzbyaVar4 = zzd3.zzc;
            if (zzbyaVar4 != null) {
                zza2.zzc("adapter_sv", zzbyaVar4.toString());
            }
        }
        this.zzd.zza(zza2);
    }
}
