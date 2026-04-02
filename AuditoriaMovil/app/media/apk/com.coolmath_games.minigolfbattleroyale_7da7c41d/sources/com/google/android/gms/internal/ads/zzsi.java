package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.UByte;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzsi extends zzsm {
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
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzb = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    protected final long zzb(zzamf zzamfVar) {
        int i;
        byte[] zzi = zzamfVar.zzi();
        int i2 = zzi[0] & UByte.MAX_VALUE;
        int i3 = i2 & 3;
        int i4 = 2;
        if (i3 == 0) {
            i4 = 1;
        } else if (i3 != 1 && i3 != 2) {
            i4 = zzi[1] & 63;
        }
        int i5 = i2 >> 3;
        return zzi(i4 * (i5 >= 16 ? IronSourceConstants.IS_INSTANCE_NOT_FOUND << i : i5 >= 12 ? 10000 << (i & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i));
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzamf zzamfVar, long j, zzsk zzskVar) {
        if (!this.zzb) {
            byte[] copyOf = Arrays.copyOf(zzamfVar.zzi(), zzamfVar.zze());
            byte b = copyOf[9];
            List<byte[]> zza2 = zzop.zza(copyOf);
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN("audio/opus");
            zzaftVar.zzaa(b & UByte.MAX_VALUE);
            zzaftVar.zzab(48000);
            zzaftVar.zzP(zza2);
            zzskVar.zza = zzaftVar.zzah();
            this.zzb = true;
            return true;
        } else if (zzskVar.zza != null) {
            boolean z = zzamfVar.zzv() == 1332770163;
            zzamfVar.zzh(0);
            return z;
        } else {
            throw null;
        }
    }
}
