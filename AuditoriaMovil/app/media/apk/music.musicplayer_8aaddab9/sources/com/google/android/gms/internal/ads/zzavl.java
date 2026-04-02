package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzavl {
    public final List<byte[]> zza;
    public final int zzb;

    private zzavl(List<byte[]> list, int i2) {
        this.zza = list;
        this.zzb = i2;
    }

    public static zzavl zza(zzaux zzauxVar) throws zzanp {
        try {
            zzauxVar.zzj(21);
            int zzl = zzauxVar.zzl() & 3;
            int zzl2 = zzauxVar.zzl();
            int zzg = zzauxVar.zzg();
            int i2 = 0;
            for (int i3 = 0; i3 < zzl2; i3++) {
                zzauxVar.zzj(1);
                int zzm = zzauxVar.zzm();
                for (int i4 = 0; i4 < zzm; i4++) {
                    int zzm2 = zzauxVar.zzm();
                    i2 += zzm2 + 4;
                    zzauxVar.zzj(zzm2);
                }
            }
            zzauxVar.zzi(zzg);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < zzl2; i6++) {
                zzauxVar.zzj(1);
                int zzm3 = zzauxVar.zzm();
                for (int i7 = 0; i7 < zzm3; i7++) {
                    int zzm4 = zzauxVar.zzm();
                    System.arraycopy(zzauv.zza, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(zzauxVar.zza, zzauxVar.zzg(), bArr, i8, zzm4);
                    i5 = i8 + zzm4;
                    zzauxVar.zzj(zzm4);
                }
            }
            return new zzavl(i2 == 0 ? null : Collections.singletonList(bArr), zzl + 1);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new zzanp("Error parsing HEVC config", e2);
        }
    }
}
