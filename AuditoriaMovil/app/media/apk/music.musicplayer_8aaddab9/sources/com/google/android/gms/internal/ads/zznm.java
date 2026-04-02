package com.google.android.gms.internal.ads;

import android.util.Log;
/* loaded from: classes.dex */
public final class zznm {
    public static void zza(long j2, zzamf zzamfVar, zzox[] zzoxVarArr) {
        int i2;
        while (true) {
            if (zzamfVar.zzd() <= 1) {
                return;
            }
            int zzc = zzc(zzamfVar);
            int zzc2 = zzc(zzamfVar);
            int zzg = zzamfVar.zzg() + zzc2;
            if (zzc2 == -1 || zzc2 > zzamfVar.zzd()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                zzg = zzamfVar.zze();
            } else if (zzc == 4 && zzc2 >= 8) {
                int zzn = zzamfVar.zzn();
                int zzo = zzamfVar.zzo();
                if (zzo == 49) {
                    i2 = zzamfVar.zzv();
                    zzo = 49;
                } else {
                    i2 = 0;
                }
                int zzn2 = zzamfVar.zzn();
                if (zzo == 47) {
                    zzamfVar.zzk(1);
                    zzo = 47;
                }
                boolean z = zzn == 181 && (zzo == 49 || zzo == 47) && zzn2 == 3;
                if (zzo == 49) {
                    z &= i2 == 1195456820;
                }
                if (z) {
                    zzb(j2, zzamfVar, zzoxVarArr);
                }
            }
            zzamfVar.zzh(zzg);
        }
    }

    public static void zzb(long j2, zzamf zzamfVar, zzox[] zzoxVarArr) {
        int zzn = zzamfVar.zzn();
        if ((zzn & 64) != 0) {
            zzamfVar.zzk(1);
            int i2 = (zzn & 31) * 3;
            int zzg = zzamfVar.zzg();
            for (zzox zzoxVar : zzoxVarArr) {
                zzamfVar.zzh(zzg);
                zzoxVar.zzy(zzamfVar, i2);
                if (j2 != -9223372036854775807L) {
                    zzoxVar.zzv(j2, 1, i2, 0, null);
                }
            }
        }
    }

    private static int zzc(zzamf zzamfVar) {
        int i2 = 0;
        while (zzamfVar.zzd() != 0) {
            int zzn = zzamfVar.zzn();
            i2 += zzn;
            if (zzn != 255) {
                return i2;
            }
        }
        return -1;
    }
}
