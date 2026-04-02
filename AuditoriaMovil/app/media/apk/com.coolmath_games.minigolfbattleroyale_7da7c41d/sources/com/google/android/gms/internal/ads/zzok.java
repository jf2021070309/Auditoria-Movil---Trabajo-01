package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzok {
    public final List<byte[]> zza;
    public final int zzb;
    public final String zzc;

    private zzok(List<byte[]> list, int i, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = str;
    }

    public static zzok zza(zzamf zzamfVar) throws zzaha {
        try {
            zzamfVar.zzk(21);
            int zzn = zzamfVar.zzn() & 3;
            int zzn2 = zzamfVar.zzn();
            int zzg = zzamfVar.zzg();
            int i = 0;
            for (int i2 = 0; i2 < zzn2; i2++) {
                zzamfVar.zzk(1);
                int zzo = zzamfVar.zzo();
                for (int i3 = 0; i3 < zzo; i3++) {
                    int zzo2 = zzamfVar.zzo();
                    i += zzo2 + 4;
                    zzamfVar.zzk(zzo2);
                }
            }
            zzamfVar.zzh(zzg);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String str = null;
            for (int i5 = 0; i5 < zzn2; i5++) {
                int zzn3 = zzamfVar.zzn() & 127;
                int zzo3 = zzamfVar.zzo();
                int i6 = 0;
                while (i6 < zzo3) {
                    int zzo4 = zzamfVar.zzo();
                    System.arraycopy(zzalw.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzamfVar.zzi(), zzamfVar.zzg(), bArr, i7, zzo4);
                    if (zzn3 == 33 && i6 == 0) {
                        i6 = 0;
                        str = zzakv.zzb(new zzamg(bArr, i7, i7 + zzo4));
                    }
                    i4 = i7 + zzo4;
                    zzamfVar.zzk(zzo4);
                    i6++;
                }
            }
            return new zzok(i == 0 ? null : Collections.singletonList(bArr), zzn + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzaha.zzb("Error parsing HEVC config", e);
        }
    }
}
