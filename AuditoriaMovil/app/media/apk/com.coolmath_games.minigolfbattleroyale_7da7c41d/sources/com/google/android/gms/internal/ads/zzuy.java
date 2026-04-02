package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzuy {
    public static zzuw zza(zznv zznvVar) throws IOException {
        byte[] bArr;
        zzamf zzamfVar = new zzamf(16);
        if (zzux.zza(zznvVar, zzamfVar).zza != 1380533830) {
            return null;
        }
        zznp zznpVar = (zznp) zznvVar;
        zznpVar.zzh(zzamfVar.zzi(), 0, 4, false);
        zzamfVar.zzh(0);
        int zzv = zzamfVar.zzv();
        if (zzv != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(zzv);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        zzux zza = zzux.zza(zznvVar, zzamfVar);
        while (zza.zza != 1718449184) {
            zznpVar.zzj((int) zza.zzb, false);
            zza = zzux.zza(zznvVar, zzamfVar);
        }
        zzakt.zzd(zza.zzb >= 16);
        zznpVar.zzh(zzamfVar.zzi(), 0, 16, false);
        zzamfVar.zzh(0);
        int zzp = zzamfVar.zzp();
        int zzp2 = zzamfVar.zzp();
        int zzC = zzamfVar.zzC();
        int zzC2 = zzamfVar.zzC();
        int zzp3 = zzamfVar.zzp();
        int zzp4 = zzamfVar.zzp();
        int i = ((int) zza.zzb) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            zznpVar.zzh(bArr2, 0, i, false);
            bArr = bArr2;
        } else {
            bArr = zzamq.zzf;
        }
        return new zzuw(zzp, zzp2, zzC, zzC2, zzp3, zzp4, bArr);
    }
}
