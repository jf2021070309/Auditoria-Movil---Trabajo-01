package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzok {
    public final List<byte[]> zza;
    public final int zzb;
    public final String zzc;

    private zzok(List<byte[]> list, int i2, String str) {
        this.zza = list;
        this.zzb = i2;
        this.zzc = str;
    }

    public static zzok zza(zzamf zzamfVar) throws zzaha {
        try {
            zzamfVar.zzk(21);
            int zzn = zzamfVar.zzn() & 3;
            int zzn2 = zzamfVar.zzn();
            int zzg = zzamfVar.zzg();
            int i2 = 0;
            for (int i3 = 0; i3 < zzn2; i3++) {
                zzamfVar.zzk(1);
                int zzo = zzamfVar.zzo();
                for (int i4 = 0; i4 < zzo; i4++) {
                    int zzo2 = zzamfVar.zzo();
                    i2 += zzo2 + 4;
                    zzamfVar.zzk(zzo2);
                }
            }
            zzamfVar.zzh(zzg);
            byte[] bArr = new byte[i2];
            String str = null;
            int i5 = 0;
            for (int i6 = 0; i6 < zzn2; i6++) {
                int zzn3 = zzamfVar.zzn() & 127;
                int zzo3 = zzamfVar.zzo();
                int i7 = 0;
                while (i7 < zzo3) {
                    int zzo4 = zzamfVar.zzo();
                    System.arraycopy(zzalw.zza, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(zzamfVar.zzi(), zzamfVar.zzg(), bArr, i8, zzo4);
                    if (zzn3 == 33 && i7 == 0) {
                        str = zzakv.zzb(new zzamg(bArr, i8, i8 + zzo4));
                        i7 = 0;
                    }
                    i5 = i8 + zzo4;
                    zzamfVar.zzk(zzo4);
                    i7++;
                }
            }
            return new zzok(i2 == 0 ? null : Collections.singletonList(bArr), zzn + 1, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw zzaha.zzb("Error parsing HEVC config", e2);
        }
    }
}
