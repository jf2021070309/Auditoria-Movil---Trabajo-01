package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzpf {
    public static final zzrc zza = new zzpe(null);

    public static zzri zza(zzlb zzlbVar) {
        zzkj zzkjVar;
        zzre zzreVar = new zzre();
        zzreVar.zzb(zzlbVar.zzb());
        for (List<zzkv> list : zzlbVar.zzd()) {
            for (zzkv zzkvVar : list) {
                int zze = zzkvVar.zze() - 2;
                if (zze != 1) {
                    if (zze != 2) {
                        if (zze == 3) {
                            zzkjVar = zzkj.zzc;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        zzkjVar = zzkj.zzb;
                    }
                } else {
                    zzkjVar = zzkj.zza;
                }
                zzreVar.zza(zzkjVar, zzkvVar.zza(), zzkvVar.zzb());
            }
        }
        if (zzlbVar.zza() != null) {
            zzreVar.zzc(zzlbVar.zza().zza());
        }
        try {
            return zzreVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
