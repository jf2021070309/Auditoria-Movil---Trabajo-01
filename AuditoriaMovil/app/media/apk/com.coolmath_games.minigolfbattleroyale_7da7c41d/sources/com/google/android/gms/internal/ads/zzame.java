package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzame {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzame() {
        this.zza = zzamq.zzf;
    }

    public zzame(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    private final void zzm() {
        int i;
        int i2 = this.zzb;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.zzd) && (i2 != i || this.zzc != 0))) {
            z = false;
        }
        zzakt.zzd(z);
    }

    public final void zza(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i;
    }

    public final int zzb() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzc() {
        return (this.zzb * 8) + this.zzc;
    }

    public final void zzd(int i) {
        int i2 = i / 8;
        this.zzb = i2;
        this.zzc = i - (i2 * 8);
        zzm();
    }

    public final void zze() {
        int i = this.zzc + 1;
        this.zzc = i;
        if (i == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzm();
    }

    public final void zzf(int i) {
        int i2 = i / 8;
        int i3 = this.zzb + i2;
        this.zzb = i3;
        int i4 = this.zzc + (i - (i2 * 8));
        this.zzc = i4;
        if (i4 > 7) {
            this.zzb = i3 + 1;
            this.zzc = i4 - 8;
        }
        zzm();
    }

    public final boolean zzg() {
        boolean z = (this.zza[this.zzb] & (128 >> this.zzc)) != 0;
        zze();
        return z;
    }

    public final int zzh(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.zzc += i;
        int i3 = 0;
        while (true) {
            i2 = this.zzc;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.zzc = i4;
            byte[] bArr = this.zza;
            int i5 = this.zzb;
            this.zzb = i5 + 1;
            i3 |= (bArr[i5] & UByte.MAX_VALUE) << i4;
        }
        byte[] bArr2 = this.zza;
        int i6 = this.zzb;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & UByte.MAX_VALUE) >> (8 - i2)));
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb = i6 + 1;
        }
        zzm();
        return i7;
    }

    public final void zzi(byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.zza;
            int i5 = this.zzb;
            int i6 = i5 + 1;
            this.zzb = i6;
            byte b = bArr2[i5];
            int i7 = this.zzc;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b2);
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.zzc;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.zza;
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & UByte.MAX_VALUE) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.zzc = i11;
        byte[] bArr4 = this.zza;
        int i12 = this.zzb;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.zzc = 0;
            this.zzb = i12 + 1;
        }
        zzm();
    }

    public final void zzj() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzm();
    }

    public final void zzk(int i) {
        zzakt.zzd(this.zzc == 0);
        this.zzb += i;
        zzm();
    }

    public final void zzl(int i, int i2) {
        int i3;
        int i4 = i & 16383;
        int min = Math.min(8 - this.zzc, 14);
        int i5 = this.zzc;
        int i6 = (8 - i5) - min;
        byte[] bArr = this.zza;
        int i7 = this.zzb;
        byte b = (byte) (((MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i5) | ((1 << i6) - 1)) & bArr[i7]);
        bArr[i7] = b;
        int i8 = 14 - min;
        bArr[i7] = (byte) (b | ((i4 >>> i8) << i6));
        int i9 = i7 + 1;
        while (i8 > 8) {
            i8 -= 8;
            this.zza[i9] = (byte) (i4 >>> i8);
            i9++;
        }
        byte[] bArr2 = this.zza;
        byte b2 = (byte) (bArr2[i9] & ((1 << i3) - 1));
        bArr2[i9] = b2;
        bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << (8 - i8)) | b2);
        zzf(14);
        zzm();
    }
}
