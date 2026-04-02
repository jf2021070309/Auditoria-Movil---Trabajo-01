package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zzegy implements zzeek<zzdmh, zzfbi, zzefy> {
    private final Context zza;
    private final zzdlb zzb;
    private final Executor zzc;

    public zzegy(Context context, zzdlb zzdlbVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfal zzfalVar, int i2) {
        return zzfalVar.zza.zza.zzg.contains(Integer.toString(i2));
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
        if (zzu != null && zzc(zzfalVar, 6)) {
            zzab = zzdmm.zzaa(zzu);
        } else if (zzB != null && zzc(zzfalVar, 6)) {
            zzab = zzdmm.zzad(zzB);
        } else if (zzB != null && zzc(zzfalVar, 2)) {
            zzab = zzdmm.zzac(zzB);
        } else if (zzC != null && zzc(zzfalVar, 6)) {
            zzab = zzdmm.zzae(zzC);
        } else if (zzC == null || !zzc(zzfalVar, 1)) {
            throw new zzehs(1, "No native ad mappers");
        } else {
            zzab = zzdmm.zzab(zzC);
        }
        if (zzfalVar.zza.zza.zzg.contains(Integer.toString(zzab.zzv()))) {
            zzdmo zzU = this.zzb.zzU(new zzcxv(zzfalVar, zzezzVar, zzeefVar.zza), new zzdmy(zzab), new zzdol(zzC, zzB, zzu, null));
            zzeefVar.zzc.zzc(zzU.zzf());
            zzU.zza().zzi(new zzcsw(zzeefVar.zzb), this.zzc);
            return zzU.zzh();
        }
        throw new zzehs(1, "No corresponding native ad listener");
    }
}
