package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
/* loaded from: classes.dex */
public final class zzfbm {
    public static zzbcz zza(Throwable th) {
        if (th instanceof zzeeg) {
            zzeeg zzeegVar = (zzeeg) th;
            return zzc(zzeegVar.zza(), zzeegVar.zzb());
        } else if (th instanceof zzdym) {
            return th.getMessage() == null ? zzd(((zzdym) th).zza(), null, null) : zzd(((zzdym) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzbb) {
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) th;
            return new zzbcz(zzbbVar.zza(), zzfmi.zza(zzbbVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static zzbcz zzb(Throwable th, zzeeh zzeehVar) {
        zzbcz zzbczVar;
        zzbcz zza = zza(th);
        int i2 = zza.zza;
        if ((i2 == 3 || i2 == 0) && (zzbczVar = zza.zzd) != null && !zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue() && zzeehVar != null) {
            zza.zze = zzeehVar.zzd();
        }
        return zza;
    }

    public static zzbcz zzc(int i2, zzbcz zzbczVar) {
        if (i2 != 0) {
            if (i2 == 8) {
                if (((Integer) zzbet.zzc().zzc(zzbjl.zzfU)).intValue() > 0) {
                    return zzbczVar;
                }
                i2 = 8;
            }
            return zzd(i2, null, zzbczVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbcz zzd(int r8, java.lang.String r9, com.google.android.gms.internal.ads.zzbcz r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbm.zzd(int, java.lang.String, com.google.android.gms.internal.ads.zzbcz):com.google.android.gms.internal.ads.zzbcz");
    }
}
