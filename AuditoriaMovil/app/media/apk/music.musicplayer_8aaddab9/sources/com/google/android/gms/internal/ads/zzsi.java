package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class zzsi extends zzsm {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean zzb;

    public static boolean zzd(zzamf zzamfVar) {
        if (zzamfVar.zzd() < 8) {
            return false;
        }
        byte[] bArr = new byte[8];
        zzamfVar.zzm(bArr, 0, 8);
        return Arrays.equals(bArr, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final long zzb(zzamf zzamfVar) {
        byte[] zzi = zzamfVar.zzi();
        int i2 = zzi[0] & 255;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = zzi[1] & 63;
        }
        int i5 = i2 >> 3;
        int i6 = i5 & 3;
        return zzi(i4 * (i5 >= 16 ? 2500 << i6 : i5 >= 12 ? 10000 << (i6 & 1) : i6 == 3 ? 60000 : 10000 << i6));
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzamf zzamfVar, long j2, zzsk zzskVar) {
        if (this.zzb) {
            Objects.requireNonNull(zzskVar.zza);
            boolean z = zzamfVar.zzv() == 1332770163;
            zzamfVar.zzh(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze());
        byte b2 = copyOf[9];
        List<byte[]> zza2 = zzop.zza(copyOf);
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzN("audio/opus");
        zzaftVar.zzaa(b2 & 255);
        zzaftVar.zzab(48000);
        zzaftVar.zzP(zza2);
        zzskVar.zza = zzaftVar.zzah();
        this.zzb = true;
        return true;
    }
}
