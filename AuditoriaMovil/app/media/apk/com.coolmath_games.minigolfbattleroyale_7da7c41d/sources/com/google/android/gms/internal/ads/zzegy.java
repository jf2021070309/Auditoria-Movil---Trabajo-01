package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzegy implements zzeek<zzdmh, zzfbi, zzefy> {
    private final Context zza;
    private final zzdlb zzb;
    private final Executor zzc;

    public zzegy(Context context, zzdlb zzdlbVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfal zzfalVar, int i) {
        return zzfalVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final void zza(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw {
        zzfar zzfarVar = zzfalVar.zza.zza;
        zzeefVar.zzb.zzo(this.zza, zzfalVar.zza.zza.zzd, zzezzVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbx.zzl(zzezzVar.zzs), zzeefVar.zzc, zzfarVar.zzi, zzfarVar.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeek
    public final /* bridge */ /* synthetic */ zzdmh zzb(zzfal zzfalVar, zzezz zzezzVar, zzeef<zzfbi, zzefy> zzeefVar) throws zzfaw, zzehs {
        zzdmm zzab;
        zzbvr zzB = zzeefVar.zzb.zzB();
        zzbvs zzC = zzeefVar.zzb.zzC();
        zzbvv zzu = zzeefVar.zzb.zzu();
        if (zzu == null || !zzc(zzfalVar, 6)) {
            if (zzB == null || !zzc(zzfalVar, 6)) {
                if (zzB == null || !zzc(zzfalVar, 2)) {
                    if (zzC == null || !zzc(zzfalVar, 6)) {
                        if (zzC == null || !zzc(zzfalVar, 1)) {
                            throw new zzehs(1, "No native ad mappers");
                        }
                        zzab = zzdmm.zzab(zzC);
                    } else {
                        zzab = zzdmm.zzae(zzC);
                    }
                } else {
                    zzab = zzdmm.zzac(zzB);
                }
            } else {
                zzab = zzdmm.zzad(zzB);
            }
        } else {
            zzab = zzdmm.zzaa(zzu);
        }
        if (!zzfalVar.zza.zza.zzg.contains(Integer.toString(zzab.zzv()))) {
            throw new zzehs(1, "No corresponding native ad listener");
        }
        zzdmo zzU = this.zzb.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdmy(zzab), new zzdol(zzC, zzB, zzu, null));
        zzeefVar.zzc.zzc(zzU.zzf());
        zzU.zza().zzi(new zzcsw(zzeefVar.zzb), this.zzc);
        return zzU.zzh();
    }
}
