package com.google.android.gms.internal.ads;

import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamg {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzamg(byte[] bArr, int i, int i2) {
        zza(bArr, i, i2);
    }

    private final int zzh() {
        int i = 0;
        while (!zzd()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zze(i) : 0);
    }

    private final boolean zzi(int i) {
        if (i < 2 || i >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    private final void zzj() {
        int i;
        int i2 = this.zzc;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.zzb) && (i2 != i || this.zzd != 0))) {
            z = false;
        }
        zzakt.zzd(z);
    }

    public final void zza(byte[] bArr, int i, int i2) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = i2;
        this.zzd = 0;
        zzj();
    }

    public final void zzb() {
        int i = this.zzd + 1;
        this.zzd = i;
        if (i == 8) {
            this.zzd = 0;
            int i2 = this.zzc;
            this.zzc = i2 + (true == zzi(i2 + 1) ? 2 : 1);
        }
        zzj();
    }

    public final void zzc(int i) {
        int i2 = this.zzc;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.zzc = i4;
        int i5 = this.zzd + (i - (i3 * 8));
        this.zzd = i5;
        if (i5 > 7) {
            this.zzc = i4 + 1;
            this.zzd = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.zzc) {
                zzj();
                return;
            } else if (zzi(i2)) {
                this.zzc++;
                i2 += 2;
            }
        }
    }

    public final boolean zzd() {
        boolean z = (this.zza[this.zzc] & (128 >> this.zzd)) != 0;
        zzb();
        return z;
    }

    public final int zze(int i) {
        int i2;
        this.zzd += i;
        int i3 = 0;
        while (true) {
            i2 = this.zzd;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.zzd = i4;
            byte[] bArr = this.zza;
            int i5 = this.zzc;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
            if (true != zzi(i5 + 1)) {
                r3 = 1;
            }
            this.zzc = i5 + r3;
        }
        byte[] bArr2 = this.zza;
        int i6 = this.zzc;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.zzd = 0;
            this.zzc = i6 + (true != zzi(i6 + 1) ? 1 : 2);
        }
        zzj();
        return i7;
    }

    public final int zzf() {
        return zzh();
    }

    public final int zzg() {
        int zzh = zzh();
        return (zzh % 2 == 0 ? -1 : 1) * ((zzh + 1) / 2);
    }
}
